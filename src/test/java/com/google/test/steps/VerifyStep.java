package com.google.test.steps;

import com.google.test.pageobjects.VerifyPage;
import net.thucydides.core.annotations.Step;

public class VerifyStep {

    VerifyPage verify;

    @Step
    public void theElementIsDisplayed() {
        verify.theAssertionIsOk();
    }
}
