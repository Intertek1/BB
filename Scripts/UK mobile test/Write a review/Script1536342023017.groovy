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

WebUI.callTestCase(findTestCase('UK mobile test/Launch browser to UK site and close cookie notification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'), 
    0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Body (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Fragrance'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Fragrance'))

WebUI.waitForElementClickable(findTestObject('Page_Fragrance/a_English Laundry No. 7 For He'), 0)

WebUI.click(findTestObject('Page_Fragrance/a_English Laundry No. 7 For He'))

WebUI.comment('The "Write a Review" button will not appear on the page until that exact part of the page is scrolled to, therefore the only way to get it to appear on the screen is to bounce around the page using several Scroll To Position instructions')

WebUI.scrollToPosition(0, 700)

WebUI.scrollToPosition(0, 1000)

WebUI.scrollToPosition(0, 600)

WebUI.scrollToElement(findTestObject('Page_English Laundry No. 7 For Her/h3_Reviews'), 0)

WebUI.click(findTestObject('Page_English Laundry No. 7 For Her/a_Write a Review'))

WebUI.callTestCase(findTestCase('1. Common script/Create new account (UK)'), [:], FailureHandling.STOP_ON_FAILURE)

'Enable this line only when running this test case by itself'
WebUI.scrollToElement(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Long known for his line of'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu_2'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/span_Review summary'))

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_title'), 'Makes me smeel mainly')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/textarea_review_text'), 'In the morning I splash it on and it surrounds my face with class.  English Laundry Collection for men will turn the women into beasts.  If you want to be the king of the beast and smell like a jungle cat, put it on in the afternoon when you go out with the guys and have a rendezvoos.')

WebUI.setText(findTestObject('Page_Birchbox Join the UKs 1 beauty/input_nickname'), 'Rocky')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/button_Submit Review'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Return to Product'))

