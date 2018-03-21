import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.lang.ProcessEnvironment.Variable as Variable
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
import com.sun.org.apache.bcel.internal.classfile.LocalVariable
import com.sun.org.apache.xalan.internal.xsltc.compiler.ForEach as ForEach
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.logging.KeywordLogger

CustomKeywords.'com.cc51722rc1.utilities.CustomBrowser.ccAgentBrowser'(Username)

CustomKeywords.'com.AstriskValidation.AstriskValidation.AGENTNAILUP'(Username, Password)

WebUI.click(findTestObject('li_Initiate Agent'))

WebUI.click(findTestObject('a_here'))

WebUI.selectOptionByLabel(findTestObject('select_QUESTIONS ABOUT PLAN  G'), 'QUESTIONS ABOUT PLAN / GENERAL QUESTIONS',
		true)

WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_continue'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/input_script_continue'))

WebUI.waitForElementVisible(findTestObject('Object Repository/input_cl_cust-8231'), GlobalVariable.TimeOut)

WebUI.setText(findTestObject('Object Repository/input_cl_cust-8231'), FirstName)

WebUI.setText(findTestObject('Object Repository/input_cl_cust-1081'), MiddleInitial)

WebUI.setText(findTestObject('Object Repository/input_cl_cust-8230'), LastName)

WebUI.sendKeys(findTestObject('Object Repository/input_cl_cust-8230'), Keys.chord(Keys.TAB))

WebUI.waitForElementVisible(findTestObject('select_SelfSomeone Else'), GlobalVariable.TimeOut)

WebUI.selectOptionByLabel(findTestObject('select_SelfSomeone Else'), SelforSomeoneElse, true)

WebUI.setText(findTestObject('input_cl_cust-7741'), Phone)

WebUI.click(findTestObject('Object Repository/div_Mr.Ms.tmay I please have t'))

WebUI.selectOptionByValue(findTestObject('select_YESNO'), YESno, true)

WebUI.selectOptionByValue(findTestObject('select_YESNO_1'), YESno1, true)

WebUI.selectOptionByValue(findTestObject('select_YESNO_2'), YESno2, true)

WebUI.setText(findTestObject('Object Repository/input_cl_cust-3631'), ZipCode)

WebUI.click(findTestObject('Object Repository/p_Before we get started I have'))

WebUI.sendKeys(findTestObject('Object Repository/input_script_county_lookup'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_county_lookup'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('td_Beverly Hills'))

WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_intro_btn'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/input_script_intro_btn'))

WebUI.waitForElementVisible(findTestObject('select_YESNO_3'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('select_YESNO_3'), YESno3, true)

WebUI.selectOptionByValue(findTestObject('select_YESNO_4'), YESno4, true)

WebUI.selectOptionByValue(findTestObject('select_YESNO_5'), YESno5, true)

WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_kits_btn'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/input_script_kits_btn'))

WebUI.sendKeys(findTestObject('Object Repository/input_script_mapd'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('select_YESNO_6'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('select_YESNO_6'), YESno6, true)

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page_1521130954307/td_The lead data has been save'), 2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_1520996206463/input_new_script_wrapup_btn'), GlobalVariable.TimeOut)

WebUI.sendKeys(findTestObject('Object Repository/Page_1520996206463/input_new_script_wrapup_btn'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page_1521130954307/td_The lead data has been save'), 2)

WebUI.waitForElementVisible(findTestObject('Object Repository/input_script_not_medicare_eligible_btn'), GlobalVariable.TimeOut)

WebUI.sendKeys(findTestObject('Object Repository/input_script_not_medicare_eligible_btn'), Keys.chord(Keys.ENTER))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Page_1521130954307/td_The lead data has been save'), 2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_1520967438581/input_script_not_medicare_eligible_btn - Second'),
		GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/Page_1520967438581/input_script_not_medicare_eligible_btn - Second'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_CTI Agent Screens/li_Home  Pause'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/Page_CTI Agent Screens/li_Home  Pause'))

WebUI.waitForElementVisible(findTestObject('Object Repository/li_End of Shift'), GlobalVariable.TimeOut)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_CTI Agent Screens/li_End of Shift'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Object Repository/Page_CTI Agent Screens/li_End of Shift'))

WebUI.closeBrowser()