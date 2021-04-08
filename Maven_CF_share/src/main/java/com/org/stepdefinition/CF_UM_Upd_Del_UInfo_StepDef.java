package com.org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.org.browser.Browser;
import com.org.locators.UM_Upd_Del_UInfo;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_UM_Upd_Del_UInfo_StepDef extends Browser{
UM_Upd_Del_UInfo U_D;
@When("^Click User and edit role,email address as \"([^\"]*)\"$")
public void click_User_and_edit_role_email_address_as(String email) throws Throwable {
    U_D=new UM_Upd_Del_UInfo();
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    Click(U_D.getSigin());
    Click(U_D.getUsers());
    Click(U_D.getEdit());
    Click(U_D.getEmail());
    Actions a=new Actions(driver);
   
    a.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
    a.keyDown(Keys.CONTROL).sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).build().perform();
    U_D.setEmail(email);
    dropdown(U_D.getRole(), "Admin");
    Click(U_D.getUpdate());
    Thread.sleep(5000);

  


    
    
}

@When("^Delete User$")
public void delete_User() throws Throwable {
    Click(U_D.getDelete());
    Click(U_D.getCDel());
}

@Then("^User info can be Updated and Deleted successfully$")
public void user_info_can_be_Updated_and_Deleted_successfully() throws Throwable {
    System.out.println("User Updated and Deleted Successfully");
}

}
