package searching_sorting_algorithm;
/*
 * Binary search is about half of the search space using logic.
 * Using the binary search we can improve the time complexity. 
 * In binary search we need sorted array instead it gives possibly wrong answer 
 */
public class Binary_Search {

	static int binary_search(int a[], int start, int end, int key) {

		//10,20,30,40,50
		// 0  1  2  3  
	    if (start <= end) {//0<=4 true
	    	//3<=4 true
	        int mid = (start + end) / 2; //0+4/2=2    (3+4)/2=3
	        	//40==40 true
	        if (key == a[mid])//40==30 false
	            return mid;

	        else {
	            if (key > a[mid])//40>30 true
	                return binary_search(a, mid + 1, end, key);//go to right
	            						//2+1 =3 , a-length-1, 40
	            else
	                return binary_search(a, start, mid - 1, key);//go to left 
	        }

	    } else
	        return -1;
	}

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		//int a[]= {12, 43, 19, 1, 5 ,6};
		//unsorted array cant give appropriate answer
		int result=binary_search(a, 0,a.length-1, 40);
		System.out.println(result);

	}

}
