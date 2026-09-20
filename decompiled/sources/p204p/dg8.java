package p204p;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Build;

/* JADX INFO: loaded from: classes5.dex */
public final class dg8 implements cg8 {

    /* JADX INFO: renamed from: a */
    public final BluetoothGatt f48748a;

    public dg8(BluetoothGatt bluetoothGatt, wej0 wej0Var) {
        this.f48748a = bluetoothGatt;
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: a */
    public final boolean mo28910a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f48748a.readCharacteristic(bluetoothGattCharacteristic);
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: b */
    public final BluetoothGattService mo28911b() {
        return this.f48748a.getService(l5j.f129958a);
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: c */
    public final boolean mo28912c(int i) {
        return this.f48748a.requestMtu(i);
    }

    @Override // p204p.cg8
    public final void close() {
        this.f48748a.close();
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: d */
    public final bg8 mo28913d(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        BluetoothGatt bluetoothGatt = this.f48748a;
        if (i >= 33) {
            int iWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, 2);
            if (iWriteCharacteristic != 0) {
                return new zf8(iWriteCharacteristic);
            }
        } else {
            bluetoothGattCharacteristic.setValue(bArr);
            if (!bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic)) {
                return new zf8(-1);
            }
        }
        return ag8.f15307a;
    }

    @Override // p204p.cg8
    public final void disconnect() {
        this.f48748a.disconnect();
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: e */
    public final boolean mo28914e() {
        return this.f48748a.discoverServices();
    }

    @Override // p204p.cg8
    /* JADX INFO: renamed from: f */
    public final boolean mo28915f() {
        return this.f48748a.readRemoteRssi();
    }
}
