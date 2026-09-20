package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class bmc1 implements Parcelable {
    public static final Parcelable.Creator<bmc1> CREATOR = new nlc1(12);

    /* JADX INFO: renamed from: a */
    public final String f28501a;

    /* JADX INFO: renamed from: b */
    public final String f28502b;

    /* JADX INFO: renamed from: c */
    public final String f28503c;

    /* JADX INFO: renamed from: d */
    public final String f28504d;

    /* JADX INFO: renamed from: e */
    public final String f28505e;

    public bmc1(String str, String str2, String str3, String str4, String str5) {
        this.f28501a = str;
        this.f28502b = str2;
        this.f28503c = str3;
        this.f28504d = str4;
        this.f28505e = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmc1)) {
            return false;
        }
        bmc1 bmc1Var = (bmc1) obj;
        return wj50.m88271j(this.f28501a, bmc1Var.f28501a) && wj50.m88271j(this.f28502b, bmc1Var.f28502b) && wj50.m88271j(this.f28503c, bmc1Var.f28503c) && wj50.m88271j(this.f28504d, bmc1Var.f28504d) && wj50.m88271j(this.f28505e, bmc1Var.f28505e);
    }

    public final int hashCode() {
        int iHashCode = this.f28501a.hashCode() * 31;
        String str = this.f28502b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f28503c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f28504d;
        return this.f28505e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28501a);
        parcel.writeString(this.f28502b);
        parcel.writeString(this.f28503c);
        parcel.writeString(this.f28504d);
        parcel.writeString(this.f28505e);
    }
}
