/*
Complete the code segment to swap two numbers using call by object reference.
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
class Question {  //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
  int e1 = sc.nextInt();  //Read e1
  int e2 = sc.nextInt();  //Read e2
 }
public class Question5 {
static void swap(Question q){
int t=q.e1;
  q.e1=q.e2;
  q.e2=t;
}
public static void main(String[] args) {
 //Create an object of class Question
   	Question t = new Question();
  //Call the method swap()
        swap(t);

    System.out.println(t.e1+" "+ t.e2);     
  }
 
}
