package io.stewan.capacitor.fcm.interfaces;

public interface TokenListeners<TSuccess, TError> extends OnFinishedListener<TSuccess> {
    void error(TError message);
}
