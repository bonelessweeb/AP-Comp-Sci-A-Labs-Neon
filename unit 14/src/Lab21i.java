//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		Scanner sc = new Scanner(new File("C:\\Users\\longl5895\\Desktop\\AP-Comp-Sci-A-Labs-Neon\\unit 14\\src\\lab21i.dat"));
		int size = sc.nextInt();
		String rows = sc.nextLine();
		
		Maze test = new Maze(size, rows);
		out.println(test);
	}
}