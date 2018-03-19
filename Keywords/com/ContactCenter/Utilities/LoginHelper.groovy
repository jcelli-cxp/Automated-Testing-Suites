package com.ContactCenter.Utilities

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

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
import com.sun.media.sound.SoftReverb.Delay

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class LoginHelper {

	@Keyword
	public void loginIntoApplication(String ContactCenterURL, String Username, String Password){

		WebUI.waitForPageLoad(GlobalVariable.TimeOut)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_username'), GlobalVariable.TimeOut)
		WebUI.setText(findTestObject('Object Repository/input_username'), Username)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_password'), GlobalVariable.TimeOut)
		WebUI.setText(findTestObject('Object Repository/input_password'), Password)
		WebUI.click(findTestObject('Object Repository/input_password'))
		WebUI.waitForPageLoad(GlobalVariable.TimeOut)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input'),GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/Page_1520967438581/input'))
		WebUI.click(findTestObject('Object Repository/li_Initiate Connection'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/button_Nailup'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/button_Nailup'))
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/li_Initiate Agent'), GlobalVariable.TimeOut)
		WebUI.waitForElementVisible(findTestObject('Object Repository/li_Initiate Agent'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/li_Initiate Agent'))
		WebUI.waitForElementClickable(findTestObject('Object Repository/a_here'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/a_here'))

	}

}
