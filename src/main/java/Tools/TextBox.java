package Tools;


import org.openqa.selenium.WebElement;

public class TextBox extends BaseClass {

    public static boolean EnterValue(WebElement TxtBox, String StrValue){
       boolean IsEntred = false;
        try {
            if (TxtBox.isDisplayed()){
                TxtBox.click();
                TxtBox.clear();
                TxtBox.sendKeys((CharSequence) StrValue);
                IsEntred = true;
            }
            else {
                System.out.println("TxtBox Not Displays");
            }


        } catch (Exception e) {
            System.out.println("Enter Value Failed "+e);
        }
        return IsEntred;
    }

}
