package com.epam.hicucumber;

import com.epam.pages.DriverAbstract;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.epam.pages.GoogleTranslatorPage;

public class StepDefs {

    private GoogleTranslatorPage googleTranslatorPage = new GoogleTranslatorPage();


    @Given("the user is on the google translate page")
    public void the_user_is_on_the_google_translate_page() {
        googleTranslatorPage.goToBasePage();
    }

    @Given("selected languages from {string} to {string}")
    public void selected_languages_from_to(String langFrom, String langTo) {
        googleTranslatorPage.addSelectedLangFromEnToUa(langFrom, langTo);
    }

    @When("the user looks up the translation of the word {string}")
    public void the_user_looks_up_the_translation_of_the_word(String searchWord) {
        googleTranslatorPage.inputTranslationWord(searchWord);
    }

    @Then("they should see the translation {string}")
    public void they_should_see_the_translation(String appleWord) {
        googleTranslatorPage.resultOfTranslation(appleWord);
    }

    @Then("number of characters must be {int}.")
    public void number_of_characters_must_be(int resultLength) {
        googleTranslatorPage.lengthOfWord(resultLength);
            }

    @Then("they should see the definition {string}")
    public void they_should_see_the_definition(String string) {
        googleTranslatorPage.visibleDefinition(string);
//    DriverAbstract.closeDriver();
    }

    }
