package pageModel;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {
    String url="https://www.trendyol.com/";
    String btnClosePopUp=".fancybox-close";
    String btnAccountUser =".account-user";
    String btnNotificationClose = "modal-close";
    String btnUserInfo =".i-user-info";
    //String btnUserInfo ="div[class='login-dropdown']>p[class='i-user-info']";

    public void goToPage(){
        open(url);
    }

    public void closePopup(){
        findByCss(btnClosePopUp).click();
    }

    public void clickAccountUser(){
        findByCss(btnAccountUser).click();
    }

    public void closeNotification() throws InterruptedException {
        SelenideElement element = findByClassName(btnNotificationClose);
        Thread.sleep(2000);
        if(element.isDisplayed()){
            element.click();
        }
    }
    public void clickUserInfo(){

        findByCss(btnAccountUser).click();


    }
}
