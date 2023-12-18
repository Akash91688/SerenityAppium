package testcases;

import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.WebDriverFacade;
@RunWith(SerenityRunner.class)
public class TestNativeApp extends PageObject{
	
	
	@Managed(driver="appium")
	WebDriver appium;
	@Test
	public void nativeappTest() throws InterruptedException 
	{
	    find(By.id("org.wordpress.android:id/create_site_button")).click();
		find(By.id("org.wordpress.android:id/email_address")).sendKeys("trainer@way2automation.com");
		find(By.id("org.wordpress.android:id/username")).sendKeys("RahulArora");
		find(By.id("org.wordpress.android:id/password")).sendKeys("sedfsfddsf");
		find(By.id("org.wordpress.android:id/site_url")).sendKeys("way2automation.com");
		find(By.id("org.wordpress.android:id/signup_button")).click();
		Thread.sleep(3000);
		
	}

}
