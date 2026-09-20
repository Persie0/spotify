package p204p;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

/* JADX INFO: loaded from: classes5.dex */
public final class be8 implements cg8 {
    @Override // p204p.cg8
    /* JADX INFO: renamed from: a */
    public final boolean mo28910a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        throw new IllegalStateException("Should never be called when getService returns null");
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ BluetoothGattService mo28911b() {
        return null;
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: c */
    public final boolean mo28912c(int i) {
        return false;
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: d */
    public final bg8 mo28913d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        throw new IllegalStateException("Should never be called when getService returns null");
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: e */
    public final boolean mo28914e() {
        return false;
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: f */
    public final boolean mo28915f() {
        return false;
    }

    @Override // p204p.cg8
    public final void close() {
    }

    @Override // p204p.cg8
    public final void disconnect() {
    }
}
