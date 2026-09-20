package p204p;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class nqf1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final rtg1 f157271l;

    public nqf1(rtg1 rtg1Var) {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback", 2);
        this.f157271l = rtg1Var;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: v1 */
    public final boolean mo36471v1(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        int i2 = parcel.readInt();
        int i3 = rhf1.f199217a;
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(s571.m77246e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        this.f157271l.m76378a(Integer.valueOf(i2));
        return true;
    }
}
