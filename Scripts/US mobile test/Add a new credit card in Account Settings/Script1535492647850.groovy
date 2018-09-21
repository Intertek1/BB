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

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Account Settings (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Account Settings (1)'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/span_Subscription Details'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Subscription Details'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Payment Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Payment Details'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Address Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Address Details'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Account Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Account Details'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Payment Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Payment Details'))

WebUI.comment('Test - Add a new credit card in Account Settings')

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Add Payment Method'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Add Payment Method'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Credit Card Number'))

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_creditCardNumber'), '5100081112223332')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/select_01020304050607080910111 (2)'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/select_16171819202122232425262 (2)'), 
    '20', true)

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_cvv'), '737')

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('1. Common script/Enter shipping information (US)'), [:], FailureHandling.STOP_ON_FAILURE)

'Disable this line if running this test case by itself and only if creating a new account first'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_TestFirstName TestLastName (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Add Payment Method'))

WebUI.comment('Issue - The following line is not working properly - Might be an iframe issue')

not_run: WebUI.verifyTextPresent('1881', false)

not_run: WebUI.closeBrowser()

not_run: WebUI.delay(5)

not_run: WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'), 0)

not_run: WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'))

