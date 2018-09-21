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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.staging.birchbox.co.uk/')

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_barNarrow__menu___3BAeI ut'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Make-Up'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/a_All Make-Up'))

WebUI.scrollToElement(findTestObject('Page_Make-Up/img_image__absolute___2DQnl ut'), 0)

WebUI.click(findTestObject('Page_Make-Up/img_image__absolute___2DQnl ut'))

WebUI.click(findTestObject('Object Repository/Page_Benefit High Beam/svg_icon__svg___cc1CR utilitie'))

WebUI.click(findTestObject('Object Repository/Page_Benefit High Beam/div_listSelector__checkboxUnch'))

WebUI.click(findTestObject('Object Repository/Page_Benefit High Beam/div_barNarrow__menu___3BAeI ut'))

WebUI.click(findTestObject('Object Repository/Page_Benefit High Beam/div_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Benefit High Beam/a_My Lists'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/svg_icon__svg___cc1CR utilitie'))

WebUI.click(findTestObject('Page_Birchbox Join the UKs 1 beauty/div_Add to Basket 22.00'))

