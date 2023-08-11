package stepDef_tripo;

import common_Pages_tripo.base_pages;
import common_Pages_tripo.login_page;
import io.cucumber.java.en.Given;
import utilitys.common_methods;

public class login_tC {
	@Given("I am in the home page")
	public void i_am_in_the_home_page() {
		base_pages.openUrl();
	}

	@Given("Give from")
	public void give_from() {
		login_page.giveFrom();
	}

	@Given("Give to")
	public void give_to() {
		login_page.giveTo();
	}
	
	@Given("to Scroll")
	public void to_scroll() {
		login_page.toSC();
	}
	
	@Given("Depature")
	public void depature() {
		login_page.DeparT();
	}

	@Given("date select")
	public void date_select() {
		login_page.departDatE();
	}

//	@Given("Click Person")
//	public void click_person() {
//		login_page.PersoN();
//	}
	
	@Given("pract drop")
	public void pract_drop() {
		login_page.AddDrop();
	}

	@Given("currency")
	public void currency() {
		login_page.currenCY();
	}

	@Given("driver close")
	public void driver_close() {
		base_pages.DriverClose();
	}

}
