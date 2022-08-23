import java.util.*;

public class ArrayListProgram {

	
	  public static void main(String[] args) { 
		  
	  ArrayList<Integer> aList = new ArrayList<Integer> (); //Declaration of ArrayList 
	  
	  aList.add(1); 
	  aList.add(2);
	  aList.add(3);
	  
	  var nums = new ArrayList<Integer> (aList); //declaring nums ArrayList & it has "aList" values
	  //"var" keyword is introduced in java 10 and it can detect the data type by using their surroundings
	 
	  
	  nums.add(4);
	  nums.add(5);
	  
	  var nums1 = new HashSet<Integer> (); //declaring nums ArrayList & it has "aList" values
	  //"var" keyword is introduced in java 10 and it can detect the data type by using their surroundings
	 
	  
	  nums1.add(4);
	  nums1.add(5);
	  nums1.add(5);
	  nums1.add(100);
	  nums1.add(1);
	  
		
		  Iterator<Integer> itr = nums.iterator();
		  
		  while (itr.hasNext()) { 
			  int a = itr.next(); System.out.println(a); 
			}
		 
	  
	  
		/*
		 * for(int a:nums) { System.out.println(a); }
		 */
	  
	  //System.out.println(aList); //
	  System.out.println(nums);
	  
	  
	  }
	 
		/*
		 * public static < E > void printArray(E[] elements) { for ( E element :
		 * elements){ System.out.println(element ); } System.out.println(); } public
		 * static void main( String args[] ) { Integer[] intArray = { 10, 20, 30, 40, 50
		 * }; Character[] charArray = { 'J', 'A', 'V', 'A', 'T','P','O','I','N','T' };
		 * 
		 * System.out.println( "Printing Integer Array" ); printArray( intArray );
		 * 
		 * System.out.println( "Printing Character Array" ); printArray( charArray ); }
		 */   
}
