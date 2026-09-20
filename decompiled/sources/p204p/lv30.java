package p204p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class lv30 implements mv30 {

    /* JADX INFO: renamed from: a */
    public IBinder f137210a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f137210a;
    }

    @Override // p204p.mv30
    /* JADX INFO: renamed from: y */
    public final void mo60047y(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(mv30.f147503f);
            parcelObtain.writeStringArray(strArr);
            this.f137210a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
