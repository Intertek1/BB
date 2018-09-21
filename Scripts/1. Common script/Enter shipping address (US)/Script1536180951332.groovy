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

'A delay of about 5 seconds is necessary, otherwise an error message says the next field is not editable'
WebUI.delay(3)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Enter shipping address'))

'A delay of about 5 seconds is necessary, otherwise an error message says the next field is not editable'
WebUI.delay(2)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_firstName (5)'), 'Bob')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_lastName (5)'), 'Slydell')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_company'), 'Initek')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_streetAddress1 (1)'), '4683 Chabot Drive')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_streetAddress2 (1)'), 'Suite 201')

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_city (1)'), 'Pleasanton')

WebUI.selectOptionByValue(findTestObject('Page_Beauty Box Subscription for Wo/select_AAACAEAFAKALAMAPARAZCAC (4)'), 'California', 
    true)

WebUI.setText(findTestObject('Page_Beauty Box Subscription for Wo/input_postCode (1)'), '94589')

'If the user is not logged in, this step will create a new account'
if (WebUI.verifyElementPresent(findTestObject('Page_Beauty Box Subscription for Wo/button_Save'), 5, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Save'))
} else {
    WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Continue'))
}

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Confirm (1)'))

WebUI.delay(2)

