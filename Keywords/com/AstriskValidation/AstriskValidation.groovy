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
import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class AstriskValidation {

	@Keyword
	public void AGENTNAILUP(){

		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.ContacCenterURL)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_username'), GlobalVariable.TimeOut)
		WebUI.setText(findTestObject('Object Repository/input_username'), GlobalVariable.Username)
		WebUI.setText(findTestObject('Object Repository/input_password'), GlobalVariable.Password)
		WebUI.click(findTestObject('Object Repository/input_loginButton'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/select_Dont Login OutboundTest'), GlobalVariable.TimeOut)
		WebUI.selectOptionByLabel(findTestObject('Object Repository/select_Dont Login OutboundTest'), "Don\'t Login Outbound", false)
		WebUI.click(findTestObject('input'))
		WebUI.click(findTestObject('Object Repository/li_Initiate Connection'))
		WebUI.click(findTestObject('button_Nailup'))
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/li_Initiate Connection'), GlobalVariable.TimeOut)


	}


	@Keyword
	public void AGENTIBCALL() {

		WebUI.click(findTestObject('li_Initiate Agent'))
		WebUI.click(findTestObject('a_here'))
		WebUI.waitForElementVisible(findTestObject('select_QUESTIONS ABOUT PLAN  G'), GlobalVariable.TimeOut)
		WebUI.selectOptionByLabel(findTestObject('select_QUESTIONS ABOUT PLAN  G'), 'QUESTIONS ABOUT PLAN / GENERAL QUESTIONS', true)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_continue'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_continue'))
		WebUI.waitForElementVisible(findTestObject('input_cl_cust-8231'), GlobalVariable.TimeOut)
		WebUI.setText(findTestObject('input_cl_cust-8231'), 'Test')
		WebUI.setText(findTestObject('input_cl_cust-8231'), 'Test')
		WebUI.setText(findTestObject('input_cl_cust-1081'), 'E')
		WebUI.setText(findTestObject('input_cl_cust-8230'), 'Test')
		WebUI.click(findTestObject('Object Repository/div_Last Name'))
		WebUI.waitForElementVisible(findTestObject('select_SelfSomeone Else'), GlobalVariable.TimeOut)
		WebUI.selectOptionByLabel(findTestObject('select_SelfSomeone Else'), 'Self', true)
		WebUI.setText(findTestObject('input_cl_cust-7741'), '1234567890')
		WebUI.click(findTestObject('Object Repository/div_Mr.Ms.tmay I please have t'))
		WebUI.selectOptionByValue(findTestObject('select_YESNO'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('select_YESNO_1'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('select_YESNO_2'), 'NO', true)
		WebUI.setText(findTestObject('input_cl_cust-3631'), '90210')
		WebUI.click(findTestObject('span_Press look-up below to co'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_county_lookup'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_county_lookup'))
		WebUI.click(findTestObject('td_Beverly Hills'))
		WebUI.click(findTestObject('Object Repository/input_script_intro_btn'))
		WebUI.waitForElementVisible(findTestObject('select_YESNO_3'), GlobalVariable.TimeOut)
		WebUI.selectOptionByValue(findTestObject('select_YESNO_3'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('select_YESNO_4'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('select_YESNO_5'), 'NO', true)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_kits_btn'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_kits_btn'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_mapd'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_mapd'))
		WebUI.waitForElementVisible(findTestObject('select_YESNO_6'), GlobalVariable.TimeOut)
		WebUI.selectOptionByValue(findTestObject('select_YESNO_6'), 'NO', true)
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_wrapup_btn'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_wrapup_btn'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_not_medicare_eligible_btn'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_not_medicare_eligible_btn'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_not_medicare_dispo_btn'), GlobalVariable.TimeOut)
		WebUI.click(findTestObject('Object Repository/input_script_not_medicare_dispo_btn'))
		WebUI.click(findTestObject('li_Home  Pause'))
		WebUI.click(findTestObject('li_End of Shift'))
		WebUI.closeBrowser()

	}


	@Keyword
	public void AGENTLOGOUT() {

		WebUI.click(findTestObject('li_Home  Pause'))
		WebUI.click(findTestObject('li_End of Shift'))
		WebUI.closeBrowser()

	}
	
	
	@Keyword
	public void AGENTOBCALL() {
		
		
	}
}