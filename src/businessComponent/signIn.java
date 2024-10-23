package businessComponent;

import java.util.Base64;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import util.webDriver;

public class signIn extends webDriver{
	@Test(priority = 3)
	public static void vaildSignIn() throws InterruptedException  {
		webDriver.openBrowser();
	   Thread.sleep(5000);
	   String password= "VinoAbi28101996";
	   //byte[] encrypt =Base64.getEncoder().encode(new String(password));
		//byte[] decrypt = Base64.getDecoder().decode(new String(password));
	   driver.findElement(pages.signIn.txt_email).sendKeys("vrasasuntharam@gmail.com");
	   driver.findElement(pages.signIn.txt_password).sendKeys(password);
	   driver.findElement(pages.signIn.btn_login).click();
}
	@Test(priority = 1)
	public static void invaildUsernameSignIn() throws InterruptedException  {
		webDriver.openBrowser();
	   Thread.sleep(5000);
	   String password= "Vmlub2phQWJpcmFt";
		byte[] decrypt = Base64.getDecoder().decode(new String(password));
	   driver.findElement(pages.signIn.txt_email).sendKeys("vinoja@gmail.com");
	   driver.findElement(pages.signIn.txt_password).sendKeys(new String(decrypt));
	   driver.findElement(pages.signIn.btn_login).click();
	   Thread.sleep(3000);
	   String toasterTitle=driver.findElement(pages.signIn.toaster).getText();
	   String toasterMessage=driver.findElement(pages.signIn.toasterMessage).getText();
	   System.out.print(toasterMessage);
	   //String toasterMessage = "ncikjdo";
	   Assert.assertEquals(toasterTitle, "Not found");
	   Assert.assertEquals(toasterMessage, "User not found, please check your email is correct and try again.");
	   
	  // Assert.
	   driver.close();
}
	@Test(priority = 2)
	public static void invaildPasswordSignIn() throws InterruptedException  {
		webDriver.openBrowser();
	   Thread.sleep(5000);
	   driver.findElement(pages.signIn.txt_email).sendKeys("vino");
	   driver.findElement(pages.signIn.txt_password).sendKeys("12345678");
	   driver.findElement(pages.signIn.btn_login).click();
	   Thread.sleep(3000);
	   String toasterMessageForInvalid=driver.findElement(pages.signIn.toasterMessageForInvalid).getText();
	   System.out.print(toasterMessageForInvalid);
	   Assert.assertEquals(toasterMessageForInvalid, "Incorrect password. Please try again, or tap ‘Forgot password’ to reset.");
	   
//	   Assert.
	   driver.close();
}
}
