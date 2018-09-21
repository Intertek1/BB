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

WebUI.delay(6)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Checkout'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/a_Checkout'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Checkout'))

'If the user is not logged in, this step will create a new account'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Email Address (3)'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Create new account (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

'If there is an "Enter shipping address" element present, then this form will be filled out'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Enter shipping address'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Enter shipping address (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

'A delay of about 10 seconds is necessary, otherwise the following error displays:\r\nTest Cases/US mobile test/Purchase regular and configurable items (US, mobile) FAILED because (of) Unable to click on object \'Object Repository/Page_Beauty Box Subscription for Wo/div_Select shipping method'
WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Select shipping method'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Select shipping method'))

'A delay of about 4 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Beauty Box Subscription for Wo/div_UPS Ground 7.00\' (Root cause: org.openqa.selenium.WebDriverException: unknown error: Element <div>...</div> is not clickable at point (177, 112). Other element would receive the click:'
WebUI.delay(4)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_UPS Ground 7.00'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_UPS Ground 7.00'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Continue'))

WebUI.delay(5)

'If there is an "Add payment method" element present, then this information will be entered'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Add payment information'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Enter payment information (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

'A delay of about 5 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Beauty Box Subscription for Wo/button_Place Order\''
WebUI.delay(5)

WebUI.scrollToPosition(0, 99999)

WebUI.comment('Test - Check for correct sales tax calculation and currency symbol')

'Get the string for the total amount and store it into the variable "dollar_amount"'
subtotal = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_subtotal'), FailureHandling.STOP_ON_FAILURE)

'Get the string for the total amount and store it into the variable "dollar_amount"'
tax = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_tax'), FailureHandling.STOP_ON_FAILURE)

'Get the string for the total amount and store it into the variable "dollar_amount"'
not_run: shipping = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_shipping'), FailureHandling.STOP_ON_FAILURE)

'Get the string for the total amount and store it into the variable "dollar_amount"'
not_run: discount = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_discount'), FailureHandling.STOP_ON_FAILURE)

'Get the string for the total amount and store it into the variable "dollar_amount"'
total = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_total'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(subtotal, '^\\$[0-9]+\\.[0-9]{2}$', true)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(tax, '^\\$[0-9]+\\.[0-9]{2}$', true)

'Check the string against a regex for the correct U.S. currency format'
not_run: WebUI.verifyMatch(shipping, '^\\$[0-9]+\\.[0-9]{2}$', true)

'Check the string against a regex for the correct U.S. currency format'
not_run: WebUI.verifyMatch(discount, '^-\\$[0-9]+\\.[0-9]{2}$', true)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(total, '^\\$[0-9]+\\.[0-9]{2}$', true)

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/button_Place Order'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Place Order'))

WebUI.delay(14)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Continue Shopping (2)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Continue Shopping (2)'))

WebUI.delay(5)

'Click the Birchbox icon'
WebUI.click(findTestObject('Object Repository/Page_Shop Best Sellers/svg_icon__svg___cc1CR utilitie'))

