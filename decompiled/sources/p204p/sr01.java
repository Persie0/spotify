package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class sr01 implements Parcelable {
    public static final Parcelable.Creator<sr01> CREATOR = new sp01(15);

    /* JADX INFO: renamed from: a */
    public final rr01 f213201a;

    /* JADX INFO: renamed from: b */
    public final nk01 f213202b;

    /* JADX INFO: renamed from: c */
    public final q111 f213203c;

    public sr01(rr01 rr01Var, nk01 nk01Var, q111 q111Var) {
        this.f213201a = rr01Var;
        this.f213202b = nk01Var;
        this.f213203c = q111Var;
    }

    /* JADX INFO: renamed from: c */
    public static sr01 m78983c(sr01 sr01Var, rr01 rr01Var, nk01 nk01Var, q111 q111Var, int i) {
        if ((i & 1) != 0) {
            rr01Var = sr01Var.f213201a;
        }
        if ((i & 2) != 0) {
            nk01Var = sr01Var.f213202b;
        }
        if ((i & 4) != 0) {
            q111Var = sr01Var.f213203c;
        }
        sr01Var.getClass();
        return new sr01(rr01Var, nk01Var, q111Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr01)) {
            return false;
        }
        sr01 sr01Var = (sr01) obj;
        return wj50.m88271j(this.f213201a, sr01Var.f213201a) && wj50.m88271j(this.f213202b, sr01Var.f213202b) && wj50.m88271j(this.f213203c, sr01Var.f213203c);
    }

    /* JADX INFO: renamed from: g */
    public final as01 m78984g() {
        as01 as01VarM64652c = this.f213202b.m64652c();
        if (as01VarM64652c != null) {
            return as01VarM64652c;
        }
        throw new IllegalArgumentException("No params in share format");
    }

    public final int hashCode() {
        return this.f213203c.hashCode() + ((this.f213202b.hashCode() + (this.f213201a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f213201a.writeToParcel(parcel, i);
        this.f213202b.writeToParcel(parcel, i);
        this.f213203c.writeToParcel(parcel, i);
    }

    public /* synthetic */ sr01(rr01 rr01Var, nk01 nk01Var) {
        this(rr01Var, nk01Var, new q111(null, null, false, null, 15));
    }
}
