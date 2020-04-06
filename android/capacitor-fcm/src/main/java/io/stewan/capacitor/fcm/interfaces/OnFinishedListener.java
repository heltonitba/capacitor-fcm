package io.stewan.capacitor.fcm.interfaces;

import android.support.annotation.NonNull;

public interface OnFinishedListener<TResult> {
    void success(@NonNull TResult result);
}
