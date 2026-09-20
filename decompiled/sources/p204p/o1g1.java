package p204p;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class o1g1 extends g5f1 {
    public o1g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 5);
    }

    /* JADX INFO: renamed from: j2 */
    public final void m66067j2(lag1 lag1Var) {
        Parcel parcelM43604d2 = m43604d2();
        int i = qmf1.f190217a;
        parcelM43604d2.writeStrongBinder(lag1Var);
        parcelM43604d2.writeInt(1);
        m43603c2(43, parcelM43604d2);
    }

    /* JADX INFO: renamed from: k2 */
    public final void m66068k2(lag1 lag1Var, String str) {
        Parcel parcelM43604d2 = m43604d2();
        int i = qmf1.f190217a;
        parcelM43604d2.writeStrongBinder(lag1Var);
        parcelM43604d2.writeString(str);
        m43603c2(63, parcelM43604d2);
    }

    /* JADX INFO: renamed from: l2 */
    public final void m66069l2(lag1 lag1Var, Uri uri, int i) {
        Parcel parcelM43604d2 = m43604d2();
        int i2 = qmf1.f190217a;
        parcelM43604d2.writeStrongBinder(lag1Var);
        qmf1.m73273c(parcelM43604d2, uri);
        parcelM43604d2.writeInt(i);
        m43603c2(40, parcelM43604d2);
    }

    /* JADX INFO: renamed from: m2 */
    public final void m66070m2(hcg1 hcg1Var, cgt0 cgt0Var) {
        Parcel parcelM43604d2 = m43604d2();
        int i = qmf1.f190217a;
        parcelM43604d2.writeStrongBinder(hcg1Var);
        qmf1.m73273c(parcelM43604d2, cgt0Var);
        m43603c2(6, parcelM43604d2);
    }
}
