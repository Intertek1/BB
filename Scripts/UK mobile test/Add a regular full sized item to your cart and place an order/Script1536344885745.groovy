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

not_run: WebUI.callTestCase(findTestCase('UK mobile test/Launch browser to UK site and close cookie notification'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'), 
    0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Body (1)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Body (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Bath  Shower'), 0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Bath  Shower'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Bath  Shower/img_Refine_image__absolute___2'), 0)

WebUI.click(findTestObject('Object Repository/Page_Bath  Shower/img_Refine_image__absolute___2'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 99999)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Aromatherapy Associates Revive/div_Add to Basket45.00'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Aromatherapy Associates Revive/div_Add to Basket45.00'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Aromatherapy Associates Revive/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___checkout_icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Checkout (5)'))

WebUI.callTestCase(findTestCase('1. Common script/Create new account (UK)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Choose delivery option (5)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Choose delivery option (5)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Home Delivery (5)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Home Delivery (5)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/button_Continue (4)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/button_Continue (4)'))

WebUI.delay(5)

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Enter delivery address'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.callTestCase(findTestCase('1. Common script/Enter shipping address (UK)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.waitForPageLoad(0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (4)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (4)'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Standard Delivery 0.00'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Standard Delivery 0.00'))

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/button_Continue (4)'))

WebUI.waitForPageLoad(0)

WebUI.delay(5)

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Add payment information'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.callTestCase(findTestCase('1. Common script/Enter payment information (UK)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(2)

WebUI.scrollToPosition(0, 99999)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (4)'))

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (4)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (4)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementClickable(findTestObject('Page_The Birchbox Shop/div_Order History (1)'), 0)

WebUI.click(findTestObject('Page_The Birchbox Shop/div_Order History (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Order No. 111109631'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Order No. 111109631'))

WebUI.delay(4)

WebUI.verifyTextPresent('Aromatherapy Associates Revive Morning Bath & Shower Oil', false)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___Birchbox_icon'))

