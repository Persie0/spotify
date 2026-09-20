package p204p;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aaf1 extends kv30 implements qaf1 {
    public aaf1() {
        super("com.google.android.gms.cast.internal.IBundleCallback", 3);
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) fmf1.m42106a(parcel, Bundle.CREATOR);
        fmf1.m42109d(parcel);
        mo43951x1(bundle);
        return true;
    }
}
