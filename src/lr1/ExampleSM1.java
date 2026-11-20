package lr1;

import java.util.Scanner;

public class ExampleSM1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваше отчество: ");
        String otchestvo = in.nextLine();

        System.out.printf("Привет %s %s \n", name, otchestvo);
        in.close();
    }
}