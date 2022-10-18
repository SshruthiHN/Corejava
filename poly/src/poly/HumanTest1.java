package poly;

class Human{
public static Human shruthi;
void speak(Unknown person) {
      System.out.println("HI");
      
}
void speak(Friend person) {
	System.out.println("HI.......bla bla");
}
	
}
class Unknown{
}
class Friend{
}

public class HumanTest1 {
	public static void main(String[] args) {
		Human shruthi=new Human();
		Unknown unknown=new Unknown();
		Friend friend=new Friend();
		
		shruthi.speak(unknown);
		shruthi.speak(friend);
		// TODO Auto-generated method stub

	}

}


