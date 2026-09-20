package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class i990 implements r990 {
    public static final Parcelable.Creator<i990> CREATOR = new x390(11);

    /* JADX INFO: renamed from: a */
    public final Long f99955a;

    /* JADX INFO: renamed from: b */
    public final String f99956b;

    /* JADX INFO: renamed from: c */
    public final String f99957c;

    /* JADX INFO: renamed from: d */
    public final String f99958d;

    /* JADX INFO: renamed from: e */
    public final boolean f99959e;

    /* JADX INFO: renamed from: f */
    public final String f99960f;

    /* JADX INFO: renamed from: g */
    public final String f99961g;

    /* JADX INFO: renamed from: h */
    public final String f99962h;

    public i990(Long l, String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.f99955a = l;
        this.f99956b = str;
        this.f99957c = str2;
        this.f99958d = str3;
        this.f99959e = z;
        this.f99960f = str4;
        this.f99961g = str5;
        this.f99962h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i990)) {
            return false;
        }
        i990 i990Var = (i990) obj;
        return wj50.m88271j(this.f99955a, i990Var.f99955a) && wj50.m88271j(this.f99956b, i990Var.f99956b) && wj50.m88271j(this.f99957c, i990Var.f99957c) && wj50.m88271j(this.f99958d, i990Var.f99958d) && this.f99959e == i990Var.f99959e && wj50.m88271j(this.f99960f, i990Var.f99960f) && wj50.m88271j(this.f99961g, i990Var.f99961g) && wj50.m88271j(this.f99962h, i990Var.f99962h);
    }

    public final int hashCode() {
        Long l = this.f99955a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f99956b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f99957c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f99958d;
        int iM77245d = s571.m77245d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f99959e);
        String str4 = this.f99960f;
        int iHashCode4 = (iM77245d + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f99961g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f99962h;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Long l = this.f99955a;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        parcel.writeString(this.f99956b);
        parcel.writeString(this.f99957c);
        parcel.writeString(this.f99958d);
        parcel.writeInt(this.f99959e ? 1 : 0);
        parcel.writeString(this.f99960f);
        parcel.writeString(this.f99961g);
        parcel.writeString(this.f99962h);
    }
}
