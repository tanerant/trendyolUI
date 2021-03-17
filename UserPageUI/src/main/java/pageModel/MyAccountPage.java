package pageModel;

public class MyAccountPage extends BasePage{


    String Title = "//*[@id=\"account\"]/div[1]/h2";
    String UserButton  ="//*[@id=\"account\"]/div[1]/ul/li[6]";
    String InAccount = ".my-account-title";
    String UserName = "//*[@id=\"UserModel_FirstName\"]";
    String UserMail = "//*[@id=\"UserModel_Email\"]";

    public String checkTitle(){
        return findByXpath(Title).getText();
    }

    public String userInfo(){

        findByXpath(UserButton).click();
        return findByCss(InAccount).getText();

    }
    public String userName(){

        return findByXpath(UserName).getValue();
    }
    public String userMail(){

        return findByXpath(UserMail).getValue();

    }


}
