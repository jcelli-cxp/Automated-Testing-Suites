package com.AstriskValidation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import com.sun.org.apache.bcel.internal.classfile.LocalVariable

import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class AstriskValidation {

	@Keyword
	public AGENTNAILUP(String Username, String Password){

		WebUI.waitForElementVisible(findTestObject('Object Repository/input_username'), GlobalVariable.TimeOut)
		WebUI.setText(findTestObject('Object Repository/input_username'), Username)
		WebUI.setText(findTestObject('Object Repository/input_password'), Password)
		WebUI.click(findTestObject('Object Repository/input_loginButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/select_Dont Login OutboundTest'), GlobalVariable.TimeOut)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/select_Dont Login OutboundTest'), "Don\'t Login Outbound", false)
		WebUI.click(findTestObject('input'))
		WebUI.click(findTestObject('Object Repository/li_Initiate Connection'))
		WebUI.click(findTestObject('button_Nailup'))
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/li_Initiate Connection'), GlobalVariable.TimeOut)


	}

	@Keyword
	public void AGENTLOGOUT() {

		WebUI.click(findTestObject('li_Home  Pause'))
		WebUI.click(findTestObject('li_End of Shift'))
		WebUI.closeBrowser()

	}
}