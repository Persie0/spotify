package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class rr01 implements Parcelable {
    public static final Parcelable.Creator<rr01> CREATOR = new sp01(14);

    /* JADX INFO: renamed from: a */
    public final lu01 f201918a;

    /* JADX INFO: renamed from: b */
    public final xr01 f201919b;

    public rr01(lu01 lu01Var, xr01 xr01Var) {
        this.f201918a = lu01Var;
        this.f201919b = xr01Var;
    }

    /* JADX INFO: renamed from: c */
    public static rr01 m76272c(rr01 rr01Var, lu01 lu01Var, xr01 xr01Var, int i) {
        if ((i & 1) != 0) {
            lu01Var = rr01Var.f201918a;
        }
        if ((i & 2) != 0) {
            xr01Var = rr01Var.f201919b;
        }
        rr01Var.getClass();
        return new rr01(lu01Var, xr01Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr01)) {
            return false;
        }
        rr01 rr01Var = (rr01) obj;
        return wj50.m88271j(this.f201918a, rr01Var.f201918a) && wj50.m88271j(this.f201919b, rr01Var.f201919b);
    }

    public final int hashCode() {
        return this.f201919b.f265192a.hashCode() + (this.f201918a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f201918a, i);
        parcel.writeParcelable(this.f201919b, i);
    }
}
