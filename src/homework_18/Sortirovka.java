package homework_18;

public class Sortirovka {
    int [][]array1;
    public void sortirovka(int array[]) {
        int min = array[0];
        for (int i = 0; i < array.length - 1 ; i++){
            for (int j = 0; j < array.length - i - 1 ; j++){
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;


                }
            }



        }




    }
}


class SortirovkaTest {
    public static void main(String[] args) {
        Sortirovka sort = new Sortirovka();
        int array[] = {123,4};
        sort.sortirovka(array);
       System.out.println(array[0]);

    }

}
/*

цикл с 0 элемента 6
min = 0
if min > 1 то 1 = min
if min

сравниваем 0 элемент больше ли следующего элемента 1, если да, то свапаем.
потом 0 элемент сравниваем с элементом 2
 */