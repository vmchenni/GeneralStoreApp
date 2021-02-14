package stepDefnition;

import Utilities.Utilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.core.gherkin.Step;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Do;
import io.cucumber.java.hu.De;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.support.FindBy;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class StepDefinitions {
//
//
//
//    public static AndroidDriver<AndroidElement> driver;
//    public static Utilities utilities;
//    public static IOSDriver<IOSElement> IOSDriver;
//
//
    @Given("User prints hello world")
    public void Userprintshelloworld(){
        System.out.println("Hello World");
    }
//
//    @Given("User launches app")
//    public void userLaunchesApp() throws MalformedURLException {
//        utilities=new Utilities();
//        DesiredCapabilities capabilities=new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S9+")  ;
//        capabilities.setCapability(MobileCapabilityType.UDID,"42345a3836313098");
//        capabilities.setCapability(MobileCapabilityType.APP,"/Users/vishwanathchenni/Downloads/ApiDemos-debug.apk");
//
//        driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
////        driver.findElementByAccessibilityId("Accessibility").click();
//        TouchAction touchAction=new TouchAction(driver);
////        touchAction.tap(driver.findElementByAccessibilityId("Accessibility")).perform();
//    }
//
//    @Given("User taps on element")
//    public void userTapsOnElement() {
//      AndroidElement myElement=  driver.findElementByAccessibilityId("Accessibility");
//      utilities.tapOnElement(myElement);
//    }
//    @Given("Given User Enters Value in edibox")
//    public void GivenUserEntersValueinedibox() {
//        AndroidElement myElement=StepDefinitions.driver.findElementByAccessibilityId("Accessibility");
//        utilities.fnEnterTextValue(myElement,"myValue");
//    }
//
//    @Given("User taps on Views")
//    public void userTapsOnViews() {
//        utilities.tapOnElement(StepDefinitions.driver.findElementByAccessibilityId("Views"));
//    }
//
//    @Then("Click on Date Widgets")
//    public void clickOnDateWidgets() {
//        utilities.tapOnElement(StepDefinitions.driver.findElementByAccessibilityId("Date Widgets"));
//    }
//
//    @Then("Then tap on inline watch")
//    public void thenTapOnInlineWatch() {
//       AndroidElement myelement= StepDefinitions.driver.findElementByAccessibilityId("2. Inline");
//       TouchAction touchAction=new TouchAction(StepDefinitions.driver);
//       touchAction.tap(tapOptions().withElement(element(myelement))).perform();
//
//    }
//
//    @And("Swipe from from {int} to {int}")
//    public void swipeFromFromTo(int arg0, int arg1) {
//        WebElement fromElement=StepDefinitions.driver.findElementByXPath("//*[@content-desc='12']");
//        WebElement ToElement=StepDefinitions.driver.findElementByXPath("//*[@content-desc='6']");
//        TouchAction touchAction=new TouchAction(StepDefinitions.driver);
//        touchAction.longPress(longPressOptions().
//                withElement(element(fromElement)).
//                withDuration(ofSeconds(2))).
//                moveTo(element(ToElement)).release().perform();
//    }
//
//    @Then("User scrolls down")
//    public void userScrollsDown() {
//
//        //The viewing size of the device
//        Dimension size = StepDefinitions.driver.manage().window().getSize();
//
//        //x position set to mid-screen horizontally
//        int width = size.width / 2;
//
//        //Starting y location set to 80% of the height (near bottom)
//        int startPoint = (int) (size.getHeight() * 0.80);
//
//        //Ending y location set to 20% of the height (near top)
//        int endPoint = (int) (size.getHeight() * 0.20);
//
////        new TouchAction(driver).press(PointOption.point(width, startPoint)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(width, endPoint)).release().perform();
//        TouchAction touchAction=new TouchAction(StepDefinitions.driver);
//        touchAction.press(PointOption.point(width,startPoint)).
//                waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10))).
//                moveTo(PointOption.point(width,endPoint)).
//                release().
//                perform();
//    }
//
//    @Given("User taps on Drag and Drop")
//    public void userTapsOnDragAndDrop() {
//        utilities.tapOnElement(StepDefinitions.driver.findElementByAccessibilityId("Drag and Drop"));
//    }
//
//    @Then("Drag first element to Second element")
//    public void dragFirstElementToSecondElement() {
//        AndroidElement fromElement=StepDefinitions.driver.findElementsByClassName("android.view.View").get(0);
//        AndroidElement toElement=StepDefinitions.driver.findElementsByClassName("android.view.View").get(2);
//
//        utilities.dragFirstElementToSecondElement(fromElement,toElement);
//    }
//
//    @And("then press andoid back button")
//    public void thenPressAndoidBackButton() {
////        StepDefinitions.driver.pressKeyCode(AndroidKeyCode.BACK);
//        StepDefinitions.driver.pressKey(new KeyEvent(AndroidKey.BACK));
////        List of keys available at below location
////        https://developer.android.com/reference/android/view/KeyEvent#KEYCODE_BACK
//    }
//
//    @Given("User launches an existing app in mobile")
//    public void userLaunchesAnExistingAppInMobile() throws MalformedURLException {
////  Install Application.Info from play store get activity details
//        DesiredCapabilities capabilities=new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.UDID,"42345a3836313098");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S9+");
//        capabilities.setCapability("appPackage", "packagename");
//        capabilities.setCapability("appActivity", "packagename.MainLaunchActivity");
//        driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//    }
//
//    @Given("User launches chrome browser in mobile")
//    public void userLaunchesChromeBrowserInMobile() throws MalformedURLException {
//        Utilities utilities=new Utilities();
//        utilities.userLaunchesChromeBrowserInMobile();
//
//    }

}
