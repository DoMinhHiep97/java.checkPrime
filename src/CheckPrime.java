import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input number:");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Its not Prime");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println("Its Prime");
            } else {
                System.out.println("Its not Prime");
            }
        }
    }
}
