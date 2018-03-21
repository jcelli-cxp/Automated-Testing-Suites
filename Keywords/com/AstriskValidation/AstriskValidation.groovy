package com.AstriskValidation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.annotation.SetUp
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
import com.sun.java.util.jar.pack.Package.Class

import internal.GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class AstriskValidation {

	@Keyword
	public void AGENTNAILUP(){

		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.ContacCenterURL)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_username'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-IB Call/input_username'), GlobalVariable.Username)
		WebUI.setText(findTestObject('Nail Up-IB Call/input_password'), GlobalVariable.Password)
		WebUI.click(findTestObject('Nail Up-IB Call/input_loginButton'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/select_Dont Login OutboundTest'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByLabel(findTestObject('Nail Up-IB Call/select_Dont Login OutboundTest'), "Don\'t Login Outbound", false)
		WebUI.click(findTestObject('Object Repository/Nail Up-IB Call/input_agent_login_mode'))
		WebUI.click(findTestObject('Nail Up-IB Call/li_Initiate Connection'))
		WebUI.click(findTestObject('Nail Up-IB Call/button_Nailup'))
		WebUI.waitForElementNotVisible(findTestObject('Nail Up-IB Call/li_Initiate Connection'), GlobalVariable.TimeOut30)


	}


	@Keyword
	public void AGENTIBCALL() {

		WebUI.click(findTestObject('Nail Up-IB Call/li_Initiate Agent'))
		WebUI.click(findTestObject('Nail Up-IB Call/a_here'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/select_QUESTIONS ABOUT PLAN  G'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByLabel(findTestObject('Nail Up-IB Call/select_QUESTIONS ABOUT PLAN  G'), 'QUESTIONS ABOUT PLAN / GENERAL QUESTIONS', true)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_continue'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_continue'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_cl_cust-8231'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-IB Call/input_cl_cust-8231'), 'Test')
		WebUI.setText(findTestObject('Nail Up-IB Call/input_cl_cust-8231'), 'Test')
		WebUI.setText(findTestObject('Nail Up-IB Call/input_cl_cust-1081'), 'E')
		WebUI.setText(findTestObject('Nail Up-IB Call/input_cl_cust-8230'), 'Test')
		WebUI.click(findTestObject('Nail Up-IB Call/div_Last Name'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/select_SelfSomeone Else'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByLabel(findTestObject('Nail Up-IB Call/select_SelfSomeone Else'), 'Self', true)
		WebUI.setText(findTestObject('Nail Up-IB Call/input_cl_cust-7741'), '1234567890')
		WebUI.click(findTestObject('Nail Up-IB Call/div_Mr.Ms.tmay I please have t'))
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO_1'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO_2'), 'NO', true)
		WebUI.setText(findTestObject('Nail Up-IB Call/input_cl_cust-3631'), '90210')
		WebUI.click(findTestObject('Nail Up-IB Call/p_Before we get started I have'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_county_lookup'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_county_lookup'))
		WebUI.click(findTestObject('Nail Up-IB Call/td_Beverly Hills'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_intro_btn'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_intro_btn'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/select_YESNO_3'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO_3'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO_4'), 'NO', true)
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO_5'), 'NO', true)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_kits_btn'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_kits_btn'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_mapd'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_mapd'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/select_YESNO_6'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-IB Call/select_YESNO_6'), 'NO', true)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_new_script_wrapup_btn'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_new_script_wrapup_btn'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_not_medicare_eligible_btn'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_not_medicare_eligible_btn'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/input_script_not_medicare_dispo_btn'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/input_script_not_medicare_dispo_btn'))
		WebUI.click(findTestObject('Nail Up-IB Call/li_Home  Pause'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/li_End of Shift'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/li_End of Shift'))


	}


	@Keyword
	public void AGENTLOGOUT() {

		WebUI.click(findTestObject('Nail Up-IB Call/li_Home  Pause'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-IB Call/li_End of Shift'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-IB Call/li_End of Shift'))

	}



	@Keyword
	public void AGENTOBNAILUP() {

		WebUI.openBrowser(GlobalVariable.ContacCenterURL)
		WebUI.maximizeWindow()
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_username'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-OB Call/input_username'), GlobalVariable.Username)
		WebUI.setText(findTestObject('Nail Up-OB Call/input_password'), GlobalVariable.Password)
		WebUI.click(findTestObject('Nail Up-OB Call/input_loginButton'))
		WebUI.waitForPageLoad(GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_Dont Login OutboundTest'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_Dont Login OutboundTest'), "1388", false)
		WebUI.click(findTestObject('Nail Up-OB Call/input_inbound'))
		WebUI.click(findTestObject('Object Repository/Nail Up-OB Call/input_agent_mode'))
		WebUI.click(findTestObject('Nail Up-OB Call/li_Initiate Connection'))
		WebUI.click(findTestObject('Nail Up-OB Call/button_Nailup'))
		WebUI.waitForElementNotVisible(findTestObject('Object Repository/Nail Up-OB Call/li_Initiate Connection'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/li_Initiate Agent'))
	}


	@Keyword
	public void AGENTOBCALL() {

		WebUI.click(findTestObject('Nail Up-OB Call/a_here'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_QUESTIONS ABOUT PLAN  G'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_QUESTIONS ABOUT PLAN  G'), 'QUESTIONS ABOUT PLAN / GENERAL QUESTIONS', false)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_continue'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_continue'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_cl_cust-8231'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-8231'), 'test')
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-1081'), 'e')
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-8230'), 'test')
		WebUI.click(findTestObject('Nail Up-OB Call/div_script_content_1779072'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_SelfSomeone Else'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_SelfSomeone Else'), 'Self', false)
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-7741'), '1234567890')
		WebUI.click(findTestObject('Nail Up-OB Call/div_script_content_1779072'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_YESNO'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO'), 'YES', false)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_1'), 'YES', false)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_2'), 'YES', false)
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-6781'), 'parnez5@gmail.com')
		WebUI.click(findTestObject('Nail Up-OB Call/div_script_content_1779072'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/p_Zip Code'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/p_Zip Code'))
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-3631'), '90210')
		WebUI.click(findTestObject('Nail Up-OB Call/div_script_content_1779072'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_county_lookup'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_county_lookup'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/td_90210'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/td_90210'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_intro'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_intro'))
		WebUI.waitForPageLoad(GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_3'), 'YES', false)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_cl_cust-971'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-OB Call/input_cl_cust-971'), '1234567980')
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_AETNACOVENTRY'), 'AETNA', false)
		WebUI.click(findTestObject('Nail Up-OB Call/input_cl_cust-9103'))
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_4'), 'YES', false)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_5'), 'NO', false)
		WebUI.click(findTestObject('Nail Up-OB Call/input_cl_cust-14781'))
		WebUI.click(findTestObject('Nail Up-OB Call/input_mapd_info'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_eligibility'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_eligibility'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_MedicaidExtra Help Only'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_MedicaidExtra Help Only'), 'Medicaid', false)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/select_Are youthey new to Med'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Object Repository/Nail Up-OB Call/select_Are youthey new to Med'), 'Are you/they new to Medicare?', false)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_Current PlanSwitching P'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_Current PlanSwitching P'), 'Switching Plan', false)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/input_offer_treeee'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Object Repository/Nail Up-OB Call/input_offer_treeee'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_YESNO_6'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_6'), 'NO', false)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/input_offer_treeee(2)'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Object Repository/Nail Up-OB Call/input_offer_treeee(2)'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/td_SK'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/td_SK'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_ekit'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_ekit'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_YESNO_7'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_7'), 'YES', false)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_8'), 'YES', false)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_ma_btn'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_ma_btn'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/input_ekit_plan_selection'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Object Repository/Nail Up-OB Call/input_ekit_plan_selection'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/td_Generic'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/td_Generic'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_EnglishSpanish'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_EnglishSpanish'), 'English', false)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_send_ekit'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_send_ekit'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/td_eKit email sent'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/td_eKit email sent'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/select_YESNO_9'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-OB Call/select_YESNO_9'), 'NO', false)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_wrapup'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_wrapup'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_ekit_dispo1'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_ekit_dispo1'))
		WebUI.click(findTestObject('Nail Up-OB Call/li_Home  Pause'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-OB Call/td_The lead data has been save'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/input_ekit_dispo2'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/input_ekit_dispo2'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-OB Call/li_End of Shift'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-OB Call/li_End of Shift'))
		WebUI.closeBrowser()


	}
	
		
	@Keyword
	public void AGENTTRANSFER() {
		WebUI.click(findTestObject('Nail Up-Transfer/li_Initiate Agent'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/a_here'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-Transfer/a_here'))
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-Transfer/td_The call was connected'), GlobalVariable.TimeOut30)
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/li_Start CONFERENCE'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-Transfer/li_Start CONFERENCE'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/select_2015 AAA MedSupp Semina'), GlobalVariable.TimeOut30)
		WebUI.selectOptionByValue(findTestObject('Nail Up-Transfer/select_2015 AAA MedSupp Semina'), '533', true)
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/input_transferNumber'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-Transfer/input_transferNumber'), '8013909648')
		WebUI.click(findTestObject('Nail Up-Transfer/button_Transfer'))
		WebUI.delay(GlobalVariable.TimeOut15)
		WebUI.click(findTestObject('Nail Up-Transfer/li_CANCEL THIS TRANSFER  CONFE'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/li_Home  Pause'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-Transfer/li_Home  Pause'))
		WebUI.click(findTestObject('Nail Up-Transfer/li_Alternate Dispositions'))
		WebUI.delay(GlobalVariable.TimeOut6)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-Transfer/input_script_test_disposition1'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Object Repository/Nail Up-Transfer/input_script_test_disposition1'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/input_cl_cust-10737'), GlobalVariable.TimeOut30)
		WebUI.setText(findTestObject('Nail Up-Transfer/input_cl_cust-10737'), 't')
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/div_script_content_1781401'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-Transfer/div_script_content_1781401'))
		WebUI.delay(GlobalVariable.TimeOut6)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Nail Up-Transfer/input_script_test_disposition2'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Object Repository/Nail Up-Transfer/input_script_test_disposition2'))
		WebUI.waitForElementVisible(findTestObject('Nail Up-Transfer/li_End of Shift'), GlobalVariable.TimeOut30)
		WebUI.click(findTestObject('Nail Up-Transfer/li_End of Shift'))
		WebUI.closeBrowser()
		
	}
	
	
}