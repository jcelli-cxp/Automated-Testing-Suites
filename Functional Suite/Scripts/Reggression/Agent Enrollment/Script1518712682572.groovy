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

WebUI.openBrowser('https://patch-testing-web1.callproxe.com/cti/agents')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/input_username'), GlobalVariable.TimeOut)

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_username'), 'a002')

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_password'), 'pass002')

WebUI.sendKeys(findTestObject('Page_CTI Agent Screens/input_password'), Keys.chord(Keys.ENTER))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputLogin'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputLogin'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_CTI Agent Screens/li_Initiate Connection'))

WebUI.click(findTestObject('Page_CTI Agent Screens/button_Nailup'))

WebUI.waitForElementNotVisible(findTestObject('Page_CTI Agent Screens/li_Initiate Connection'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/li_Initiate Agent'))

WebUI.click(findTestObject('Page_CTI Agent Screens/a_here'))

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_QUESTIONS ABOUT PLAN  G'), 'QUESTIONS ABOUT PLAN / GENERAL QUESTIONS', 
    true)

WebUI.waitForElementClickable(findTestObject('Page_CTI Agent Screens/inputContinue'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputContinue'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/input_cl_cust-8231'), GlobalVariable.TimeOut)

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_cl_cust-8231'), 'Test')

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_cl_cust-1081'), 'E')

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_cl_cust-8230'), 'Test')

WebUI.click(findTestObject('Page_CTI Agent Screens/div_script_content_1766447'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/select_SelfSomeone Else'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_SelfSomeone Else'), 'Self', true)

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_cl_cust-7741'), '1234567890')

WebUI.click(findTestObject('Page_CTI Agent Screens/div_Check box below if caller'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/select_YESNO'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO'), 'NO', true)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO_1'), 'NO', true)

WebUI.click(findTestObject('Page_CTI Agent Screens/div_May I have your email addr'))

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO_2'), 'NO', true)

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/input_cl_cust-3631'), GlobalVariable.TimeOut)

WebUI.setText(findTestObject('Page_CTI Agent Screens/input_cl_cust-3631'), '90210')

WebUI.click(findTestObject('Page_CTI Agent Screens/div_script_content_1766447'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputCountyLookup'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputCountyLookup'))

WebUI.click(findTestObject('Page_CTI Agent Screens/td_PDP and MA'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputINTRO'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputINTRO'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/select_YESNO_3'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO_3'), 'NO', true)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO_4'), 'NO', true)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO_5'), 'NO', true)

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputKits'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputKits'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputPDP'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputPDP'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/select_YESNO_6'), GlobalVariable.TimeOut)

WebUI.selectOptionByValue(findTestObject('Page_CTI Agent Screens/select_YESNO_6'), 'NO', true)

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/td_The lead data has been save'), GlobalVariable.TimeOut)

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputWrapUp'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputWrapUp'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/inputNotMedicareEligible'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputNotMedicareEligible'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/td_The lead data has been save'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/inputNotMedicareEligible2'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/li_Home  Pause'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/li_Home  Pause'))

WebUI.waitForElementVisible(findTestObject('Page_CTI Agent Screens/li_End of Shift'), GlobalVariable.TimeOut)

WebUI.click(findTestObject('Page_CTI Agent Screens/li_End of Shift'))

WebUI.closeBrowser()

