package org.example.Pages;

import org.example.StepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_addNewUser {

    public WebElement userName() {
        return Hooks.driver.findElement(By.name("username"));
    }

    public WebElement password() {
        return Hooks.driver.findElement(By.name("password"));
    }

    public WebElement loginButton() {
        return Hooks.driver.findElement(By.className("orangehrm-login-button"));
    }

    public void loginFunction(String username, String password) {
        userName().sendKeys(username);
        password().sendKeys(password);
        loginButton().click();
    }

    public WebElement adminTab() {
        return Hooks.driver.findElement(By.cssSelector("ul[class=\"oxd-main-menu\"] li:nth-child(1)"));
    }

    public WebElement addNewUserButton() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]"));
    }

    public WebElement role() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-row\"] .oxd-grid-item:nth-child(1)"));
    }

    public WebElement employeeName() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-row\"] .oxd-grid-item:nth-child(2) input"));
    }

    public WebElement status() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-row\"] .oxd-grid-item:nth-child(3)"));
    }

    public WebElement employeeUserName() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-row\"] .oxd-grid-item:nth-child(4) input"));
    }

    public WebElement employeePassword() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-row user-password-row\"] .oxd-grid-item:nth-child(1) input"));
    }

    public WebElement employeeConfirmPassword() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-row user-password-row\"] .oxd-grid-item:nth-child(2) input"));
    }

    public WebElement submitButton() {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]"));
    }

    public WebElement getCurrentUsers(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"orangehrm-horizontal-padding orangehrm-vertical-padding\"] span[class=\"oxd-text oxd-text--span\"]"));
    }
    public WebElement search(){
        return Hooks.driver.findElement(By.cssSelector("div[data-v-957b4417] input[class=\"oxd-input oxd-input--active\"]"));
    }
    public WebElement delete(){
        return Hooks.driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-trash\"]"));
    }
    public WebElement ConfirmDelete(){
        return Hooks.driver.findElement(By.cssSelector("i[class=\"oxd-icon bi-trash oxd-button-icon\"]"));
    }
    public WebElement resetSearch(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"oxd-form-actions\"] button[class=\"oxd-button oxd-button--medium oxd-button--ghost\"]"));
    }
}
