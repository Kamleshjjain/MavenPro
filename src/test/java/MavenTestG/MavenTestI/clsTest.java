package MavenTestG.MavenTestI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clsTest {
	@Test
	public void sum()
	{
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		//System.out.println("Sum of a and b is :" +sum);
		System.out.println("Sum1");
			
		Assert.assertEquals(30,sum);
	}
	
	@Test
	public void div()
	{
		// Comment addded to check compile changes
		// New comment
		int a=10;
		int b=20;
		// value added
		int val=b/a;
		
		System.out.println("Div1");
		
		//System.out.println("Sum of a and b is :" +sum);
		
		Assert.assertEquals(2,val);
	}
	
	@Test
	public void mult()
	{
		int a=10;
		int b=20;
		
		int val=a*b;
		System.out.println("Multi1");
		
		Assert.assertEquals(200,val);
	}
	
}
