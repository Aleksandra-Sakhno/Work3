package work3.utils;

import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class EventHandler implements WebDriverEventListener {
    
    @Override
    public void beforeNavigateTo(String s, WebDriver wd) {
        System.out.println("Opan url:  "+s);}
    
    @Override
    public void afterNavigateTo(String s, WebDriver wd) {
        System.out.println("Page successfully opened");
        System.out.println();}
        
    @Override
    public void beforeAlertAccept(WebDriver wd) {
        System.out.println("Alert will be accepted");}
     
    @Override
    public void afterAlertAccept(WebDriver wd) {
        System.out.println("Alert successfully accepted");
        System.out.println();}
        
    @Override
    public void afterAlertDismiss(WebDriver wd) {
        System.out.println("Alert successfully dismiss");
        System.out.println();}
        
    @Override
    public void beforeAlertDismiss(WebDriver wd) {
        System.out.println("Alert will be dismissed");}
        
    @Override
    public void beforeNavigateBack(WebDriver wd) {
        System.out.println("Navigating back to the previous page");}
        
    @Override
    public void afterNavigateBack(WebDriver wd) {
        System.out.println("Navigated back to the previous page");
        System.out.println();}
       
    @Override
    public void beforeNavigateForward(WebDriver wd) {
        System.out.println("Navigating forward to the next page");}
        
    @Override
    public void afterNavigateForward(WebDriver wd) {
        System.out.println("Navigated forward to the next page");
        System.out.println();}
        
    @Override
    public void beforeNavigateRefresh(WebDriver wd) {
        System.out.println("The page will be refreshed");}
       
    @Override
    public void afterNavigateRefresh(WebDriver wd) {
        System.out.println("The page successfully refreshed");
        System.out.println();}
        
    @Override
    public void beforeFindBy(By by, WebElement we, WebDriver wd) {
        System.out.println("Seach for element: "+by.toString());}

    @Override
    public void afterFindBy(By by, WebElement we, WebDriver wd) {
        System.out.println("Element found successfully");
        System.out.println();}
    
    @Override
    public void beforeClickOn(WebElement we, WebDriver wd) {
        System.out.println("Trying to click on: " + we.toString());}
    
    @Override
    public void afterClickOn(WebElement we, WebDriver wd) {
        System.out.println("Element successfully clicked");
        System.out.println();}
    
    @Override
    public void beforeChangeValueOf(WebElement we, WebDriver wd, CharSequence[] c) {
        System.out.println("Fill input "+we.getAttribute("id")+" with value "+Arrays.toString(c));}
    
    @Override
    public void afterChangeValueOf(WebElement we, WebDriver wd, CharSequence[] css) {
        System.out.println("Value successfully changed");
        System.out.println();}
    
    @Override
    public void beforeScript(String s, WebDriver wd) {
        System.out.println("Before executing the script : " + s);}
        
    @Override
    public void afterScript(String s, WebDriver wd) {
        System.out.println("After execution of script : "+s);
        System.out.println();}
       
    @Override
    public void onException(Throwable thrwbl, WebDriver wd) {
        System.out.println("Exception occured: " + thrwbl);
        System.out.println();}
        
}
