package SevenDisplayNew;

import java.util.Scanner;

class MyScanner {

    private static int number;

    public static int Scan() {
        System.out.print("Введите любое целое число от 1 до 2147483647: ");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        return number;
    }
}

