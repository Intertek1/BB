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

'Enable this line only when running this test case by itself\r\nStore the current date and time'
date = new Date()

'Enable this line only when running this test case by itself\r\nStore the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Enable this line only when running this test case by itself\r\nCreate a unique email address using the formatted date and time'
uniqueUKEmail = (('birchbox.intertek+uk' + datetimeMMddyyhhmm) + '@gmail.com')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Create Account (1)'))

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_firstName (4)'), 'Bob')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_lastName (4)'), 'Slydell')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Password (5)'))

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_emailAddress (4)'), uniqueUKEmail)

WebUI.setEncryptedText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_password (4)'), 'yrXHdmw+Di/576oxJz3/0g==')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_No I dont want to receive (4)'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Create Account'))

WebUI.delay(2)

not_run: while (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_503Backend fetch failed'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)) {
    'This error message is seen quite a bit on the UK site'
    WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Create Account'))
}

