package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ft5 implements Parcelable {
    public static final Parcelable.Creator<ft5> CREATOR = new vp5(5);

    /* JADX INFO: renamed from: a */
    public final String f73109a;

    /* JADX INFO: renamed from: b */
    public final String f73110b;

    /* JADX INFO: renamed from: c */
    public final String f73111c;

    /* JADX INFO: renamed from: d */
    public final boolean f73112d;

    /* JADX INFO: renamed from: e */
    public final boolean f73113e;

    /* JADX INFO: renamed from: f */
    public final boolean f73114f;

    /* JADX INFO: renamed from: g */
    public final boolean f73115g;

    /* JADX INFO: renamed from: h */
    public final boolean f73116h;

    /* JADX INFO: renamed from: i */
    public final boolean f73117i;

    /* JADX INFO: renamed from: t */
    public final ct5 f73118t;

    public ft5(String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ct5 ct5Var) {
        this.f73109a = str;
        this.f73110b = str2;
        this.f73111c = str3;
        this.f73112d = z;
        this.f73113e = z2;
        this.f73114f = z3;
        this.f73115g = z4;
        this.f73116h = z5;
        this.f73117i = z6;
        this.f73118t = ct5Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft5)) {
            return false;
        }
        ft5 ft5Var = (ft5) obj;
        return wj50.m88271j(this.f73109a, ft5Var.f73109a) && wj50.m88271j(this.f73110b, ft5Var.f73110b) && wj50.m88271j(this.f73111c, ft5Var.f73111c) && this.f73112d == ft5Var.f73112d && this.f73113e == ft5Var.f73113e && this.f73114f == ft5Var.f73114f && this.f73115g == ft5Var.f73115g && this.f73116h == ft5Var.f73116h && this.f73117i == ft5Var.f73117i && wj50.m88271j(this.f73118t, ft5Var.f73118t);
    }

    public final int hashCode() {
        int iHashCode = this.f73109a.hashCode() * 31;
        String str = this.f73110b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f73111c;
        int iM77245d = s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f73112d), 31, this.f73113e), 31, this.f73114f), 31, this.f73115g), 31, this.f73116h), 31, this.f73117i);
        ct5 ct5Var = this.f73118t;
        return iM77245d + (ct5Var != null ? ct5Var.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73109a);
        parcel.writeString(this.f73110b);
        parcel.writeString(this.f73111c);
        parcel.writeInt(this.f73112d ? 1 : 0);
        parcel.writeInt(this.f73113e ? 1 : 0);
        parcel.writeInt(this.f73114f ? 1 : 0);
        parcel.writeInt(this.f73115g ? 1 : 0);
        parcel.writeInt(this.f73116h ? 1 : 0);
        parcel.writeInt(this.f73117i ? 1 : 0);
        ct5 ct5Var = this.f73118t;
        if (ct5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ct5Var.writeToParcel(parcel, i);
        }
    }
}
