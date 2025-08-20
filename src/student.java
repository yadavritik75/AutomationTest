
public class student {
	int eid;
	String name;
	int age;

	student() {
		System.out.println("Default constructor ");
	}

	student(int eid) {
		this.eid = eid;
		System.out.println("int type constructor");
	}

	student(int eid, String name) {
		this(eid);
		this.name = name;
		System.out.println("int & String type constructor");
	}

	student(int eid, String name, int age) {
		this(eid, name);
		this.age = age;
		System.out.println("int ,String & int type constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s = new student();
		student s1 = new student(10);
		student s2 = new student(20, "hello");
		student s3 = new student(30, "Hi", 56);

	}

}
