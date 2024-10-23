package pages;

import org.openqa.selenium.By;

public class viewSalespartner {
	public static By txt_firstName=By.xpath("//input[@formcontrolname=\"firstName\"]");
	public static By txt_lastName=By.xpath("//input[@formcontrolname=\"lastName\"]");
	public static By chk_location3=By.xpath("//label[text()=\"Aldridge\"]");
	public static By chk_location4=By.xpath("//label[text()=\"Aylsham\"]");
	public static By btn_save=By.xpath("//button[text()=\" Save changes\"]");
	public static By btn_delete = By.xpath("//div[text()=\"Delete account\"]");
	public static By btn_deleteConfirm = By.xpath("//button[text()=\" Yes\"]");
}
