package cl.salemlabs.cuproyale.ui;

import cl.salemlabs.cuproyale.data.repository.AutentificacionRepository;

/**
 * Created by hardroidlabs on 12-03-18.
 */

public class LoginPresenter implements LoginContract.Presenter {

  private final AutentificacionRepository repository;
  private final LoginContract.View view;

  public LoginPresenter(LoginContract.View view, AutentificacionRepository repository) {
    this.view = view;
    this.repository = repository;
  }

  @Override public void onClickLoginGoogle(String user) {
    if(user == null){
      view.showErrorMessage("Usuario invalido");
    }else {
      view.showProgresDialog();
    }
  }

  @Override public void onClickLoginFacebook(String user) {

  }
}
