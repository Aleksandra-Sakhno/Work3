
package work3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import work3.tests.BaseTest;

public class DashboardPage {

public static By catalog =By.xpath("//span[contains(text(), 'Каталог')]");                     
public static By category=By.id("subtab-AdminCategories");

private final EventFiringWebDriver driver;  
private final BaseTest bt;    


public DashboardPage (EventFiringWebDriver  driver){
        this.driver=driver;
        this.bt=new BaseTest(driver);}
     
   public void fixCatalog(){
    bt.fixWait(catalog, category); }
    
   public void clickCategory (){
    bt.findClickWait(driver, category, CategoryPage.add);}  
    
}
