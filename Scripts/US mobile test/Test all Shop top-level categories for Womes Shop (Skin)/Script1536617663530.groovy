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

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Cleanse'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cleansers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cleansers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Cleansers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Face Cleansers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Cleansers/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Cleansers/div_Cleanse'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Makeup Removers  Wipes'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Makeup Removers  Wipes'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Makeup Removers  Wipes'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Removers and Face/svg_ 2018 Birchbox_icon__svg___1'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Removers and Face/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Makeup Removers and Face/div_Cleanse'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Tools'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Tools'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Tools'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Tools/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Tools/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Tools/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Exfoliators  Scrubs'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Exfoliators  Scrubs'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Exfoliators  Scrubs'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Exfoliators/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Exfoliators/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Exfoliators/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Masks  Sheet Masks'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Masks  Sheet Masks'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Masks  Sheet Masks'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop Face Masks and Sheet Mask/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Masks and Sheet Mask/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Masks and Sheet Mask/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Peels'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Peels'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Peels'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Facial Peels/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Facial Peels/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Facial Peels/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Toners  Mists'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Toners  Mists'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Toners  Mists'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Toners  Mists/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Toners  Mists/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Toners  Mists/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Serums'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Serums'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Serums'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Face Serums/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Serums/div_Skin'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Shop Face Serums/div_Treat'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Face Serums/div_Treat'), 0)

WebUI.click(findTestObject('Object Repository/Page_Shop Face Serums/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Acne  Oil Treatments'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Acne  Oil Treatments'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Acne  Oil Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop Acne Treatments and Oily/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Acne Treatments and Oily/div_Treat'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Masks  Treatments'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Masks  Treatments'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Masks  Treatments'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Shop Eye Masks and Eye Treatme/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Masks and Eye Treatme/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Masks and Eye Treatme/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Masks  Treatments_1'), 
    0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Masks  Treatments_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Masks  Treatments_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Masks  Lip Treatments/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Masks  Lip Treatments/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Masks  Lip Treatments/div_Treat'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Essences'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Essences'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Essences'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Essences/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Essences/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Essences/div_Moisturize'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Moisturizers'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Moisturizers'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Moisturizers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Moisturizers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Moisturizers/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Moisturizers/div_Moisturize'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Oils'), 0)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Oils'), 0)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Face Oils'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Face Oils/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Oils/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Face Oils/div_Moisturize'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Eye Creams'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Creams/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Creams/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Eye Creams/div_Moisturize'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Lip Balms_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Balms/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Balms/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Lip Balms/div_Protect'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Sunscreens'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Sun Protection/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Sun Protection/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Sun Protection/div_Protect'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Tinted Moisturizers  BBCC'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_Protect'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_SPF Moisturizers'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Sun Protection/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Sun Protection/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Shop Sun Protection/div_See all Skincare'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('Page_Beauty Box Subscription for Wo/div_Skin'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Beauty Box Subscription for Wo/div_Skin'), 0)

WebUI.click(findTestObject('Page_Beauty Box Subscription for Wo/div_Skin'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/a_Best Sellers_1'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Best Sellers/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Best Sellers/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Best Sellers/a_Supplements  Wellness'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Skincare Supplements  Skincare/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Skincare Supplements  Skincare/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Skincare Supplements  Skincare/a_Skincare Sets'))

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Shop Skincare Sets/svg_ 2018 Birchbox_icon__svg__'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Sets/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Sets/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Skincare Sets/a_Skincare Tools'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Cleansing Tools/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Cleansing Tools/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Cleansing Tools/a_All Body'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Body Products/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Body Products/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Body Products/a_Body Sets'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Bath  Body Sets/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bath  Body Sets/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Bath  Body Sets/a_Body Tools'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shop Nail  Cuticle Care/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Shop Nail  Cuticle Care/div_Skin'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/Page_Shop Nail  Cuticle Care/a_Gifts with Purchase'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg__'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/div_The Mag (1)'))

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_Main_icon__svg___cc1CR uti'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Beauty Box Subscription for Wo/svg_ 2018 Birchbox_icon__svg___2'))

