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

'Store the current date and time'
not_run: date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
not_run: datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
not_run: uniqueUSEmail = (('birchbox.intertek+us' + datetimeMMddyyhhmm) + '@gmail.com')

'Enable this line only when running this test case by itself'
not_run: WebUI.openBrowser('')

'Enable this line only when running this test case by itself on a PC'
not_run: WebUI.setViewPortSize(400, 900)

WebUI.navigateToUrl('https://www.staging.birchbox.com/')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Visit Birchbox Grooming'))

WebUI.delay(2)

WebUI.waitForPageLoad(0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Visit Birchbox Beauty'))

