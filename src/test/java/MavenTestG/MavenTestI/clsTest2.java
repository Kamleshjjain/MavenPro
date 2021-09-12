package MavenTestG.MavenTestI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clsTest2 {
	@Test
	public void sum2()
	{
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		//System.out.println("Sum of a and b is :" +sum);
		System.out.println("Sum2");
			
		Assert.assertEquals(30,sum);
	}
	
	@Test
	public void div2()
	{
		int a=10;
		int b=20;
		
		int val=b/a;
		
		System.out.println("Div2");
		
		//System.out.println("Sum of a and b is :" +sum);
		
		Assert.assertEquals(2,val);
	}
	
	@Test
	public void mult2()
	{
		int a=10;
		int b=20;
		
		int val=a*b;
		System.out.println("Multi2");
		
		Assert.assertEquals(200,val);
	}
}
