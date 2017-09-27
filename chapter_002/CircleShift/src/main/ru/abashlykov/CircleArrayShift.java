package ru.abashlykov;

public class CircleArrayShift {

    public static void shift(int[] arr, int count) {

        for(int j = 0; j < count; j++) {
            int temp = arr[arr.length -1];
            for(int i = arr.length -2; i > -1; i--) {
                arr[i+1] = arr[i];
            }
            arr[0] = temp;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
