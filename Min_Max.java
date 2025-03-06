public class Min_Max {
    public static void main(String[] args) {
        int[] Array_Number = {45, 131, 5, 95, 18, 31};
        System.out.print("Smallest number in array is: ");
        System.out.println(Minimum(Array_Number));
        System.out.print("Largest number in array is: ");
        System.out.print(Maximun(Array_Number));
    }
    static int Maximun(int[] Numbers){
        int max = Numbers[0];
        for (int i = 0; i < Numbers.length; i++) {
            if (max < Numbers[i]){
                max = Numbers[i];
            }
        }
        return max;
    }
    static int Minimum(int[] Numbers) {
        int small = Numbers[0];
        for (int i = 0; i < Numbers.length; i++) {
            if (small > Numbers[i]) {
                small = Numbers[i];
            }
        }
        return small;
    }
}