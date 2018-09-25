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

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (2)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (2)'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Birchbox Exclusives'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Birchbox Exclusives'))

WebUI.delay(2)

WebUI.comment('The product displays in different places on the page depending on if the test case is run solo or as part of a suite, so the scrolling below is necessary to find it')

WebUI.scrollToPosition(0, 1000)

WebUI.delay(2)

WebUI.scrollToPosition(0, 2000)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1500)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Shop Birchbox Exclusives/img_image__absolute___Beauty Protector image'), 0)

WebUI.click(findTestObject('Page_Shop Birchbox Exclusives/img_image__absolute___Beauty Protector image'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 600)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Protector Protect  Deta/svg_favorite_icon'), 0)

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/svg_favorite_icon'))

WebUI.delay(5)

'If the user is not logged in'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Email Address (3)'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(4)

WebUI.verifyElementClickable(findTestObject('Page_Beauty Protector Protect  Deta/div_Favorites_listSelector__favorites_checkbox'))

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/div_Favorites_listSelector__favorites_checkbox'))

WebUI.delay(2)

WebUI.waitForPageLoad(0)

'Enable this line only when running this test case by itself'
not_run: WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_username'), 'birchbox.intertek+us08172018@gmail.com')

'Enable this line only when running this test case by itself'
not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_password (8)'), 
    'yrXHdmw+Di/576oxJz3/0g==')

'Enable this line only when running this test case by itself'
not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Sign In (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/p_2 Products'))

not_run: WebUI.delay(2)

not_run: WebUI.waitForElementClickable(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___close_add_to_list_dialog'), 
    0)

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/div_Add to a List_dialog__close'))

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

WebUI.comment('This section removes the favorite using the \'X\' icon')

not_run: WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___X_remove_favorite'), 
    0)

not_run: WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___X_remove_favorite'), 
    0)

not_run: WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___X_remove_favorite'))

WebUI.comment('This section removes the favorite by deselecting the favorites icon')

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Beauty Protector Protect  De'))

not_run: WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___clear_favorites_icon'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/svg_icon__svg___cc1CR utilitie_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/p_0 Products'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/svg_icon__svg___cc1CR utilitie_2'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/svg_icon__svg___clear_favorites_icon'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/div_Favorites_listSelector__uncheck_favorites'))

WebUI.click(findTestObject('Page_Beauty Protector Protect  Deta/div_Add to a List_dialog__close'))

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

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Beauty Protector Protect  Deta/svg_icon__svg___cc1CR utilitie_3'))

WebUI.verifyTextPresent('0 Products', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/span_All Lists'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__Birchbox'))

