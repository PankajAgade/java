/*
  Q ] Write a program to show the implementation of final keyword.
  	
  	1. Variable =>
  		If u make any variable as final , u cannot change the value 
  		of final variable.
  		
  	2. Method =>
  		If u make any Method as final , u cannot override That method.
  		
  	3. Class =>
  		If u make any class as final , u cannot extend That Class.
  		
  		
*/
package final_keyword;

final public class Bike {
	final int speed = 90;
	speed =100;
	//Get Compile time error. not change and update the value of speed variable.
	
	final  public void Wheel()
	{
		System.out.println("Two Wheeler");
	}

}
