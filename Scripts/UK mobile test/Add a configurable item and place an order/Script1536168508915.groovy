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

'Enable this line only when running this test case as a single'
not_run: WebUI.callTestCase(findTestCase('UK mobile test/Launch browser to UK site and close cookie notification'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'), 
    0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___hamburger_menu (1)'))

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Makeup'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Makeup'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Lipsticks  Lip Glosses'), 0)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Lipsticks  Lip Glosses'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('The product displays in different places on the page depending on if the test case is run solo or as part of a suite, so the scrolling below is necessary to find it')

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Lipsticks  Lip Glosses/img_image__absolute___2DQnl ut'), 0)

WebUI.click(findTestObject('Page_Lipsticks  Lip Glosses/a_ModelCo Lip Lacquer'))

WebUI.delay(3)

WebUI.waitForPageLoad(0)

WebUI.scrollToPosition(0, 99999)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_ModelCo Lip Lacquer/div_Add to Basket15.00'), 0)

WebUI.click(findTestObject('Object Repository/Page_ModelCo Lip Lacquer/div_Add to Basket15.00'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___checkout_icon'))

'For some reason, the user may get logged out by this step'
if (WebUI.verifyElementPresent(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_Create Account (1)'), 5, FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.callTestCase(findTestCase('1. Common script/Create new account (UK)'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.verifyElementVisible(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__profile'))

    WebUI.waitForElementClickable(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__profile'), 0)

    WebUI.click(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__profile'))
}

WebUI.callTestCase(findTestCase('1. Common script/Complete checkout (UK)'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/Page_ModelCo Lip Lacquer/svg_icon__svg___cc1CR utilitie'))

WebUI.verifyElementVisible(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__profile'))

WebUI.waitForElementClickable(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__profile'), 0)

WebUI.click(findTestObject('Page_The Birchbox Shop/svg_ 2018 Birchbox_icon__svg__profile'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_The Birchbox Shop/div_Order History'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Order No. 111109391'))

product_name = WebUI.getText(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_ModelCo Lip Lacquer - Viva'), FailureHandling.STOP_ON_FAILURE)

'Check the string against a regex for the correct U.S. currency format'
WebUI.verifyMatch(product_name, 'ModelCo® Lip Lacquer - Crème Brulee', false)

not_run: WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_ModelCo Lip Lacquer - Viva'))

not_run: WebUI.click(findTestObject('Object Repository/Page_ModelCo Lip Lacquer/h1_ModelCo Lip Lacquer'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___Birchbox_icon'))

