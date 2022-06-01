package pagetest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.Home;

import java.util.concurrent.TimeUnit;

public class Hometest {
WebDriver driver;

@Test(priority = 3)
    public void RadioButton(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://courses.letskodeit.com/practice");
    Home h=  PageFactory.initElements(driver, Home.class);
    h.varifyradiobutton();
}
    @Test(priority = 2)
public void Dropdown(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(12,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.manage().deleteAllCookies();
    driver.get("https://courses.letskodeit.com/practice");
    Home h=PageFactory.initElements(driver,Home.class);
    h.varifydropdown();
}

    @Test(priority = 0)
    public void MultiSelect(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://courses.letskodeit.com/practice");
    Home h=PageFactory.initElements(driver,Home.class);
    h.varifymultiselection();

}
    @Test(priority = 0)
    public void Checkbox(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.get("https://courses.letskodeit.com/practice");
    Home h=PageFactory.initElements(driver,Home.class);
    h.varifycheckbox();


}

}
