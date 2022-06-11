package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseDriver {
    protected WebDriver driver = null;
    protected String baseUrl = "";
    protected DevTools devTools;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            System.out.println("Firefox");
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver");
            driver = new FirefoxDriver();
            devTools = ((FirefoxDriver) driver).getDevTools();
        }
        if (browser.equalsIgnoreCase("chrome")) {
            System.out.println("Chrome");
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
            driver = new ChromeDriver();
            devTools = ((ChromeDriver) driver).getDevTools();
        }
//		if(browser.equalsIgnoreCase("safari")){
//			System.out.println("Safari");
//			System.setProperty("webdriver.safari.driver", "resources/SafariDriver.safariextension");
//			driver = new SafariDriver();
//		}
        baseUrl = "https://www.google.com/";
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000L));
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
