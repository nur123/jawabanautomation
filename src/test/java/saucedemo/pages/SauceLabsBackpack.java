package saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceLabsBackpack {

    public WebDriver driver;

    public SauceLabsBackpack(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private By cartButton = By.xpath("//div[@id='shopping_cart_container']");

    @Step("Click \"ADD TO CART\" button on the Sauce Labs Backpack page")
    public void clickAddToCartButton() {
//        driver.findElement(addToCartButton).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }

    @Step("Click Cart icon on the Sauce Labs Backpack page")
    public void clickCartButton() {
//        driver.findElement(cartButton).click();
        driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
    }
}