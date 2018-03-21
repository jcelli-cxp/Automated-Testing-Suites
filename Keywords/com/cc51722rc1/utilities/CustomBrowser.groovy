package com.cc51722rc1.utilities

import org.openqa.selenium.MutableCapabilities as DesiredCapabilities
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.stringtemplate.v4.compiler.STParser.ifstat_return

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.logging.KeywordLogger

import internal.GlobalVariable

public class CustomBrowser {

	@Keyword
	public void ccAgentBrowser(String Username) {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver")
		ChromeOptions options = new ChromeOptions()
		options.addArguments(
			"user-data-dir=/Users/jcelli/Library/Application Support/Google/Chrome/" + Username,
			"window-position=0,0",
			"window-size=800,509"
			)
		DesiredCapabilities capabilities = new DesiredCapabilities()
		capabilities.setCapability(ChromeOptions.CAPABILITY, options)
		WebDriver driver = new ChromeDriver(capabilities)
		DriverFactory.changeWebDriver(driver)
		driver.get(GlobalVariable.ContacCenterURL)
	}
}
