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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/cari')

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/i_Filter Lanjutan_fa fa-chevron-down'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_AC'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Internet'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Tempat Tidur'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Sekamar Berdua'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Air Panas'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_TV'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Kamar Md Dalam'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Meja dan Kursi'))

WebUI.click(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/label_Kamar Kosongan'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Case 3/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/p_Tidak ditemukan kost'))

WebUI.closeBrowser()

