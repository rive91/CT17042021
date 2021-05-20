package commonMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import globalVariables.GlobalVariables;

public class CommonMethods {
	
	public static String getCellData(String excelName, int row, int column) {
		try {
			// Reading Data
			FileInputStream fis = new FileInputStream(GlobalVariables.PATH_EXCEL_DATA+excelName+".xlsx");
			// Constructs an XSSFWorkbook object
			@SuppressWarnings("resource")
			Workbook wb = new XSSFWorkbook(fis);//Obtiene el archivo .xlsx
			Sheet sheet = wb.getSheetAt(0);//Lee la hoja 0
			Row rowObj = sheet.getRow(row);//indica la fila
			Cell cell = rowObj.getCell(column);//indica la columna apartir de la fila
			String value = cell.getStringCellValue(); //Obtiene el valor y lo transforma a String
			return value;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e1) {
			e1.printStackTrace();
			return null;
		}
	}

}
