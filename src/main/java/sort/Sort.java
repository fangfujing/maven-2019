package sort;

public class Sort {
    public static void main(String[] args) {

        int [] array = {3, 4, 6 , 7, 5, 3, 2};

        //冒泡
        bubbleSort(array);

        //插入排序
        insertSort(array);

        //选择排序
        selectionSort(array);

        //打印

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            //上面逻辑可优化  只记录下标    只换一次位置
            //...
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[index] < array[j]) {
                    int temp = array[index];
                    array[index] = array[j];
                    array[j] = temp;
                    index = j;
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1 -i; j++) {

                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
