// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.awt.Color;

class BallTestOne
{
	public static void main( String args[] )
	{
		Ball one = new Ball();
		out.println(one);
		
		Ball two;
		two = new Ball(100,90);
		out.println(two);
		
		Ball three = new Ball(100,100,30,50);
		out.println(three);
		
		Ball four = new Ball(100,100,30,50,Color.blue);
		out.println(four);
		
		Ball five = new Ball(100,100,30,50,Color.blue,5,6);
		out.println(five);
		
		Ball six = new Ball(100,100,30,50,Color.blue,5,6);
		out.println(six);		
		
		out.println(five.equals(four));		
		
		out.println(five.equals(five));										
	}
}
