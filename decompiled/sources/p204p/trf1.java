package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class trf1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public dz8 f223060l;

    /* JADX INFO: renamed from: m */
    public final int f223061m;

    public trf1(dz8 dz8Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 4);
        this.f223060l = dz8Var;
        this.f223061m = i;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.f223061m;
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) gmf1.m45234a(parcel, Bundle.CREATOR);
            gmf1.m45236c(parcel);
            ig31.m50507y(this.f223060l, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f223060l.mo37408B(i3, strongBinder, bundle, i2);
            this.f223060l = null;
        } else if (i == 2) {
            parcel.readInt();
            gmf1.m45236c(parcel);
            new Exception();
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            afg1 afg1Var = (afg1) gmf1.m45234a(parcel, afg1.CREATOR);
            gmf1.m45236c(parcel);
            dz8 dz8Var = this.f223060l;
            ig31.m50507y(dz8Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            ig31.m50506x(afg1Var);
            dz8Var.m37414I(afg1Var);
            Bundle bundle2 = afg1Var.f15154a;
            ig31.m50507y(this.f223060l, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f223060l.mo37408B(i4, strongBinder2, bundle2, i2);
            this.f223060l = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
