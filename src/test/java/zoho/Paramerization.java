package zoho;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Paramerization {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FileInputStream file=new FileInputStream("C:\\eclipse\\sham.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet"); 
        
        int lastRowIndex = sh.getLastRowNum(); 
      //Step.1 Take outer for loop for Rows
      for(int i=0; i<=lastRowIndex;i++) 
       { 
      //Step.2 Inner for loop used for Columns
      int lastCellIndex = sh.getRow(i).getLastCellNum()-1; 
      for(int j=0; j<=lastCellIndex; j++) 
       { 
       String info = sh.getRow(i).getCell(j).getStringCellValue(); 
       System.out.print(info+" "); 
       } 
       System.out.println(); 
       }   
	}

}
