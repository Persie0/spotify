package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class hrf1 implements i1g1, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f94433a;

    public hrf1(IBinder iBinder) {
        this.f94433a = iBinder;
    }

    /* JADX INFO: renamed from: C */
    public final Parcel m48385C(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f94433a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f94433a;
    }
}
