package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nsa1 implements Parcelable {
    public static final Parcelable.Creator<nsa1> CREATOR = new u2a1(18);

    /* JADX INFO: renamed from: a */
    public final String f157725a;

    /* JADX INFO: renamed from: b */
    public final String f157726b;

    /* JADX INFO: renamed from: c */
    public final String f157727c;

    /* JADX INFO: renamed from: d */
    public final String f157728d;

    /* JADX INFO: renamed from: e */
    public final int f157729e;

    /* JADX INFO: renamed from: f */
    public final int f157730f;

    /* JADX INFO: renamed from: g */
    public final b370 f157731g;

    public nsa1(String str, String str2, String str3, String str4, int i, int i2, b370 b370Var) {
        this.f157725a = str;
        this.f157726b = str2;
        this.f157727c = str3;
        this.f157728d = str4;
        this.f157729e = i;
        this.f157730f = i2;
        this.f157731g = b370Var;
    }

    /* JADX INFO: renamed from: c */
    public final b370 m65511c() {
        return this.f157731g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsa1)) {
            return false;
        }
        nsa1 nsa1Var = (nsa1) obj;
        return wj50.m88271j(this.f157725a, nsa1Var.f157725a) && wj50.m88271j(this.f157726b, nsa1Var.f157726b) && wj50.m88271j(this.f157727c, nsa1Var.f157727c) && wj50.m88271j(this.f157728d, nsa1Var.f157728d) && this.f157729e == nsa1Var.f157729e && this.f157730f == nsa1Var.f157730f && wj50.m88271j(this.f157731g, nsa1Var.f157731g);
    }

    public final int hashCode() {
        String str = this.f157725a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f157726b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f157727c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f157728d;
        return this.f157731g.hashCode() + mt60.m62800g(this.f157730f, mt60.m62800g(this.f157729e, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f157725a);
        parcel.writeString(this.f157726b);
        parcel.writeString(this.f157727c);
        parcel.writeString(this.f157728d);
        parcel.writeInt(this.f157729e);
        parcel.writeInt(this.f157730f);
        parcel.writeParcelable(this.f157731g, i);
    }
}
