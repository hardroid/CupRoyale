package cl.salemlabs.cuproyale.domain.repository;

import cl.salemlabs.cuproyale.domain.model.User;

/**
 * Created by hardroidlabs on 10-03-18.
 */

public interface LoginRepository {
  User getUser(String email, String password);
  User getUserOAuth(String oAuth);
}
