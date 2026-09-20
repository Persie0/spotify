package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kz20 extends vz20 {
    public static final Parcelable.Creator<kz20> CREATOR = new t320(28);

    /* JADX INFO: renamed from: a */
    public final String f127992a;

    /* JADX INFO: renamed from: b */
    public final String f127993b;

    /* JADX INFO: renamed from: c */
    public final String f127994c;

    /* JADX INFO: renamed from: d */
    public final String f127995d;

    /* JADX INFO: renamed from: e */
    public final String f127996e;

    /* JADX INFO: renamed from: f */
    public final boolean f127997f;

    /* JADX INFO: renamed from: g */
    public final boolean f127998g;

    /* JADX INFO: renamed from: h */
    public final boolean f127999h;

    public kz20(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        this.f127992a = str;
        this.f127993b = str2;
        this.f127994c = str3;
        this.f127995d = str4;
        this.f127996e = str5;
        this.f127997f = z;
        this.f127998g = z2;
        this.f127999h = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz20)) {
            return false;
        }
        kz20 kz20Var = (kz20) obj;
        return wj50.m88271j(this.f127992a, kz20Var.f127992a) && wj50.m88271j(this.f127993b, kz20Var.f127993b) && wj50.m88271j(this.f127994c, kz20Var.f127994c) && wj50.m88271j(this.f127995d, kz20Var.f127995d) && wj50.m88271j(this.f127996e, kz20Var.f127996e) && this.f127997f == kz20Var.f127997f && this.f127998g == kz20Var.f127998g && this.f127999h == kz20Var.f127999h;
    }

    @Override // p204p.vz20
    public final String getUri() {
        return this.f127992a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f127992a.hashCode() * 31, 31, this.f127993b);
        String str = this.f127994c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f127995d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f127996e;
        return Boolean.hashCode(this.f127999h) + s571.m77245d(s571.m77245d((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f127997f), 31, this.f127998g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f127992a);
        parcel.writeString(this.f127993b);
        parcel.writeString(this.f127994c);
        parcel.writeString(this.f127995d);
        parcel.writeString(this.f127996e);
        parcel.writeInt(this.f127997f ? 1 : 0);
        parcel.writeInt(this.f127998g ? 1 : 0);
        parcel.writeInt(this.f127999h ? 1 : 0);
    }
}
