import java.util.Arrays;
class Array04{
    public static void main(String args[]){

        int arr[]= {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));

        arr[3]=90;

        for(int nums: arr){
            System.out.println(nums);
        }


    }
}