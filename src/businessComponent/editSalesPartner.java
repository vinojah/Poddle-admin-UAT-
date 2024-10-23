package businessComponent;

import util.webDriver;
import org.testng.annotations.Test;

public class editSalesPartner extends webDriver{
//	@Test(priority = 1)
//	public static void searchSalesPartner() throws InterruptedException  {
//		businessComponent.signIn.vaildSignIn();
//		Thread.sleep(3000);
//		driver.findElement(pages.salespartnerList.txt_search).sendKeys("Abi");
//		Thread.sleep(5000);
//		driver.findElement(pages.salespartnerList.btn_view).click();
//	}
	@Test(priority = 1)
	public static void editSalesPartner() throws InterruptedException  {
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(3000);
		driver.findElement(pages.salespartnerList.txt_search).sendKeys("Abi");
		Thread.sleep(5000);
		driver.findElement(pages.salespartnerList.btn_view).click();
		Thread.sleep(5000);
		driver.findElement(pages.viewSalespartner.txt_firstName).clear();
		Thread.sleep(2000);
		driver.findElement(pages.viewSalespartner.txt_firstName).sendKeys("Vino");
		driver.findElement(pages.viewSalespartner.txt_lastName).clear();
		Thread.sleep(2000);
		driver.findElement(pages.viewSalespartner.txt_lastName).sendKeys("Abi");
		Thread.sleep(2000);
		driver.findElement(pages.viewSalespartner.chk_location3).click();
		driver.findElement(pages.viewSalespartner.chk_location4).click();
		driver.findElement(pages.viewSalespartner.btn_save).click();
		driver.close();
	}
}
