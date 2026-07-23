import java.util.Scanner;
class Array03{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int arr[]= new int[5];

        System.out.println("Array imput: ");
       for(int i=0; i<arr.length; i++){
           arr[i]=scan.nextInt();
       }

       //print to verify

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        scan.close();
    }
}