package MavenTestG.MavenTestI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clsTest3 {
	@Test
	public void sum3()
	{
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		//System.out.println("Sum of a and b is :" +sum);
		System.out.println("Sum3");
			
		Assert.assertEquals(30,sum);
	}
	
	@Test
	public void div3()
	{
		int a=10;
		int b=20;
		
		int val=b/a;
		
		System.out.println("Div3");
		
		//System.out.println("Sum of a and b is :" +sum);
		
		Assert.assertEquals(2,val);
	}
	
	@Test
	public void mult3()
	{
		int a=10;
		int b=20;
		
		int val=a*b;
		System.out.println("Multi3");
		
		Assert.assertEquals(200,val);
	}
}
