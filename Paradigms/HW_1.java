package Paradigms;

import java.util.Arrays;

public class HW_1 {
    public static void main(String args[]) {
        int[] sortArray = {12, 6, 4, 1, 15, 10};

        System.out.println("Сортировка императивным способом");
        bubbleSortImperative(sortArray);
        for(int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + "\n");
        }

        System.out.println("Сортировка декларативным способом");
        Arrays.sort(sortArray);
        for(int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + "\n");
        }

    } 

    public static void bubbleSortImperative(int[] sortArray){
        for (int i = 0; i < sortArray.length - 1; i++) {
            for(int j = 0; j < sortArray.length - i - 1; j++) {
                if(sortArray[j + 1] < sortArray[j]) {
                    int tmp = sortArray[j];
                    sortArray[j] = sortArray[j + 1];
                    sortArray[j + 1] = tmp;
                }
            }
        }
    }

}

