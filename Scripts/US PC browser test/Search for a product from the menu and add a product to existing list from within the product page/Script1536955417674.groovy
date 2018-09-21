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
import org.openqa.selenium.Keys as Keys

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US PC browser test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'Tap the search icon'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__search'), 0)

'Tap the search icon'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__search'))

WebUI.delay(5)

'Enter a search term (purple)'
WebUI.setText(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/input_searchForm__input___2s6r (1)'), 
    'purple')

'Initiate the search'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_Search (1)'))

'Select the first result containing the word "purple"'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Montale Dark Purple Eau de P (1)'))

WebUI.delay(2)

'Select the Favorite icon (heart)'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Montale Dark Purple Eau de Par/svg_icon__svg___cc1CR utilitie_1'), 
    0)

'Select the Favorite icon (heart)'
WebUI.click(findTestObject('Object Repository/Page_Montale Dark Purple Eau de Par/svg_icon__svg___cc1CR utilitie_1'))

WebUI.delay(2)

'If the user is not logged in, this step will create a new account'
if (WebUI.verifyElementPresent(findTestObject('Page_Montale Dark Purple Eau de Par/div_Sign Up'), 5, FailureHandling.OPTIONAL)) {
    WebUI.callTestCase(findTestCase('1. Common script/Create new account (US)'), [:], FailureHandling.STOP_ON_FAILURE)
}

'Add the item to the "My Favorites" list'
WebUI.click(findTestObject('Page_Montale Dark Purple Eau de Par/div_listSelector__checkboxUnch'))

'Wait for the Add to Favorites dialog to dismiss itself'
WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('Page_Montale Dark Purple Eau de Par/div_Profile_PC browser'), 0)

'Tap the profile menu'
WebUI.click(findTestObject('Page_Montale Dark Purple Eau de Par/div_Profile_PC browser'))

WebUI.delay(5)

'Select "Your Lists"'
WebUI.click(findTestObject('Object Repository/Page_Montale Dark Purple Eau de Par/a_Your Lists'))

WebUI.delay(2)

'Select "My Favorites"'
WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/label_Favorites'), 0)

'Select "My Favorites"'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/label_Favorites'))

WebUI.delay(2)

WebUI.verifyTextPresent('Montale Dark Purple Eau de Parfum - 50 ml', false)

'Select the Favorite icon (heart)'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/a_Montale Dark Purple Eau de P (1)'))

WebUI.delay(2)

'Select the Favorite icon (heart)'
WebUI.click(findTestObject('Page_Montale Dark Purple Eau de Par/svg_Add to Cart_icon__svg___filledheart'))

WebUI.delay(2)

'Select the Favorite icon (heart)'
WebUI.click(findTestObject('Page_Montale Dark Purple Eau de Par/div_Favorites_listSelector__checkbox checked'))

WebUI.delay(2)

'Select the Favorite icon (heart)'
WebUI.click(findTestObject('Page_Montale Dark Purple Eau de Par/svg_Log In_icon__svg___Birchbox'))

