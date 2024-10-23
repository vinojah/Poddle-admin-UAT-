package testScript;

public class testcase_Createsalespartner {
	public static void testcase_createSalesPartner() throws InterruptedException {
		testScript.testcase_SignIn.testcase_signIn();
		Thread.sleep(5000);
		businessComponent.createSalespartner.createSalesPartner();
		
	}
}
