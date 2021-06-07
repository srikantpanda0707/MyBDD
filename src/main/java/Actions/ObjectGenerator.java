package Actions;

import Tools.*;
import Utils.TestDatas;
import org.openqa.selenium.WebDriver;

public class ObjectGenerator {
    private final WebDriver driver;
    public ObjectGenerator(WebDriver driver){
        this.driver = driver;
    }
    public Alert alert;
    public DropDown DD;
    public Elements ele;
    public Frame frame;
    public Sync sync;
    public TextBox textBox;
    public Window window;
    public TestDatas testDatas;



    public void initPage(){
        Alert alert = new Alert();
        DropDown DD = new DropDown();
        Elements ele = new Elements();
        Frame frame = new Frame();
        Sync sync = new Sync();
        TextBox textBox = new TextBox();
        Window window = new Window();
        TestDatas testDatas = new TestDatas();
    }

}
