package overriding;
class HDFC extends RBI{
	}



public class Methodoverriding {
	public static void main(String args[]) {
		RBI rbi =new RBI();
		SBI sbi=new SBI();
		HDFC hdfc =new HDFC();
		System.out.println(rbi.getIntrestRate());
		System.out.println(sbi.getIntrestRate());
		System.out.println(hdfc.getIntrestRate());

			
		
		
		
	}

}
