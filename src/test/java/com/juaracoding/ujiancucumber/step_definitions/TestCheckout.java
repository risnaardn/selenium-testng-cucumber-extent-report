package com.juaracoding.ujiancucumber.step_definitions;

import com.juaracoding.ujiancucumber.pages.CheckOut;
import com.juaracoding.ujiancucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestCheckout {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private CheckOut checkOut = new CheckOut();

    public TestCheckout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case Item 1
    @When("User open the page web shop")
    public void user_open_the_page_web_shop() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User open the page web shop");

    }

    @And("User click the button search")
    public void user_click_the_button_search() {
        checkOut.clickSearchIcon();
        extentTest.log(LogStatus.PASS, "User click the button search");
    }


    @And("User write product")
    public void User_write_product() {
        checkOut.writeTheItem("DRESS");
        extentTest.log(LogStatus.PASS, "User write product");
    }

    @And("User key enter")
    public void User_key_enter() {
        checkOut.pressEnter();
        extentTest.log(LogStatus.PASS, "User key enter");
    }

    @And("User choose the product")
    public void User_choose_the_product() {
        checkOut.itemOne();
        extentTest.log(LogStatus.PASS, "User choose the product");
    }

    @And("User select size and color the product")
    public void User_select_size_and_color_the_product() {
        checkOut.setSelectColorandSizeItemOne("White", "Medium");
        extentTest.log(LogStatus.PASS, "User select size and color the product");
    }

    @Then("User click button Add To Cart")
    public void User_click_button_Add_To_Cart() {
        checkOut.setBtnAddToCartOne();
        extentTest.log(LogStatus.PASS, "User click button Add To Cart");
    }


    // Test Case Item two
    @When("User already open home page")
    public void User_already_open_home_page() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User already open home page");

    }

    @And("User click for button search")
    public void User_click_for_button_search() {
        checkOut.clickSearchIcon();
        extentTest.log(LogStatus.PASS, "User click for button search");
    }


    @And("User write product two")
    public void User_write_product_two() {
        checkOut.writeTheItem("SHIRT");
        extentTest.log(LogStatus.PASS, "User write product two");
    }

    @And("User press key enter")
    public void User_press_key_enter() {
        checkOut.pressEnter();
        extentTest.log(LogStatus.PASS, "User press key enter");
    }

    @And("User choose product two")
    public void User_choose_product_two() {
        checkOut.itemTwo();
        extentTest.log(LogStatus.PASS, "User choose product two");
    }

    @And("User select size and color product two")
    public void User_select_size_and_color_product_two() {
        checkOut.setSelectColorandSizeItemTwo("Pink", "32");
        extentTest.log(LogStatus.PASS, "User select size and color product two");
    }

    @Then("User click button Add to cart product two")
    public void User_click_button_Add_to_cart_product_two() {
        checkOut.setBtnAddToCartOne();
        extentTest.log(LogStatus.PASS, "User click button Add to cart product two");
    }

    //Test Case Checkout

    @When("User on home page")
    public void user_on_home_page() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User on home page");

    }

    @And("User scroll the page")
    public void user_scroll_the_page() {
        checkOut.scrollDownPage();
        extentTest.log(LogStatus.PASS, "User scroll the page");
    }


    @And("User click Checkout")
    public void user_click_checkout() {
        checkOut.setMenuCheckOut();
        extentTest.log(LogStatus.PASS, "User click Checkout");
    }

    @And("User scroll down")
    public void user_scroll_down() {
        checkOut.scrollDownPageCheckout();
        extentTest.log(LogStatus.PASS, "User scroll down");
    }

    @And("User checklist verify")
    public void user_chechlist_verify() {
        checkOut.chechlist();
        extentTest.log(LogStatus.PASS, "User checklist verify");
    }

    @Then("User click button Place Order")
    public void user_click_button_Place_Order() {
        checkOut.setBtnPlaceOrder();
        extentTest.log(LogStatus.PASS, "User click button Place Order");
    }


}
