package HW_1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class HW_1_Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println();
        int num = in.nextInt();
        System.out.printf("Сумма чисел до %d = %d", num, sum(num));
        System.out.printf("\nФакториал %d = %d", num, fact(num));
        in.close();
    }

    static int sum(int num) {
        int res = 0;
        for (int i = 1; i < num; i++) {
            res += i;
        }
        return res + num;
    }

    static int fact(int num) {
        int res = 1;
        if (num == 0)
            num = 1;
        for (int i = 1; i < num; i++) {
            res *= i;
        }
        return res * num;
    }
}
