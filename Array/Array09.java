import java.util.Arrays;
import java.util.Scanner;

public class Array09{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int arr[]=  new int[3];

        System.out.println("Input: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }

        for(int nums: arr){
            System.out.print(Arrays.toString(arr));
        }



    }
}