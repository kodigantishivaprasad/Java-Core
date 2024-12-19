package constructor;

public class DefaultConstructor 
{
	DefaultConstructor()
	{
		System.out.println("deafult constructor");
	}
	
	DefaultConstructor(int a){
		System.out.println("a = "+a);
	}
	
	public static void main(String[] args) 
	{
		new DefaultConstructor();
		new DefaultConstructor(10);
	}
}
