package p204p;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes5.dex */
public final class jby0 {

    /* JADX INFO: renamed from: a */
    public final int f110921a;

    /* JADX INFO: renamed from: b */
    public final BluetoothDevice f110922b;

    /* JADX INFO: renamed from: c */
    public final Integer f110923c;

    /* JADX INFO: renamed from: d */
    public final String f110924d;

    public jby0(int i, BluetoothDevice bluetoothDevice, Integer num, String str) {
        this.f110921a = i;
        this.f110922b = bluetoothDevice;
        this.f110923c = num;
        this.f110924d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jby0)) {
            return false;
        }
        jby0 jby0Var = (jby0) obj;
        return this.f110921a == jby0Var.f110921a && wj50.m88271j(this.f110922b, jby0Var.f110922b) && wj50.m88271j(this.f110923c, jby0Var.f110923c) && wj50.m88271j(this.f110924d, jby0Var.f110924d);
    }

    public final int hashCode() {
        int iHashCode = (this.f110922b.hashCode() + (Integer.hashCode(this.f110921a) * 31)) * 31;
        Integer num = this.f110923c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f110924d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
