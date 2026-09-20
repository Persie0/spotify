package p204p;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class su30 implements uu30 {

    /* JADX INFO: renamed from: a */
    public IBinder f213989a;

    /* JADX INFO: renamed from: C */
    public final void m79375C(ru30 ru30Var) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(uu30.f234098e);
            parcelObtain.writeStrongInterface(ru30Var);
            if (!this.f213989a.transact(1, parcelObtain, null, 1)) {
                throw new RemoteException("Method registerCallback is unimplemented.");
            }
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f213989a;
    }
}
