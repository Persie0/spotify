package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class yx30 implements zx30 {

    /* JADX INFO: renamed from: a */
    public IBinder f277125a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f277125a;
    }

    @Override // p204p.zx30
    /* JADX INFO: renamed from: y0 */
    public final void mo67y0(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(zx30.f287191k);
            parcelObtain.writeInt(i);
            if (bundle != null) {
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f277125a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
