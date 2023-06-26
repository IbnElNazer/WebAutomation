package pages;

import org.openqa.selenium.By;

public class UserAccountPage {
    private By ProfileButton = By.xpath("/html/body/div[1]/div[1]/div/div[6]/div[1]/div/div/ul/li[5]/span/a");
    private By EditProfileButton = By.className("button-header-container button-header-container-desktop");
    private By NameField = By.id("profile_name");
    private By SaveButton =By.id("save-public-activity");
    private By SaveSuccessMessage = By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div/form/div/div[1]/div/div/span");
}
