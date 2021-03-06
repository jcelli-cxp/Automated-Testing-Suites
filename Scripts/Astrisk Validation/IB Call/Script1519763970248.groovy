import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

CustomKeywords.'com.AstriskValidation.AstriskValidation.AGENTNAILUP'()
//CustomKeywords.'com.AstriskValidation.AstriskValidation.AGENTIBCALL'()
//CustomKeywords.'com.AstriskValidation.AstriskValidation.AGENTLOGOUT'()


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
WebUI.click(findTestObject('Object Repository/p_Before we get started I have'))
WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_county_lookup'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Object Repository/input_script_county_lookup'))
WebUI.click(findTestObject('td_Beverly Hills'))
WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_intro_btn'), GlobalVariable.TimeOut)
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
WebUI.waitForElementVisible(findTestObject('Object Repository/td_The lead data has been save'), GlobalVariable.TimeOut)
WebUI.waitForElementVisible(findTestObject('Object Repository/input_new_script_wrapup_btn'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Object Repository/input_new_script_wrapup_btn'))
WebUI.waitForElementVisible(findTestObject('Object Repository/td_The lead data has been save'), GlobalVariable.TimeOut)
WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_not_medicare_eligible_btn'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Object Repository/input_script_not_medicare_eligible_btn'))
WebUI.waitForElementVisible(findTestObject('Object Repository/td_The lead data has been save'), GlobalVariable.TimeOut)
WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_not_medicare_dispo_btn'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Object Repository/input_script_not_medicare_dispo_btn'))
WebUI.click(findTestObject('li_Home  Pause'))
WebUI.waitForElementVisible(findTestObject('Object Repository/li_End of Shift'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('li_End of Shift'))
