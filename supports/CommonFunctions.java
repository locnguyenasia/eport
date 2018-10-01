package supports;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class CommonFunctions {
    private static WebDriver driver;
    private static WebDriverWait waiter;
    private static Action action;
    private static final int TIMEOUT = 9;
    private static final String BROWSER = "chrome";
    private static final String URL = "https://google.com";

    //************************************************************************************************************
    public static WebDriver getDriver(){
        return driver;
    }

    //************************************************************************************************************
    public static void launchBrowser(String browser){
        if (browser.equalsIgnoreCase("ie")) {
            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {
            System.err.println("Browser " + browser + " is not defined");
        }
        waiter = new WebDriverWait(driver, TIMEOUT);
    }

    public static void launchBrowser(){
        launchBrowser(BROWSER);
    }

    public static void closeBrowser(){
        if (driver!=null){
            driver.quit();
        }
    }

    //************************************************************************************************************
    public static By getBy(How how, String locator){
        By element = null;
        switch (how){
            case CLASS_NAME:
                element = By.className(locator);
                break;
            case CSS:
                element = By.cssSelector(locator);
                break;
            case ID:
                element = By.id(locator);
                break;
            case ID_OR_NAME:
                element = ByIdOrName.id(locator);
                break;
            case LINK_TEXT:
                element = By.linkText(locator);
                break;
            case NAME:
                element = By.name(locator);
                break;
            case PARTIAL_LINK_TEXT:
                element = By.partialLinkText(locator);
                break;
            case TAG_NAME:
                element = By.tagName(locator);
                break;
            case XPATH:
                element = By.xpath(locator);
                break;
            case UNSET:
                break;
        }
        return element;
    }

    //************************************************************************************************************
    public static void maxWindow(){
        driver.manage().window().maximize();
    }

    public static void visit(String url){
        maxWindow();
        driver.get(url);
    }

    public static void visit(){
        visit(URL);
    }

    //************************************************************************************************************
    public static void waitForElementPresent(By by) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
//            waiter.until(ExpectedConditions.presenceOfElementLocated(by));
//            waiter.until(ExpectedConditions.elementToBeClickable(by));
            waiter.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (TimeoutException e){
            System.out.println(e.toString());
        }
    }

    //************************************************************************************************************
    private static WebElement getElement(By by) {
        waitForElementPresent(by);
        return driver.findElement(by);
    }

    public static void click(By by){
        getElement(by).click();
    }

    //************************************************************************************************************
    public static void fillIn(By by, String withText) {
        getElement(by).clear();
        getElement(by).sendKeys(withText);
    }

    //************************************************************************************************************
    public static String getText(By by) {
        return getElement(by).getText();
    }

    //************************************************************************************************************
    public static Boolean isDisplayed(By by) {
        return getElement(by).isDisplayed();
    }

    public static Boolean isEnabled(By by) {
        return getElement(by).isEnabled();
    }

    public static Boolean isSelected(By by) {
        return getElement(by).isSelected();
    }

    public static void handleAlertPopup() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
    }

    public static void switchToFrame(int id){
        driver.switchTo().frame(id);
    }
    //************************************************************************************************************
    public static void takeScreenShot(String filePath) throws Exception {
        File screenFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        File destFile = new File("./target/screenshot/" + filePath + "-" + timeStamp + ".png");
        FileUtils.copyFile(screenFile, destFile);
    }
}