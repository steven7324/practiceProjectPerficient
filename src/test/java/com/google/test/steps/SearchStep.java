package com.google.test.steps;

import com.google.test.pageobjects.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchStep {

    SearchPage search;

    @Step
    public void aWord(String word) {
        search.typeText(word);
        search.pressButton();
    }
}
