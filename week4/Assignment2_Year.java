/*
Complete the code segment to print the current year. Your code should compile successfully.

Note: 1) In this program, you are not allowed to use any import statement. 
           2) Use should use predefined class Calendar defined in java.util package and name its object as current.
           3) No Public Test Case is given.
*/

// The following is the declaration of the main class named Question42
public class Question42 { 
	public static void main(String args[]){
		int year; // integer type variable to store year	
java.util.Calendar current=java.util.Calendar.getInstance();
year=current.get(java.util.Calendar.YEAR);
// Print the current Year
		System.out.println("Current Year: "+year);
}
}
