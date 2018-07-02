import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.dbs.com/developers/#/')

WebUI.verifyElementPresent(findTestObject('Dev_Portal/Page_DBS Developers/a_Discover APIs'), 0)

WebUI.verifyElementPresent(findTestObject('Dev_Portal/Page_DBS Developers/a_How It Works'), 0)

WebUI.verifyElementPresent(findTestObject('Dev_Portal/Page_DBS Developers/a_LOG IN'), 0)

WebUI.verifyElementPresent(findTestObject('Dev_Portal/Page_DBS Developers/a_SIGN UP'), 0)

WebUI.verifyElementPresent(findTestObject('Dev_Portal/Page_DBS Developers/a_Support'), 0)

WebUI.closeBrowser()

