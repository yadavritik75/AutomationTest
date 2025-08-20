interface I1 {
	void show();
	 int a=20;
}
interface I2
{
	void display();
}
class test1 implements I1,I2 {
	public void show(int a) {
		System.out.println("integer  method");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("modifying method");
	}

	@Override
	public void display() {
		System.out.println("Display method modifying");
		
	}
}

public class Interfacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t = new test1();
		t.show();
		t.show(34);
		t.display();
	}

}
