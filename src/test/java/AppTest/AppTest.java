

package AppTest;

import org.testng.annotations.Test;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.interactions.HasTouchScreen;

import static io.appium.java_client.touch.TapOptions.tapOptions;



public class AppTest {

AndroidDriver<AndroidElement> driver;
	
  @Test
  public void f() {
	  System.out.println("TestNG - Default TC");
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  
	  capabilities.setCapability("platformName","Android");
	  capabilities.setCapability("deviceName","Pixel 2 XL API 31");
	  capabilities.setCapability("uuid","emulator-5554");
	  capabilities.setCapability("platformversion","12.0");
	  capabilities.setCapability("appPackage", "io.appium.android.apis");
	  capabilities.setCapability("appActivity", "ApiDemos");
	 
	  try {
		driver = new AndroidDriver<AndroidElement> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  
  @Test
  public void test_0() throws InterruptedException {
  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Preference");
  el1.click();
  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("4. Default values");
  el2.click();
  //MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]");
  // -> recording한 script의 권장에 따라 다른 함수로 대체
  MobileElement el3 = driver.findElementByAndroidUIAutomator("text(\"Edit text preference\")");
  el3.click();
  Thread.sleep(3000);
  MobileElement el4 = (MobileElement) driver.findElementById("android:id/edit");
  el4.clear();
  //el4.sendKeys("Dog");
  el4.setValue("Do");
  MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
  el5.click();

// 결과 점검: 다시 Edit 창을 띄웠을 때 설정한 문자열(Dog)가 표시되는지 assert로 확인
  el3 = driver.findElementByAndroidUIAutomator("text(\"Edit text preference\")");
  el3.click();
  el4 = (MobileElement) driver.findElementById("android:id/edit");
  
  assert el4.getText().equals("Dog"):"Actual value is : '"+el4.getText()+"' did not match with expected value: Dog";
  
  
  
  
  }
  
  
  
  
  
  
  @Test
  public void test_1() throws InterruptedException {
	  MobileElement el5 = (MobileElement) driver.findElementById("android:id/button1");
	  el5.click();
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Animation");
	  el1.click();
	  
	  MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Seeking");
	  el2.click();  
  }

  @Test
  public void test_2() throws InterruptedException {
	  
	  AndroidTouchAction touch = new AndroidTouchAction(driver);
	  touch.press(PointOption.point(373,326))
	  .moveTo(PointOption.point(939,330))
	  .release()
	  .perform();
	  
	  AndroidTouchAction touch2 = new AndroidTouchAction(driver);
	  touch2.press(PointOption.point(928,330))
	  .moveTo(PointOption.point(1195,334))
	  .release()
	  .perform();
	  
	  AndroidTouchAction touch3 = new AndroidTouchAction(driver);
	  touch3.press(PointOption.point(1199,334))
	  .moveTo(PointOption.point(376,326))
	  .release()
	  .perform();
	  
	  driver.navigate().back();
	  MobileElement viewFlip = (MobileElement) driver.findElementByAccessibilityId("View Flip");
	  viewFlip.click();
	  MobileElement one = driver.findElementByAndroidUIAutomator("text(\"One\")");
	 
	  
	  AndroidTouchAction touch4 = new AndroidTouchAction (driver);
	  touch4.longPress(LongPressOptions.longPressOptions()
	                  .withElement (ElementOption.element (one)))
	                .perform ();
	  System.out.println("LongPressed Tapped");
	  Thread.sleep(500);
	  
	  
	  
	  
	  driver.navigate().back();
	  Thread.sleep(500);
	  driver.navigate().back();
	  MobileElement views = (MobileElement) driver.findElementByAccessibilityId("Views");
	 views.click();
	  AndroidTouchAction touch5 = new AndroidTouchAction(driver);
	  touch5.press(PointOption.point(675,1677))
	  .moveTo(PointOption.point(700,392))
	  .release()
	  .perform();
	  
	  AndroidTouchAction touch6 = new AndroidTouchAction(driver);
	  touch6.press(PointOption.point(675,392))
	  .moveTo(PointOption.point(700,1677))
	  .release()
	  .perform();
	  
	  
	  Thread.sleep(500);
	  driver.navigate().back();
	  MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Animation");
	  el1.click();
	  
	  MobileElement viewFlip2 = (MobileElement) driver.findElementByAccessibilityId("View Flip");
	  viewFlip2.click();
	  
	 

	  MobileElement Two = driver.findElementByAndroidUIAutomator("text(\"Two\")");

	  
	


	  AndroidTouchAction taction = new AndroidTouchAction(driver);
	    taction.tap(tapOptions().withElement(ElementOption.element(Two))
	    .withTapsCount(2)).perform();
	  

  }

  
}
