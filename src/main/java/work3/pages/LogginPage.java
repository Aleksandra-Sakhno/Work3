
package work3.pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import work3.utils.Properties;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import static work3.pages.DashboardPage.catalog;
import work3.tests.BaseTest;

public class LogginPage {
private final EventFiringWebDriver driver;
public static By emailInput =By.id("email");
private final By passInput=By.id("passwd");
private final By loginBtb=By.name("submitLogin"); 
private final String email="webinar.test@gmail.com";
private final String password="Xcg7299bnSmMuRLp9ITw";
private final BaseTest bt;

public LogginPage (EventFiringWebDriver  driver){
    this.driver=driver; 
    this.bt=new BaseTest(driver);
}

public void open(){
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.get(Properties.getBaseAdminUrl());}

public void emailInput (){
    bt.findPrint(driver, emailInput, email);}
    
public void passWdInput (){
    bt.findPrint(driver, passInput, password);}

public void clickBtn (){
    bt.findClickWait(driver, loginBtb, DashboardPage.catalog);}
    

}
