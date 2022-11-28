package tdd;

import java.util.Random;

public class Shuffle {
    public static void main(String[] args) {
        int [] shuffle = {3, 6, 7, 3, 7};
        for (int i = 0; i < shuffle.length; i++) {
            System.out.println(i);
        }

    }
    public static int[] shuffleArrays(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomNumber = random.nextInt(arr.length);
            int temp = arr[randomNumber];
            arr[randomNumber] = arr[i];
            arr[i] = temp;
//            number = number * 10 + random.nextInt(10);
        }
        return arr;
    }
}
