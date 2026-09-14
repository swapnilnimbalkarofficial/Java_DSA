
public class EqualAndEqualsToMethod {

	public static void main(String[] args) {
		String s1= new String("Swapnil");
		String s2= new String("Swapnil");
		System.out.println(s1==s2);/*false bcz if both object are refernce to same object then it return true 
		otherwise false
		Note:
		.equals method is present in object class also meant for reference comparison only based on requirement
		we can override for content comparison.
		
		In String class, all Wrapper class and all collection classes .equals() method is overridden for
		 content comparison
		
		
		*/
		System.out.println(s1.equals(s2));//true bcz both objects reference are diff but content is same 

	}

}
