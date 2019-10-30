package pages;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GoogleTranslatorPage extends DriverAbstract{

    private String BaseURL = "https://translate.google.com/?hl=ru";

    private By openLeftSelectLangMenu = By.cssSelector(".sl-wrap [aria-label]");
    private By openRightSelectLangMenu = By.cssSelector(".tl-wrap [aria-label]");
    private By definitionOfTheWord = By.xpath("//div[contains(text(),'the tree which bears apples.')]");
    private By inputFormToTranslate = By.xpath("//*[@id='source']");
    private By getResultOfTranslation = By.xpath("//*[@class= 'tlid-translation translation']");
    private By setLangFromWhichToTranslate = By.xpath("//*[@id='sl_list-search-box']");
    private By setLangToWhichToTranslate = By.xpath("//*[@id='tl_list-search-box']");
    private By setTheWOrdToTranslate = By.cssSelector("textarea#source");

    public WebElement inputFormToTranslate() {
        return driver.findElement(inputFormToTranslate);
    }

    public WebElement setTheWOrdToTranslate() {
        return driver.findElement(setTheWOrdToTranslate);
    }

    public WebElement openDropDovmMenyFromLang() {
        return driver.findElement(openLeftSelectLangMenu);
    }

    public WebElement openDropDovnMenyToLang() {
        return driver.findElement(openRightSelectLangMenu);
    }

    public WebElement definitionOfTheWord() {
        return driver.findElement(definitionOfTheWord);
    }

    public WebElement getResultOfTranslation() {
        return driver.findElement(getResultOfTranslation);
    }

    public WebElement setLangToWhichToTranslate() {
        return driver.findElement(setLangToWhichToTranslate);
    }

    public WebElement setLangFromWhichToTranslate() {
        return driver.findElement(setLangFromWhichToTranslate);
    }


    public void goToBasePage() {
        driver.get(BaseURL);
        Allure.addAttachment("browser opened", BaseURL);
    }

    public void clearInputForm() {
        inputFormToTranslate().clear();
    }

    public void addSelectedLangFromEnToUa(String langFrom, String langTo) {
        openDropDovmMenyFromLang().click();
        setLangFromWhichToTranslate().sendKeys(langFrom);
        setLangFromWhichToTranslate().sendKeys(Keys.ENTER);
        Allure.addAttachment("typing language", langFrom + " language was entered");
        openDropDovnMenyToLang().click();
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
        assertTrue("resultLength is " + lengthOfWord, wordToTranslate == lengthOfWord);
    }

    public void visibleDefinition(String string) {
        assertEquals(string, definitionOfTheWord().getText());
        definitionOfTheWord().getText().equalsIgnoreCase(string);
    }

}
