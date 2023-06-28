package HW_1;
//Вывести все простые числа от 1 до 1000

public class HW_1_Task_2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (j < i & i % j == 0) {
                    break;
                }
                if (i % j == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
