package p204p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

/* JADX INFO: loaded from: classes5.dex */
public interface cg8 {
    /* JADX INFO: renamed from: a */
    boolean mo28910a(BluetoothGattCharacteristic bluetoothGattCharacteristic);

    /* JADX INFO: renamed from: b */
    BluetoothGattService mo28911b();

    /* JADX INFO: renamed from: c */
    boolean mo28912c(int i);

    void close();

    /* JADX INFO: renamed from: d */
    bg8 mo28913d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr);

    void disconnect();

    /* JADX INFO: renamed from: e */
    boolean mo28914e();

    /* JADX INFO: renamed from: f */
    boolean mo28915f();
}
