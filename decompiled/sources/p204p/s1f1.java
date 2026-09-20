package p204p;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class s1f1 implements g2f1 {

    /* JADX INFO: renamed from: a */
    public IBinder f204709a;

    @Override // p204p.g2f1
    /* JADX INFO: renamed from: X0 */
    public final void mo43389X0(o6r o6rVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ravelin.core.IDeviceIdInterface");
            parcelObtain.writeInt(1);
            o6rVar.writeToParcel(parcelObtain, 0);
            this.f204709a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f204709a;
    }

    @Override // p204p.g2f1
    /* JADX INFO: renamed from: l1 */
    public final void mo43390l1(yue yueVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.ravelin.core.IDeviceIdInterface");
            parcelObtain.writeStrongInterface(yueVar);
            this.f204709a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
