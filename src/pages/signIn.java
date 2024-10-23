package pages;

import org.openqa.selenium.By;

public class signIn {
	public static By txt_email=By.xpath("//input[@class=\"form-control ng-untouched ng-pristine ng-invalid\"]");
	public static By txt_password=By.xpath("//input[@class=\"form-control border-right-0 ng-untouched ng-pristine ng-invalid\"]");
	public static By btn_login=By.xpath("//button[@class=\"btn btn-md p-button btn-block\"]");
	public static By toaster=By.xpath("//div[@aria-label=\"Not found\"]");
	public static By toasterMessage=By.xpath("//div[@aria-label=\"User not found, please check your email is correct and try again.\"]");
	public static By toasterMessageForInvalid=By.xpath("//div[@aria-label=\"Incorrect password. Please try again, or tap ‘Forgot password’ to reset.\"]");
}
