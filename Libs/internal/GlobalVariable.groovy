package internal
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import groovy.transform.CompileStatic


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 * 
 */

@CompileStatic
public class GlobalVariable {
	 
    /**
     * <p>Global Time Out for loading</p>
     */
	public static Object TimeOut = 60
	 
    /**
     * <p>Global Variable for Username Data</p>
     */
	public static Object Username = findTestData('AgentDataFolder/Agent Test Data').getValue(1, 1)
	 
    /**
     * <p>Global Variable for Password Data</p>
     */
	public static Object Password = findTestData('AgentDataFolder/Agent Test Data').getValue(2, 1)
	 
    /**
     * <p>URL for Contact Center</p>
     */
	public static Object ContacCenterURL = 'https://patch-testing-web1.callproxe.com/cti/agents'
	 
    /**
     * <p></p>
     */
	public static Object ScriptField = findTestData('Custom Objects/Custom Fields')
	 
    /**
     * <p>Time Out for five secs</p>
     */
	public static Object TimeOut5 = 5
	 
}
