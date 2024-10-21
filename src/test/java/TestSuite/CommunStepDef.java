package TestSuite;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Pages.LoginOrabgeHRM;
import io.cucumber.java.en.Given;

public class CommunStepDef {
	@Given("Admin est connecte avec le bon username {string} et le bon password {string}")
	public void admin_est_connecte_avec_le_bon_username_et_le_bon_password(String name, String pwd) throws Exception {
		Config.driver =new EdgeDriver();
		Config.confedge();
		Config.maximize();
		String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		Config.driver.get(url);
		LoginOrabgeHRM page= new LoginOrabgeHRM ();
		page.loguinWithValudCredentials(name, pwd);
	}
}
