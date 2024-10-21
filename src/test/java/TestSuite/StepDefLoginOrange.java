package TestSuite;

import org.junit.Assert;
import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginOrabgeHRM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLoginOrange {

@Given("Admin in loguin page")
public void admin_in_loguin_page() {
   Config.driver= new EdgeDriver();
   Config.confedge();
   Config.maximize();
   String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
Config.driver.get(url);

}

@When("Admin enter correct username {string} and correct password {string}")
public void admin_enter_correct_username_and_correct_password(String mail, String pwd) throws Exception {
	LoginOrabgeHRM page=new LoginOrabgeHRM();
	page.loguinWithValudCredentials(mail, pwd);
}

@Then("Admin is redirected to the Home page")
public void admin_is_redirected_to_the_home_page() {
   
}
@When("Admin enter incorrect username {string} and incorrect password {string}")
public void admin_enter_incorrect_username_and_incorrect_password(String nom, String pwd) throws Exception {
	LoginOrabgeHRM page=new LoginOrabgeHRM();
	page.loguinWithValudCredentials(nom, pwd);
}

@Then("Admin is in the loguin page that contains message {string}")
public void admin_is_in_the_loguin_page_that_contains_message(String mess) {
	LoginOrabgeHRM log=new LoginOrabgeHRM();

	Assert.assertEquals(mess, log.verif());
}



}
