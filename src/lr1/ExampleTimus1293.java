package lr1;

import java.util.Scanner;

public class ExampleTimus1293 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
int x,y,z;

        do {
            System.out.println("Введите количество панелей от 1 до 100");
                x = in.nextInt();
        } while (x < 1 || x > 100);
        System.out.println("Отлично! Панелей " + x);

        do {
            System.out.println("Введите длину панели от 1 до 100");
               y = in.nextInt();
        } while (y < 1 || y > 100);
        System.out.println("Отлично! длина панели " + y);

        do {
            System.out.println("Введите ширину панели от 1 до 100");
               z = in.nextInt();
        } while (z < 1 || z > 100);
        System.out.println("Отлично! ширина панели " + z);

        int s = x*y*z*2;

        System.out.printf("нам потребуется %d нанограмм сульфида тория \n ", s);
        in.close();
    }
}
