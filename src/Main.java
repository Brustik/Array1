import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 и 2");
        int[] arrayInt = new int [3]; //целочисленный массив
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        int arrayIntLeight = arrayInt.length;
        for (int i = 0; i < arrayIntLeight - 1; i++) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.print(arrayInt[arrayIntLeight - 1]);
        System.out.println();

        double[] arrayDouble = {1.57, 7.654, 9.986}; //массив с дробными числами
        int arrayDoubleLeight = arrayDouble.length;
        for (int d = 0; d < arrayDoubleLeight - 1; d++) {
            System.out.print(arrayDouble[d] + ", ");
        }
        System.out.print(arrayDouble[arrayDoubleLeight - 1]);
        System.out.println();

        int[] arrayRandom = {67, 45, 89, 43, 23}; //произвольный массив
        int arrayRandomLeight = arrayRandom.length;
        for (int r = 0; r < arrayRandomLeight - 1; r++) {
            System.out.print(arrayRandom[r] + ", ");
        }
        System.out.print(arrayRandom[arrayRandomLeight - 1]);
        System.out.println();

    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int[] arrayInt = new int [3]; //целочисленный массив
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;
        int arrayIntLeight = arrayInt.length;
        for (int i = arrayIntLeight - 1; i > 0; i--) {
            System.out.print(arrayInt[i] + ", ");
        }
        System.out.print(arrayInt[0]);
        System.out.println();

        double[] arrayDouble = {1.57, 7.654, 9.986}; //массив с дробными числами
        int arrayDoubleLeight = arrayDouble.length;
        for (int d = arrayDoubleLeight - 1; d > 0; d--) {
            System.out.print(arrayDouble[d] + ", ");
        }
        System.out.print(arrayDouble[0]);
        System.out.println();

        int[] arrayRandom = {67, 45, 89, 43, 23}; //произвольный массив
        int arrayRandomLeight = arrayRandom.length;
        for (int r = arrayRandomLeight - 1; r > 0; r--) {
            System.out.print(arrayRandom[r] + ", ");
        }
        System.out.print(arrayRandom[0]);
        System.out.println();

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задача 4");
        int arrayInt[] = {1, 2, 3};
        int arrayIntLeight = arrayInt.length;
        for (int i = 0; i < arrayIntLeight; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] = arrayInt[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }




}