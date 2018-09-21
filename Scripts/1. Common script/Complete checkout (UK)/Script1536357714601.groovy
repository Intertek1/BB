import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Checkout (4)'))

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Create Account (1)'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Create new account (UK)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Choose delivery option (4)'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Home Delivery (4)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Enter delivery address'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Enter shipping address (UK)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(8)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (3)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Standard Delivery 2.95 (3)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (3)'))

WebUI.delay(5)

WebUI.waitForPageLoad(0)

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Add payment information'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Enter payment information (UK)'), [:], FailureHandling.STOP_ON_FAILURE)
}

'Get the string for the total amount and store it into the variable "dollar_amount"'
subtotal_amount = WebUI.getText(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_subtotal'), FailureHandling.STOP_ON_FAILURE)

'Get the string for the total amount and store it into the variable "dollar_amount"'
total_amount = WebUI.getText(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_total'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.K. currency format'
WebUI.verifyMatch(subtotal_amount, '^£[0-9]+\\.[0-9]{2}$', true)

'Check the string against a regex for the correct U.K. currency format'
WebUI.verifyMatch(total_amount, '^£[0-9]+\\.[0-9]{2}$', true)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (3)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (3)'))

WebUI.delay(10)

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (3)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (3)'))

WebUI.delay(5)

