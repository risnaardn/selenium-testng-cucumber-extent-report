package com.juaracoding.ujiancucumber.step_definitions;

import com.juaracoding.ujiancucumber.pages.LoginPage;
import com.juaracoding.ujiancucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case One
    @When("User go to web shop")
    public void user_go_to_Web_Shop() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to web shop");

    }

    @And("User Scroll Page")
    public void user_scroll_page() {
        loginPage.scrollDownPage();
        extentTest.log(LogStatus.PASS, "User Scroll Page");
    }


    @And("User Click MyAccount")
    public void user_invalid_credentials() {
        loginPage.clickMyAccount();
        extentTest.log(LogStatus.PASS, "User Click MyAccount");
    }

    @And("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.Login("risnardn", "akucantikbanget");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @Then("User click button login valid")
    public void user_click_btn_login() {
        loginPage.btnLogin();
        extentTest.log(LogStatus.PASS, "User click button login valid");
    }


}
