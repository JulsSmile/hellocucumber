package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTranslatorPage{

    WebDriver driver;

    private By selectLanguageFromWhichTranslate = By.xpath("//*[@class = 'sl-more tlid-open-source-language-list']");
    private By selectLanguageToWhichTranslate = By.xpath("//*[@class = 'tl-more tlid-open-target-language-list']");
    private By selectEnglishLanguage = By.xpath("//*[@class= 'language_list_item language_list_item_language_name' and text()= 'англійська']");
    private By selectUkrainianLanguage = By.xpath("//*[@class= 'language_list_item language_list_item_language_name' and text()= 'українська']");
    private By definitionOfTheWord = By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]");

    private By inputFormToTranslate = By.xpath("//*[@id='source']");
    private By getResultOfTranslation = By.xpath("//*[@class= 'tlid-translation translation']");

    public GoogleTranslatorPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement inputFormToTranslate() {
        return driver.findElement(inputFormToTranslate);
    }

    public void clearInputForm() {
        inputFormToTranslate().sendKeys("mnkljkjm");
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
public void isRightURL(){
    String URL = driver.getCurrentUrl();
    Assert.assertEquals(URL, "https://translate.google.com/?hl=uk");
}
    public void addSelectedLangFromEnToUa() {
        selectLanguageToWhichTranslate().click();
        selectEnglishLanguage().click();
    }

}
