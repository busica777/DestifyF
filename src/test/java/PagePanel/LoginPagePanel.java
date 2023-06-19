package PagePanel;

import org.openqa.selenium.support.PageFactory;
import Pages.LoginPage;
import Utils.BaseClass;
import Utils.UtilityClass;

public class LoginPagePanel extends BaseClass {
	LoginPage loginPage;
	UtilityClass utilityClass = new UtilityClass();

	public LoginPagePanel() {
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	
	public void clickLoginLink() {
		UtilityClass.waitForElement(LoginPage.loginLink);
		LoginPage.loginLink.click();
	}
	
	

	public void enterUserName(String str) throws Throwable {
		UtilityClass.waitForElement(LoginPage.emailTxtBox);
		LoginPage.emailTxtBox.click();
		//LoginPage.usernameTxtBox.clear();
		Thread.sleep(1000);
		LoginPage.emailTxtBox.sendKeys(str);
	}

	public void enterPassword(String str) {
		UtilityClass.waitForElement(LoginPage.passwordTxtBox);
		LoginPage.passwordTxtBox.sendKeys(str);
	}

	public void clickLoginBtn() {
		UtilityClass.waitForElement(LoginPage.loginBtn);
		LoginPage.loginBtn.click();
	}
	
	public void clickCloseBtn() {
		UtilityClass.waitForElement(LoginPage.closeBtn);
		LoginPage.closeBtn.click();
	}
	
	

}
