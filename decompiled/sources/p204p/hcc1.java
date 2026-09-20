package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hcc1 implements Parcelable {
    public static final Parcelable.Creator<hcc1> CREATOR = new c8b1(26);

    /* JADX INFO: renamed from: L0 */
    public final fcc1 f89752L0;

    /* JADX INFO: renamed from: M0 */
    public final z0r f89753M0;

    /* JADX INFO: renamed from: N0 */
    public final String f89754N0;

    /* JADX INFO: renamed from: O0 */
    public final String f89755O0;

    /* JADX INFO: renamed from: X */
    public final Uri f89756X;

    /* JADX INFO: renamed from: Y */
    public final boolean f89757Y;

    /* JADX INFO: renamed from: Z */
    public final nu71 f89758Z;

    /* JADX INFO: renamed from: a */
    public final String f89759a;

    /* JADX INFO: renamed from: b */
    public final gcr0 f89760b;

    /* JADX INFO: renamed from: c */
    public final gcr0 f89761c;

    /* JADX INFO: renamed from: d */
    public final int f89762d;

    /* JADX INFO: renamed from: e */
    public final int f89763e;

    /* JADX INFO: renamed from: f */
    public final String f89764f;

    /* JADX INFO: renamed from: g */
    public final String f89765g;

    /* JADX INFO: renamed from: h */
    public final om01 f89766h;

    /* JADX INFO: renamed from: i */
    public final sr01 f89767i;

    /* JADX INFO: renamed from: t */
    public final long f89768t;

    public hcc1(String str, gcr0 gcr0Var, gcr0 gcr0Var2, int i, int i2, String str2, String str3, om01 om01Var, sr01 sr01Var, long j, Uri uri, boolean z, nu71 nu71Var, fcc1 fcc1Var, z0r z0rVar, String str4, String str5) {
        this.f89759a = str;
        this.f89760b = gcr0Var;
        this.f89761c = gcr0Var2;
        this.f89762d = i;
        this.f89763e = i2;
        this.f89764f = str2;
        this.f89765g = str3;
        this.f89766h = om01Var;
        this.f89767i = sr01Var;
        this.f89768t = j;
        this.f89756X = uri;
        this.f89757Y = z;
        this.f89758Z = nu71Var;
        this.f89752L0 = fcc1Var;
        this.f89753M0 = z0rVar;
        this.f89754N0 = str4;
        this.f89755O0 = str5;
    }

    /* JADX INFO: renamed from: c */
    public static hcc1 m47108c(hcc1 hcc1Var, String str, om01 om01Var, long j, nu71 nu71Var, fcc1 fcc1Var, z0r z0rVar, String str2, int i) {
        String str3 = hcc1Var.f89759a;
        gcr0 gcr0Var = hcc1Var.f89760b;
        gcr0 gcr0Var2 = hcc1Var.f89761c;
        int i2 = hcc1Var.f89762d;
        int i3 = hcc1Var.f89763e;
        String str4 = (i & 32) != 0 ? hcc1Var.f89764f : str;
        String str5 = hcc1Var.f89765g;
        om01 om01Var2 = (i & 128) != 0 ? hcc1Var.f89766h : om01Var;
        sr01 sr01Var = hcc1Var.f89767i;
        long j2 = (i & 512) != 0 ? hcc1Var.f89768t : j;
        Uri uri = hcc1Var.f89756X;
        String str6 = str4;
        om01 om01Var3 = om01Var2;
        long j3 = j2;
        boolean z = hcc1Var.f89757Y;
        nu71 nu71Var2 = (i & 4096) != 0 ? hcc1Var.f89758Z : nu71Var;
        fcc1 fcc1Var2 = (i & 8192) != 0 ? hcc1Var.f89752L0 : fcc1Var;
        z0r z0rVar2 = (i & 16384) != 0 ? hcc1Var.f89753M0 : z0rVar;
        String str7 = (i & 32768) != 0 ? hcc1Var.f89754N0 : str2;
        String str8 = hcc1Var.f89755O0;
        hcc1Var.getClass();
        return new hcc1(str3, gcr0Var, gcr0Var2, i2, i3, str6, str5, om01Var3, sr01Var, j3, uri, z, nu71Var2, fcc1Var2, z0rVar2, str7, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcc1)) {
            return false;
        }
        hcc1 hcc1Var = (hcc1) obj;
        return wj50.m88271j(this.f89759a, hcc1Var.f89759a) && wj50.m88271j(this.f89760b, hcc1Var.f89760b) && wj50.m88271j(this.f89761c, hcc1Var.f89761c) && this.f89762d == hcc1Var.f89762d && this.f89763e == hcc1Var.f89763e && wj50.m88271j(this.f89764f, hcc1Var.f89764f) && wj50.m88271j(this.f89765g, hcc1Var.f89765g) && wj50.m88271j(this.f89766h, hcc1Var.f89766h) && wj50.m88271j(this.f89767i, hcc1Var.f89767i) && nu71.m65679c(this.f89768t, hcc1Var.f89768t) && wj50.m88271j(this.f89756X, hcc1Var.f89756X) && this.f89757Y == hcc1Var.f89757Y && wj50.m88271j(this.f89758Z, hcc1Var.f89758Z) && wj50.m88271j(this.f89752L0, hcc1Var.f89752L0) && wj50.m88271j(this.f89753M0, hcc1Var.f89753M0) && wj50.m88271j(this.f89754N0, hcc1Var.f89754N0) && wj50.m88271j(this.f89755O0, hcc1Var.f89755O0);
    }

    public final int hashCode() {
        int iHashCode = this.f89759a.hashCode() * 31;
        gcr0 gcr0Var = this.f89760b;
        int iM77245d = s571.m77245d(nap.m64019l(this.f89756X, dq60.m36605e(rkh0.m75733g(this.f89767i, (this.f89766h.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f89763e, mt60.m62800g(this.f89762d, (this.f89761c.hashCode() + ((iHashCode + (gcr0Var == null ? 0 : gcr0Var.hashCode())) * 31)) * 31, 31), 31), 31, this.f89764f), 31, this.f89765g)) * 31, 31), this.f89768t, 31), 31), 31, this.f89757Y);
        nu71 nu71Var = this.f89758Z;
        int iHashCode2 = (this.f89752L0.hashCode() + ((iM77245d + (nu71Var == null ? 0 : Long.hashCode(nu71Var.f158526a))) * 31)) * 31;
        z0r z0rVar = this.f89753M0;
        int iHashCode3 = (iHashCode2 + (z0rVar == null ? 0 : z0rVar.hashCode())) * 31;
        String str = this.f89754N0;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89755O0;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f89759a);
        parcel.writeParcelable(this.f89760b, i);
        parcel.writeParcelable(this.f89761c, i);
        parcel.writeInt(this.f89762d);
        parcel.writeInt(this.f89763e);
        parcel.writeString(this.f89764f);
        parcel.writeString(this.f89765g);
        parcel.writeParcelable(this.f89766h, i);
        parcel.writeParcelable(this.f89767i, i);
        parcel.writeParcelable(new nu71(this.f89768t), i);
        parcel.writeParcelable(this.f89756X, i);
        parcel.writeInt(this.f89757Y ? 1 : 0);
        parcel.writeParcelable(this.f89758Z, i);
        parcel.writeParcelable(this.f89752L0, i);
        parcel.writeString(this.f89754N0);
        parcel.writeString(this.f89755O0);
    }

    public /* synthetic */ hcc1(String str, gcr0 gcr0Var, gcr0 gcr0Var2, int i, int i2, String str2, String str3, om01 om01Var, sr01 sr01Var, long j, Uri uri, boolean z, nu71 nu71Var, fcc1 fcc1Var, String str4, String str5, int i3) {
        this(str, gcr0Var, gcr0Var2, i, i2, str2, str3, om01Var, sr01Var, j, uri, z, nu71Var, (i3 & 8192) != 0 ? ecc1.f58306a : fcc1Var, (z0r) null, str4, str5);
    }
}
