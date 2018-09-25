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
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

'Enable this line only when running this test case by itself'
WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.delay(2)

'If the user is not logged in, this step will create a new account'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Email Address (3)'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Your Account_close'))
}

not_run: WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_My Birchbox'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_My Birchbox'))

WebUI.comment('Note: Purchased boxes never populate in this page.  The following is the most that can be verified.')

WebUI.delay(3)

not_run: WebUI.verifyTextPresent('We Are Prepping Your Box', false)

not_run: WebUI.verifyTextPresent('Stay tuned for your personalized first box!', false)

