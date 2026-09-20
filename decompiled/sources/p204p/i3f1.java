package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class i3f1 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f98170a;

    /* JADX INFO: renamed from: l */
    public final String f98171l;

    public i3f1(IBinder iBinder, String str) {
        this.f98170a = iBinder;
        this.f98171l = str;
    }

    /* JADX INFO: renamed from: C */
    public final Parcel m49620C() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f98171l);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f98170a;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m49621v1(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f98170a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
