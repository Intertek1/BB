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

'Enable this line only when running this test suite by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__hamburger_menu (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Collections (3)'))

WebUI.delay(2)

WebUI.verifyTextPresent('Limited Edition Boxes', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Birchbox Discovery Kits', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Birchbox Exclusives', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Best-Sellers', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Gifts with Purchase', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (4)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Makeup (4)'))

WebUI.delay(2)

WebUI.verifyTextPresent('Complexion', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Eye', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Cheek', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Lip', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Hair (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Hair (2)'))

WebUI.delay(2)

WebUI.verifyTextPresent('Wash & Care', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Treat', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Style', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Extend', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Main (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Skin'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Skin'))

WebUI.delay(2)

WebUI.verifyTextPresent('Cleanse', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Treat', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Moisturize', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyTextPresent('Protect', false, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Main (2)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_The Mag'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_The Mag'))

WebUI.delay(2)

WebUI.verifyTextPresent('Visit the Mag', false)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Main'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/span_Main'))

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__svg___close_hamburger_menu'), 
    5)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_TopBar__CloseHamburgerMenu'))

