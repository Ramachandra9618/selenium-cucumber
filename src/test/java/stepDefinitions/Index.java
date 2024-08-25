package stepDefinitions;

import Utilities.ActionUtility;
import pageObjects.*;

public class Index extends  BaseClass {
    public HomePage homePage;
    public LoginPage loginPage;
    public RegisterPage registerPage;
    public ProductPage productPage;
   public CartPage cartPage;
   public ActionUtility actionUtility;


   public  ActionUtility getActionUtility(){
       if (actionUtility == null){
           actionUtility = new ActionUtility(webDriver);
       }
       return actionUtility;
   }

   public HomePage getHomePage(){
       if (homePage == null){
           homePage = new HomePage(webDriver);
       }
       return homePage;
   }

   public ProductPage getProductPage(){
       if (productPage == null){
           productPage = new ProductPage(webDriver);
       }
       return productPage;
   }

   public CartPage getCartPage(){
       if (cartPage == null){
           cartPage = new CartPage(webDriver);
       }
       return  cartPage;
   }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(webDriver);
        }
        return loginPage;
    }

    public RegisterPage getRegisterPage() {
        if (registerPage == null) {
            registerPage = new RegisterPage(webDriver);
        }
        return registerPage;
    }

}

