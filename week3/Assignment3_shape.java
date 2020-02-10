/*
A class Shape is defined with two overloading constructors in it. Another class Test1 is partially defined which inherits the class Shape. The class Test1 should include two overloading constructors as appropriate for some object instantiation shown in main( ) method. You should define the constructors using the super class constructors. Also, override the method calculate( ) in Test1 to calculate the volume of a Shape.
Mail your queries on studyizfun@gmail.com
connect me on linkedin
https://www.linkedin.com/in/kameshShekhar/
Join Telegram group for more queries
https://t.me/studyfunk
Join Whatsapp group for more queries
https://chat.whatsapp.com/D2C3KlcnskzAywXHmNao3o
If you like my video 
Please donate at least RS 10 to my paytm wallet 8809692924
It will help me financially and encourage me to make more videos
*/
import java.util.Scanner;
class Shape{
   double length, breadth;
   Shape(double l, double b){ //Constructor to initialize a Shape object  
      length = l;
      breadth= b;
    }
  Shape(double len){    //Constructor to initialize another Shape object  
     length = breadth = len;
   }
  double calculate(){  // To calculate the area of a shape object
    return length * breadth ;
  }
}
public class Test1 extends Shape{    
   double h;
Test1(double _l,double _h){
super(_l);
  h=_h;
}
Test1(double _l,double _b, double _h){
super(_l,_b);
  h=_h;
}
double calculate(){
return length*breadth*h;
}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);//Create an object to read input                                                            
	double l=sc.nextDouble(); //Read length
	double b=sc.nextDouble(); //Read breadth	
	double h=sc.nextDouble(); //Read height
	Test1 myshape1 = new Test1(l,h);
	Test1 myshape2 = new Test1(l,b,h);
	double volume1;
	double volume2;
	volume1 = myshape1.calculate();
	volume2=myshape2.calculate();
	System.out.println(volume1);
	System.out.println(volume2);
	}
}
