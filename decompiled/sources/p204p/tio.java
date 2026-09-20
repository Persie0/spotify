package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface tio {
    ck90 getState();

    default Bundle serialize() {
        return null;
    }

    void start();

    void stop();
}
