package cl.salemlabs.cuproyale.domain.interactor;

/**
 * Created by hardroidlabs on 10-03-18.
 */

public interface BaseInteractor<P> {
  interface Callback{
    void onSuccess();
    void onError(Throwable error);
  }

  void excecute(P parameter, Callback callback);
}
