/*
Complete the code segment to call the method  print() of class Student first and then call print() method of class School.

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

class School { 
    // This is a method in class School
    public void print() { 
		System.out.println("Hi! I am class SCHOOL."); 
    } 
} 
// This is the class named Student
class Student { 
	// This is a method in class Student
    public void print() { 
		System.out.println("Hi! I am class STUDENT"); 
    } 
}

public class Question22{ 
    public static void main(String args[]){
    
    Student s=new Student();
s.print();
School c=new School();
c.print();

}
}
