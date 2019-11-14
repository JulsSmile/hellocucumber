package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GoogleTranslatorPage extends BasePage{

    private static final String BASE_URL = "https://translate.google.com/?hl=ru";

    private By openLeftSelectLangMenu = By.cssSelector(".sl-wrap [aria-label]");
    private By openRightSelectLangMenu = By.cssSelector(".tl-wrap [aria-label]");
    private By definitionOfTheWord = By.xpath("//div[contains(text(),'the tree which bears apples.')]");
    private By inputFormToTranslate = By.xpath("//*[@id='source']");
    private By getResultOfTranslation = By.xpath("//*[@class= 'tlid-translation translation']");
    private By setLangFromWhichToTranslate = By.xpath("//*[@id='sl_list-search-box']");
    private By setLangToWhichToTranslate = By.xpath("//*[@id='tl_list-search-box']");
    private By setTheWOrdToTranslate = By.cssSelector("textarea#source");

    private WebElement inputFormToTranslate() {
        return getDriver().findElement(inputFormToTranslate);
    }

    private WebElement setTheWOrdToTranslate() {
        return getDriver().findElement(setTheWOrdToTranslate);
    }

    private WebElement openDropDownMendyFromLang() {
        return getDriver().findElement(openLeftSelectLangMenu);
    }

    private WebElement openDropDownMendyToLang() {
        return getDriver().findElement(openRightSelectLangMenu);
    }

    private WebElement definitionOfTheWord() {
        return getDriver().findElement(definitionOfTheWord);
    }

    private WebElement getResultOfTranslation() {
        return getDriver().findElement(getResultOfTranslation);
    }

    private WebElement setLangToWhichToTranslate() {
        return getDriver().findElement(setLangToWhichToTranslate);
    }

    private WebElement setLangFromWhichToTranslate() {
        return getDriver().findElement(setLangFromWhichToTranslate);
    }


    public void goToBasePage() {
        getDriver().navigate().to(BASE_URL);
    }

    public void addSelectedLangFromEnToUa(String langFrom, String langTo) {
        openDropDownMendyFromLang().click();
        setLangFromWhichToTranslate().sendKeys(langFrom);
        setLangFromWhichToTranslate().sendKeys(Keys.ENTER);
        openDropDownMendyToLang().click();
        setLangToWhichToTranslate().sendKeys(langTo);
        setLangToWhichToTranslate().sendKeys(Keys.ENTER);
    }

    public void inputTranslationWord(String searchWord) {
        inputFormToTranslate().sendKeys(searchWord);
        inputFormToTranslate().sendKeys(Keys.ENTER);
    }

    public void resultOfTranslation(String translatedWord) {
        assertTrue("Translated word is " + translatedWord, getResultOfTranslation().getText().equalsIgnoreCase(translatedWord));
    }

    public void lengthOfWord(int wordToTranslate) {
        int lengthOfWord = setTheWOrdToTranslate().getText().length();
        assertEquals("resultLength is " + lengthOfWord, wordToTranslate, lengthOfWord);
    }

    public void visibleDefinition(String string) {
        assertEquals(string, definitionOfTheWord().getText());
    }
}
