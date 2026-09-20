package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class ipf1 implements rpf1, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f104495a;

    public ipf1(IBinder iBinder) {
        this.f104495a = iBinder;
    }

    /* JADX INFO: renamed from: C */
    public final Parcel m51260C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f104495a;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m51261v1(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f104495a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
