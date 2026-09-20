package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class ay30 implements cy30 {

    /* JADX INFO: renamed from: a */
    public IBinder f21083a;

    /* JADX INFO: renamed from: C */
    public final String m27498C(String str, k3y0 k3y0Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
            parcelObtain.writeString("q3voa1im9e");
            parcelObtain.writeString("foo");
            parcelObtain.writeString(str);
            parcelObtain.writeStrongInterface(k3y0Var);
            this.f21083a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readString();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final boolean m27499a2(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
            parcelObtain.writeString(str);
            this.f21083a.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f21083a;
    }

    /* JADX INFO: renamed from: v1 */
    public final boolean m27500v1(String str, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.msc.sa.aidl.ISAService");
            parcelObtain.writeInt(100);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f21083a.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
