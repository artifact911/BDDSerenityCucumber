package ru.search.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://poisk-cheloveka.ru")
public class SearchPage extends PageObject {

    @FindBy(xpath = "//input[@name='user_q']")
    WebElementFacade searchInput;

    @FindBy(xpath = "//form[@class='top_search_form']/input[@value='Найти']")
    WebElementFacade searchBtn;

    public void inputToSearchField(String text) {
        searchInput.type(text);
    }

    public void clickSearchInput() {
        searchInput.click();
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }
}
