
class car {
	void engine() {
		System.out.println("car 1");
	}
}

class Bike extends car {
	void engine() {
		super.engine();
		System.out.println(" bike 1 ");

	}

}

public class Test {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.engine();

	}
}
