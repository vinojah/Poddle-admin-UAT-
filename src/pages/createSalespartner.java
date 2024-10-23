package pages;

import org.openqa.selenium.By;

public class createSalespartner {
	public static By btn_createNew=By.xpath("//button[@class=\"btn p-button px-5\"]");
	public static By btn_chooseFile=By.xpath("//label[text()=\" Choose file \"]");
	public static By btn_uploadFile=By.xpath("//label[text()=\" Upload new image \"]");
	public static By btn_confirm =By.xpath("//button[text()=\" Confirm\"]");
	public static By txt_firstName=By.xpath("//input[@formcontrolname=\"firstName\"]");
	public static By txt_lastName = By.xpath("//input[@formcontrolname=\"lastName\"]");
	public static By txt_email = By.xpath("//input[@formcontrolname=\"email\"]");
	public static By btn_continue = By.xpath("//button[text()=\"Continue\"]");
	public static By chk_location1 = By.xpath("//label[text()=\"Aldridge\"]");
	public static By chk_location2 = By.xpath("//label[text()=\"Abingdon\"]");
	public static By btn_finish = By.xpath("//button[text()=\" Finish\"]");
	public static By btn_okay = By.xpath("//button[text()=\"Okay\"]");
	public static By labelImage = By.xpath("//div[text()=\"no file selected\"]");
	public static By labelTextfield = By.xpath("//div[text()=\"This field is mandatory\"]");
	public static By toasterUserExist=By.xpath("//div[@aria-label=\"Bad Request\"]");
	public static By toasterUserExistMessage=By.xpath("//div[@aria-label=\"User already register for request user type\"]");
	
}
