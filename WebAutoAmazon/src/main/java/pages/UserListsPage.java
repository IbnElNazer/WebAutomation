package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserListsPage extends BasePage {

    private By CreateListButton= By.id("createList");
    private By ListNameField= By.id("list-name");
    private By CreateButton = By.id("wl-redesigned-create-list");
    private By FirstListNameArea = By.xpath(("(//div[1]/span[contains(@id,'wl-list-entry-title')])[1]"));
    private By FirstListPrivacyArea =By.xpath("(//div/div[contains(@id,'wl-list-entry-privacy')])[1]");
    private By MoreHover =By.id("overflow-menu-popover-trigger");
    private By ManageListButton =By.id("editYourList");
    private By PrivacyListDropdown =By.id("list-settings-privacy");
    private By SaveListButton =By.id("list-settings-save");

    public UserListsPage(WebDriver driver){
        this.driver = driver;
    }



    public void clickCreateListButton(){
        clickLink(CreateListButton);
    }
    public void insertListName(String name){
        driver.findElement(ListNameField).sendKeys(name);
    }
    public void clickCreateButton(){
        clickLink(CreateButton);
    }
    public String getFirstListName(){
        return getText(FirstListNameArea);
    }
    public String getFirstListPrivacy(){
        return getText(FirstListPrivacyArea);
    }
    public void hoverToMore(){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(MoreHover));
    }
    public void clickManageListButton(){
        clickLink(ManageListButton);
    }
    public void selectPrivacy (String x){
        Select option = new Select(driver.findElement(PrivacyListDropdown));
        option.selectByVisibleText(x);
    }
    public void clickSaveListButton(){
        clickLink(SaveListButton);
    }


}
