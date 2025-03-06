import java.util.Arrays;
import java.util.Scanner;
public class TwoD_array {
    public static void main(String[] args) {
        int[][] Number={
                {5,85,12,34},
                {29,45,23},
                {78,32,22,14,38}
        };
        System.out.println("Given array is");
        printArray(Number);
        System.out.println("Enter the number for search: ");
        Scanner in = new Scanner(System.in);
        int Search = in.nextInt();
        in.close();
        int[] ans =Search_A(Number,Search);
        System.out.println(Arrays.toString(ans));
        System.out.print(findMax(Number));
    }
    static void printArray(int[][] Number) {
        for (int[] row : Number) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static int findMax(int[][] array) {
        int max = array[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (max < array[row][col]) {
                    max = array[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println("Index of largest number is: " + maxRow + " " + maxCol);
        return max;
    }
    static int[] Search_A(int[][] Number,int Search){
        int max_row=0,max_col=0;
        for (int row = 0; row < Number.length; row++) {
            for (int col = 0; col < Number[row].length; col++) {
                if (Search == Number[row][col]){
                    System.out.print("index of "+Search+" number is: ");
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
