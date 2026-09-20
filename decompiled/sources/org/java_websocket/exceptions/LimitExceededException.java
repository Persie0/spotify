package org.java_websocket.exceptions;

import androidx.car.app.model.Alert;

/* JADX INFO: loaded from: classes16.dex */
public class LimitExceededException extends InvalidDataException {

    /* JADX INFO: renamed from: b */
    public final int f10961b;

    public LimitExceededException() {
        this(Alert.DURATION_SHOW_INDEFINITELY);
    }

    public LimitExceededException(int i) {
        super(1009);
        this.f10961b = i;
    }

    public LimitExceededException(String str, int i) {
        super(1009, str);
        this.f10961b = i;
    }

    public LimitExceededException(String str) {
        this(str, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
