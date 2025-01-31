package appiumtest;

import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
		AppiumDriverLocalService service =new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\chins\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Pixel 3a API 34");
		options.setApp("D:\\workspace\\appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		//, accessbilityId and androidUIAutomator k liye AppiumBy use
		AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		
		
		driver.quit();
		service.stop();
	}
	

}
