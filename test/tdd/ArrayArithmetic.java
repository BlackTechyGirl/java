package tdd;

public class ArrayArithmetic {
    public static int sumOfArray(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int minimumOfArray(int[] arr) {
        int minimum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]){
            minimum = arr[i];
            }
        }
        return minimum;
    }

    public static int maximumOfArray(int[] arr) {
        int maximum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maximum < arr[i]){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static int sumMin(int[] arr) {
        int sumMin = sumOfArray(arr) - maximumOfArray(arr);
//        int sum = 0;
//        int max = arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//            sum += arr[i];
//            if (max < arr[i]){
//                max = arr[i];
//            }
//        }
//        int sumMin = sum - max;
        return sumMin;
    }
    public static int sumMax(int[] arr) {
        int sumMax = sumOfArray(arr) - minimumOfArray(arr);
//        int sum = 0;
//        int min = arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//            sum += arr[i];
//            if (min > arr[i]){
//                min = arr[i];
//            }
//        }
//        int sumMax = sum - min;
        return sumMax;
    }

    public static int [] accendArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int [] decendArray(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    temp = arr[i];
                    arr[i] =arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
