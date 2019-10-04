package pages;

import hellocucumber.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTranslatorPage extends Hooks{

    WebDriver driver;

    private By selectLanguageFromWhichTranslate = By.xpath("//*[@class = 'sl-more tlid-open-source-language-list']");
    private By selectLanguageToWhichTranslate = By.xpath("//*[@class = 'tl-more tlid-open-target-language-list']");
    private By selectEnglishLanguage = By.xpath("//*[@class= 'language_list_item language_list_item_language_name' and text()= 'англійська']");
    private By selectUkrainianLanguage = By.xpath("//*[@class= 'language_list_item language_list_item_language_name' and text()= 'українська']");
    private By definitionOfTheWord = By.xpath("//div[contains(text(),'the tree which bears apples.')]");
    private By inputFormToTranslate = By.xpath("//*[@id='source']");
    private By getResultOfTranslation = By.xpath("//*[@class= 'tlid-translation translation']");
    private By setLangFromWhichToTranslate = By.xpath("//*[@id='sl_list-search-box']");
    private By setLangToWhichToTranslate = By.xpath("//*[@id='tl_list-search-box']");

    public GoogleTranslatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement inputFormToTranslate() {
        return driver.findElement(inputFormToTranslate);
    }

    public WebElement selectLanguageToWhichTranslate() {
        return driver.findElement(selectLanguageToWhichTranslate);
    }

    public WebElement selectLanguageFromWhichTranslate() {
        return driver.findElement(selectLanguageFromWhichTranslate);
    }

    public WebElement selectEnglishLanguage() {
        return driver.findElement(selectEnglishLanguage);
    }

    public WebElement selectUkrainianLanguage() {
        return driver.findElement(selectUkrainianLanguage);
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

    public void isRightURL() {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://translate.google.com");
    }

    public void clearInputForm() {
        inputFormToTranslate().clear();
    }

    public void addSelectedLangFromEnToUa(String langFrom, String langTo) {
        selectLanguageToWhichTranslate().click();
        setLangFromWhichToTranslate().sendKeys(langFrom);
        selectLanguageFromWhichTranslate().click();
        setLangToWhichToTranslate().sendKeys(langTo);
    }

    public void inputTranslationWord(String searchWord) {
        inputFormToTranslate().sendKeys(searchWord);
    }

    public void resultOfTranslation(String translatedWord) {
        resultOfTranslation(translatedWord);
    }
}
