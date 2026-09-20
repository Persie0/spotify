package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class a1g1 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f11413a;

    public a1g1(IBinder iBinder) {
        this.f11413a = iBinder;
    }

    /* JADX INFO: renamed from: C */
    public final void m24431C(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f11413a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f11413a;
    }
}
