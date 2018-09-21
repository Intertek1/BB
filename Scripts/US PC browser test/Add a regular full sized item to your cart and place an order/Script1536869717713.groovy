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

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US PC browser test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Hair (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Hair (1)'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_See all Haircare PC'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_See all Haircare PC'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/a_Style (1)'), 0)

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Hot Tools (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Hot Tools (1)'))

WebUI.waitForElementVisible(findTestObject('Page_Shop Hair Tools/a_Spornette Little Wonder (1)'), 0)

WebUI.click(findTestObject('Page_Shop Hair Tools/a_Spornette Little Wonder (1)'))

WebUI.comment('Scroll the page to get the Add To Cart button to display')

'Scroll to the top of the page'
WebUI.scrollToPosition(0, 0)

'Scroll to the bottom of the page'
WebUI.scrollToPosition(0, 99999)

'Scroll to the top of the page'
WebUI.scrollToPosition(0, 0)

'A delay of about 4 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)\''
WebUI.delay(10)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Spornette Little Wonder/div_Add to Cart8.00 (1)'))

'A delay is necessary here, otherwise an error will occur when attempting to select the Birchbox button'
WebUI.delay(10)

'Select the Birchbox icon'
WebUI.waitForElementClickable(findTestObject('Page_Spornette Little Wonder/svg_Log In_icon__Birchbox'), 0)

'Select the Birchbox icon'
WebUI.click(findTestObject('Page_Spornette Little Wonder/svg_Log In_icon__Birchbox'))

WebUI.delay(4)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_The Mag_icon__svg___checkout icon PC browser'))

WebUI.delay(6)

WebUI.callTestCase(findTestCase('1. Common script/Complete checkout (US)'), [:], FailureHandling.STOP_ON_FAILURE)

