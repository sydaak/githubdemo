package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Home {
    WebDriver driver;
    @FindBy(xpath = "//input[@id='hondaradio']")
    WebElement radiobutton;
    @FindBy(xpath = "//option[@value='honda']")
    WebElement dropdown;
    @FindBy(xpath = "//select[@id='multiple-select-example']")
    WebElement multiselect;

    @FindBy(xpath ="//input[@id='hondacheck']")//div[@id='checkbox-example-div']
    WebElement checkbox;

    public Home(WebDriver driver){
        this.driver=driver;
    }
    public void varifyradiobutton(){
        radiobutton.click();
    }
    public void varifydropdown(){
        dropdown.click();
    }
    public void varifymultiselection()
    {
        Select select=new Select(multiselect);
        select.selectByIndex(1);
        select.selectByVisibleText("Apple");
       //multiselect.click();
    }
    public void varifycheckbox(){
         //Select select=new Select(checkbox);
        //select.selectByIndex(1);
        //select.selectByValue("honda");
        checkbox.click();
    }
}
