package chapterSeven.turtle;

public class MultidimentionalArray {
    public static void main(String[] args) {
    int [][] array = new int[5][5];
        array[0][0] = 1;
        array[0][4] = 1;
        array[1][1] = 1;
        array[1][3] = 1;
        array[2][2] = 1;
        array[3][1] = 1;
        array[3][3] = 1;
        array[4][0] = 1;
        array[4][4] = 1;

    for (int i = 0; i <array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            if(array[i][j] == 1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

        }
        System.out.println();
        }
    }
}
