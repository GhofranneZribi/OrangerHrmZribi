package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginOrabgeHRM {
@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")
WebElement email ;
@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")
WebElement password ;
@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
WebElement loguin ;
@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
WebElement verifmess;
public LoginOrabgeHRM () {
	PageFactory.initElements(Config.driver, this);
}
public void loguinWithValudCredentials(String name, String pass) throws Exception {
	Thread.sleep(3000);
email.sendKeys(name);	
Config.attente(10);
password.sendKeys(pass);
loguin.click();

			
}
public String verif() {
	String Actual=verifmess.getText();
	return Actual; 
}

}

