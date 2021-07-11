package Utils;

import Actions.BasicAction;
import Tools.*;

public class ObjectGenerator extends  BaseClass {

//    private static ObjectGenerator OBI;
    public Alert alert;
    public DropDown DD;
    public Elements ele;
    public Frame frame;
    public Sync sync;
    public TextBox textBox;
    public Window window;
    public TestDatas testDatas;

//    private ObjectGenerator(){
//
//    }
//    public static ObjectGenerator getObjectInstance(){
//        if (OBI == null){
//            OBI = new ObjectGenerator();
//        }
//        return OBI;
//    }
//    public void getObjectClass(){
//        alert = new Alert();
//        DD = new DropDown();
//        ele = new Elements();
//        frame = new Frame();
//        sync = new Sync();
//        textBox = new TextBox();
//        window = new Window();
//        testDatas = new TestDatas();
//    }
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
