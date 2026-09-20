package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class kzf1 extends kv30 {

    /* JADX INFO: renamed from: l */
    public final oc5 f128104l;

    public kzf1(oc5 oc5Var) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 11);
        this.f128104l = oc5Var;
    }

    @Override // p204p.kv30
    /* JADX INFO: renamed from: b2 */
    public final boolean mo25223b2(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f128104l);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = pkf1.f178455a;
        Parcelable parcelable = parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel);
        long j = parcel.readLong();
        pkf1.m70215c(parcel);
        this.f128104l.mo53293a(j, string, string2, (Bundle) parcelable);
        parcel2.writeNoException();
        return true;
    }
}
