//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

class InsertionSort
{
	private ArrayList<String> list;

	public InsertionSort()
	{
		list = new ArrayList <String>();


	}

	//modfiers
	public void add( String  word)
	{
		int loc = 0;
		loc = Collections.binarySearch(list,word);
		if (loc < 0){
			loc = Math.abs(loc + 1);
			list.add(loc,word);
		}







	}


	public void remove(String word)
	{
		int loc = 0;
		loc = Collections.binarySearch(list, word);
		if (loc >= 0){
			list.remove(loc);
		}





	}

	public String toString()
	{
		return list.toString();
	}
}