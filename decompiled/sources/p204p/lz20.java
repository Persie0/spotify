package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class lz20 extends vz20 {
    public static final Parcelable.Creator<lz20> CREATOR = new t320(29);

    /* JADX INFO: renamed from: a */
    public final String f138241a;

    /* JADX INFO: renamed from: b */
    public final String f138242b;

    /* JADX INFO: renamed from: c */
    public final String f138243c;

    /* JADX INFO: renamed from: d */
    public final String f138244d;

    public lz20(String str, String str2, String str3, String str4) {
        this.f138241a = str;
        this.f138242b = str2;
        this.f138243c = str3;
        this.f138244d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz20)) {
            return false;
        }
        lz20 lz20Var = (lz20) obj;
        return wj50.m88271j(this.f138241a, lz20Var.f138241a) && wj50.m88271j(this.f138242b, lz20Var.f138242b) && wj50.m88271j(this.f138243c, lz20Var.f138243c) && wj50.m88271j(this.f138244d, lz20Var.f138244d);
    }

    @Override // p204p.vz20
    public final String getUri() {
        return this.f138241a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f138241a.hashCode() * 31, 31, this.f138242b);
        String str = this.f138243c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f138244d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f138241a);
        parcel.writeString(this.f138242b);
        parcel.writeString(this.f138243c);
        parcel.writeString(this.f138244d);
    }
}
