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
not_run: WebUI.callTestCase(findTestCase('US PC browser test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (2)'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Lip'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Lip'))

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 2000)

WebUI.delay(2)

WebUI.scrollToPosition(0, 1000)

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_Shop Lipsticks/img_25.00_image__absolute___2D'), 0)

WebUI.click(findTestObject('Object Repository/Page_Lipsticks/a_Mally Beauty High-Shine Liqu'))

WebUI.comment('Not sure how the buttons for the different shades are differentiated to make the next part work')

WebUI.delay(2)

WebUI.verifyTextPresent('Heartbreaker', false)

WebUI.click(findTestObject('Page_Mally Beauty High-Shine Liquid/div_Lipety Split_swatch__image'))

WebUI.verifyTextPresent('Lipety Split', false)

not_run: WebUI.click(findTestObject('Page_Mally Beauty High-Shine Liquid/div_Nude Light_swatch__image__'))

not_run: WebUI.verifyTextPresent('Nude Light', false)

not_run: WebUI.click(findTestObject('Page_Mally Beauty High-Shine Liquid/div_Perfois Pink_swatch__image'))

not_run: WebUI.verifyTextPresent('Perfois Pink', false)

not_run: WebUI.click(findTestObject('Page_Mally Beauty High-Shine Liquid/div_Sweet Berry_swatch__image_'))

not_run: WebUI.verifyTextPresent('Sweet Berry', false)

WebUI.click(findTestObject('Object Repository/Page_Mally Beauty High-Shine Liquid/div_Add to Cart20.00'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Mally Beauty High-Shine Liquid/svg_Log In_icon__svg___Birchbox PC browser'), 
    0)

WebUI.click(findTestObject('Page_Mally Beauty High-Shine Liquid/svg_Log In_icon__svg___Birchbox PC browser'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/svg_The Mag_icon__svg___checkout icon PC browser'), 
    0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_The Mag_icon__svg___checkout icon PC browser'))

WebUI.callTestCase(findTestCase('1. Common script/Complete checkout (US)'), [:], FailureHandling.STOP_ON_FAILURE)

