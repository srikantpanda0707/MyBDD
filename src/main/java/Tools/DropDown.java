package Tools;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

    public  void selectByText(WebElement element, String strText) {
        if (element.isDisplayed()) {
            Select Sel = new Select(element);
            Sel.selectByVisibleText(strText);
        } else {
            System.out.println("Text not selected");
        }
    }

    public  void selectByValue(WebElement element, String Str){
        if (element.isDisplayed()){
            Select Sel = new Select(element);
            Sel.selectByValue(Str);
        }
        else {
            System.out.println("Text not selected");
        }
    }



}
