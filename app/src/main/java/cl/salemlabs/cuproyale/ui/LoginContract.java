package cl.salemlabs.cuproyale.ui;

import cl.salemlabs.cuproyale.ui.model.UserViewModel;

/**
 * Created by hardroidlabs on 12-03-18.
 */

public class LoginContract {
  interface View{
    void showProgresDialog();
    void showErrorMessage(String message);
    void loginOk(UserViewModel token);
  }

  interface Presenter{
    void onClickLoginGoogle(String user);
    void onClickLoginFacebook(String user);
  }
}
