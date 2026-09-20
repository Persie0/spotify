package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class hee1 implements Parcelable {
    public static final Parcelable.Creator<hee1> CREATOR = new xed1(17);

    /* JADX INFO: renamed from: a */
    public final ou31 f90420a;

    /* JADX INFO: renamed from: b */
    public final xr01 f90421b;

    /* JADX INFO: renamed from: c */
    public final dee1 f90422c;

    /* JADX INFO: renamed from: d */
    public final int f90423d;

    public hee1(int i, xr01 xr01Var, ou31 ou31Var, dee1 dee1Var) {
        this.f90420a = ou31Var;
        this.f90421b = xr01Var;
        this.f90422c = dee1Var;
        this.f90423d = i;
    }

    /* JADX INFO: renamed from: c */
    public final int m47305c() {
        return this.f90423d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hee1)) {
            return false;
        }
        hee1 hee1Var = (hee1) obj;
        return wj50.m88271j(this.f90420a, hee1Var.f90420a) && wj50.m88271j(this.f90421b, hee1Var.f90421b) && wj50.m88271j(this.f90422c, hee1Var.f90422c) && this.f90423d == hee1Var.f90423d;
    }

    /* JADX INFO: renamed from: g */
    public final xr01 m47306g() {
        return this.f90421b;
    }

    /* JADX INFO: renamed from: h */
    public final dee1 m47307h() {
        return this.f90422c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f90423d) + ((this.f90422c.hashCode() + ((this.f90421b.f265192a.hashCode() + (this.f90420a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f90420a, i);
        parcel.writeParcelable(this.f90421b, i);
        this.f90422c.writeToParcel(parcel, i);
        parcel.writeInt(this.f90423d);
    }
}
