package com.ContactCenter.Utilities

import org.openqa.selenium.MutableCapabilities as DesiredCapabilities
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable

public class CustomBrowser {

	@Keyword
	public void ccAgentBrowser(String Username) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver")
		ChromeOptions options = new ChromeOptions()
		options.addArguments("profile-directory=" + Username,
			"window-position=" + 2 + "," + 1)
		DesiredCapabilities capabilities = new DesiredCapabilities()
		capabilities.setCapability(ChromeOptions.CAPABILITY, options)
		WebDriver driver = new ChromeDriver(capabilities)
		DriverFactory.changeWebDriver(driver)
		driver.get(GlobalVariable.ContacCenterURL)
	}

}
