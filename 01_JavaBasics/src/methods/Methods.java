package methods;
class One
{
	void one()
	{
		System.out.println("One class");
	}
}
class Two extends One
{
	void two()
	{
		System.out.println("Two class");
	}
}
public class Methods extends Two
{

	void method1()
	{
		super.one();
		System.out.println("method1");
	}
	
	void method2()
	{
		super.two();
		System.out.println("method2");
	}
	
	public static void main(String[] args)
	{
		Methods m=new Methods();
		m.method1();
		m.method2();
	}
}
