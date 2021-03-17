package steps;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageModel.HomePage;
import pageModel.LoginPage;
import pageModel.MyAccountPage;

import static org.testng.Assert.assertEquals;

public class AccountSteps {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    MyAccountPage myAccountPage = new MyAccountPage();

    @Test
    public void checkLogin() throws InterruptedException {

        homePage.goToPage();
        homePage.closePopup();
        homePage.clickAccountUser();
        loginPage.login();
        Thread.sleep(2000);
        homePage.closeNotification();
        assertEquals("hesabım", loginPage.checkLogin().toLowerCase());

    }


    @Test(dependsOnMethods={"checkLogin"})
    public void checkAccount() throws InterruptedException{

            homePage.clickUserInfo();
            Thread.sleep(2000);
            assertEquals("hesabım", myAccountPage.checkTitle().toLowerCase());

            myAccountPage.userInfo();

            assertEquals("kullanıcı bilgilerim", myAccountPage.userInfo().toLowerCase());
            assertEquals("D?<'^4ADa46465511dad   adadadasdd", myAccountPage.userName());
            assertEquals("tttest31234@gmail.com", myAccountPage.userMail());
        }



    }


