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

not_run: WebUI.delay(2)

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Spread the Love Earn  in P'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Spread the Love Earn  in P'))

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input__tokenInput'), 'qptester@gmail.com')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/textarea_customerMessage'), 'Greetings Professor Falken')

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Remind after 7 days'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Send'))

WebUI.delay(3)

WebUI.verifyTextPresent('1 person was successfully invited to Birchbox!', false)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_notifier__remove___email_notification'))

WebUI.delay(3)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'))

