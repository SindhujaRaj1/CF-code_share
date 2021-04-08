package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.RM_Edit_Del_Role;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_RM_Edit_Del_Role_StepDef extends Browser{
	RM_Edit_Del_Role r_ed;
	@When("^Click Roles,select role,edit \"([^\"]*)\" then update$")
	public void click_Roles_select_role_edit_then_update(String rname) throws Throwable {
	    r_ed=new RM_Edit_Del_Role();
	    Click(r_ed.getSigin());
	    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    Click(r_ed.getRoles());
	    Click(r_ed.getR_edit());
	    r_ed.setE_rname(rname);
	    r_ed.setE_rdescrp("Business Analyst");
	    Click(r_ed.getE_role());
	    Click(r_ed.getUpdate());
	}

	@Then("^Delete role$")
	public void delete_role() throws Throwable {
	    Click(r_ed.getR_delet());
	    Click(r_ed.getR_cdelet());
	}


}
