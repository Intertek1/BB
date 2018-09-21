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

not_run: WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (2)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Birchbox Exclusives'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Birchbox Exclusives'))

WebUI.delay(3)

WebUI.scrollToPosition(0, 1000)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1500)

WebUI.scrollToElement(findTestObject('Page_Shop Birchbox Exclusives/img_image__absolute___Beauty Protector image'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Birchbox Exclusives/a_Beauty Protector Protect  De'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Birchbox Exclusives/a_Beauty Protector Protect  De'))

WebUI.delay(4)

WebUI.scrollToPosition(0, 550)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/svg_icon__svg___cc1CR utilitie'), 5)

WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/svg_icon__svg___cc1CR utilitie'))

WebUI.delay(4)

WebUI.waitForPageLoad(0)

'Enable this line only when running this test case by itself'
not_run: WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_username'), 'birchbox.intertek+us08172018@gmail.com')

'Enable this line only when running this test case by itself'
not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_password (8)'), 
    'yrXHdmw+Di/576oxJz3/0g==')

'Enable this line only when running this test case by itself'
not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Sign In (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/p_2 Products'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___close_add_to_list_dialog'), 
    0)

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___close_add_to_list_dialog'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___profile_icon'), 0)

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___profile_icon'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/div_Your Lists'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/div_Your Lists'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Favorites3 Products'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Favorites3 Products'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Add to Cart from Favorites'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Add to Cart from Favorites'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'))

not_run: WebUI.callTestCase(findTestCase('1. Common script/Complete checkout (US)'), [:], FailureHandling.STOP_ON_FAILURE)

