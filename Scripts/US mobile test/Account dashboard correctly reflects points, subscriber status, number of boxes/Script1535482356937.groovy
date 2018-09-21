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

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.delay(2)

WebUI.comment('Capture and compare the strings in the "Your Account" menu and in the "Birchbox Loyalty Program" page that display the number of points and throw an error if they don\'t match')

string1 = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/span_(95 pts)'))

'Trim the parentheses off the ends of the string'
string1 = string1.substring(1, string1.length() - 1)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Birchbox Loyalty Program'))

string2 = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_95 pts'))

try {
    //If the two strings are not the same, this will throw an exception and the catch block will be executed
    assert string1 == string2
}
catch (Throwable e) {
    throw new AssertionError(((('ERROR: "' + string1) + '" under Your Account does not match "') + string2) + '" in the Birchbox Loyalty Program page', 
    e)
} 

WebUI.comment('Ensure that an active subscription is mentioned under Subscription Details')

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Account Settings (1)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Subscription Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Subscription Details'))

WebUI.verifyTextPresent('(?i)SUBSCRIBER SINCE (JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC) 201(8|9)', true)

WebUI.verifyTextPresent('[0-9]+ (?i)BOX(?:ES) \\([0-9]+ REMAINING\\)$', true)

