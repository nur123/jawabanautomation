package saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Cart {

    public WebDriver driver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    private By checkoutButton = By.xpath("//button[@id='checkout']");
    private By removeButton = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    private By removeButtons = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    private By listOfItems = By.xpath("//div[@class='cart_item']");
    private By continueShoppingButton = By.xpath("//input[@id='continue']");

    @Step("Delete one product item from the cart by clicking \"REMOVE\" button")
    public void removeOneItemFromCart() {
//        driver.findElement(removeButton).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
    }

    @Step("Delete all items from the cart by clicking button \"REMOVE\" near every product item")
    public void removeAllItemsFromCart() {
        List<WebElement> removeButtonsList = driver.findElements(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
        for (int i = 0; i < removeButtonsList.size(); i++) {
            removeButtonsList.get(i).click();
        }
    }

    public int listOfItems() {
        List<WebElement> items = driver.findElements(By.xpath("//div[@class='cart_item']"));
        return items.size();
    }

    @Step("Click \"CHECKOUT\" button on the Cart page")
    public void clickCheckoutButton() {
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
    }

    @Step("Click \"CONTINUE SHOPPING\" button on the Cart page")
    public void clickContinueShoppingButton() {
        driver.findElement(By.xpath("//input[@id='continue']")).click();
    }
}