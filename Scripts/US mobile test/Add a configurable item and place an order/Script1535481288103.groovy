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

//if (getSessionID() == null) {
'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'Tap the hamburger menu'
WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'), 0)

//}
'Tap the hamburger menu'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'), 0)

'Tap the hamburger menu'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.delay(1)

'Select the makeup category'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (2) (1) (1) (1)'), 
    0)

'Select the makeup category'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (2) (1) (1) (1)'))

WebUI.delay(3)

'Select the lip category'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Lip (1) (1) (1)'), 
    0)

'Select the lip category'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Lip (1) (1) (1)'))

WebUI.delay(3)

'Select the lip category'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks (1) (1) (1)'), 
    0)

'Select the lipsticks category'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks (1) (1) (1)'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 1000)

WebUI.waitForPageLoad(0)

WebUI.scrollToElement(findTestObject('Page_Shop Lipsticks/img_image__absolute___2DQnl ut (1)'), 0)

'Select a product with options available (Mally Beauty High-Shine Liquid Lipstick Pens)'
WebUI.click(findTestObject('Page_Lipsticks/a_Mally Beauty High-Shine Liqu (1) (1) (1)'))

WebUI.comment('Navigate to a configurable product and explore')

WebUI.comment('Issue - Can only select between two different shades')

WebUI.scrollToPosition(0, 100)

WebUI.delay(2)

WebUI.scrollToPosition(0, 600)

WebUI.delay(2)

WebUI.verifyTextPresent('Lipety Split', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.scrollToPosition(0, 99999)

WebUI.click(findTestObject('Object Repository/Page_Mally Beauty High-Shine Liquid/div_Add to Cart20.00 (1) (1) (1)'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Mally Beauty High-Shine Liquid/svg_icon__svg___Birchbox_icon (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__checkout'))

WebUI.delay(18)

WebUI.callTestCase(findTestCase('1. Common script/Complete checkout (US)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile (1)'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Order History'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Order History'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___order history arrow'), 
    0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___order history arrow'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_icon__svg___cc1CR utilitie_4'))

order_verification = WebUI.getText(findTestObject('Page_Beauty Box Subscription for Wo/div_Order_History_Mally Beauty High-Shine Li'))

WebUI.verifyMatch(order_verification, 'Mally Beauty High-Shine Liquid Lipstick Pens - Lipety Split', false, FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_Mally Beauty High-Shine Liquid/svg_icon__svg___cc1CR utilitie'))

WebUI.click(findTestObject('Page_Mally Beauty High-Shine Liquid/svg_icon__svg___Birchbox_icon (1)'))

