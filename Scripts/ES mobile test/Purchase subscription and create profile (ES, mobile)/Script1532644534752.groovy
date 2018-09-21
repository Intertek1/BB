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

'Store the current date and time'
date = new Date()

'Store the date and time in the format month/day/year/hour/minute'
datetimeMMddyyhhmm = date.format('MMddyyhhmm')

'Create a unique email address using the formatted date and time'
uniqueESEmail = (('birchbox.intertek+es' + datetimeMMddyyhhmm) + '@gmail.com')

'Enable this line only when running this test case by itself'
WebUI.openBrowser('')

'Enable this line only when running this test case by itself on a PC'
WebUI.setViewPortSize(400, 900)

'Enable this line only when running this test case by itself'
WebUI.navigateToUrl('https://www.staging.birchbox.es/')

WebUI.waitForElementVisible(findTestObject('Page_Descubre la caja de belleza co/div_cookieNotice__remove___2-T (2)'), 0)

'Dismiss the blue notification at the top'
WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_cookieNotice__remove___2-T (2) (1)'))

'Tap the hamburger menu'
WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/svg_icon__svg___hamburger_menu (1)'))

WebUI.comment('Navigate to the subscription page and initiate a purchase')

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Suscrbete (1) (1)'), 
    0)

'Tap "Suscríbete"'
WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Suscrbete (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Suscrbete a Birchbox/div_Mensual1095  Djate sorpren (1) (1)'), 
    0)

'Scroll to "¡La quiero!"'
WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Suscrbete a Birchbox/button_La quiero (1)'), 60)

'Tap "¡La quiero!"'
WebUI.click(findTestObject('Object Repository/Page_Suscrbete a Birchbox/button_La quiero (1)'))

WebUI.comment('Register as a new user')

WebUI.comment('Script has difficulty scrolling at this point, so a while loop should force it to keep trying, but doesn\'t work')

'Script has difficulty scrolling at this point, so a while loop should force it to keep trying'
while (WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Pedido (2) (1)'), 
    5, FailureHandling.CONTINUE_ON_FAILURE) == false) {
    WebUI.comment('Issue - The script continues past the while loop, despite not having scrolled to and clicking the button it was supposed to')

    WebUI.scrollToPosition(0, 0)

    'Scroll to "Pedido"'
    WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Pedido (2) (1)'), 0)
}

'Tap "Pedido"'
WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Pedido (2) (1)'))

'Display the password requirements first, otherwise the password field won\'t accept any text'
not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Contrasea (1) (1)'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_firstName (1) (1)'), 
    'PruebaNombre')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_lastName (1) (1)'), 'PruebaApellido')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_emailAddress (1) (1)'), 
    uniqueESEmail)

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_password (1) (1)'), 
    'yrXHdmw+Di/576oxJz3/0g==')

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No no quiero recibir vuest (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No no quiero recibir vuest (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente (1) (1)'), 
    0)

'Tap "Siguiente"'
not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente (1) (1)'))

not_run: WebUI.comment('Enter shipping information')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.streetAddress1 (1) (1)'), 
    'Cádiz 78')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.city (1) (1)'), 
    'Huéneja')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_A CoruaAlavaAlbaceteAli (1) (1)'), 
    'Granada', true)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.postCode (1) (1)'), 
    '18512')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.telephone (1) (1)'), 
    '795935735')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_payment.creditCardNumber (1) (1)'), 
    '4988438843884305')

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_01020304050607080910111 (1) (1)'), 
    '8', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_16171819202122232425262 (1) (1)'), 
    '18', true)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_payment.cvv (1) (1)'), 
    '737')

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Confirmar (1) (1)'), 
    0)

'Tap "Confirmar"'
not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Confirmar (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_button__default___1Nv1u (1) (1)'), 
    0)

'Tap "Confirmar"'
not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_button__default___1Nv1u (1) (1)'))

