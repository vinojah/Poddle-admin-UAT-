package businessComponent;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import util.webDriver;

public class createSalespartner extends webDriver{
	@Test(priority = 3)
	public static void createSalesPartner() throws InterruptedException  {
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(3000);
		driver.findElement(pages.createSalespartner.btn_createNew).click();
		Thread.sleep(5000);
		driver.findElement(pages.createSalespartner.btn_chooseFile).click();
		driver.findElement(pages.createSalespartner.btn_uploadFile).click();
		Thread.sleep(15000);
		driver.findElement(pages.createSalespartner.btn_confirm).click();
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.txt_firstName).sendKeys("Vinoja");
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.txt_lastName).sendKeys("Abiram");
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.txt_email).sendKeys("rvinoja1996@gmail.com");
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.btn_continue).click();
		
		driver.findElement(pages.createSalespartner.chk_location1).click();
		driver.findElement(pages.createSalespartner.chk_location2).click();
		driver.findElement(pages.createSalespartner.btn_finish).click();
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.btn_okay).click();
	}
	@Test(priority = 1)
	public static void validateMandatoryInStep1() throws InterruptedException  {
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(3000);
		driver.findElement(pages.createSalespartner.btn_createNew).click();
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.btn_continue).click();
		String imageText=driver.findElement(pages.createSalespartner.labelImage).getText();
		Assert.assertEquals(imageText, "no file selected");
		String textfieldMandatoryText=driver.findElement(pages.createSalespartner.labelTextfield).getText();
		Assert.assertEquals(textfieldMandatoryText, "This field is mandatory");
		driver.close();
	}
	@Test(priority = 2)
	public static void checkAlreadyExistSalespartner() throws InterruptedException  {
		businessComponent.signIn.vaildSignIn();
		Thread.sleep(3000);
		driver.findElement(pages.createSalespartner.btn_createNew).click();
		Thread.sleep(5000);
		driver.findElement(pages.createSalespartner.btn_chooseFile).click();
		driver.findElement(pages.createSalespartner.btn_uploadFile).click();
		Thread.sleep(15000);
		driver.findElement(pages.createSalespartner.btn_confirm).click();
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.txt_firstName).sendKeys("Vinoja");
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.txt_lastName).sendKeys("Abiram");
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.txt_email).sendKeys("vinojarasasuntharam@gmail.com");
		Thread.sleep(2000);
		driver.findElement(pages.createSalespartner.btn_continue).click();
		
		driver.findElement(pages.createSalespartner.chk_location1).click();
		driver.findElement(pages.createSalespartner.chk_location2).click();
		driver.findElement(pages.createSalespartner.btn_finish).click();
		Thread.sleep(3000);
		String toasterUserTitle=driver.findElement(pages.createSalespartner.toasterUserExist).getText();
		String toasterUserMessage=driver.findElement(pages.createSalespartner.toasterUserExistMessage).getText();
		System.out.print(toasterUserMessage);
		Assert.assertEquals(toasterUserTitle, "Bad Request");
		Assert.assertEquals(toasterUserMessage, "User already register for request user type");
		driver.close();
	}
}
