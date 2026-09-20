package p204p;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class t6f1 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f217549a;

    public t6f1(IBinder iBinder) {
        this.f217549a = iBinder;
    }

    /* JADX INFO: renamed from: C */
    public final void m80161C(trf1 trf1Var, eb10 eb10Var) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(trf1Var);
            parcelObtain.writeInt(1);
            g7g1.m43822a(eb10Var, parcelObtain, 0);
            this.f217549a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f217549a;
    }
}
