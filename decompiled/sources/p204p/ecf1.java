package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ecf1 extends g5f1 implements zdf1 {
    /* JADX INFO: renamed from: g0 */
    public final void m38500g0(int i) {
        Parcel parcelM43604d2 = m43604d2();
        parcelM43604d2.writeInt(i);
        m43606f2(5, parcelM43604d2);
    }

    /* JADX INFO: renamed from: j2 */
    public final void m38501j2(lg5 lg5Var, String str, String str2, boolean z) {
        Parcel parcelM43604d2 = m43604d2();
        fmf1.m42107b(parcelM43604d2, lg5Var);
        parcelM43604d2.writeString(str);
        parcelM43604d2.writeString(str2);
        parcelM43604d2.writeInt(z ? 1 : 0);
        m43606f2(4, parcelM43604d2);
    }
}
