package com.google.test.steps;

import com.google.test.pageobjects.OpenGooglePage;
import net.thucydides.core.annotations.Step;

public class OpenGoogleStep {

    OpenGooglePage openGoogle;

    @Step
    public void page() {
        openGoogle.open();
    }
}
