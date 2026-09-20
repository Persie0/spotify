package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class xf81 implements Parcelable {
    public static final Parcelable.Creator<xf81> CREATOR = new f881(10);

    /* JADX INFO: renamed from: e */
    public static final xf81 f260865e = new xf81(null, null, null, "");

    /* JADX INFO: renamed from: a */
    public final String f260866a;

    /* JADX INFO: renamed from: b */
    public final String f260867b;

    /* JADX INFO: renamed from: c */
    public final String f260868c;

    /* JADX INFO: renamed from: d */
    public final String f260869d;

    public xf81(String str, String str2, String str3, String str4) {
        this.f260866a = str;
        this.f260867b = str2;
        this.f260868c = str3;
        this.f260869d = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m90466c() {
        return this.f260866a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf81)) {
            return false;
        }
        xf81 xf81Var = (xf81) obj;
        return wj50.m88271j(this.f260866a, xf81Var.f260866a) && wj50.m88271j(this.f260867b, xf81Var.f260867b) && wj50.m88271j(this.f260868c, xf81Var.f260868c) && wj50.m88271j(this.f260869d, xf81Var.f260869d);
    }

    /* JADX INFO: renamed from: g */
    public final String m90467g() {
        return this.f260868c;
    }

    public final String getTitle() {
        return this.f260867b;
    }

    /* JADX INFO: renamed from: h */
    public final String m90468h() {
        return this.f260869d;
    }

    public final int hashCode() {
        String str = this.f260866a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f260867b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f260868c;
        return this.f260869d.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f260866a);
        parcel.writeString(this.f260867b);
        parcel.writeString(this.f260868c);
        parcel.writeString(this.f260869d);
    }
}
