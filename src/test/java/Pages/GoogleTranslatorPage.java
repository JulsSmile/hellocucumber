package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleTranslatorPage{
    private WebDriver driver;
    private String BaseURL = "https://translate.google.com";

    private By selectLanguageFromWhichTranslate  = By.xpath("//*[@class = 'sl-more tlid-open-source-language-list']");
    private By selectLanguageToWhichTranslate  = By.xpath("//*[@class = 'tl-more tlid-open-target-language-list']']");
}
