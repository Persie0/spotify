package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class jz20 extends vz20 {
    public static final Parcelable.Creator<jz20> CREATOR = new t320(27);

    /* JADX INFO: renamed from: a */
    public final String f117561a;

    /* JADX INFO: renamed from: b */
    public final String f117562b;

    /* JADX INFO: renamed from: c */
    public final String f117563c;

    /* JADX INFO: renamed from: d */
    public final String f117564d;

    /* JADX INFO: renamed from: e */
    public final boolean f117565e;

    public jz20(String str, String str2, String str3, String str4, boolean z) {
        this.f117561a = str;
        this.f117562b = str2;
        this.f117563c = str3;
        this.f117564d = str4;
        this.f117565e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz20)) {
            return false;
        }
        jz20 jz20Var = (jz20) obj;
        return wj50.m88271j(this.f117561a, jz20Var.f117561a) && wj50.m88271j(this.f117562b, jz20Var.f117562b) && wj50.m88271j(this.f117563c, jz20Var.f117563c) && wj50.m88271j(this.f117564d, jz20Var.f117564d) && this.f117565e == jz20Var.f117565e;
    }

    @Override // p204p.vz20
    public final String getUri() {
        return this.f117561a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f117561a.hashCode() * 31, 31, this.f117562b);
        String str = this.f117563c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117564d;
        return Boolean.hashCode(this.f117565e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117561a);
        parcel.writeString(this.f117562b);
        parcel.writeString(this.f117563c);
        parcel.writeString(this.f117564d);
        parcel.writeInt(this.f117565e ? 1 : 0);
    }
}
