package cl.salemlabs.cuproyale.data.repository;

/**
 * Created by hardroidlabs on 07-03-18.
 */

public interface AutentificacionRepository {
  interface AutentificacionRepositoryCallback {
    void onSuccess(String token);

    void onError(Throwable t);
  }

  String signInUser(AutentificacionRepositoryCallback callback);
}
