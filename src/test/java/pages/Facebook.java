package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class Facebook {
	public Facebook() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	@FindBy(xpath="//a[@id=\"u_0_2_jU\"]")
	public WebElement NewAccount;

	@FindBy(xpath="//div[@class=\"mbs _52lq fsl fwb fcb\"]")
	public WebElement Title;

	@FindBy(css="div[class=\"_52lr fsm fwn fcg\"]")
	public WebElement lastTitle;

	@FindBy(xpath="//input[@aria-label=\"Adýn\"]")
	public WebElement name;

	@FindBy(xpath="//input[@aria-label=\"Soyadýn\"]")
	public WebElement lastname;

	@FindBy(xpath="//input[@aria-label=\"Cep telefonu numarasý veya e-posta\"]")
	public WebElement ePosta;

	@FindBy(xpath="//input[@aria-label=\"Yeni þifre\"]")
	public WebElement newPassword;

	@FindBy(xpath="//div[text()=\"Doðum Tarihi\"]")
	public WebElement birthday;

	@FindBy(xpath="//div[text()=\"Cinsiyet\"]")
	public WebElement gender;

	@FindBy(xpath="//div[@class=\"_1lch\"]//button[text()='Kaydol']")
	public WebElement buttonTitle;

}
