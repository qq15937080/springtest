package com.shsz.jexecl.demo;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExportExcel {
	public void exportClassroom() throws Exception {
		try {
			String fileName = "c:\\aaa.xls";//  exprot EXECL path 
			WritableWorkbook wbook = Workbook.createWorkbook(new File(fileName));
			WritableSheet wsheet = wbook.createSheet("信息表", 0); // 工作表名称
			// 设置Excel字体
			WritableFont wfont = new WritableFont(WritableFont.ARIAL, 16,
					WritableFont.BOLD, false,
					jxl.format.UnderlineStyle.NO_UNDERLINE,
					jxl.format.Colour.BLACK);
			WritableCellFormat titleFormat = new WritableCellFormat(wfont);
			String[] title = { "名称", "密码", };
			// 设置Excel表头
			for (int i = 0; i < title.length; i++) {
				Label excelTitle = new Label(i, 0, title[i], titleFormat);
				wsheet.addCell(excelTitle);
			}
			int c = 1; // 用于循环时Excel的行号
			ClassroomService cs = new ClassroomService();
			List list = cs.findAllClassroom(); // 这个是从数据库中取得要导出的数据
			Iterator it = list.iterator();
			while (it.hasNext()) {
				ClassroomDTO crdto = (ClassroomDTO) it.next();
				Label content1 = new Label(0, c, crdto.getStuName());
				Label content2 = new Label(1, c, crdto.getStuPassword());
				wsheet.addCell(content1);
				wsheet.addCell(content2);
				c++;
			}
			wbook.write(); // 写入文件
			wbook.close();
		} catch (Exception e) {
			throw new Exception("导出文件出错");
		}
	}

	public static void main(String[] args) throws Exception {
		ExportExcel tt = new ExportExcel();
		tt.exportClassroom();
	}

}