package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class q4h1 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f185180a;

    public q4h1(IBinder iBinder) {
        this.f185180a = iBinder;
    }

    /* JADX INFO: renamed from: C */
    public final void m72159C(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f185180a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f185180a;
    }
}
