package Utils;

import Tools.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class ExtentReport extends BaseClass {

    public ExtentHtmlReporter HMR;
    public ExtentReports Extent;
    public ExtentTest Test;

    @BeforeClass
    public void SetReport(){

        HMR = new ExtentHtmlReporter("./Test-Output/myreport.html");

        HMR.config().setDocumentTitle("Automation Report");
        HMR.config().setReportName("Functional Report");
        HMR.config().setTheme(Theme.DARK);

        Extent = new ExtentReports();
        Extent.attachReporter(HMR);
        Extent.setSystemInfo("Hostname","Localhost");
        Extent.setSystemInfo("OS","Windows10");
        Extent.setSystemInfo("Tester name","Vimalan");
        Extent.setSystemInfo("Browser","Chrome");

    }

    @AfterClass
    public void EndReport(){
        Extent.flush();

    }





}
