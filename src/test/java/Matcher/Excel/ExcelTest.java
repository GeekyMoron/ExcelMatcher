package Matcher.Excel;

import java.io.IOException;

import org.testng.annotations.Test;

@Test
public class ExcelTest {
public static void exceltest() throws IOException
{
	ExcelOps.getDatathroughExcel(Constant.SHEET_NAME,Constant.Excel1,Constant.Excel2);
}
}
