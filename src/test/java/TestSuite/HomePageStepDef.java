package TestSuite;

import org.junit.Assert;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {




@When("Admin clique sur le {string}")
public void admin_clique_sur_le(String menuName) throws Exception {
	HomePage clic =new HomePage();
	clic.clickOnProductyName(menuName);
}

@Then("La page du menu est affichee et contient le nom de {string}")
public void la_page_du_menu_est_affichee_et_contient_le_nom_de(String Expected) {
	HomePage verif =new HomePage();
	Assert.assertEquals(Expected, verif.verifMnuName());
	Config.quit();
}



}
