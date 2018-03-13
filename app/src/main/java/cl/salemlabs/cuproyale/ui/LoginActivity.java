package cl.salemlabs.cuproyale.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import cl.salemlabs.cuproyale.R;
import cl.salemlabs.cuproyale.ui.model.UserViewModel;

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

  LoginContract.Presenter presenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
  }

  @Override public void showProgresDialog() {

  }

  @Override public void showErrorMessage(String message) {

  }

  @Override public void loginOk(UserViewModel token) {

  }
}
