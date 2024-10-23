package businessComponent;

import org.testng.annotations.Test;

import util.webDriver;

public class deleteSalesPartner extends webDriver{
	@Test
	public static void deleteSalesPartner() throws InterruptedException  {
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(3000);
		driver.findElement(pages.salespartnerList.txt_search).sendKeys("Abi");
		Thread.sleep(5000);
		driver.findElement(pages.salespartnerList.btn_view).click();
		Thread.sleep(5000);
		driver.findElement(pages.viewSalespartner.btn_delete).click();
		Thread.sleep(3000);
		driver.findElement(pages.viewSalespartner.btn_deleteConfirm).click();
		Thread.sleep(3000);
		driver.close();
	}
}
