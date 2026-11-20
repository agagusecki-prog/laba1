package lr1;

import java.util.Scanner;

public class ExampleSM7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой возраст ");
        int age = in.nextInt();
        age = 2026-age;
        int age2 = age-1;

        System.out.printf("Вы родились в %d или в %d \n", age, age2);
        in.close();
    }
}