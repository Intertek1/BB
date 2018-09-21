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

'Enable this line only when running this test case as a single'
WebUI.callTestCase(findTestCase('UK mobile test/Launch browser to UK site and close cookie notification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_The Birchbox Shop/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_The Birchbox Shop/div_Makeup'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_The Birchbox Shop/a_Eyeshadows'), 0)

WebUI.click(findTestObject('Object Repository/Page_The Birchbox Shop/a_Eyeshadows'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Eyeshadows/a_LOC One  Done Shadow Stick'), 0)

WebUI.click(findTestObject('Object Repository/Page_Eyeshadows/a_LOC One  Done Shadow Stick'))

WebUI.comment('Navigate to a configurable product and explore')

WebUI.comment('Issue - Can only select between two different shades')

WebUI.scrollToPosition(0, 100)

WebUI.delay(2)

WebUI.scrollToPosition(0, 600)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Page_LOC One  Done Shadow Stick/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_LOC One  Done Shadow Stick/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_LOC One  Done Shadow Stick/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_LOC One  Done Shadow Stick/div_swatch__image___4F2Tg'))

WebUI.scrollToPosition(0, 99999)

WebUI.click(findTestObject('Object Repository/Page_LOC One  Done Shadow Stick/div_Add to Basket8.00'))

WebUI.scrollToPosition(0, 0)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_LOC One  Done Shadow Stick/svg_icon__svg___Birchbox_icon'), 0)

WebUI.click(findTestObject('Page_LOC One  Done Shadow Stick/svg_icon__svg___Birchbox_icon'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___checkout_icon'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___checkout_icon'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Checkout_1 (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Checkout_1 (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Choose delivery option (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Choose delivery option (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Home Delivery (3)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Home Delivery (3)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Select shipping method (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Standard Delivery 2.95 (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Standard Delivery 2.95 (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Continue (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Place Order and Pay (2)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (2)'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Continue Shopping (2)'))

