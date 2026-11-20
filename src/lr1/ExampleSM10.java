package lr1;

import java.util.Scanner;

public class ExampleSM10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1");
        int x = in.nextInt();
        System.out.println("Введите число 2 ");
        int y = in.nextInt();
        int z = x+y;
        int e = x-y;
        System.out.printf("%d + %d = %d \n %d - %d = %d \n ", x, y, z, x, y, e);
        in.close();
    }
}