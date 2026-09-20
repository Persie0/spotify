package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class lo0 implements Parcelable {
    public static final Parcelable.Creator<lo0> CREATOR = new C2267ps(25);

    /* JADX INFO: renamed from: X */
    public final Long f135253X;

    /* JADX INFO: renamed from: Y */
    public final Double f135254Y;

    /* JADX INFO: renamed from: Z */
    public final String f135255Z;

    /* JADX INFO: renamed from: a */
    public final aly f135256a;

    /* JADX INFO: renamed from: b */
    public final String f135257b;

    /* JADX INFO: renamed from: c */
    public final String f135258c;

    /* JADX INFO: renamed from: d */
    public final String f135259d;

    /* JADX INFO: renamed from: e */
    public final String f135260e;

    /* JADX INFO: renamed from: f */
    public final String f135261f;

    /* JADX INFO: renamed from: g */
    public final String f135262g;

    /* JADX INFO: renamed from: h */
    public final String f135263h;

    /* JADX INFO: renamed from: i */
    public final String f135264i;

    /* JADX INFO: renamed from: t */
    public final String f135265t;

    public lo0(aly alyVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, Double d, String str10) {
        this.f135256a = alyVar;
        this.f135257b = str;
        this.f135258c = str2;
        this.f135259d = str3;
        this.f135260e = str4;
        this.f135261f = str5;
        this.f135262g = str6;
        this.f135263h = str7;
        this.f135264i = str8;
        this.f135265t = str9;
        this.f135253X = l;
        this.f135254Y = d;
        this.f135255Z = str10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo0)) {
            return false;
        }
        lo0 lo0Var = (lo0) obj;
        return wj50.m88271j(this.f135256a, lo0Var.f135256a) && wj50.m88271j(this.f135257b, lo0Var.f135257b) && wj50.m88271j(this.f135258c, lo0Var.f135258c) && wj50.m88271j(this.f135259d, lo0Var.f135259d) && wj50.m88271j(this.f135260e, lo0Var.f135260e) && wj50.m88271j(this.f135261f, lo0Var.f135261f) && wj50.m88271j(this.f135262g, lo0Var.f135262g) && wj50.m88271j(this.f135263h, lo0Var.f135263h) && wj50.m88271j(this.f135264i, lo0Var.f135264i) && wj50.m88271j(this.f135265t, lo0Var.f135265t) && wj50.m88271j(this.f135253X, lo0Var.f135253X) && wj50.m88271j(this.f135254Y, lo0Var.f135254Y) && wj50.m88271j(this.f135255Z, lo0Var.f135255Z);
    }

    public final int hashCode() {
        int iHashCode = this.f135256a.hashCode() * 31;
        String str = this.f135257b;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f135258c), 31, this.f135259d), 31, this.f135260e), 31, this.f135261f), 31, this.f135262g), 31, this.f135263h), 31, this.f135264i), 31, this.f135265t);
        Long l = this.f135253X;
        int iHashCode2 = (iM77243b + (l == null ? 0 : l.hashCode())) * 31;
        Double d = this.f135254Y;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str2 = this.f135255Z;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f135256a, i);
        parcel.writeString(this.f135257b);
        parcel.writeString(this.f135258c);
        parcel.writeString(this.f135259d);
        parcel.writeString(this.f135260e);
        parcel.writeString(this.f135261f);
        parcel.writeString(this.f135262g);
        parcel.writeString(this.f135263h);
        parcel.writeString(this.f135264i);
        parcel.writeString(this.f135265t);
        Long l = this.f135253X;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        Double d = this.f135254Y;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f135255Z);
    }
}
