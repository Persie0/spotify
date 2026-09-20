package p204p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class v0f1 extends Binder implements IInterface {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f235988a = 0;

    public /* synthetic */ v0f1() {
    }

    /* JADX INFO: renamed from: a2 */
    public abstract boolean mo56334a2(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.f235988a;
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.f235988a) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                b1f1 b1f1Var = (b1f1) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    Bundle bundle = (Bundle) k1f1.m55092a(parcel);
                    k1f1.m55093b(parcel);
                    b1f1Var.mo27907s1(bundle);
                    return true;
                }
                if (i == 3) {
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    Bundle bundle2 = (Bundle) k1f1.m55092a(parcel);
                    k1f1.m55093b(parcel);
                    b1f1Var.mo27904H(bundle2);
                    return true;
                }
                ev61 ev61Var = b1f1Var.f22310l;
                d1f1 d1f1Var = b1f1Var.f22311m;
                if (i == 4) {
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    k1f1.m55093b(parcel);
                    d1f1Var.f44259e.m40479c(ev61Var);
                    return true;
                }
                if (i != 5) {
                    return false;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                k1f1.m55093b(parcel);
                d1f1Var.f44259e.m40479c(ev61Var);
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return mo56334a2(i, parcel, parcel2);
        }
    }

    public v0f1(String str) {
        attachInterface(this, str);
    }
}
