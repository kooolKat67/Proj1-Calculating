import java.util.Scanner; // do not delete or modify this line of code.
/* William Dinh
   0201 
   Andrea 
   The purpose of this program is to acquire two Cartesian coordinates and 
   determine whether the majority of the numbers that compose the Cartesian coordinates 
   are even, odd or if there are an equal number of even and odd numbers. 
   These coordinates are then used in the program to determine if they can be the 
   opposite corners of a rectangle. If the coordinates are the corners of a rectangle the
   Length and Width of the rectangle are calculated from the coordinates and used to determine
   the area of a rectangle. If the Cartesian coordinates are not the opposite corners of a rectangle 
   the program outputs that the coordinates are not the coordinates of the rectangle.
	*/ 
/**
 * <P>This class uses an instance of the <code>Scanner</code> class 
 * to get input from the user: 
 * four integers - representing two (x,y) coordinate pairs.</P>
 * <P>
 * Follow the instructions provided in the Project Description.
 * All code must appear in the main function whose header is given below.
 * </P>
 *
 * </P>
 * @author UMD CS Department.
 *
 */
public class Calculating {

	// entry point: execution begins here ....
	public static void main( String[] args ) {
		Scanner inScan = new Scanner(System.in);

		System.out.println("Enter a value for X1");
		int X1 = inScan.nextInt(); 
		System.out.println("Enter a value for Y1");
		int Y1 = inScan.nextInt();
		System.out.println("Enter a value for X2");
		int X2 = inScan.nextInt(); 
		System.out.println("Enter a value for Y2");
		int Y2 = inScan.nextInt(); 
		int Odd = 0;
		int Even = 0;
		if(X1%2==0){
			Even = Even + 1;
		}
		else{
			Odd = Odd + 1;
		}
		if(X2%2==0){
			Even= Even + 1;
		}
		else{
			Odd = Odd + 1;	
		}
		if(Y1%2==0){
			Even = Even + 1;
		}
		else{
			Odd = Odd + 1;
		}
		if(Y2%2==0){
			Even = Even + 1; 
		}
		else{
			Odd = Odd + 1;
		}
		if(Even<Odd){
			System.out.println("More odds than evens input.");
		}
		else if(Odd<Even){
			System.out.println("More evens than odds input.");
		}
		else if(Odd==Even){
			System.out.println("Same number of evens and odds input.");
		}
		int Length = 0;
		if(X1<X2){
			Length = X2-X1;
		}else{

		}
		Length = X1-X2;
		if(Length<0){
			Length = Length*-1;
		}
		int Width = 0;
		if(Y1<Y2){
			Width = Y2-Y1;
		}else{

		}
		Width = Y2-Y1;	
		if(Width<0){
			Width = Width*-1;
		}
		int Area= Width * Length;
		if(X1==X2 || Y1==Y2){
			System.out.println("not a rectangle.");
		}
		else{
			System.out.println("Area = "+Area);
		}
	}
}


/*
 * Create a Scanner object that will be used to get user input
 * from the Keyboard.
 * Prompt for and read the four integers to be considered.
 * Determine the dominant parity: odd, even or same.
 * Determine the area of the rectangle formed.
 */



