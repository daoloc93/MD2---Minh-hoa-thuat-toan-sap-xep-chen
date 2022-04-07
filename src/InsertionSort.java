import jdk.nashorn.internal.ir.LiteralNode;

import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        int[] list = {1,2,5,7,4,6,89,0,3};

        insertionSort(list);
        for (int element:list) {
            System.out.print(element + " ");
        }
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;
            for (j = i-1; j >= 0 && list[j] > currentElement; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = currentElement;
        }
    }
}
