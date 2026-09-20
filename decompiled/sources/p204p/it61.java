package p204p;

import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseSettings;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
public final class it61 extends AdvertiseCallback {
    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartFailure(int i) {
        Logger.m3966b("Tap BLE Peripheral: Advertising failed (errorCode=%d)", Integer.valueOf(i));
    }

    @Override // android.bluetooth.le.AdvertiseCallback
    public final void onStartSuccess(AdvertiseSettings advertiseSettings) {
    }
}
