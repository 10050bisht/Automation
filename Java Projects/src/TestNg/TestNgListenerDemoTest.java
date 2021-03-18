package TestNg;

import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//@Ignore
@Listeners()
public class TestNgListenerDemoTest {
/*	
 *  Parameter Examples
	@Test
	@Parameters({"MyName"})   
	public void test1(@Optional("Himanshu") String name) {
		System.out.println("Name is : "+ name);
	}
	*/

	/*
// 	 Group Examples
	@Test(groups = {"Sanity"})
	public void test1() {
		System.out.println("This is Test 1 ");
	}
	
	@Test(groups = {"Sanity" , "Smoke"})
	public void test2() {
		System.out.println("This is Test 2 ");
		
	}
	@Test(groups = {"" , "regression"})
	public void test3() {
		System.out.println("This is Test 3 ");
	}
	@Test
	public void test4() {
		System.out.println("This is Test 4 ");
	}
	*/
	
/*	   DependsOn Method and groups Example:--
	@Test(dependsOnMethods = {"test2"}, priority = 1)
	public void test1() {
		System.out.println("This is Test 1 ");
	}
	
	@Test(dependsOnGroups = "Sanity1" )
	public void test2() {
		System.out.println("This is Test 2 ");
		
	}
	@Test( groups = "Sanity1")
	public void test3() {
		System.out.println("This is Test 3 ");
		
	}
	*/
}