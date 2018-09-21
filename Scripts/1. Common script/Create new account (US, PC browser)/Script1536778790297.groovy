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

'Enable this line only when running this test case by itself\r\nStore the current date and time'
date = new Date()

'Enable this line only when running this test case by itself\r\nStore the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Enable this line only when running this test case by itself\r\nCreate a unique email address using the formatted date and time'
uniqueUSEmail = (('birchbox.intertek+us' + datetimeMMddyyhhmm) + '@gmail.com')

'Enable this line only when running this test case by itself'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Sign Up (3)'))

'Enable this line only when running this test case by itself'
not_run: WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_First Name (3)'))

'Enable this line only when running this test case by itself'
WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_firstName (5)'), 'Milton')

'Enable this line only when running this test case by itself'
WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_lastName (5)'), 'Waddams')

'Enable this line only when running this test case by itself'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Password_PC browser'))

'Enable this line only when running this test case by itself'
WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_emailAddress (5)'), uniqueUSEmail)

'Enable this line only when running this test case by itself'
WebUI.setEncryptedText(findTestObject('Page_Beauty Box Subscription for Wo/input_password (6)'), 'yrXHdmw+Di/576oxJz3/0g==')

'Enable this line only when running this test case by itself'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Sign Up (3)'))

