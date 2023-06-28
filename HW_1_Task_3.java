package HW_1;
//Реализовать простой калькулятор

import java.util.Scanner;

public class HW_1_Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Input operation: ");
        String operation = in.nextLine();
        System.out.printf("Input num 1: ");
        int num_1 = in.nextInt();
        System.out.printf("Input num 2: ");
        int num_2 = in.nextInt();
        switch (operation) {
            case "+":
                System.out.println(sum(num_1, num_2));
                break;
            case "-":
                System.out.println(subt(num_1, num_2));
                break;
            case "*":
                System.out.println(prod(num_1, num_2));
                break;
            case "/":
            case ":":
                System.out.printf("%.2f", div(num_1, num_2));
                break;
            default:
                break;
        }
        in.close();
    }

    static int sum(int num_1, int num_2) {
        int res = num_1 + num_2;
        return res;
    }

    static int subt(int num_1, int num_2) {
        int res = num_1 - num_2;
        return res;
    }

    static int prod(int num_1, int num_2) {
        int res = num_1 * num_2;
        return res;
    }

    static float div(int num_1, int num_2) {
        float num_float1 = num_1;
        float num_float2 = num_2;
        float res = num_float1 / num_float2;
        return res;
    }
}
