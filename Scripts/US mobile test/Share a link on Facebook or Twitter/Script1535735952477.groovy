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

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('1. Common script/Log into an existing account (US)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__profile'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Spread the Love Earn  in P (1)'))

WebUI.waitForPageLoad(0)

WebUI.scrollToPosition(0, 400)

WebUI.delay(1)

'Select the Twitter button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_StyledButton-gXzblK kjj'))

'Select the Twitter button'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_StyledButton-gXzblK kjj'))

'Switch the focus to the Twitter popup'
WebUI.switchToWindowIndex(1)

try {
    //If the text is not present, switch the focus back to the main window or all subsequent test cases will fail
    assert WebUI.verifyTextPresent('https://www.staging.birchbox.com/invite/', false)
}
catch (Throwable e) {
    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    throw new AssertionError('ERROR: Expected string not found in Twitter', e)
} 

'Close the Twitter popup'
WebUI.closeWindowIndex(1)

'Switch the focus back to the main Birchbox site'
WebUI.switchToWindowIndex(0)

'Select the Facebook button'
WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_StyledButton-gXzblK icV'))

'Select the Facebook button'
WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/button_StyledButton-gXzblK icV'))

'Switch the focus to the Facebook popup'
WebUI.switchToWindowIndex(1)

try {
    //If the text is not present, switch the focus back to the main window or all subsequent test cases will fail
    assert WebUI.verifyTextPresent('Log in to use your Facebook account with Birchbox Comments.', false)
}
catch (Throwable e) {
    WebUI.closeWindowIndex(1)

    WebUI.switchToWindowIndex(0)

    throw new AssertionError('ERROR: Expected string not found in Facebook', e)
} 

'Close the Facebook popup'
WebUI.closeWindowIndex(1)

'Switch the focus back to the main Birchbox site'
WebUI.switchToWindowIndex(0)

