package hellocucumber;

import Pages.GoogleTranslatorPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stepdefs{

    WebDriver driver;
    String BaseURL = "https://translate.google.com";


    @Given("I am on the Standard form of translator page on URL {string}")
    public void i_am_on_the_Standard_form_of_translator_page_on_URL(String BaseURL) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BaseURL);

    }

    @Then("I should see empty form to input text for translation")
    public void i_should_see_empty_form_to_input_text_for_translation() {
        GoogleTranslatorPage googleTranslatorPage = new GoogleTranslatorPage(driver);
        googleTranslatorPage.clearInputForm();
    }

    @Given("the user is on the google translate page")
    public void the_user_is_on_the_google_translate_page() {

    }

    @Given("selected languages from {string} to {string}")
    public void selected_languages_from_to(String string, String string2) {
        GoogleTranslatorPage googleTranslatorPage = new GoogleTranslatorPage(driver);
        googleTranslatorPage.selectLanguageFromWhichTranslate();

    }

//    @When("the user looks up the translation of the word {string}")
//    public void the_user_looks_up_the_translation_of_the_word(String string) {
//
//    }
//
//    @Then("they should see the translation {string}")
//    public void they_should_see_the_translation(String string) {
//
//    }
//
//    @Then("number of characters must be {string}.")
//    public void number_of_characters_must_be(String string) {
//
//    }
//
//    @Then("they should see the definition {string}")
//    public void they_should_see_the_definition(String string) {
//
//    }
}
