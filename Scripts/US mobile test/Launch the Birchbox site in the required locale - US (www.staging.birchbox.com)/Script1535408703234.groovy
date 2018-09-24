import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.rtp.SessionAddress as SessionAddress
import org.openqa.selenium.remote.SessionId as SessionId
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

'Browser launches only once and will remain open throughout all the tests'
WebUI.openBrowser('')

viewportHeight = WebUI.getViewportHeight()

viewportWidth = WebUI.getViewportWidth()

println((('Browser size: ' + viewportWidth) + 'X') + viewportHeight)

'Navigate to the Birchbox staging website'
WebUI.navigateToUrl('https://www.staging.birchbox.com')

'Check the browser size to see if the test is running on either a desktop or mobile device.  It\'s not perfect, but generally a PC browser will open much wider'
if (viewportWidth > 1000) {
    'Should only be enabled when running the mobile tests on a desktop browser\r\nThe width of the browser window must be no greater than roughly 400 on a PC or the page will display differently and the script won\'t work'
    WebUI.setViewPortSize(400, 900)
}

'A 15% discount popup displays only once roughly 5 seconds after the web page loads for the first time, so the script will give it time to display here'
WebUI.delay(10)

'Dismiss the popup'
WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/svg_icon__close_popup'))

