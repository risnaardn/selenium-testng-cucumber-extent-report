package com.juaracoding.ujiancucumber.step_definitions;

import com.juaracoding.ujiancucumber.pages.SearchAndAdd;
import com.juaracoding.ujiancucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestSearchAndAdd {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private SearchAndAdd searchAndAdd = new SearchAndAdd();

    public TestSearchAndAdd() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    // Test Case Item 1
    @When("User open web shop")
    public void user_open_web_shop() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User open web shop");

    }

    @And("User click button search")
    public void user_click_button_search() {
        searchAndAdd.clickSearchIcon();
        extentTest.log(LogStatus.PASS, "User click button search");
    }


    @And("User write the product")
    public void user_write_the_product() {
        searchAndAdd.writeTheItem("DRESS");
        extentTest.log(LogStatus.PASS, "User write the product");
    }

    @And("User press enter")
    public void user_press_enter() {
        searchAndAdd.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter");
    }

    @And("User choose the item")
    public void user_choose_the_item() {
        searchAndAdd.itemOne();
        extentTest.log(LogStatus.PASS, "User choose the item");
    }

    @And("User select size and color")
    public void user_select_size_and_color() {
        searchAndAdd.setSelectColorandSizeItemOne("White", "Medium");
        extentTest.log(LogStatus.PASS, "User select size and color");
    }

    @Then("User click button Add to cart")
    public void user_click_button_add_to_cart_One() {
        searchAndAdd.setBtnAddToCartOne();
        extentTest.log(LogStatus.PASS, "User click button Add to cart");
    }


    // Test Case Item two
    @When("User already open web")
    public void user_open_web_shop_itemTwo() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User already open web");

    }

    @And("User click button search again")
    public void user_click_button_search_itemTwo() {
        searchAndAdd.clickSearchIcon();
        extentTest.log(LogStatus.PASS, "User click button search again");
    }


    @And("User write the product two")
    public void user_write_the_product_itemTwo() {
        searchAndAdd.writeTheItem("SHIRT");
        extentTest.log(LogStatus.PASS, "User write the product two");
    }

    @And("User press enter again")
    public void user_press_enter_itemTwo() {
        searchAndAdd.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter again");
    }

    @And("User choose the item two")
    public void user_choose_the_item_itemTwo() {
        searchAndAdd.itemTwo();
        extentTest.log(LogStatus.PASS, "User choose the item two");
    }

    @And("User select size and color for item two")
    public void user_select_size_and_color_itemTwo() {
        searchAndAdd.setSelectColorandSizeItemTwo("Pink", "32");
        extentTest.log(LogStatus.PASS, "User select size and color for item two");
    }

    @Then("User click button Add to cart Item two")
    public void user_click_button_add_to_cart_itemTwo() {
        searchAndAdd.setBtnAddToCartOne();
        extentTest.log(LogStatus.PASS, "User click button Add to cart Item two");
    }


}

