package MricoEgde_WebDriver.M;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver","C:/Software/Driver/msedgedriver.exe" );
        WebDriver driver=new EdgeDriver();
        driver.get("http://www.amazon.co.uk");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
