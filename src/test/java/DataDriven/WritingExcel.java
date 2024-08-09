package DataDriven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		FileOutputStream File=new FileOutputStream("C:\\Users\\Jeshwanthi\\eclipse-workspace\\TechQFlow\\TestData\\EmployeeData.xlsx");
		XSSFWorkbook Workbook=new XSSFWorkbook();
		XSSFSheet Sheet= Workbook.createSheet();
			
		for(int r=0;r<3;r++) {
		XSSFRow Currentrow=Sheet.createRow(r);
		for(int c=0;c<4;c++)
		{
		System.out.println("Enter Value:");
		String value=sc.next();
		Currentrow.createCell(c).setCellValue(value);
		}
		}
		Workbook.write(File);
		Workbook.close();
		File.close();

	}

}
