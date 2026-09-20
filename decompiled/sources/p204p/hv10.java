package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class hv10 implements Parcelable {
    public static final Parcelable.Creator<hv10> CREATOR = new km10(18);

    /* JADX INFO: renamed from: a */
    public final lt10 f95553a;

    /* JADX INFO: renamed from: b */
    public final String f95554b;

    /* JADX INFO: renamed from: c */
    public final ss10 f95555c;

    /* JADX INFO: renamed from: d */
    public final boolean f95556d;

    /* JADX INFO: renamed from: e */
    public final boolean f95557e;

    /* JADX INFO: renamed from: f */
    public final boolean f95558f;

    public hv10(lt10 lt10Var, String str, ss10 ss10Var, boolean z, boolean z2, boolean z3) {
        this.f95553a = lt10Var;
        this.f95554b = str;
        this.f95555c = ss10Var;
        this.f95556d = z;
        this.f95557e = z2;
        this.f95558f = z3;
    }

    /* JADX INFO: renamed from: c */
    public static hv10 m48702c(hv10 hv10Var, boolean z, boolean z2, boolean z3, int i) {
        lt10 lt10Var = hv10Var.f95553a;
        String str = hv10Var.f95554b;
        ss10 ss10Var = hv10Var.f95555c;
        if ((i & 8) != 0) {
            z = hv10Var.f95556d;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = hv10Var.f95557e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = hv10Var.f95558f;
        }
        hv10Var.getClass();
        return new hv10(lt10Var, str, ss10Var, z4, z5, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv10)) {
            return false;
        }
        hv10 hv10Var = (hv10) obj;
        return wj50.m88271j(this.f95553a, hv10Var.f95553a) && wj50.m88271j(this.f95554b, hv10Var.f95554b) && this.f95555c == hv10Var.f95555c && this.f95556d == hv10Var.f95556d && this.f95557e == hv10Var.f95557e && this.f95558f == hv10Var.f95558f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f95558f) + s571.m77245d(s571.m77245d((this.f95555c.hashCode() + s571.m77243b(this.f95553a.hashCode() * 31, 31, this.f95554b)) * 31, 31, this.f95556d), 31, this.f95557e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f95553a, i);
        parcel.writeString(this.f95554b);
        parcel.writeString(this.f95555c.name());
        parcel.writeInt(this.f95556d ? 1 : 0);
        parcel.writeInt(this.f95557e ? 1 : 0);
        parcel.writeInt(this.f95558f ? 1 : 0);
    }
}
