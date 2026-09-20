package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class w87 implements Parcelable {
    public static final Parcelable.Creator<w87> CREATOR = new fi6(28);

    /* JADX INFO: renamed from: a */
    public final String f248862a;

    /* JADX INFO: renamed from: b */
    public final String f248863b;

    /* JADX INFO: renamed from: c */
    public final String f248864c;

    /* JADX INFO: renamed from: d */
    public final String f248865d;

    /* JADX INFO: renamed from: e */
    public final String f248866e;

    /* JADX INFO: renamed from: f */
    public final String f248867f;

    /* JADX INFO: renamed from: g */
    public final String f248868g;

    /* JADX INFO: renamed from: h */
    public final String f248869h;

    public w87(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f248862a = str;
        this.f248863b = str2;
        this.f248864c = str3;
        this.f248865d = str4;
        this.f248866e = str5;
        this.f248867f = str6;
        this.f248868g = str7;
        this.f248869h = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w87)) {
            return false;
        }
        w87 w87Var = (w87) obj;
        return wj50.m88271j(this.f248862a, w87Var.f248862a) && wj50.m88271j(this.f248863b, w87Var.f248863b) && wj50.m88271j(this.f248864c, w87Var.f248864c) && wj50.m88271j(this.f248865d, w87Var.f248865d) && wj50.m88271j(this.f248866e, w87Var.f248866e) && wj50.m88271j(this.f248867f, w87Var.f248867f) && wj50.m88271j(this.f248868g, w87Var.f248868g) && wj50.m88271j(this.f248869h, w87Var.f248869h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(this.f248862a.hashCode() * 31, 31, this.f248863b), 31, this.f248864c), 31, this.f248865d);
        String str = this.f248866e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f248867f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f248868g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f248869h;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f248862a);
        parcel.writeString(this.f248863b);
        parcel.writeString(this.f248864c);
        parcel.writeString(this.f248865d);
        parcel.writeString(this.f248866e);
        parcel.writeString(this.f248867f);
        parcel.writeString(this.f248868g);
        parcel.writeString(this.f248869h);
    }
}
