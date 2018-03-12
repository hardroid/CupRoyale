package cl.salemlabs.cuproyale.domain.interactor.login;

import cl.salemlabs.cuproyale.domain.interactor.BaseInteractor;
import cl.salemlabs.cuproyale.domain.model.User;
import cl.salemlabs.cuproyale.domain.repository.LoginRepository;

/**
 * Created by hardroidlabs on 10-03-18.
 */

public class LoginUserGmailInteractor implements BaseInteractor<String, User> {

  LoginRepository loginRepository;

  public LoginUserGmailInteractor(LoginRepository loginRepository) {
    this.loginRepository = loginRepository;
  }

  @Override public void excecute(String parameter, Callback callback) {
    loginRepository.getUserOAuth(parameter);
  }
}
