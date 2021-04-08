package com.org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="CF_Feature",glue="com.org.stepdefinition",
                  tags={"@Login"})
public class Runner {

}
