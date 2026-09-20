package p204p;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes5.dex */
public final class jf8 implements pf8 {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f111837a;

    public jf8(BluetoothDevice bluetoothDevice) {
        this.f111837a = bluetoothDevice;
    }

    @Override // p204p.pf8
    /* JADX INFO: renamed from: a */
    public final String mo38720a() {
        return this.f111837a.getAddress();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (jf8.class.equals(obj != null ? obj.getClass() : null)) {
            return wj50.m88271j(this.f111837a.getAddress(), ((jf8) obj).f111837a.getAddress());
        }
        return false;
    }

    public final int hashCode() {
        return this.f111837a.getAddress().hashCode();
    }
}
