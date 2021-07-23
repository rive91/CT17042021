package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
//import org.testng.Assert;

import globalVariables.GlobalVariables;

public class CommonMethods {
	
	public static void takeScreenshot(WebDriver webdriver, String testCaseName) {
		//Toma el Screenshot de la pagina
		File scrFile = ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		
		//Establecer ruta donde se guarda el screenshot
		String screenshotPath = Paths.get("").toAbsolutePath().toString() + File.separator + "test-output" + File.separator + "ExecutionResult";
		try {
			FileHandler.createDir(new File(screenshotPath));//Crear el folder usando la ruta especificada del String "screenshotPath"
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));//Copiamos el Screenshot a la ruta creada
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static String getJSONvalue (String jsonFileObj, String jsonKey) {
		//Json datos
		try {
		InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");//Usando la ruta para obtener el archivo Json
		JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
		
		//Obtener el dato desaedo
		String jsonValue = (String) jsonObject.getJSONObject(jsonFileObj).get(jsonKey);//Convertimos a String el node del archivo Json
		return jsonValue;
		
		}catch (FileNotFoundException e){
			//Assert.fail("JSON File is not found");
			return null;
		}
	}
	
	public static String getJSONvalue (String jsonFileObj, String nodo,  String jsonKey) {
		//Json datos
		try {
		InputStream inputStream = new FileInputStream(GlobalVariables.PATH_JSON_DATA + jsonFileObj + ".json");//Usando la ruta para obtener el archivo Json
		JSONObject jsonObject = new JSONObject(new JSONTokener(inputStream));
		
		//Obtener el dato desaedo
		String jsonValue = (String) jsonObject.getJSONObject(nodo).get(jsonKey);//Convertimos a String el node del archivo Json
		return jsonValue;
		
		}catch (FileNotFoundException e){
			//Assert.fail("JSON File is not found");
			return null;
		}
	}
	
	public static String getCellData(String excelName, int row, int column) {
		try {
			//Ruta Excel
			FileInputStream exs = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA + excelName + ".xlsx");
			//Contruir un Objecto XSSFWorkbook
			Workbook wb = new XSSFWorkbook(exs); //Obtiene el Excel
			Sheet sheet = wb.getSheetAt(0); //Lee la hoja 0
			Row rowObj = sheet.getRow(row); //Indica la fila
			Cell cell = rowObj.getCell(column); //indica la columna apartir de la fila
			String value = cell.getStringCellValue(); //Obtiene el valor y lo transforma a String
			return value;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}

}
