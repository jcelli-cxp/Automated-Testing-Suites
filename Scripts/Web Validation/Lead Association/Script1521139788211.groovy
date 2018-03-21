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

CustomKeywords.'com.AstriskValidation.AstriskValidation.AGENTOBNAILUP'()

WebUI.click(findTestObject('Lead Association/li_Initiate Agent'))
WebUI.waitForElementVisible(findTestObject('Lead Association/a_here'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Lead Association/a_here'))
WebUI.setText(findTestObject('Lead Association/input_cl_phone_number'), '8013909648')
WebUI.waitForElementVisible(findTestObject('Lead Association/a_Associate Customer'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Lead Association/a_Associate Customer'))
WebUI.waitForElementVisible(findTestObject('Lead Association/td_KatalonOBTest'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Lead Association/td_KatalonOBTest'))
WebUI.waitForElementVisible(findTestObject('Lead Association/td_The call has been associate'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Lead Association/td_The call has been associate'))
WebUI.click(findTestObject('Lead Association/li_Alternate Dispositions'))
WebUI.waitForElementVisible(findTestObject('Lead Association/input_cl_cust-10737'), GlobalVariable.TimeOut)
WebUI.setText(findTestObject('Lead Association/input_cl_cust-10737'), 'test')
WebUI.click(findTestObject('Lead Association/div_script_content_1756893'))
WebUI.click(findTestObject('Lead Association/li_Home  Pause'))
WebUI.waitForElementVisible(findTestObject('Lead Association/input_script_test_disposition'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Lead Association/input_script_test_disposition'))
WebUI.waitForElementVisible(findTestObject('Lead Association/li_End of Shift'), GlobalVariable.TimeOut)
WebUI.click(findTestObject('Lead Association/li_End of Shift'))
