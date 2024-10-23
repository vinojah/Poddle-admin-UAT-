package businessComponent;

import org.testng.annotations.Test;

import util.webDriver;

public class logout extends webDriver{
	@Test
	public static void logout() throws InterruptedException  {
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(4000);
		driver.findElement(pages.salespartnerList.btn_menuBar).click();
		driver.findElement(pages.salespartnerList.btn_logout).click();
	}

}
