import java.util.Scanner;
class ChildChotaException extends RuntimeException
{
	
}
class TooYoungException extends RuntimeException
{
	public TooYoungException(String msg)
	{
		super(msg);
	}
}
class TooOldException extends RuntimeException
{
	public TooOldException(String msg)
	{
		super(msg);
	}
}
public class Exception4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		if(age < 10)
		{
			throw new ChildChotaException();
		}
		if(age >= 10 && age < 18)
		{
			throw new TooYoungException("your kid not eligible for marriage try after sometime");
		}
		if(age >= 18 && age <= 30)
		{
			System.out.println("eligible for marriage enjoy the life......");
		}
		if(age > 35)
		{
			throw new TooOldException("you are old man not eligible for marriage");
		}
		s.close();
	}

}
