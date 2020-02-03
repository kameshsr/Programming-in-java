/*
Complete the code segment to call default constructor first and then any other constructor in the class Answer.
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
public class Question24{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
}
class Answer{
  Answer(){
  System.out.println("You got nothing.");
  }
  Answer(int marks,String type){
  Answer a=new Answer();
    System.out.print("You got "+marks+" for an "+type);
  }
}
