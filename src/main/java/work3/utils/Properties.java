
package work3.utils;

import org.openqa.selenium.remote.BrowserType;


public class Properties {
public  static final String DEFAULT_BASE_ADMIN_URL="http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";   
private static final String DEFAULT_BROWSER=BrowserType.CHROME;       

public static String getBaseAdminUrl(){
    return System.getProperty(EnvironmentVariables.BASE_ADMIN_URL.toString(),DEFAULT_BASE_ADMIN_URL);}

public static String getBrowser(){
    return System.getProperty(EnvironmentVariables.BROWSER.toString(),DEFAULT_BROWSER);}
//public static void main( String[] args) throws InterruptedException {System.out.println(" dgrt   ");}
        }
enum EnvironmentVariables {
    BASE_ADMIN_URL("env.admin.url"),
    BROWSER("browser");

 private final String value;
 EnvironmentVariables (String value) {this.value=value;}

 
    @Override
    public String toString(){return value;}
}
