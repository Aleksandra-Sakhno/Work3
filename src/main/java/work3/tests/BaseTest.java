
package work3.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import work3.utils.Properties;
import work3.utils.EventHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
    
    private static WebDriver getDriver(){
        String browser=Properties.getBrowser();
        switch(browser) {
            case "firefox": 
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
                return new FirefoxDriver();
            case "ie":
            case "internet explorer":
                System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/Drivers/IEDriverServer.exe");
                return new InternetExplorerDriver();
            case "chrome":
            default:
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
                return new ChromeDriver();
            }
        
        }
       
    public static EventFiringWebDriver getGonfiguredDriver() {
        WebDriver driver=getDriver();
        driver.manage().window().maximize();
        EventFiringWebDriver webDriver=new EventFiringWebDriver(driver);
        webDriver.register(new EventHandler());
        return webDriver;
        }
    
    private final EventFiringWebDriver driver;
    
    public BaseTest (EventFiringWebDriver  driver){
        this.driver=driver;}
    
    public void waiteBy( By locat) {
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locat));}
    
    public void findClickWait(EventFiringWebDriver driver,By locat1, By locat2){
        WebElement el=driver.findElement(locat1);
        el.click();
        waiteBy(locat2);
    }
    public void findPrint (EventFiringWebDriver driver, By locat,String keys)
        {driver.findElement(locat).sendKeys(keys); }
     
    public void fixWait(By locat1, By locat2){
        Actions bld=new Actions(driver);
        WebElement el=driver.findElement(locat1);
        bld.moveToElement(el).build().perform();
        waiteBy(locat2);}
    
    public void quitDriver(EventFiringWebDriver driver) {
        driver.quit();}
    
    
}

 