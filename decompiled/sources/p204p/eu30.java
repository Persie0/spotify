package p204p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class eu30 implements gu30, IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f62865a;

    public eu30(IBinder iBinder) {
        this.f62865a = iBinder;
    }

    /* JADX INFO: renamed from: C */
    public final void m40020C(int i, Parcel parcel) {
        try {
            this.f62865a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // p204p.gu30
    /* JADX INFO: renamed from: N0 */
    public final void mo40021N0(Bundle bundle, p6f1 p6f1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = hmf1.f92976a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(p6f1Var);
        m40020C(1, parcelObtain);
    }

    @Override // p204p.gu30
    /* JADX INFO: renamed from: W0 */
    public final void mo40022W0(Bundle bundle, p6f1 p6f1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = hmf1.f92976a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(p6f1Var);
        m40020C(4, parcelObtain);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f62865a;
    }

    @Override // p204p.gu30
    /* JADX INFO: renamed from: j1 */
    public final void mo40023j1(Bundle bundle, p6f1 p6f1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = hmf1.f92976a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(p6f1Var);
        m40020C(2, parcelObtain);
    }

    @Override // p204p.gu30
    /* JADX INFO: renamed from: u1 */
    public final void mo40024u1(Bundle bundle, p6f1 p6f1Var) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.engage.protocol.IAppEngageService");
        int i = hmf1.f92976a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(p6f1Var);
        m40020C(3, parcelObtain);
    }
}
