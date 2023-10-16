package singleton;

public class Main {

	public static void main(String[] args) {
		MySingleton myInstance1 = MySingleton.getInstance();
		
		MySingleton myInstance2 = MySingleton.getInstance();
		
		System.out.println(myInstance1.equals(myInstance2));

	}

}
