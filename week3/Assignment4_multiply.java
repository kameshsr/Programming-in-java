/*
This program to exercise the call of static and non-static methods. A partial code is given defining two methods, namely sum( ) and multiply ( ). You have to call these methods to find the sum and product of two numbers. Complete the code segment as instructed.  
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
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Test3{
   public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
QuestionScope s=new QuestionScope();
System.out.println(s.sum(n1,n2));
System.out.print(QuestionScope.multiply(n1,n2));

}
}
