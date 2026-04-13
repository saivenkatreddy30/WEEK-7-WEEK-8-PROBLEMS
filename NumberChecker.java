import java.util.Scanner;

public class NumberChecker {

    public static boolean isPrime(int n) {

        if(n <= 1)
            return false;

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0)
                return false;
        }

        return true;
    }

    public static boolean isNeon(int n) {

        int square = n * n;
        int sum = 0;

        while(square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == n;
    }

    public static boolean isSpy(int n) {

        int sum = 0;
        int product = 1;

        while(n > 0) {

            int digit = n % 10;

            sum += digit;
            product *= digit;

            n /= 10;
        }

        return sum == product;
    }

    public static boolean isAutomorphic(int n) {

        int square = n * n;
        int temp = n;

        while(temp > 0) {

            if(temp % 10 != square % 10)
                return false;

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Prime Number: " + isPrime(num));
        System.out.println("Neon Number: " + isNeon(num));
        System.out.println("Spy Number: " + isSpy(num));
        System.out.println("Automorphic Number: " + isAutomorphic(num));

        sc.close();
    }
}