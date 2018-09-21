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

'A delay of about 5 seconds is necessary, otherwise the following error displays:\r\nUnable to click on object \'Object Repository/Page_Beauty Box Subscription for Wo/button_Place Order\''
WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Add payment information'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Add payment information'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_creditCardNumber (1)'), '4111111145551142')

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_01020304050607080910111 (4)'), '8', 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_16171819202122232425262 (4)'), '18', 
    true)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_cvv (1)'), '737')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/rect_Save_for_future_use'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Continue'))

'A delay of about 10 seconds is necessary, otherwise the following error displays:\r\nTest Cases/US mobile test/Purchase regular and configurable items (US, mobile) FAILED because (of) Unable to click on object \'Object Repository/Page_Beauty Box Subscription for Wo/button_Continue\''
WebUI.delay(12)

'If there is an "Add payment method" element present, then this information will be entered'
if (WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/button_Continue'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Continue'))
}

