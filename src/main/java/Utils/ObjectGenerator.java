package Utils;

import Tools.*;

public class ObjectGenerator extends  BaseClass {


    public Alert alert;
    public DropDown DD;
    public Elements ele;
    public Frame frame;
    public Sync sync;
    public TextBox textBox;
    public Window window;
    public TestDatas testDatas;



    public void initPage(){
         alert = new Alert();
         DD = new DropDown();
        ele = new Elements();
         frame = new Frame();
         sync = new Sync();
        textBox = new TextBox();
         window = new Window();
         testDatas = new TestDatas();
    }

}
