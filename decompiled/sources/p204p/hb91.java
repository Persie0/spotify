package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hb91 implements Parcelable {
    public static final Parcelable.Creator<hb91> CREATOR = new f891(4);

    /* JADX INFO: renamed from: a */
    public final b370 f89454a;

    /* JADX INFO: renamed from: b */
    public final String f89455b;

    /* JADX INFO: renamed from: c */
    public final String f89456c;

    /* JADX INFO: renamed from: d */
    public final String f89457d;

    /* JADX INFO: renamed from: e */
    public final d0n0 f89458e;

    /* JADX INFO: renamed from: f */
    public final xxm0 f89459f;

    /* JADX INFO: renamed from: g */
    public final dlx f89460g;

    public hb91(b370 b370Var, String str, String str2, String str3, d0n0 d0n0Var, xxm0 xxm0Var, dlx dlxVar) {
        this.f89454a = b370Var;
        this.f89455b = str;
        this.f89456c = str2;
        this.f89457d = str3;
        this.f89458e = d0n0Var;
        this.f89459f = xxm0Var;
        this.f89460g = dlxVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb91)) {
            return false;
        }
        hb91 hb91Var = (hb91) obj;
        return wj50.m88271j(this.f89454a, hb91Var.f89454a) && wj50.m88271j(this.f89455b, hb91Var.f89455b) && wj50.m88271j(this.f89456c, hb91Var.f89456c) && wj50.m88271j(this.f89457d, hb91Var.f89457d) && wj50.m88271j(this.f89458e, hb91Var.f89458e) && this.f89459f == hb91Var.f89459f && wj50.m88271j(this.f89460g, hb91Var.f89460g);
    }

    public final int hashCode() {
        int iHashCode = this.f89454a.hashCode() * 31;
        String str = this.f89455b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89456c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f89457d;
        int iHashCode4 = (this.f89458e.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        xxm0 xxm0Var = this.f89459f;
        int iHashCode5 = (iHashCode4 + (xxm0Var == null ? 0 : xxm0Var.hashCode())) * 31;
        dlx dlxVar = this.f89460g;
        return iHashCode5 + (dlxVar != null ? dlxVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f89454a, i);
        parcel.writeString(this.f89455b);
        parcel.writeString(this.f89456c);
        parcel.writeString(this.f89457d);
        parcel.writeParcelable(this.f89458e, i);
        xxm0 xxm0Var = this.f89459f;
        if (xxm0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(xxm0Var.name());
        }
        parcel.writeParcelable(this.f89460g, i);
    }
}
