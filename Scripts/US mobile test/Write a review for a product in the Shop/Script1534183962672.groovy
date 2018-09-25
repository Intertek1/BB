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
WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Visit Birchbox Grooming'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/a_Visit Birchbox Grooming'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Visit Birchbox Grooming'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Beard  Shave'))

WebUI.scrollToElement(findTestObject('Page_Beauty Box Subscription for Wo/a_Aftershave'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Aftershave'))

WebUI.click(findTestObject('Object Repository/Page_Aftershave/a_PRORASO Liquid Aftershave Lo'))

WebUI.comment('The "Write a Review" button will not appear on the page until that exact part of the page is scrolled to, therefore the only way to get it to appear on the screen is to bounce around the page using several Scroll To Position instructions')

WebUI.waitForElementVisible(findTestObject('Page_Proraso Liquid Aftershave Loti/div_People Who Bought This Als'), 0)

WebUI.scrollToElement(findTestObject('Page_Proraso Liquid Aftershave Loti/div_People Who Bought This Als'), 0)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1500)

WebUI.scrollToElement(findTestObject('Page_Proraso Liquid Aftershave Loti/a_Read All Reviews'), 0)

WebUI.click(findTestObject('Object Repository/Page_Proraso Liquid Aftershave Loti/a_Write a Review'))

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/div_Email Address (3)'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Create new account (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.delay(5)

WebUI.waitForPageLoad(0)

'Give a 5 star rating'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___review_star_icon'))

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_title'), 'Makes me smeel mainly')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/textarea_review_text'), 'In the mornin\' I splash it on and it surrounds my face with class.  Beast aftershave will turn the women into beasts.  If you want to be the king of the beasts and smell like a jungle cat.  In the afternoon when I put it on to go out with the guys and have a rendezvouse')

'Sometimes the test case will have a nickname field and sometimes it won\'t'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/span_Your Nickname'), 5, FailureHandling.OPTIONAL)) {
    WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_nickname'), 'Rocky')
}

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Submit Review'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Return to Product'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Return to Product'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu'))

WebUI.click(findTestObject('Object Repository/Page_Proraso Liquid Aftershave Loti/a_Visit Birchbox Beauty'))

