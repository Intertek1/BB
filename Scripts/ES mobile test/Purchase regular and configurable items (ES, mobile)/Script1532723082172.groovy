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
not_run: WebUI.openBrowser('')

'Enable this line only when running this test case by itself on a PC'
not_run: WebUI.setViewPortSize(400, 900)

'Enable this line only when running this test case by itself'
not_run: WebUI.navigateToUrl('https://www.staging.birchbox.es/')

not_run: WebUI.waitForElementVisible(findTestObject('Page_Descubre la caja de belleza co/div_cookieNotice__remove___2-T (4)'), 
    0)

not_run: WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_cookieNotice__remove___2-T (4)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Descubre la caja de belleza co/div_Cuidado Facial (2)'), 0)

not_run: WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_Cuidado Facial (2)'))

not_run: WebUI.click(findTestObject('Page_Descubre la caja de belleza co/a_All Cuidado Facial (2)'))

not_run: WebUI.comment('Load multiple pages of content which should ensure that the product the script is looking for is listed')

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'))

not_run: WebUI.waitForElementVisible(findTestObject('Page_Cuidado Facial/div_Ver ms productos (1)'), 0)

not_run: WebUI.scrollToElement(findTestObject('Page_Cuidado Facial/a_Boots Laboratories Serum7 Re (2)'), 0)

not_run: WebUI.click(findTestObject('Page_Cuidado Facial/a_Ainhoa Men Crema de Afeitar (1)'))

not_run: WebUI.click(findTestObject('Page_Ainhoa Men Crema de Afeitar 20/svg_icon__svg___cc1CR utilitie (1) (2)'))

not_run: WebUI.setText(findTestObject('Page_Ainhoa Men Crema de Afeitar 20/input_username (2)'), uniqueESEmail)

not_run: WebUI.setEncryptedText(findTestObject('Page_Ainhoa Men Crema de Afeitar 20/input_password (2)'), 'yrXHdmw+Di/576oxJz3/0g==')

not_run: WebUI.click(findTestObject('Page_Ainhoa Men Crema de Afeitar 20/label_Mis Favoritos (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Regalos por compra/div_barNarrow__menu___3BAeI ut (2)'))

not_run: WebUI.click(findTestObject('Page_Regalos por compra/div_Maquillaje (2)'))

not_run: WebUI.click(findTestObject('Page_Regalos por compra/a_All Maquillaje (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/div_Nombre (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/div_Ver ms productos (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/div_Ver ms productos (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/div_Ver ms productos (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/div_Ver ms productos (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/div_Ver ms productos (1) (2)'))

not_run: WebUI.click(findTestObject('Page_Maquillaje/a_MeMeMe Flawless Finish Liqui (2)'))

not_run: WebUI.click(findTestObject('Page_MeMeMe Flawless Finish Liquid/div_swatch__inner___35qkb util (2)'))

not_run: WebUI.verifyTextPresent('Honey Blush', false)

not_run: WebUI.click(findTestObject('Page_MeMeMe Flawless Finish Liquid/div_swatch__inner___35qkb util (2)'))

not_run: WebUI.verifyTextPresent('Porcelain Pure', false)

not_run: WebUI.click(findTestObject('Page_MeMeMe Flawless Finish Liquid/div_Aadir al carrito 1650 (2)'))

not_run: WebUI.click(findTestObject('Page_MeMeMe Flawless Finish Liquid/div_swatch__inner___35qkb util (2)'))

not_run: WebUI.click(findTestObject('Page_MeMeMe Flawless Finish Liquid/div_swatch__inner___35qkb util (2)'))

not_run: WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_Mis Favoritos2 productos (1) (1) (2)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Aadir al carrito 3750 (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/svg_icon__svg___cc1CR utilitie (2) (1)'))

not_run: WebUI.click(findTestObject('Page_Descubre la caja de belleza co/a_Pedido (2) (1) (2)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_button__default___1Nv1u (1) (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Seguir comprando (1) (1)'))

not_run: WebUI.click(findTestObject('Page_Ainhoa Men Crema de Afeitar 20/svg_icon__svg___cc1CR utilitie_1 (2)'))

not_run: WebUI.click(findTestObject('Page_Ainhoa Men Crema de Afeitar 20/div_Accede (2)'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/svg_icon__svg___hamburger_menu'))

WebUI.waitForElementClickable(findTestObject('Page_Maquillaje/div_Manicura y Pedicura (1)'), 0)

WebUI.click(findTestObject('Page_Maquillaje/div_Manicura y Pedicura (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Models Own esmaltes de uas/a_Esmaltes'), 0)

WebUI.click(findTestObject('Object Repository/Page_Models Own esmaltes de uas/a_Esmaltes'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 1400)

WebUI.click(findTestObject('Object Repository/Page_Esmaltes/a_Models Own esmaltes de uas'))

WebUI.scrollToPosition(0, 600)

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Object Repository/Page_Models Own esmaltes de uas/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Models Own esmaltes de uas/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Models Own esmaltes de uas/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Models Own esmaltes de uas/div_swatch__image___4F2Tg'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Models Own esmaltes de uas/div_swatch__image___4F2Tg'))

WebUI.scrollToPosition(0, 99999)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Models Own esmaltes de uas/div_Aadir al carrito600 (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('Page_Models Own esmaltes de uas/svg_icon__svg___Birchbox_icon'))

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/svg_icon__svg___hamburger_menu'))

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_Cuidado Facial_1 (1)'))

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/a_Exfoliantes (1)'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 1200)

WebUI.click(findTestObject('Object Repository/Page_Exfoliantes/a_Benta berry  G-1 Exfoliante'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 700)

WebUI.click(findTestObject('Page_Benta berry G-1 Exfoliante/svg_icon__svg___favorites_icon'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/div_Regstrate'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/input_firstName'), 'Bob')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/input_lastName'), 'Slydell')

not_run: WebUI.click(findTestObject('Page_Benta berry G-1 Exfoliante/div_Contrasea (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/input_emailAddress'), 'birchbox.intertek+es08242018@gmail.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/input_password'), 'yrXHdmw+Di/576oxJz3/0g==')

not_run: WebUI.click(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/div_No no quiero recibir vuest'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/button_Regstrate'))

not_run: WebUI.click(findTestObject('Page_Benta berry G-1 Exfoliante/svg_icon__svg___favorites_icon'))

WebUI.click(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/button_Accede'))

WebUI.click(findTestObject('Object Repository/Page_Benta berry G-1 Exfoliante/div_listSelector__checkboxUnch'))

WebUI.click(findTestObject('Page_Benta berry G-1 Exfoliante/svg_icon__svg___Birchbox_icon'))

