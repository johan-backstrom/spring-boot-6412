package com.github.johan.backstrom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by cla_johbac on 2016-07-19.
 */
public class CucumberSteps {

    @Given("^The app is running$")
    public void the_app_is_running() throws Throwable {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .properties(System.getProperties())
                .build()
                .run("--monkey=666");
    }

    @When("^I do stuff$")
    public void i_do_stuff() throws Throwable {
        System.out.println("Doing stuff...");
    }

    @Then("^Nothing happens$")
    public void nothing_happens() throws Throwable {
        System.out.println("Absolutely nothing!");

    }

}
