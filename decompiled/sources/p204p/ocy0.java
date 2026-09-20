package p204p;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes5.dex */
public final class ocy0 {

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice f164018a;

    /* JADX INFO: renamed from: b */
    public final Integer f164019b;

    public ocy0(BluetoothDevice bluetoothDevice, Integer num) {
        this.f164018a = bluetoothDevice;
        this.f164019b = num;
    }

    /* JADX INFO: renamed from: a */
    public final BluetoothDevice m66727a() {
        return this.f164018a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ocy0)) {
            return false;
        }
        ocy0 ocy0Var = (ocy0) obj;
        return wj50.m88271j(this.f164018a, ocy0Var.f164018a) && wj50.m88271j(this.f164019b, ocy0Var.f164019b);
    }

    public final int hashCode() {
        int iHashCode = this.f164018a.hashCode() * 31;
        Integer num = this.f164019b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
