package pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MWebHomePage extends BasePage {
    By hambergurMenu = By.cssSelector("[class='navbar-toggler-icon']");

    public MWebHomePage(WebDriver driver) {
        super(driver);
    }

    public void toggleMenu(){
        waitAndClick(hambergurMenu);
    }
}
