package com.google.test.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {

    @FindBy(name = "q")
    public WebElementFacade txtSearchBox;

    @FindBy(name = "btnK")
    public WebElementFacade btnSearch;

    public void typeText(String word) {
        txtSearchBox.sendKeys(word);
    }

    public void pressButton() {
        btnSearch.click();
    }
}
