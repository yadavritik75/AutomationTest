import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class exceptioncodepractice {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		FileInputStream f = new FileInputStream("D:\\Reinforcement\\aman.txt");
		System.out.println("Hello");
//		int a=20,b=0,c;
//		c=a/b;
//		System.out.println(c);
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception ClassNotFoundException)
		{
			System.out.println("hellodd");
		}
		
		System.out.println("abcd");
	}

}
