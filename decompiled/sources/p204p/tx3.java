package p204p;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class tx3 implements BluetoothProfile.ServiceListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingleEmitter f224551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BluetoothAdapter f224552b;

    public tx3(SingleEmitter singleEmitter, BluetoothAdapter bluetoothAdapter) {
        this.f224551a = singleEmitter;
        this.f224552b = bluetoothAdapter;
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        Objects.toString(bluetoothProfile.getConnectedDevices());
        SingleEmitter singleEmitter = this.f224551a;
        if (!singleEmitter.isDisposed()) {
            singleEmitter.onSuccess(bluetoothProfile.getConnectedDevices());
        }
        this.f224552b.closeProfileProxy(i, bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public final void onServiceDisconnected(int i) {
    }
}
