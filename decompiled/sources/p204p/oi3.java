package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class oi3 implements Parcelable {
    public static final Parcelable.Creator<oi3> CREATOR = new bc3(7);

    /* JADX INFO: renamed from: a */
    public final boolean f165653a;

    /* JADX INFO: renamed from: b */
    public final boolean f165654b;

    /* JADX INFO: renamed from: c */
    public final Boolean f165655c;

    /* JADX INFO: renamed from: d */
    public final boolean f165656d;

    public oi3(boolean z, boolean z2, Boolean bool, boolean z3) {
        this.f165653a = z;
        this.f165654b = z2;
        this.f165655c = bool;
        this.f165656d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi3)) {
            return false;
        }
        oi3 oi3Var = (oi3) obj;
        return this.f165653a == oi3Var.f165653a && this.f165654b == oi3Var.f165654b && wj50.m88271j(this.f165655c, oi3Var.f165655c) && this.f165656d == oi3Var.f165656d;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f165653a) * 31, 31, this.f165654b);
        Boolean bool = this.f165655c;
        return Boolean.hashCode(this.f165656d) + ((iM77245d + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f165653a ? 1 : 0);
        parcel.writeInt(this.f165654b ? 1 : 0);
        Boolean bool = this.f165655c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        parcel.writeInt(this.f165656d ? 1 : 0);
    }
}
