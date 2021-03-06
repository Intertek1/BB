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

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_firstName (2)'), 'Samir')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_lastName (2)'), 'Nagheenanajar')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_streetAddress1'), '4683 Chabot Drive')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_streetAddress2'), 'Suite 200')

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_city'), 'Pleasanton')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/select_AAACAEAFAKALAMAPARAZCAC (2)'), 
    'California', true)

WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_postCode'), '94588')

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Continue'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/button_Confirm (1)'))

