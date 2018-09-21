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

'Store the current date and time'
date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
uniqueUSEmail = (('birchbox.intertek+us' + datetimeMMddyyhhmm) + '@gmail.com')

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Sign Up (3)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Sign Up (3)'))

'If the script is running on a PC browser, this step will execute'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Password_PC browser'), 1, FailureHandling.OPTIONAL)) {
    'Expand the password requirements'
    WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Password_PC browser'), FailureHandling.STOP_ON_FAILURE)
}

if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Protector Protect  Deta/div_Password_PC'), 1, FailureHandling.OPTIONAL)) {
    'Expand the password requirements'
    WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/div_Password_PC'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_firstName (5)'), 'Milton')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_lastName (5)'), 'Waddams')

'If the script is running on a mobile browser, this step will execute'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Password (8)'), 1, FailureHandling.OPTIONAL)) {
    'Expand the password requirements'
    WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Password (8)'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_emailAddress (5)'), uniqueUSEmail)

'The script will enter the password into an element that is dependent upon whether it is run on a PC or mobile browser'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/input_password (6)'), 1, FailureHandling.OPTIONAL)) {
    WebUI.setEncryptedText(findTestObject('Page_Beauty Box Subscription for Wo/input_password (6)'), 'yrXHdmw+Di/576oxJz3/0g==')
} else if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Protector Protect  Deta/input_Password_PC browser'), 1, 
    FailureHandling.OPTIONAL)) {
    WebUI.setEncryptedText(findTestObject('Page_Beauty Protector Protect  Deta/input_Password_PC browser'), 'yrXHdmw+Di/576oxJz3/0g==')
} else {
    WebUI.setEncryptedText(findTestObject('Page_Beauty Box Subscription for Wo/input_Password_PC'), 'yrXHdmw+Di/576oxJz3/0g==')
}

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Sign Up (3)'))

WebUI.delay(2)

