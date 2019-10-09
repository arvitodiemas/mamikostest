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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mamikos.com/cari')

WebUI.setText(findTestObject('Object Repository/Case 4/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/input_Rentang Harga_filterPriceMin'), 
    '0')

WebUI.setText(findTestObject('Object Repository/Case 4/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/input___filterPriceMax'), 
    '500')

WebUI.click(findTestObject('Object Repository/Case 4/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/button_Set'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Case 4/Page_Mamikos - Cari Kost di sekitar sini Cari Kost di sekitarmu/p_Tidak ditemukan kost'))

WebUI.closeBrowser()

