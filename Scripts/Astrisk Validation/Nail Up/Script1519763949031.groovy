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
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.AstriskValidation.AstriskValidation.AGENTNAILUP'()


/*WebUI.openBrowser('')

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

*/