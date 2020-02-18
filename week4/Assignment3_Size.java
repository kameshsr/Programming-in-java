interface ExtraLarge{
	String extra = "This is extra-large";
 void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");			//semicolon missing
    }
}
 
class Medium extends Large {
    public void Print() {
    	  super.Print();										//two times super keyword  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print(); 										//extra semicolon
        System.out.println("This is small");
    }
  }
																		//extra closing curly braces
 
class Question43 implements ExtraLarge{
 public void display(){
  System.out.print(extra);
  }
    public static void main(String[] args) {
      
        Small s = new Small();
        s.Print();
      Question43 q = new Question43();
	  q.display();
	  
    }
}
