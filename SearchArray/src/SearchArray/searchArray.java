/**
 * This program searches through an array to find and display all of the names that begin with 'M'
 */
package SearchArray;

/**
 * @author TaylorJenkins
 *
 */
public class searchArray {

	public static void main(String[] args) {
		String[] names = { "Bill", "Mike", "Joe", "Dave", "Sam", "Mary", "George", "Lucy" };
		
		System.out.println("Names from Array:");
		System.out.println("______________________");
		for (int i = 0; i < names.length; i++){
			System.out.println(names[i]);
		}
		
		System.out.println("\nNames that start with 'M':");
		System.out.println("_______________________________");
		for (int i = 0; i < names.length; i++){
			if (names[i].charAt(0) == 'M'){
				System.out.println(names[i]);
			}
		}
	}

}
