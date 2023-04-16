package lesson_20;

public class Test {


    public static void main(String[] args) {
        int array[] = new int[4];
        for (int i = 0; i < array.length; i++ ) {
            array[i] = i * 10;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }


    }
}
