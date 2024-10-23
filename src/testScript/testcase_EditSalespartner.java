package testScript;

public class testcase_EditSalespartner {
	public static void testcase_editSalesPartner() throws InterruptedException {
		testScript.testcase_Createsalespartner.testcase_createSalesPartner();
		businessComponent.editSalesPartner.editSalesPartner();
			
	}
}
