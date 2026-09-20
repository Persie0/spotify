package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class gc40 implements i6z0 {
    public static final Parcelable.Creator<gc40> CREATOR = new y240(10);

    /* JADX INFO: renamed from: a */
    public final int f78484a;

    /* JADX INFO: renamed from: b */
    public final String f78485b;

    /* JADX INFO: renamed from: c */
    public final String f78486c;

    /* JADX INFO: renamed from: d */
    public final String f78487d;

    /* JADX INFO: renamed from: e */
    public final String f78488e;

    /* JADX INFO: renamed from: f */
    public final Double f78489f;

    /* JADX INFO: renamed from: g */
    public final String f78490g;

    public gc40(int i, String str, String str2, String str3, String str4, Double d, String str5) {
        this.f78484a = i;
        this.f78485b = str;
        this.f78486c = str2;
        this.f78487d = str3;
        this.f78488e = str4;
        this.f78489f = d;
        this.f78490g = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc40)) {
            return false;
        }
        gc40 gc40Var = (gc40) obj;
        return this.f78484a == gc40Var.f78484a && wj50.m88271j(this.f78485b, gc40Var.f78485b) && wj50.m88271j(this.f78486c, gc40Var.f78486c) && wj50.m88271j(this.f78487d, gc40Var.f78487d) && wj50.m88271j(this.f78488e, gc40Var.f78488e) && wj50.m88271j(this.f78489f, gc40Var.f78489f) && wj50.m88271j(this.f78490g, gc40Var.f78490g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(Integer.hashCode(this.f78484a) * 31, 31, this.f78485b), 31, this.f78486c);
        String str = this.f78487d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f78488e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f78489f;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f78490g;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p204p.i6z0
    /* JADX INFO: renamed from: s */
    public final int mo27367s() {
        return this.f78484a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f78484a);
        parcel.writeString(this.f78485b);
        parcel.writeString(this.f78486c);
        parcel.writeString(this.f78487d);
        parcel.writeString(this.f78488e);
        Double d = this.f78489f;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f78490g);
    }
}
