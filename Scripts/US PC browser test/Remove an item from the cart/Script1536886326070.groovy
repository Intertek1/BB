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
not_run: WebUI.callTestCase(findTestCase('US PC browser test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__search'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__search'))

'Wait a few seconds before entering text or an "element not currently interactable" error may appear'
WebUI.delay(5)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_searchForm__input___2s6r (2)'), 'soap')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Search (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Level Naturals Peppermint  P'))

WebUI.waitForElementVisible(findTestObject('Page_Tweezerman Smooth Finish Facia/div_Add to Cart20.00'), 0)

WebUI.click(findTestObject('Object Repository/Page_Tweezerman Smooth Finish Facia/div_Add to Cart20.00'))

'Wait a few seconds before entering text or an "element not currently interactable" error may appear'
WebUI.delay(8)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__search'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__search'))

'Wait a few seconds before entering text or an "element not currently interactable" error may appear'
WebUI.delay(5)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_searchForm__input___2s6r (2)'), 'rubber')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Search (2)'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Dr. Jart Bright Lover Rubber'))

WebUI.waitForElementVisible(findTestObject('Page_Dr. Jart Bright Lover Rubber M/div_Add to Cart12.00'), 0)

WebUI.click(findTestObject('Object Repository/Page_Dr. Jart Bright Lover Rubber M/div_Add to Cart12.00'))

WebUI.delay(10)

'Select the checkout icon'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_The Mag_icon__svg___checkout icon PC browser'))

WebUI.comment('Verify that an item can be removed by selecting the \'X\' button')

WebUI.delay(5)

'Select the \'X\' icon'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__X_Dr._Jart'), 0)

'Select the \'X\' icon'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__X_Dr._Jart'))

WebUI.delay(5)

WebUI.comment('Verify that an item can be removed by selecting the \'-\' button')

'Select the \'-\' icon'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__-_Soap'), 0)

'Select the \'-\' icon'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__-_Soap'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/a_Continue Shopping (1)'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/a_Continue Shopping (1)'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Continue Shopping (1)'))

