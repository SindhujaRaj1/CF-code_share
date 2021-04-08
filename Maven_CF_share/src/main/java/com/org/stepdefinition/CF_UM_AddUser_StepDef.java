package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.org.browser.Browser;
import com.org.locators.UM_AddUser;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_UM_AddUser_StepDef extends Browser{
UM_AddUser um;
@When("^Click User,Add User \"([^\"]*)\" and \"([^\"]*)\"  and \"([^\"]*)\"$")
public void click_User_Add_User_and_and(String un, String em, String dp) throws Throwable  {
    um=new UM_AddUser();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
   Click(um.getSigin());
   Click(um.getUsers());
   Click(um.getAdd());
   um.setUname(un);
   um.setEmail(em);
   dropdown(um.getRole(),dp);
}

@Then("^Save user$")
public void save_user() throws Throwable {
   Click(um.getAddUser());
}

}
