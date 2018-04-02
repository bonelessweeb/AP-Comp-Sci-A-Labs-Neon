//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSort
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		int num = number;
		while (num > 0){
			num = num / 10;
			count ++;
		}

		return count;
	}
	
	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int num = number;
		int index = getNumDigits(number)-1;
		while(num > 0){
			sorted[index] = num % 10;
			num = num / 10;
			index--;
			
		}
		out.println(Arrays.toString(sorted));
		
		for(int i = 0; i < sorted.length-1; i++){
			int spot = i;
			for (int k = i ; k < sorted.length; k++){
				if (sorted[k] < sorted[i]){
					spot = k;
				}
				int temp = sorted[i];
				sorted[i] = sorted[spot];
				sorted[spot] = temp;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		















		return sorted;
	}
}