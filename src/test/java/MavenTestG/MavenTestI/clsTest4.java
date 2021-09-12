package MavenTestG.MavenTestI;

import org.testng.Assert;
import org.testng.annotations.Test;

public class clsTest4 {
	@Test
	public void sum4()
	{
		int a=10;
		int b=20;
		
		int sum=a+b;
		
		//System.out.println("Sum of a and b is :" +sum);
		System.out.println("Sum4");
			
		Assert.assertEquals(30,sum);
	}
	
	@Test
	public void div4()
	{
		int a=10;
		int b=20;
		
		int val=b/a;
		
		System.out.println("Div4");
		
		//System.out.println("Sum of a and b is :" +sum);
		
		Assert.assertEquals(2,val);
	}
	
	@Test
	public void mult4()
	{
		int a=10;
		int b=20;
		
		int val=a*b;
		System.out.println("Multi4");
		
		Assert.assertEquals(200,val);
	}
}
