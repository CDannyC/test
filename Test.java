/*
 * Daniel Condarcuri
 * 01/02/22
 * Unit 3 Activity 5 Question 1 - Rectangle
 * Description: Calculates perimeter and area of rectangles
 */
/*
 * block comment
 */
// line comment
public class hello_world 
{
	public static void main(String[] args) {
		//Variable Declaration & Initializations
		double length = 5;
		double height = 10;
		
		double perimeter;
		double area;
		System.out.println("calculating the perimeter of a rectangle");
		perimeter = (length + height) * 2;
		System.out.println("The perimeter of a rectangle with a length of "+ length + "cm and a height of " + height + "cm is: " + perimeter + "cm");
		System.out.println("calculating area of a rectangle");
		perimeter = length * height;
		System.out.println("The area of a rectangle with a length of "+ length + "cm and a height of " + height + "cm is: " + perimeter + "cm^2");
	}// end main()
}// end class
