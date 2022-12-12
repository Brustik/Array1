import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 и 2");
        int[] arrayInt = new int[3]; //целочисленный массив
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        int arrayIntLenght = arrayInt.length;
        for (int i = 0; i < arrayIntLenght; i++) {
            if (i == arrayIntLenght - 1) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }


        double[] arrayDouble = {1.57, 7.654, 9.986}; //массив с дробными числами
        int arrayDoubleLenght = arrayDouble.length;
        for (int d = 0; d < arrayDoubleLenght; d++) {
            if (d == arrayDoubleLenght - 1) {
                System.out.println(arrayDouble[d]);
                break;
            }
            System.out.print(arrayDouble[d] + ", ");
        }

        int[] arrayRandom = {67, 45, 89, 43, 23}; //произвольный массив
        int arrayRandomLenght = arrayRandom.length;
        for (int r = 0; r < arrayRandomLenght; r++) {
            if (r == arrayRandomLenght - 1) {
                System.out.println(arrayRandom[r]);
                break;
            }
            System.out.print(arrayRandom[r] + ", ");
        }


    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] arrayInt = new int[3]; //целочисленный массив
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        int arrayIntLenght = arrayInt.length;
        for (int i = arrayIntLenght - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(arrayInt[i]);
                break;
            }
            System.out.print(arrayInt[i] + ", ");
        }

        double[] arrayDouble = {1.57, 7.654, 9.986}; //массив с дробными числами
        int arrayDoubleLenght = arrayDouble.length;
        for (int d = arrayDoubleLenght - 1; d >= 0; d--) {
            if (d == 0) {
                System.out.println(arrayDouble[d]);
                break;
            }
            System.out.print(arrayDouble[d] + ", ");
        }

        int[] arrayRandom = {67, 45, 89, 43, 23}; //произвольный массив
        int arrayRandomLenght = arrayRandom.length;
        for (int r = arrayRandomLenght - 1; r >= 0; r--) {
            if (r == 0) {
                System.out.println(arrayRandom[r]);
                break;
            }
            System.out.print(arrayRandom[r] + ", ");
        }

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int arrayInt[] = {1, 2, 3};
        int arrayIntLenght = arrayInt.length;
        for (int i = 0; i < arrayIntLenght; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] = arrayInt[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }


}