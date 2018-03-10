import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WorkOnArray newArray = new WorkOnArray();
        newArray.input();
        newArray.output();
        System.out.println("");
        newArray.bubbleSort();
        newArray.output();
    }

    public static class WorkOnArray {
        private int[] arrey = new int[10];

        public void input() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Введите " + (i + 1) + "-ое число в массив: ");
                arrey[i] = scanner.nextInt();
            }
        }

        public void bubbleSort() {
            for (int i = arrey.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (arrey[j] > arrey[j + 1]) {
                        int tmp = arrey[j];
                        arrey[j] = arrey[j + 1];
                        arrey[j + 1] = tmp;
                    }
                }
            }
        }

        public void output() {
            System.out.println("Массив имеет вид: ");
            for (int i = 0; i < 10; i++) {
                System.out.print(arrey[i] + " ");
            }
        }
    }
}