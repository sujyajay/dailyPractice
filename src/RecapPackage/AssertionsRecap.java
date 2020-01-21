package RecapPackage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsRecap {

	
@Test

	public void assertMethd()
	{
	
	 //System.out.println("assert Equals: ");
	 
	 SoftAssert sa = new SoftAssert();
	 sa.assertFalse(true, "A=====True");
	 
	 assertFalse(false, "===TRUE");
	 assertEquals("a", "a", "Strings do not match ::::");
	 
	sa.assertAll();
	}
	
}