package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class d4k0 extends e4k0 {
    public static final Parcelable.Creator<d4k0> CREATOR = new fgj0(19);

    /* JADX INFO: renamed from: a */
    public final boolean f45193a;

    /* JADX INFO: renamed from: b */
    public final boolean f45194b;

    /* JADX INFO: renamed from: c */
    public final String f45195c;

    public d4k0(String str, boolean z, boolean z2) {
        this.f45193a = z;
        this.f45194b = z2;
        this.f45195c = str;
    }

    /* JADX INFO: renamed from: c */
    public static d4k0 m34917c(d4k0 d4k0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = d4k0Var.f45193a;
        }
        if ((i & 2) != 0) {
            z2 = d4k0Var.f45194b;
        }
        String str = d4k0Var.f45195c;
        d4k0Var.getClass();
        return new d4k0(str, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4k0)) {
            return false;
        }
        d4k0 d4k0Var = (d4k0) obj;
        return this.f45193a == d4k0Var.f45193a && this.f45194b == d4k0Var.f45194b && wj50.m88271j(this.f45195c, d4k0Var.f45195c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f45193a) * 31, 31, this.f45194b);
        String str = this.f45195c;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45193a ? 1 : 0);
        parcel.writeInt(this.f45194b ? 1 : 0);
        parcel.writeString(this.f45195c);
    }
}
