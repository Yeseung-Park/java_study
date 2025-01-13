package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println(size + "개의 정수를 입력하세요:");
        for (int i = 0;i < size;i++) {
            numbers[i] = scanner.nextInt();
        }

        int maxNumber, minNumber;
        maxNumber = minNumber = numbers[0];

        for (int i = 0;i < size;i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);

    }
}
