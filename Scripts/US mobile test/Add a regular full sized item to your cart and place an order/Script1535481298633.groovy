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

'Select the hamburger menu'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Hair (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Hair (1)'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/div_See all Haircare (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_See all Haircare (1)'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/a_Style (1)'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Hot Tools (1)'))

WebUI.click(findTestObject('Page_Shop Hair Tools/a_Spornette Little Wonder (1)'))

WebUI.comment('Scroll the page to get the Add To Cart button to display')

'Scroll to the top of the page'
WebUI.scrollToPosition(0, 0)

'A delay of about 10 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)\''
WebUI.delay(3)

'Scroll to the bottom of the page'
WebUI.scrollToPosition(0, 99999)

'A delay of about 10 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)\''
WebUI.delay(3)

'Scroll to the top of the page'
WebUI.scrollToPosition(0, 0)

'A delay of about 10 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)\''
WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)'))

'A delay is necessary here, otherwise an error will occur when attempting to select the Birchbox button'
WebUI.delay(5)

'Select the Birchbox icon'
WebUI.waitForElementVisible(findTestObject('Page_Spornette Little Wonder/svg_ 2018 Birchbox_icon__svg__'), 0)

'Select the Birchbox icon'
WebUI.waitForElementClickable(findTestObject('Page_Spornette Little Wonder/svg_ 2018 Birchbox_icon__svg__'), 0)

'Select the Birchbox icon'
WebUI.click(findTestObject('Page_Spornette Little Wonder/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__checkout'))

WebUI.delay(10)

WebUI.callTestCase(findTestCase('1. Common script/Complete checkout (US)'), [:], FailureHandling.STOP_ON_FAILURE)

