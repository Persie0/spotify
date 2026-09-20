package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vnc0 implements Parcelable {
    public static final Parcelable.Creator<vnc0> CREATOR = new f4c0(9);

    /* JADX INFO: renamed from: L0 */
    public final zrl0 f243039L0;

    /* JADX INFO: renamed from: M0 */
    public final String f243040M0;

    /* JADX INFO: renamed from: N0 */
    public final gqc0 f243041N0;

    /* JADX INFO: renamed from: O0 */
    public final String f243042O0;

    /* JADX INFO: renamed from: P0 */
    public final int f243043P0;

    /* JADX INFO: renamed from: Q0 */
    public final String f243044Q0;

    /* JADX INFO: renamed from: R0 */
    public final boolean f243045R0;

    /* JADX INFO: renamed from: X */
    public final String f243046X;

    /* JADX INFO: renamed from: Y */
    public final String f243047Y;

    /* JADX INFO: renamed from: Z */
    public final String f243048Z;

    /* JADX INFO: renamed from: a */
    public final String f243049a;

    /* JADX INFO: renamed from: b */
    public final String f243050b;

    /* JADX INFO: renamed from: c */
    public final String f243051c;

    /* JADX INFO: renamed from: d */
    public final String f243052d;

    /* JADX INFO: renamed from: e */
    public final String f243053e;

    /* JADX INFO: renamed from: f */
    public final String f243054f;

    /* JADX INFO: renamed from: g */
    public final String f243055g;

    /* JADX INFO: renamed from: h */
    public final String f243056h;

    /* JADX INFO: renamed from: i */
    public final String f243057i;

    /* JADX INFO: renamed from: t */
    public final String f243058t;

    public vnc0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, zrl0 zrl0Var, String str14, gqc0 gqc0Var, String str15, int i, String str16, boolean z) {
        this.f243049a = str;
        this.f243050b = str2;
        this.f243051c = str3;
        this.f243052d = str4;
        this.f243053e = str5;
        this.f243054f = str6;
        this.f243055g = str7;
        this.f243056h = str8;
        this.f243057i = str9;
        this.f243058t = str10;
        this.f243046X = str11;
        this.f243047Y = str12;
        this.f243048Z = str13;
        this.f243039L0 = zrl0Var;
        this.f243040M0 = str14;
        this.f243041N0 = gqc0Var;
        this.f243042O0 = str15;
        this.f243043P0 = i;
        this.f243044Q0 = str16;
        this.f243045R0 = z;
    }

    /* JADX INFO: renamed from: c */
    public final String m86038c() {
        return this.f243049a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnc0)) {
            return false;
        }
        vnc0 vnc0Var = (vnc0) obj;
        return wj50.m88271j(this.f243049a, vnc0Var.f243049a) && wj50.m88271j(this.f243050b, vnc0Var.f243050b) && wj50.m88271j(this.f243051c, vnc0Var.f243051c) && wj50.m88271j(this.f243052d, vnc0Var.f243052d) && wj50.m88271j(this.f243053e, vnc0Var.f243053e) && wj50.m88271j(this.f243054f, vnc0Var.f243054f) && wj50.m88271j(this.f243055g, vnc0Var.f243055g) && wj50.m88271j(this.f243056h, vnc0Var.f243056h) && wj50.m88271j(this.f243057i, vnc0Var.f243057i) && wj50.m88271j(this.f243058t, vnc0Var.f243058t) && wj50.m88271j(this.f243046X, vnc0Var.f243046X) && wj50.m88271j(this.f243047Y, vnc0Var.f243047Y) && wj50.m88271j(this.f243048Z, vnc0Var.f243048Z) && wj50.m88271j(this.f243039L0, vnc0Var.f243039L0) && wj50.m88271j(this.f243040M0, vnc0Var.f243040M0) && this.f243041N0 == vnc0Var.f243041N0 && wj50.m88271j(this.f243042O0, vnc0Var.f243042O0) && this.f243043P0 == vnc0Var.f243043P0 && wj50.m88271j(this.f243044Q0, vnc0Var.f243044Q0) && this.f243045R0 == vnc0Var.f243045R0;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f243049a.hashCode() * 31, 31, this.f243050b);
        String str = this.f243051c;
        int iM77243b2 = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f243052d), 31, this.f243053e), 31, this.f243054f), 31, this.f243055g), 31, this.f243056h), 31, this.f243057i);
        String str2 = this.f243058t;
        int iHashCode = (this.f243039L0.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((iM77243b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f243046X), 31, this.f243047Y), 31, this.f243048Z)) * 31;
        String str3 = this.f243040M0;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        gqc0 gqc0Var = this.f243041N0;
        int iHashCode3 = (iHashCode2 + (gqc0Var == null ? 0 : gqc0Var.hashCode())) * 31;
        String str4 = this.f243042O0;
        return Boolean.hashCode(this.f243045R0) + s571.m77243b(f710.m40938f(this.f243043P0, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31, this.f243044Q0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f243049a);
        parcel.writeString(this.f243050b);
        parcel.writeString(this.f243051c);
        parcel.writeString(this.f243052d);
        parcel.writeString(this.f243053e);
        parcel.writeString(this.f243054f);
        parcel.writeString(this.f243055g);
        parcel.writeString(this.f243056h);
        parcel.writeString(this.f243057i);
        parcel.writeString(this.f243058t);
        parcel.writeString(this.f243046X);
        parcel.writeString(this.f243047Y);
        parcel.writeString(this.f243048Z);
        this.f243039L0.writeToParcel(parcel, i);
        parcel.writeString(this.f243040M0);
        gqc0 gqc0Var = this.f243041N0;
        if (gqc0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gqc0Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f243042O0);
        int i2 = this.f243043P0;
        if (i2 == 1) {
            str = "UNKNOWN";
        } else if (i2 == 2) {
            str = "NO_HOLDOUT";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "HOLDOUT";
        }
        parcel.writeString(str);
        parcel.writeString(this.f243044Q0);
        parcel.writeInt(this.f243045R0 ? 1 : 0);
    }
}
