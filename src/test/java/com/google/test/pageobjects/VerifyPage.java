package com.google.test.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class VerifyPage extends PageObject {

    @FindBy(id = "pTwnEc")
    public WebElementFacade verifyElement;

    public void theAssertionIsOk() {
        assertThat(verifyElement.isDisplayed(), equalTo(true));
    }
}
