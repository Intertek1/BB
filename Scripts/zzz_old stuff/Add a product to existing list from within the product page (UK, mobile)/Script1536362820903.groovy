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

WebUI.callTestCase(findTestCase('UK mobile test/Launch browser to UK site and close cookie notification'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'))

WebUI.waitForElementClickable(findTestObject('Page_LOC One  Done Shadow Stick/div_Hair (1)'), 0)

WebUI.click(findTestObject('Page_LOC One  Done Shadow Stick/div_Hair (1)'))

WebUI.waitForElementClickable(findTestObject('Page_LOC One  Done Shadow Stick/a_Shampoos (1)'), 0)

WebUI.click(findTestObject('Page_LOC One  Done Shadow Stick/a_Shampoos (1)'))

WebUI.click(findTestObject('Object Repository/Page_Shampoos/a_Korres Aloe and Dittany Sham (1)'))

'Scroll to the "Read More" text'
WebUI.scrollToPosition(0, 500)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Korres Aloe and Dittany Shampo/svg_icon__svg___favorites_icon (1)'))

WebUI.callTestCase(findTestCase('1. Common script/Create new account (UK)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Korres Aloe and Dittany Shampo/label_Favourites (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Korres Aloe and Dittany Shampo/svg_icon__svg___profile_icon (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Korres Aloe and Dittany Shampo/div_My Lists (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Korres Aloe and Dittany Shampo/div_My Lists (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Favourites1 Product (2) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/a_Favourites1 Product (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Birchbox Join the UKs 1 beauty/div_Add to Basket (2) (1)'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Korres Aloe and Dittany Shampo/svg_icon__svg___Birchbox_icon'))

