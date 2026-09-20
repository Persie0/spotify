package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bsx0 implements jsx0 {
    public static final Parcelable.Creator<bsx0> CREATOR = new xxw0(29);

    /* JADX INFO: renamed from: a */
    public final int f30418a;

    /* JADX INFO: renamed from: b */
    public final String f30419b;

    /* JADX INFO: renamed from: c */
    public final String f30420c;

    /* JADX INFO: renamed from: d */
    public final String f30421d;

    /* JADX INFO: renamed from: e */
    public final String f30422e;

    /* JADX INFO: renamed from: f */
    public final String f30423f;

    /* JADX INFO: renamed from: g */
    public final Double f30424g;

    /* JADX INFO: renamed from: h */
    public final String f30425h;

    public bsx0(int i, String str, String str2, String str3, String str4, String str5, Double d, String str6) {
        this.f30418a = i;
        this.f30419b = str;
        this.f30420c = str2;
        this.f30421d = str3;
        this.f30422e = str4;
        this.f30423f = str5;
        this.f30424g = d;
        this.f30425h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsx0)) {
            return false;
        }
        bsx0 bsx0Var = (bsx0) obj;
        return this.f30418a == bsx0Var.f30418a && wj50.m88271j(this.f30419b, bsx0Var.f30419b) && wj50.m88271j(this.f30420c, bsx0Var.f30420c) && wj50.m88271j(this.f30421d, bsx0Var.f30421d) && wj50.m88271j(this.f30422e, bsx0Var.f30422e) && wj50.m88271j(this.f30423f, bsx0Var.f30423f) && wj50.m88271j(this.f30424g, bsx0Var.f30424g) && wj50.m88271j(this.f30425h, bsx0Var.f30425h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f30418a) * 31, 31, this.f30419b), 31, this.f30420c), 31, this.f30421d);
        String str = this.f30422e;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f30423f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f30424g;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f30425h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30418a);
        parcel.writeString(this.f30419b);
        parcel.writeString(this.f30420c);
        parcel.writeString(this.f30421d);
        parcel.writeString(this.f30422e);
        parcel.writeString(this.f30423f);
        Double d = this.f30424g;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f30425h);
    }
}
