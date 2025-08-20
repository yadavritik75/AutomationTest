	class person{
		//constructor overloading 
		person()
		{
			System.out.println("1st constructor ");
		}
		person(String name)
		{
			System.out.println("I am from parameterized constructor");
		}
		person(String name,int a)
		{
			System.out.println("I am from parameterized constructor having string & int");
		}
		person(String name,int a,double b)
		{
			System.out.println("parameterized constructor having three data types");
		}
		person(int a,int b, String name)
		{
			System.out.println("No sequence parameterized constructor");
		}
		person(int a ,int b)
		{
			System.out.println("int type parameterized constructor ");
		}
		public static void main(String[] args) {
			person p=new person("Ritik");
			person p1=new person("Yadav",10);
			person p2=new person("MCA",10,20.0);
			person p3=new person(23,34,"xyz");
			person p4=new person(77,89);
			
		}
	}
