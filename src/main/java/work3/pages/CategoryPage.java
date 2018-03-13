package work3.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import work3.tests.BaseTest;

public class CategoryPage {
public static String nameNewCategory="NewCategory";
public static By add=By.cssSelector("#toolbar-nav .process-icon-new");   
public static By newCategory=By.cssSelector("#name_1"); 
public static By saveBtn=By.cssSelector("#category_form_submit_btn"); 
public static By saveOk=By.cssSelector(".alert-success");           
public static By sortUp=By.xpath("//span[@class='title_box'][contains(text(), 'Имя')]//i[@class='icon-caret-up']");   
public static By placeCategory=By.xpath("//td[contains(text(), nameNewCategory)]");
private final BaseTest bt;
private final EventFiringWebDriver driver;  
    
public CategoryPage (EventFiringWebDriver  driver){
        this.driver=driver;
        this.bt=new BaseTest(driver);}

public void clickAdd(){
    bt.findClickWait(driver, add, newCategory);}

public void makeCategory(){
    bt.findPrint(driver, newCategory, nameNewCategory);}
    
public void clickSave(){
    bt.findClickWait(driver, saveBtn, saveOk);}

public void clickSort(){
    bt.findClickWait(driver, sortUp, placeCategory);
    System.out.println("New category found");}

public void quit(){
    bt.quitDriver(driver);}

}
