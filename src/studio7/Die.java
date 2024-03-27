package studio7;

public class Die {

	private int numberOfSides;
	
	public Die(int n) {
		this.numberOfSides = n;
	}
	
	public int roll() {
		int roll = (int) (Math.random()*this.numberOfSides)+1;	
		return roll;
	}
	
	public static void main(String[] args) {
		Die die = new Die(8);
		System.out.println(die.roll());
	}
}