not_run: WebUI.comment('Complete the profile, tapping all available options')

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Completa tu perfil de bellez (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Completa tu perfil de bellez (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi piel (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi piel (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Seco (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Seco (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Acn (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Acn (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Prevenir el envejecimiento (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Celulitis (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Manchas (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Manchas (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ojeras o bolsas (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rojeces (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Piel Sensible (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Estras (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Estras (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Proteccin solar (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Falta de firmeza (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Piel atpica (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cabello dbil (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cabello dbil (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado anti-arrugas e hid (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado de pieles maduras (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otros (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy claro (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy claro (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Castao (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Castao (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rizado (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rizado (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Seco yo daado (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Fino (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Encrespado (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Encrespado (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Tipo Afro (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Normal_1 (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Graso (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Graso (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Liso (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mixto (seco en las puntas (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Grueso (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Corto (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ondulado (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ondulado (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A tratamientos qumicos (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A tratamientos qumicos (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A coloracin (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rizador (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Secador (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Secador (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Plancha de pelo (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Lo dejo secarse al aire (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Practicidad (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Practicidad (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo la tcnica del hilo (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo la tcnica del hilo (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Elctrica (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo una cuchilla (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo una cuchilla (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Unas pinzas (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras tcnicas (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ninguna (lser) (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy poca (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy poca (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Tcnica del hilo (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Depiladora elctrica (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Pinzas (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras tcnicas (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras tcnicas (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ninguna (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En casa (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En casa (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En un centro de belleza (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Depende (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi estilo (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi estilo (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Aventurero Quiero probar n (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Aventurero Quiero probar n (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Clsico Me gusta un estilo (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Trendy Me gusta ser siempr (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Natural Me gusta la natura (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Soy novata ayuda (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Soy novata ayuda (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado corporal (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado corporal (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Fragancias (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Maquillaje (2) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado capilar (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado capilar (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Esmaltes (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cremas faciales (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Me encantan (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Me encantan (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Regalitos beauty (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Regalitos beauty (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Accesorios (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Productos naturales (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Snacks dulces (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Snacks dulces (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Snacks salados (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Relacionados con el bienes (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Para el hogar (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Para madres ocupadas (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Para madres ocupadas (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras cosillas (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras cosillas (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_De 0 a 30 mensuales (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_De 0 a 30 mensuales (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_S (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_S (1) (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero muestras muestras y (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero muestras muestras y (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Me interesa cambiar mi rut (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No tengo tiempo para ir de (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero recibir consejos y (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero recibir consejos y (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Es difcil encontrar tienda (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otros (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_2 (1)'))

not_run: WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un anuncio en Internet (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un anuncio en Internet (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En un blog (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A travs de una amiga famil (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un artculo en una revista (1) (1)'))

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un artculo en una revista (1) (1)'), 
    0)

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En redes sociales (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otros (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/path_1 (1)'))

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('https://www.staging.birchbox.es/')

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_id(root)divclassapp__conta (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/svg_icon__svg___cc1CR utilitie (3)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/svg_icon__svg___cc1CR utilitie_1 (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Suscrbete (1) (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Suscrbete a Birchbox/button_La quiero_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Pedido (3)'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Nombre'))

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_Contrasea (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_firstName (2)'), 'Peter')

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_lastName (2)'), 'Gibbons')

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_emailAddress (2)'), uniqueESEmail)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_password (2)'), 'yrXHdmw+Di/576oxJz3/0g==')

WebUI.delay(5)

WebUI.scrollToPosition(0, 99999)

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/div_No no quiero recibir vuest (2)'))

WebUI.waitForElementVisible(findTestObject('Page_Descubre la caja de belleza co/button_Siguiente'), 0)

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.streetAddress1 (2)'), 
    'Cádiz 78')

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.city (2)'), 'Huéneja')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_A CoruaAlavaAlbaceteAli (1) (1)'), 
    'Girona', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_A CoruaAlavaAlbaceteAli (1) (1)'), 
    'Granada', true)

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.postCode (2)'), '18512')

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_shipping.telephone (2)'), '795935735')

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Nmero de la tarjeta (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_payment.creditCardNumber (2)'), 
    '4977949494949497')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_01020304050607080910111 (1) (1)'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Descubre la caja de belleza co/select_16171819202122232425262 (1) (1)'), 
    '20', true)

WebUI.setText(findTestObject('Object Repository/Page_Descubre la caja de belleza co/input_payment.cvv (2)'), '737')

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/button_Revisa tus datos'))

WebUI.delay(15)

WebUI.waitForPageLoad(0)

WebUI.scrollToPosition(0, 99999)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('Page_Descubre la caja de belleza co/button_Confirmar'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/button_Confirmar'))

WebUI.delay(10)

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Completa tu perfil de bellez (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/a_Completa tu perfil de bellez (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi piel (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi piel (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Seco (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Seco (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Acn (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Acn (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Prevenir el envejecimiento (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Celulitis (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Manchas (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Manchas (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ojeras o bolsas (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rojeces (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Piel Sensible (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Estras (1) (1)'))

WebUI.scrollToElement(findTestObject('Page_Descubre la caja de belleza co/div_Estras (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Proteccin solar (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Falta de firmeza (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Piel atpica (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cabello dbil (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cabello dbil (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado anti-arrugas e hid (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado de pieles maduras (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otros (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy claro (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy claro (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Castao (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Castao (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rizado (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rizado (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Seco yo daado (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Fino (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Encrespado (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Encrespado (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Tipo Afro (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Normal_1 (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Graso (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Liso (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Liso (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mixto (seco en las puntas (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Grueso (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Grueso (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Corto (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Corto (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Page_Descubre la caja de belleza co/div_Ondulado (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ondulado (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ondulado (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Page_Descubre la caja de belleza co/div_A tratamientos qumicos (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A tratamientos qumicos (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A coloracin (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Rizador (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Secador (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Secador (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Plancha de pelo (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Lo dejo secarse al aire (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Practicidad (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Practicidad (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo la tcnica del hilo (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Elctrica (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo una cuchilla (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Utilizo una cuchilla (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Unas pinzas (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras tcnicas (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ninguna (lser) (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy poca (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Muy poca (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Tcnica del hilo (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Tcnica del hilo (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Depiladora elctrica (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Pinzas (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras tcnicas (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Ninguna (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En casa (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En casa (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En un centro de belleza (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Depende (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi estilo (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Mi estilo (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Aventurero Quiero probar n (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Aventurero Quiero probar n (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Clsico Me gusta un estilo (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Trendy Me gusta ser siempr (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Natural Me gusta la natura (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Soy novata ayuda (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Soy novata ayuda (1) (1)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado corporal (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado corporal (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Fragancias (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Maquillaje (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cuidado capilar (1) (1)'))

WebUI.scrollToElement(findTestObject('Page_Descubre la caja de belleza co/div_Cuidado capilar (1) (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Esmaltes (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cremas faciales (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No mucho'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No mucho'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Regalitos beauty (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Regalitos beauty (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Accesorios (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Productos naturales (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otras cosillas (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_De 0 a 30 mensuales (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_De 0 a 30 mensuales (1) (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No (1)'), 0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No (1)'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero muestras muestras y (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero muestras muestras y (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Me interesa cambiar mi rut (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_No tengo tiempo para ir de (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Quiero recibir consejos y (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Es difcil encontrar tienda (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Es difcil encontrar tienda (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otros (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Siguiente_3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un anuncio en Internet (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un anuncio en Internet (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En un blog (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_A travs de una amiga famil (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un artculo en una revista (1) (1)'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Un artculo en una revista (1) (1)'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_En redes sociales (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Otros (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Descubre la caja de belleza co/div_Cerca (1) (1)'))

WebUI.click(findTestObject('Page_Descubre la caja de belleza co/svg_icon__svg___Birchbox_icon'))

