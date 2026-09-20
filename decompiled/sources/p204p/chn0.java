package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class chn0 implements Parcelable {
    public static final Parcelable.Creator<chn0> CREATOR = new n9n0(24);

    /* JADX INFO: renamed from: X */
    public final String f38037X;

    /* JADX INFO: renamed from: Y */
    public final String f38038Y;

    /* JADX INFO: renamed from: a */
    public final String f38039a;

    /* JADX INFO: renamed from: b */
    public final String f38040b;

    /* JADX INFO: renamed from: c */
    public final String f38041c;

    /* JADX INFO: renamed from: d */
    public final String f38042d;

    /* JADX INFO: renamed from: e */
    public final String f38043e;

    /* JADX INFO: renamed from: f */
    public final String f38044f;

    /* JADX INFO: renamed from: g */
    public final String f38045g;

    /* JADX INFO: renamed from: h */
    public final String f38046h;

    /* JADX INFO: renamed from: i */
    public final String f38047i;

    /* JADX INFO: renamed from: t */
    public final String f38048t;

    public chn0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.f38039a = str;
        this.f38040b = str2;
        this.f38041c = str3;
        this.f38042d = str4;
        this.f38043e = str5;
        this.f38044f = str6;
        this.f38045g = str7;
        this.f38046h = str8;
        this.f38047i = str9;
        this.f38048t = str10;
        this.f38037X = str11;
        this.f38038Y = str12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chn0)) {
            return false;
        }
        chn0 chn0Var = (chn0) obj;
        return wj50.m88271j(this.f38039a, chn0Var.f38039a) && wj50.m88271j(this.f38040b, chn0Var.f38040b) && wj50.m88271j(this.f38041c, chn0Var.f38041c) && wj50.m88271j(this.f38042d, chn0Var.f38042d) && wj50.m88271j(this.f38043e, chn0Var.f38043e) && wj50.m88271j(this.f38044f, chn0Var.f38044f) && wj50.m88271j(this.f38045g, chn0Var.f38045g) && wj50.m88271j(this.f38046h, chn0Var.f38046h) && wj50.m88271j(this.f38047i, chn0Var.f38047i) && wj50.m88271j(this.f38048t, chn0Var.f38048t) && wj50.m88271j(this.f38037X, chn0Var.f38037X) && wj50.m88271j(this.f38038Y, chn0Var.f38038Y);
    }

    public final int hashCode() {
        return this.f38038Y.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f38039a.hashCode() * 31, 31, this.f38040b), 31, this.f38041c), 31, this.f38042d), 31, this.f38043e), 31, this.f38044f), 31, this.f38045g), 31, this.f38046h), 31, this.f38047i), 31, this.f38048t), 31, this.f38037X);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38039a);
        parcel.writeString(this.f38040b);
        parcel.writeString(this.f38041c);
        parcel.writeString(this.f38042d);
        parcel.writeString(this.f38043e);
        parcel.writeString(this.f38044f);
        parcel.writeString(this.f38045g);
        parcel.writeString(this.f38046h);
        parcel.writeString(this.f38047i);
        parcel.writeString(this.f38048t);
        parcel.writeString(this.f38037X);
        parcel.writeString(this.f38038Y);
    }
}
