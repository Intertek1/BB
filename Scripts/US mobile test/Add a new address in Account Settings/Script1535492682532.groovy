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
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.delay(2)

'If the user is not logged in'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Email Address (3)'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Account Settings (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Account Settings (1)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/span_Subscription Details (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/span_Subscription Details (1)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/span_Payment Details (1)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/span_Address Details (1)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/span_Account Details (1)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/span_Address Details (1)'))

WebUI.comment('Test - Add a new address in Account Settings')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Add New Address'))

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_firstName (7)'), 'Bob')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_lastName (7)'), 'Slydell')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_company (1)'), 'Initek')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_streetAddress1 (2)'), '4120 Freidrich Lane')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_city (2)'), 'Austin')

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_AAACAEAFAKALAMAPARAZCAC (5)'), 'Texas', 
    true)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_postCode (2)'), '78744')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Add Address'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Confirm (2)'))

