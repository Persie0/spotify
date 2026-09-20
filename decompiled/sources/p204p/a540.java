package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class a540 implements Parcelable {
    public static final Parcelable.Creator<a540> CREATOR = new y240(2);

    /* JADX INFO: renamed from: a */
    public final int f12419a;

    /* JADX INFO: renamed from: b */
    public final String f12420b;

    /* JADX INFO: renamed from: c */
    public final String f12421c;

    /* JADX INFO: renamed from: d */
    public final String f12422d;

    /* JADX INFO: renamed from: e */
    public final String f12423e;

    /* JADX INFO: renamed from: f */
    public final String f12424f;

    /* JADX INFO: renamed from: g */
    public final Double f12425g;

    /* JADX INFO: renamed from: h */
    public final boolean f12426h;

    /* JADX INFO: renamed from: i */
    public final String f12427i;

    public a540(int i, String str, String str2, String str3, String str4, String str5, Double d, boolean z, String str6) {
        this.f12419a = i;
        this.f12420b = str;
        this.f12421c = str2;
        this.f12422d = str3;
        this.f12423e = str4;
        this.f12424f = str5;
        this.f12425g = d;
        this.f12426h = z;
        this.f12427i = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a540)) {
            return false;
        }
        a540 a540Var = (a540) obj;
        return this.f12419a == a540Var.f12419a && wj50.m88271j(this.f12420b, a540Var.f12420b) && wj50.m88271j(this.f12421c, a540Var.f12421c) && wj50.m88271j(this.f12422d, a540Var.f12422d) && wj50.m88271j(this.f12423e, a540Var.f12423e) && wj50.m88271j(this.f12424f, a540Var.f12424f) && wj50.m88271j(this.f12425g, a540Var.f12425g) && this.f12426h == a540Var.f12426h && wj50.m88271j(this.f12427i, a540Var.f12427i);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f12419a) * 31, 31, this.f12420b), 31, this.f12421c), 31, this.f12422d);
        String str = this.f12423e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12424f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f12425g;
        int iM77245d = s571.m77245d((iHashCode2 + (d == null ? 0 : d.hashCode())) * 31, 31, this.f12426h);
        String str3 = this.f12427i;
        return iM77245d + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12419a);
        parcel.writeString(this.f12420b);
        parcel.writeString(this.f12421c);
        parcel.writeString(this.f12422d);
        parcel.writeString(this.f12423e);
        parcel.writeString(this.f12424f);
        Double d = this.f12425g;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeInt(this.f12426h ? 1 : 0);
        parcel.writeString(this.f12427i);
    }
}
