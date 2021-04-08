package com.org.stepdefinition;

import com.org.browser.Browser;
import com.org.locators.MB_Upload_NewVersion;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CF_MB_Upload_NewVersion_StepDef extends Browser{
MB_Upload_NewVersion NV;
@When("^Click style \"([^\"]*)\" and upload new version$")
public void click_style_and_upload_new_version(String desc) throws Throwable {
    NV=new MB_Upload_NewVersion();
jclick(NV.getNtopic());
jclick(NV.getThree_dot());
jclick(NV.getNew_version());
Click(NV.getNdescription());
Act_send(desc);
Click(NV.getN_next());
NV.setNimage("C:/Users/HP/Desktop/Shirts/M2_f.jpg");
NV.setNimage("C:/Users/HP/Desktop/Shirts/M2_b.jpg");
NV.setNd_file("C:/Users/HP/Desktop/Design_format/fbx/LowPolyWolf.fbx");
Click(NV.getN_next2());
}

@Then("^Add new people \"([^\"]*)\" to added version of particular topic$")
public void add_new_people_to_added_version_of_particular_topic(String newpeople) throws Throwable {
	Thread.sleep(3000);
	  Click(NV.getNinv_people());
      Act_send(newpeople);
   Thread.sleep(3000);
    jclick(NV.getNjustclk());
    jclick(NV.getnDone());
}


}
