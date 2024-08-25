package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportUtilies {
        public static String getDynamicReportName() {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String timestamp = sdf.format(new Date());
            return "test_reports/report_" + timestamp + ".html";
        }

}
