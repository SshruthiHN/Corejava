package overriding;

public class RBI {
	double getIntrestRate() {
		return 11.50;
	}
	}
class SBI extends RBI{
	double getIntrestRate(){
		return 9.00;
	}
	class HDFC extends RBI{
		double getIntrestRate() {
			return 8.00;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
