public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " - " + process(i));
        }
    }

    public static String process(int number) {
        String numberAsString = String.valueOf(number);
        StringBuffer sb = new StringBuffer();

        if (number % 3 == 0 || numberAsString.contains("3")) {
            sb.append("Fizz");
        }

        if (number % 5 == 0 || numberAsString.contains("5")) {
            sb.append("Buzz");
        }

        if (sb.length() == 0){
            return numberAsString;
        }
        return sb.toString();
    }
}
