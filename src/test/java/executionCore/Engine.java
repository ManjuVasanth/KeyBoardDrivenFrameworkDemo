package executionCore;

import java.lang.reflect.*;

import actionkeywords.ActionKeywords;
import utilities.ExcelUtilities;
// Challenge faced is whenever my core Engine class whenever there is modifications in Keywords I have to use switch or if else-if cases. Each time modifying is tedious.
//With the help of Java Reflection API code reduced drastically to few lines rather than more lines
// code maintainability was easy. Evenif we add n number of ActionKeywords in Excel my code can manage
public class Engine {
	ActionKeywords actionKeywords;
	Method[] methods;
	static String keyword;
	//This method is used to retrieve the method names from ActionKeywords class
	
	//public void getKeywordsFromActions() {
	// Whenever new object is created Constructor will be called and set of actions will be performed thatzy we are not using above function 
	public Engine() {
		actionKeywords =  new ActionKeywords();
	 methods =	actionKeywords.getClass().getMethods();
	}
	// validate method names with the Excel sheet Action Keyword column
	
	public void executeKeywords() throws Exception {
		for(int i =0;i<methods.length;i++) {
			if(methods[i].getName().equalsIgnoreCase(keyword)) {
				methods[i].invoke(actionKeywords);
				break;
			}
		}
		
	}
public static void main(String[] args) throws Exception {
	ExcelUtilities utilities = new ExcelUtilities();
	utilities.readExcelFile("src\\test\\resources\\TestDataCore.xlsx");
	// read keywordsfromExcelSheet
	Engine engine = new Engine();
	int locatorColumn = 3;
	int keywordColumn = locatorColumn+1;
	int dataColumn= locatorColumn+2;
	
	//engine.getKeywordsFromActions();
	for(int row =1;row<=ExcelUtilities.totalRows;row++) {
	
		utilities.getLocatorsKeywordsData(row, locatorColumn,keywordColumn,dataColumn);
	//engine.executeKeywords();
}
}
}
