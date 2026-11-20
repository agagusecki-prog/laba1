package lr1;

import java.util.Scanner;

public class ExampleSM4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int dayn = in.nextInt();

        System.out.printf("В месяце %s %d дней \n",  month, dayn);
        in.close();
    }
}