package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.config.Constants;

/**
 * This method will open Header.Properties and return value associate with
 * key
 * 
 * @param key
 * @return value in form of{@code String}
 */
public class PropertyUtility {

	public static String getProperty(String key) {
		String value = null;
		try {
<<<<<<< HEAD
			Constants.fis = new FileInputStream("src/main/resources/Header.properties");
=======
			Constants.fis = new FileInputStream("C:\\Eclipse-WorkSpace\\eclipse-workspace\\DalgonaFramework-1\\src\\main\\resources\\ObjectRepository.properties");
>>>>>>> 69a61ef8017b6b4ea022d534a1932fae71d0bcfe
			Properties p = new Properties();
			p.load(Constants.fis);
			value = p.getProperty(key);
		} catch (IOException e) {
			System.out.println("Unable to load Properties File");
			e.printStackTrace();
		}
		return value;
	}

	public static String captureScreenshot(WebDriver driver, String fileName) {
		TakesScreenshot ts = (TakesScreenshot) Constants.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd_hh_mm_ss").format(new java.util.Date());
		String screenshotPath = System.getProperty("user.dir") + "/Screenshot/" + fileName + " " + dateTimeFormat
				+ ".jpg";
		try {
			FileUtils.copyFile(src, new File(screenshotPath));
		} catch (IOException e) {
			System.out.println("Screenshot result failed");
			e.printStackTrace();
		}
		return screenshotPath;
	}

}