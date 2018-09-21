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

not_run: WebUI.openBrowser('')

not_run: WebUI.setViewPortSize(400, 900)

not_run: WebUI.navigateToUrl('https://www.staging.birchbox.es/')

'Enable this line only when running this test case by itself'
not_run: WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_cookieNotice__remove___2-T'))

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/svg_icon__svg___cc1CR utilitie (1)'))

'Enter the search text'
WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_searchForm__input___2s6r'), 'champú')

'Submit the search term'
WebUI.sendKeys(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_searchForm__input___2s6r'), Keys.chord(
        Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Pilopeptan Woman Champ'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Pilopeptan Woman Champ/svg_icon__svg___cc1CR utilitie'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Salerm Cosmetics Champ Espec'))

WebUI.click(findTestObject('Object Repository/Page_Salerm Cosmetics Champ Especfi/svg_icon__svg___cc1CR utilitie'))

WebUI.click(findTestObject('Object Repository/Page_Salerm Cosmetics Champ Especfi/div_dialog__close___1LhUc util'))

not_run: WebUI.closeBrowser()

