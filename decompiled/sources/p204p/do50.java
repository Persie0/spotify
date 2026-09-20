package p204p;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.MaybeEmitter;
import io.reactivex.rxjava3.core.MaybeOnSubscribe;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class do50 implements MaybeOnSubscribe {

    /* JADX INFO: renamed from: b */
    public static final UUID f50948b = UUID.fromString("9B26D8C0-A8ED-440B-95B0-C4714A518BCC");

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f50949a;

    public do50(BluetoothDevice bluetoothDevice) {
        this.f50949a = bluetoothDevice;
    }

    @Override // io.reactivex.rxjava3.core.MaybeOnSubscribe
    public final void subscribe(MaybeEmitter maybeEmitter) throws IOException {
        Logger.m3969e("Go: Creating socket", new Object[0]);
        BluetoothSocket bluetoothSocketCreateInsecureRfcommSocketToServiceRecord = this.f50949a.createInsecureRfcommSocketToServiceRecord(f50948b);
        if (bluetoothSocketCreateInsecureRfcommSocketToServiceRecord == null) {
            Logger.m3966b("Go: Failed to create a socket.", new Object[0]);
            Throwable th = new Throwable("Socket creation failed");
            if (maybeEmitter.isDisposed()) {
                return;
            }
            maybeEmitter.onError(th);
            return;
        }
        maybeEmitter.setCancellable(new zg0(bluetoothSocketCreateInsecureRfcommSocketToServiceRecord, 3));
        try {
            bluetoothSocketCreateInsecureRfcommSocketToServiceRecord.connect();
            InputStream inputStream = bluetoothSocketCreateInsecureRfcommSocketToServiceRecord.getInputStream();
            if (maybeEmitter.isDisposed()) {
                return;
            }
            maybeEmitter.onSuccess(inputStream);
        } catch (IOException e) {
            Logger.m3967c(e, "Go: Failed to connect to socket", new Object[0]);
            if (maybeEmitter.isDisposed()) {
                return;
            }
            maybeEmitter.onError(e);
        }
    }
}
