package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_addNewUser;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.security.Key;

import static org.example.StepDefs.Hooks.driver;

public class D01_addNewUser {

    P01_addNewUser object = new P01_addNewUser();
    Actions actions = new Actions(driver);
    SoftAssert softAssert = new SoftAssert();

    public static int extractNumberBetweenParentheses(String text) {
        int start = text.indexOf('(') + 1;
        int end = text.indexOf(')');

        // Check if both parentheses are found
        if (start > 0 && end > start) {
            String number = text.substring(start, end);
            return Integer.parseInt(number);
        } else {
            throw new IllegalArgumentException("No number found between parentheses in the text: " + text);
        }
    }

    @Given("the User Is On The Login Page")
    public void theUserIsOnTheLoginPage() {
        System.out.println("Welcome!!");
    }

    @When("the User Enter {string} As Username And {string} As Password")
    public void theUserEnterAsUsernameAndAsPassword(String username, String password) {
        object.loginFunction(username, password);
    }

    @And("clicks On The Admin Tab To Add New User")
    public void clicksOnTheAdminTabToAddNewUser() throws InterruptedException {
        Thread.sleep(1000);
        object.adminTab().click();
        String currentUsers=object.getCurrentUsers().getText();

        int userCount = extractNumberBetweenParentheses(currentUsers);
        System.out.println(userCount);
        object.addNewUserButton().click();
        object.role().click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        object.employeeName().sendKeys("a");
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        object.status().click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        object.employeeUserName().sendKeys("Nesmaaaa11");
        object.employeePassword().sendKeys("nesma123");
        object.employeeConfirmPassword().sendKeys("nesma123");
        object.submitButton().click();
        Thread.sleep(1000);
        String UsersAfterAdding=object.getCurrentUsers().getText();
        int userNewCount = extractNumberBetweenParentheses(UsersAfterAdding);
        System.out.println(userNewCount);
        // Add assert here
        softAssert.assertEquals(userNewCount,userCount+1);


        object.search().sendKeys("Nesmaaaa11" + Keys.ENTER);
        Thread.sleep(5000);
        object.delete().click();
        object.ConfirmDelete().click();
        Thread.sleep(500);
        object.resetSearch().click();
        Thread.sleep(500);
        String UsersAfterDeleting=object.getCurrentUsers().getText();
        int DeletedUsersCount = extractNumberBetweenParentheses(UsersAfterDeleting);
        System.out.println(DeletedUsersCount);
        // Add assert here
        softAssert.assertEquals(DeletedUsersCount,userCount);
        softAssert.assertAll();

    }

}
