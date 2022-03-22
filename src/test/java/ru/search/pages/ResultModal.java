package ru.search.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultModal extends PageObject {

    @FindBy(xpath = "//div[@class='modal_result_container']")
    WebElementFacade resultContainer;


    public boolean areResultsDisplayed() {
        resultContainer.waitUntilVisible();
        return resultContainer.isDisplayed();
    }


    //TODO подумать. Перевернутые имена приходят иногда
    public void checkResultNames(String name) {
        if (areResultsDisplayed()) {
            List<WebElement> resultList = getDriver().findElements(By.xpath("//div[@class='modal_result_container']//a"));
            for (WebElement value : resultList) {
                String text = value.getText();
                Assert.assertEquals(value.getText().trim(), name.trim());
            }
        } else System.out.println("NoSuchName");
    }

    public void checkResult(){
        Assert.assertTrue(getDriver().findElements(By.xpath("//div[@class='modal_result_container']//a")).size() > 0);
    }
}
