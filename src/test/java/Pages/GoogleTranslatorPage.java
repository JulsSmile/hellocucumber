package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleTranslatorPage{

    private WebDriver driver;

    private By selectLanguageFromWhichTranslate = By.xpath("//*[@class = 'sl-more tlid-open-source-language-list']");
    private By selectLanguageToWhichTranslate = By.xpath("//*[@class = 'tl-more tlid-open-target-language-list']");
    private By selectEnglishLanguage = By.xpath("//*[@class= 'language_list_item language_list_item_language_name' and text()= 'англійська']");
    private By selectUkrainianLanguage = By.xpath("//*[@class= 'language_list_item language_list_item_language_name' and text()= 'українська']");
    private By definitionOfTheWord = By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[2]/div[1]");

    private By inputWordToTranslate = By.xpath("//*[@id='source']");
    private By getResultOfTranslation = By.xpath("//*[@class= 'tlid-translation translation']");


    public By getSelectLanguageFromWhichTranslate() {
        return selectLanguageFromWhichTranslate;
    }

    public By getSelectLanguageToWhichTranslate() {
        return selectLanguageToWhichTranslate;
    }

    public By getSelectEnglishLanguage() {
        return selectEnglishLanguage;
    }

    public By getSelectUkrainianLanguage() {
        return selectUkrainianLanguage;
    }

    public By getDefinitionOfTheWord() {
        return definitionOfTheWord;
    }

    public By getInputWordToTranslate() {
        return inputWordToTranslate;
    }

    public By getGetResultOfTranslation() {
        return getResultOfTranslation;
    }

}
