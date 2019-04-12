import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        do {

            while (!input.hasNextInt()) {

                System.out.println("Please enter a positive integer");
                System.exit(0);

            }

            num = input.nextInt();

        } while (num < 1 && num > 0);

        System.out.println(primeFactorisation(num));

    }

    public static String primeFactorisation(int n) {

        int counter = 0;

        if (n == 1) {

            return "1";

        }

        if (n <= 0) {

            return "Please enter a positive integer";

        }

        String result = "" + n + " = ";

        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {

                result += (i + " x ");

                n = n / i;
                i = 1;

                counter++;

            }

            if (n == 1) {

                break;

            }

        }

        result = result.substring(0, result.length() - 3);

        if (counter < 2) {

            result = result.substring(0, result.length() - 1 * (result.indexOf("=") + 2));
            result += "is a prime number";

        }

        return result;

    }
}