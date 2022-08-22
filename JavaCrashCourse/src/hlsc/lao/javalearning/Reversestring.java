package hlsc.lao.javalearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reversestring {

	public static void main(String[] args) {


		  String Name = "SATHISH";
		  
		  StringBuffer buffer = new StringBuffer(); buffer.append(Name);
		  
		  System.out.println(buffer.reverse());
		 

		
		  
		  String Name2 = "SATHISH";
		  
		  char[] characterarray = Name2.toCharArray();
		  
		  String Reverse = "";
		  
		  for (int i = characterarray.length-1; i >=0 ; i--) { Reverse = Reverse +
		  characterarray[i]; } System.out.println(Reverse);
		  
		 
		
	
		
		
		
		
		
		

	}

}
