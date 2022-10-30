package com.juaracoding.ujiancucumber.pages;

import com.juaracoding.ujiancucumber.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut {
    private final WebDriver driver;

    public CheckOut(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/a")
    WebElement txtSearch;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/a/i")
    WebElement clickSearch;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement writeItem;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/input[1]")
    WebElement txtDress;


    @FindBy(xpath = "//a[normalize-space()='white milkmaid hook and eye bodycon midi dress']")
    WebElement itemOne;

    @FindBy(xpath = "//a[normalize-space()='pink fruit graphic fitted t shirt']")
    WebElement itemTwo;



    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement selectColor;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement selectSize;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddToCartOne;


    @FindBy(xpath = " //button[normalize-space()='Add to cart']")
    WebElement btnAddToCartTwo;

    @FindBy(xpath = "//a[normalize-space()='Checkout']")
    WebElement menuCheckOut;

    @FindBy(id = "terms")
    WebElement checklist;

    @FindBy(xpath = "//*[@id=\"place_order\"]")
    WebElement btnPlaceOrder;




    public String geTxtSearch(){
        return txtSearch.getText();
    }

    public void clickSearchIcon(){
        clickSearch.click();
    }

    public void writeTheItem(String item){
        writeItem.sendKeys(item);
    }

    public void pressEnter(){
        writeItem.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)");
    }

    public void itemOne(){
        itemOne.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
    }


    public void setSelectColorandSizeItemOne(String color, String size){
        this.selectColor.sendKeys(color);
        this.selectSize.sendKeys(size);
    }


    public void itemTwo(){
        itemTwo.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,550)");
    }


    public void setSelectColorandSizeItemTwo(String color, String size){
        this.selectColor.sendKeys(color);
        this.selectSize.sendKeys(size);
    }


    public void setBtnAddToCartOne(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnAddToCartOne);
    }

    public void setBtnAddToCartTwo(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnAddToCartTwo);

    }

    public void scrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,150)");
    }

    public void setMenuCheckOut(){
        menuCheckOut.click();
    }

    public void scrollDownPageCheckout() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
    }

    public void chechlist() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", checklist);
    }

    public void setBtnPlaceOrder() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnPlaceOrder);
        js.executeScript("window.scrollBy(0,250)");

    }

}
