package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dw6 implements Parcelable {
    public static final Parcelable.Creator<dw6> CREATOR = new fi6(18);

    /* JADX INFO: renamed from: L0 */
    public final z0r f53612L0;

    /* JADX INFO: renamed from: X */
    public final nu71 f53613X;

    /* JADX INFO: renamed from: Y */
    public final nu71 f53614Y;

    /* JADX INFO: renamed from: Z */
    public final String f53615Z;

    /* JADX INFO: renamed from: a */
    public final sr01 f53616a;

    /* JADX INFO: renamed from: b */
    public final int f53617b;

    /* JADX INFO: renamed from: c */
    public final gcr0 f53618c;

    /* JADX INFO: renamed from: d */
    public final int f53619d;

    /* JADX INFO: renamed from: e */
    public final int f53620e;

    /* JADX INFO: renamed from: f */
    public final String f53621f;

    /* JADX INFO: renamed from: g */
    public final String f53622g;

    /* JADX INFO: renamed from: h */
    public final om01 f53623h;

    /* JADX INFO: renamed from: i */
    public final String f53624i;

    /* JADX INFO: renamed from: t */
    public final String f53625t;

    public dw6(sr01 sr01Var, int i, gcr0 gcr0Var, int i2, int i3, String str, String str2, om01 om01Var, String str3, String str4, nu71 nu71Var, nu71 nu71Var2, String str5, z0r z0rVar) {
        this.f53616a = sr01Var;
        this.f53617b = i;
        this.f53618c = gcr0Var;
        this.f53619d = i2;
        this.f53620e = i3;
        this.f53621f = str;
        this.f53622g = str2;
        this.f53623h = om01Var;
        this.f53624i = str3;
        this.f53625t = str4;
        this.f53613X = nu71Var;
        this.f53614Y = nu71Var2;
        this.f53615Z = str5;
        this.f53612L0 = z0rVar;
    }

    /* JADX INFO: renamed from: c */
    public static dw6 m37134c(dw6 dw6Var, String str, om01 om01Var, nu71 nu71Var, nu71 nu71Var2, String str2, z0r z0rVar, int i) {
        sr01 sr01Var = dw6Var.f53616a;
        int i2 = dw6Var.f53617b;
        gcr0 gcr0Var = dw6Var.f53618c;
        int i3 = dw6Var.f53619d;
        int i4 = dw6Var.f53620e;
        String str3 = (i & 32) != 0 ? dw6Var.f53621f : str;
        String str4 = dw6Var.f53622g;
        om01 om01Var2 = (i & 128) != 0 ? dw6Var.f53623h : om01Var;
        String str5 = dw6Var.f53624i;
        String str6 = str3;
        om01 om01Var3 = om01Var2;
        String str7 = dw6Var.f53625t;
        nu71 nu71Var3 = (i & 1024) != 0 ? dw6Var.f53613X : nu71Var;
        nu71 nu71Var4 = (i & 2048) != 0 ? dw6Var.f53614Y : nu71Var2;
        String str8 = (i & 4096) != 0 ? dw6Var.f53615Z : str2;
        z0r z0rVar2 = (i & 8192) != 0 ? dw6Var.f53612L0 : z0rVar;
        dw6Var.getClass();
        return new dw6(sr01Var, i2, gcr0Var, i3, i4, str6, str4, om01Var3, str5, str7, nu71Var3, nu71Var4, str8, z0rVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw6)) {
            return false;
        }
        dw6 dw6Var = (dw6) obj;
        return wj50.m88271j(this.f53616a, dw6Var.f53616a) && this.f53617b == dw6Var.f53617b && wj50.m88271j(this.f53618c, dw6Var.f53618c) && this.f53619d == dw6Var.f53619d && this.f53620e == dw6Var.f53620e && wj50.m88271j(this.f53621f, dw6Var.f53621f) && wj50.m88271j(this.f53622g, dw6Var.f53622g) && wj50.m88271j(this.f53623h, dw6Var.f53623h) && wj50.m88271j(this.f53624i, dw6Var.f53624i) && wj50.m88271j(this.f53625t, dw6Var.f53625t) && wj50.m88271j(this.f53613X, dw6Var.f53613X) && wj50.m88271j(this.f53614Y, dw6Var.f53614Y) && wj50.m88271j(this.f53615Z, dw6Var.f53615Z) && wj50.m88271j(this.f53612L0, dw6Var.f53612L0);
    }

    public final int hashCode() {
        int iHashCode = (this.f53623h.hashCode() + s571.m77243b(s571.m77243b(mt60.m62800g(this.f53620e, mt60.m62800g(this.f53619d, (this.f53618c.hashCode() + f710.m40938f(this.f53617b, this.f53616a.hashCode() * 31, 31)) * 31, 31), 31), 31, this.f53621f), 31, this.f53622g)) * 31;
        String str = this.f53624i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53625t;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        nu71 nu71Var = this.f53613X;
        int iHashCode4 = (iHashCode3 + (nu71Var == null ? 0 : Long.hashCode(nu71Var.f158526a))) * 31;
        nu71 nu71Var2 = this.f53614Y;
        int iHashCode5 = (iHashCode4 + (nu71Var2 == null ? 0 : Long.hashCode(nu71Var2.f158526a))) * 31;
        String str3 = this.f53615Z;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        z0r z0rVar = this.f53612L0;
        return iHashCode6 + (z0rVar != null ? z0rVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f53616a, i);
        parcel.writeString(stz0.m79362p(this.f53617b));
        parcel.writeParcelable(this.f53618c, i);
        parcel.writeInt(this.f53619d);
        parcel.writeInt(this.f53620e);
        parcel.writeString(this.f53621f);
        parcel.writeString(this.f53622g);
        parcel.writeParcelable(this.f53623h, i);
        parcel.writeString(this.f53624i);
        parcel.writeString(this.f53625t);
        parcel.writeParcelable(this.f53613X, i);
        parcel.writeParcelable(this.f53614Y, i);
        parcel.writeString(this.f53615Z);
    }
}
