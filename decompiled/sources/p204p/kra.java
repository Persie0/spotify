package p204p;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kra extends Binder {

    /* JADX INFO: renamed from: a */
    public final pf40 f125594a;

    public kra(List list) {
        this.f125594a = pf40.m69791p(list);
    }

    /* JADX INFO: renamed from: a */
    public static pf40 m57146a(IBinder iBinder) {
        int i;
        if (iBinder instanceof kra) {
            return ((kra) iBinder).f125594a;
        }
        jf40 jf40VarM69788m = pf40.m69788m();
        int i2 = 0;
        int i3 = 1;
        while (i3 != 0) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInt(i2);
                try {
                    iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                    while (true) {
                        i = parcelObtain2.readInt();
                        if (i == 1) {
                            Bundle bundle = parcelObtain2.readBundle();
                            bundle.getClass();
                            jf40VarM69788m.m28985c(bundle);
                            i2++;
                        }
                    }
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    i3 = i;
                } catch (RemoteException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }
        return jf40VarM69788m.m53150g();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        if (parcel2 == null) {
            return false;
        }
        pf40 pf40Var = this.f125594a;
        int size = pf40Var.size();
        int i3 = parcel.readInt();
        while (i3 < size && parcel2.dataSize() < mva.f147544a) {
            parcel2.writeInt(1);
            parcel2.writeBundle((Bundle) pf40Var.get(i3));
            i3++;
        }
        parcel2.writeInt(i3 < size ? 2 : 0);
        return true;
    }
}
