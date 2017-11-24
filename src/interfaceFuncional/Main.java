package interfaceFuncional;

public class Main {

	interface Num{
		double getValue();
	}
	
	public static void main(String[] args) {
		
		Num n;
		n = () -> 3.348;
		
		System.out.println(n.getValue());

	}

}
