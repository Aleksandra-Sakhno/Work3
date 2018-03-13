package work3.tests;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import work3.pages.CategoryPage;
import work3.pages.DashboardPage;
import work3.pages.LogginPage;
import static work3.tests.BaseTest.getGonfiguredDriver;

public class MyTest {
public static void main( String[] args) throws InterruptedException{
   
EventFiringWebDriver driver = getGonfiguredDriver();
  
LogginPage logPage=new  LogginPage(driver); 
    logPage.open(); 
    logPage.emailInput ();
    logPage.passWdInput ();
    logPage.clickBtn ();
    
DashboardPage dashPage=new  DashboardPage(driver); 
    dashPage.fixCatalog();
    dashPage.clickCategory ();
    
CategoryPage catPage=new  CategoryPage(driver);
    catPage.clickAdd();  
    catPage.makeCategory();
    catPage.clickSave();
    catPage.clickSort();
    catPage.quit();
    }

}