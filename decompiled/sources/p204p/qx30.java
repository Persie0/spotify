package p204p;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class qx30 implements sx30 {

    /* JADX INFO: renamed from: a */
    public IBinder f193467a;

    /* JADX INFO: renamed from: C */
    public final boolean m74098C() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(sx30.f214799j);
            if (!this.f193467a.transact(5, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method isDisplayCapable is unimplemented.");
            }
            parcelObtain2.readException();
            boolean z = parcelObtain2.readInt() != 0;
            parcelObtain2.recycle();
            parcelObtain.recycle();
            return z;
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f193467a;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m74099v1(px30 px30Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(sx30.f214799j);
            parcelObtain.writeStrongInterface(px30Var);
            if (!this.f193467a.transact(7, parcelObtain, parcelObtain2, 0)) {
                throw new RemoteException("Method unregisterProjectedDeviceStateListener is unimplemented.");
            }
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }
}
