/* A Java program to illustrate working of StringTokenizer class:*/
import java.util.*; 
public class StrTokenizer 
{ 
	public static void main(String args[]) 
	{ 
		System.out.println("Using Constructor 1 - "); 
		StringTokenizer st1 = new StringTokenizer("Hello VJIT How are you"); 
				while (st1.hasMoreTokens()) 
				System.out.println(st1.nextToken()); 

		System.out.println("Using Constructor 2 - "); 
		StringTokenizer st2 = new StringTokenizer("Welcome : TO : VJIT", " :"); 
			while (st2.hasMoreTokens()) 
			System.out.println(st2.nextToken()); 

		System.out.println("Using Constructor 3 - "); 
		StringTokenizer st3 = new StringTokenizer("Welcome : TO : VJIT", " :", true); 
			while (st3.hasMoreTokens()) 
			System.out.println(st3.nextToken()); 
	} 
}