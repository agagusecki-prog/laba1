package lr1;

import java.util.Scanner;

public class ExampleSM9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int x = in.nextInt();

        int y = x-1;
        int z = x+1;
int e = (x+y+z)*(x+y+z);
        System.out.printf("%d %d %d %d \n", x, y, z, e);
        in.close();
    }
}