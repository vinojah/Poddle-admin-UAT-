package testScript;

public class testcase_DeleteSalespartner {
	public static void testcase_editSalesPartner() throws InterruptedException {
		testScript.testcase_EditSalespartner.testcase_editSalesPartner();
		Thread.sleep(5000);
		businessComponent.deleteSalesPartner.deleteSalesPartner();
	}
}
