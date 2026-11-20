package lr1;

import java.util.Scanner;

public class ExampleSM5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой год рождения ");
        int age = in.nextInt();
        age = 2026-age;
        int age2 = age-1;

        System.out.printf("Вам %d или %d \n", age, age2);
        in.close();
    }
}