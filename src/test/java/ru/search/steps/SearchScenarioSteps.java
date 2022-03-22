package ru.search.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ru.search.pages.ResultModal;
import ru.search.pages.SearchPage;

public class SearchScenarioSteps {

    private SearchPage searchPage;
    private ResultModal resultModal;

    @Given("^user opens the site$")
    public void givenUserOpensTheSite() {
        searchPage.open();
    }

    @Given("user clicks on input")
    public void givenUserClicksOnInput() {
        searchPage.clickSearchInput();
    }

    @When("^user (?:searches for|searches) (.*)$")
    public void whenUserInputSearchText(String text) {
        searchPage.inputToSearchField(text);
    }

    @When("user clicks on Search button")
    public void whenUserClicksSearchBtn(){
        searchPage.clickSearchBtn();
    }

    @Then("user sees list of results")
    public void thenUserSeesListOfResults(){
        Assert.assertTrue(resultModal.areResultsDisplayed());
    }

    @Then("(.*) should be displayed")
    public void thenShouldBeDisplayed(){
        resultModal.checkResult();
    }
}
