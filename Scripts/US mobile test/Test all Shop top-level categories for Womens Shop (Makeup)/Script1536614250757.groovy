import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Enable this line only when running this test case by itself'
not_run: WebUI.callTestCase(findTestCase('US mobile test/Launch the Birchbox site in the required locale - US (www.staging.birchbox.com)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Shop Whats New/svg_ 2018 Birchbox_icon__svg__'), 0)

WebUI.click(findTestObject('Page_Shop Whats New/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Whats New/div_Complexion'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Tinted Moisturizers  BBCC Cr'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Tinted Moisturizers  BBCC Cr'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Tinted Moisturizers  BBCC Cr'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Tinted Moisturizers  BBCC/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Tinted Moisturizers  BBCC/div_Makeup'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Tinted Moisturizers  BBCC/div_Complexion'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Foundations'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Foundations'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Foundations'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Foundations/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Foundations/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Foundations/div_Complexion'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Concealers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Concealers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Concealers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Concealers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Concealers/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Concealers/div_Complexion'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Primers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Primers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Primers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Primers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Primers/div_Makeup'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Primers/div_Complexion'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Makeup Primers/div_Complexion'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Primers/div_Complexion'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Color-Correcting'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Color-Correcting'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Color-Correcting'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Color-Correcting Makeup/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Color-Correcting Makeup/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Color-Correcting Makeup/div_Complexion'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Setting Sprays  Powders'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Setting Sprays  Powders'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Setting Sprays  Powders'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Setting Sprays and/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Setting Sprays and/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Setting Sprays and/div_Complexion'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Complexion Sets  Palettes'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Complexion Sets  Palettes'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Complexion Sets  Palettes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Complexion Sets  M/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Complexion Sets  M/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Complexion Sets  M/div_Eye'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Mascaras'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Mascaras'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Mascaras'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Mascaras/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Mascaras/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Mascaras/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Brows'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Brows'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Brows'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Brow Makeup/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Brow Makeup/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Brow Makeup/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eyeliners'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eyeliners'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eyeliners'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Eyeliners/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Eyeliners/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eyeliners/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eyeshadows'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eyeshadows'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eyeshadows'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Eyeshadows/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Eyeshadows/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eyeshadows/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Primers'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Primers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Primers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Primers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Primers/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Primers/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lash Primers  Treatments'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lash Primers  Treatments'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lash Primers  Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lash Primers  Lash Treatm/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lash Primers  Lash Treatm/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lash Primers  Lash Treatm/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_False Lashes'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_False Lashes'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_False Lashes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop False Lashes/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop False Lashes/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop False Lashes/div_Eye'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Sets  Palettes'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Sets  Palettes'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Sets  Palettes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Makeup Sets and Makeu/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Makeup Sets and Makeu/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Makeup Sets and Makeu/div_Cheek'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Blushes'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Blushes'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Blushes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Blush/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Blush/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Blush/div_Cheek'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Bronzers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Bronzers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Bronzers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Bronzer/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Bronzer/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Bronzer/div_Cheek'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Highlighters'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Highlighters'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Highlighters'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Highlighter/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Highlighter/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Highlighter/div_Cheek'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Contouring'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Contouring'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Contouring'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Contouring Makeup/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Contouring Makeup/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Contouring Makeup/div_Cheek'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cheek Sets  Palettes'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cheek Sets  Palettes'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cheek Sets  Palettes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Cheek Palettes and/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Cheek Palettes and/div_Makeup'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Cheek Palettes and/div_Cheek'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Cheek Palettes and/div_Cheek'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip  Cheek Multi-taskers'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip  Cheek Multi-taskers'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip  Cheek Multi-taskers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip and Cheek Multi-taske/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip and Cheek Multi-taske/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip and Cheek Multi-taske/div_Lip'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks (3)'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks (3)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lipsticks (3)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lipsticks/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lipsticks/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lipsticks/div_Lip'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Balms'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Balms'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Balms'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Tinted Lip Balms/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Tinted Lip Balms/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Tinted Lip Balms/div_Lip'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Glosses'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Glosses'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Glosses'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Glosses/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Glosses/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Glosses/div_Lip'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Masks  Treatments'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Masks  Treatments'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Masks  Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Masks  Lip Treatments/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Masks  Lip Treatments/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Masks  Lip Treatments/div_Lip'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Liners'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Liners'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Liners'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Liner Makeup/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Liner Makeup/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Liner Makeup/div_Lip'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip  Cheek Multi-taskers'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip  Cheek Multi-taskers'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip  Cheek Multi-taskers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip and Cheek Multi-taske/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip and Cheek Multi-taske/div_Makeup'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip and Cheek Multi-taske/div_Lip'))

WebUI.delay(2)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Sets  Palettes'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Sets  Palettes'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Sets  Palettes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Makeup Sets  Lip Pale/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Makeup Sets  Lip Pale/div_Makeup'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Lip Makeup Sets  Lip Pale/a_Best Sellers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Lip Makeup Sets  Lip Pale/a_Best Sellers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Makeup Sets  Lip Pale/a_Best Sellers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Best Sellers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Best Sellers/div_Makeup'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Best Sellers/a_Makeup Sets'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Best Sellers/a_Makeup Sets'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Sets/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Sets/div_Makeup'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Sets/a_Makeup Brushes  Tools'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Makeup Sets/a_Makeup Brushes  Tools'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Sets/a_Makeup Brushes  Tools'))

WebUI.delay(3)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/svg_ 2018 Birchbox_icon__svg__'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/svg_ 2018 Birchbox_icon__svg__'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/div_Makeup'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/a_Makeup Removers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/a_Makeup Removers'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Brushes and Makeup/a_Makeup Removers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Removers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Removers/div_Makeup'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Makeup Removers/a_Gifts with Purchase'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Makeup Removers/a_Gifts with Purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Removers/a_Gifts with Purchase'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Whats New/div_Makeup'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Makeup'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_See all Makeup (1)'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_See all Makeup (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_See all Makeup (1)'))

