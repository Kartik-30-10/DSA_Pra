import java.util.Scanner;

public class LS_E_S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] Num = {45,25,78,62,49,43,76};
        String [] Str ={"Alice", "Bob", "Charlie", "David", "Emily", "Frank"};
        System.out.println("Given arrays are: ");
        System.out.print("String:  ");
        printarray(Str);
        System.out.println();
        System.out.print("Numbers:  ");
        printarray(Num);
        System.out.println();
        System.out.println("Enter the element for search:");
        System.out.print("String: ");
        String name = in.nextLine();
        System.out.print("Numbers: ");
        int target = in.nextInt();
        System.out.println("Enter the starting and ending point for search between 0 to "+Str.length);
        System.out.print("For string: ");
        int S = in.nextInt();
        int E = in.nextInt();
        System.out.println("Enter the starting and ending point for search between 0 to "+Num.length);
        System.out.print("For integers: ");
        int s = in.nextInt();
        int e = in.nextInt();
        in.close();
        int Result = Int(Num,target,s,e);
        System.out.println(Result);
        String result = Str(Str,name,S,E);
        System.out.println(result);
    }
    static void printarray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    static void printarray(String [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    static int Int(int[] Numbers, int Target, int Start, int End){
        if (Numbers.length == 0){
            System.out.println("Array is not Completed");
            return -1;
        }
        for (int i = Start; i <=End ; i++) {
            if (Target==Numbers[i]){
                System.out.print("index number is: "+i);
                return Target;
            }
        }
        System.out.println("Enter valid input");
        return -1;
    }
    static String Str(String[] Word,String Target,int Start, int End){
        if (Word.length == 0){
            return "Array is not valid";
        }
        for (int i = Start; i <End ; i++) {
            if (Target.equals(Word[i])){
                System.out.println("index number is: "+i);
                return Target;
            }
        }
        return "Enter valid input";
    }
}
