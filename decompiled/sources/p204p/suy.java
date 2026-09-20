package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class suy implements uuy {
    public static final Parcelable.Creator<suy> CREATOR = new eqy(10);

    /* JADX INFO: renamed from: X */
    public final int f214237X;

    /* JADX INFO: renamed from: Y */
    public final double f214238Y;

    /* JADX INFO: renamed from: a */
    public final String f214239a;

    /* JADX INFO: renamed from: b */
    public final String f214240b;

    /* JADX INFO: renamed from: c */
    public final qf40 f214241c;

    /* JADX INFO: renamed from: d */
    public final chn0 f214242d;

    /* JADX INFO: renamed from: e */
    public final jgn0 f214243e;

    /* JADX INFO: renamed from: f */
    public final boolean f214244f;

    /* JADX INFO: renamed from: g */
    public final boolean f214245g;

    /* JADX INFO: renamed from: h */
    public final boolean f214246h;

    /* JADX INFO: renamed from: i */
    public final int f214247i;

    /* JADX INFO: renamed from: t */
    public final boolean f214248t;

    public suy(String str, String str2, qf40 qf40Var, chn0 chn0Var, jgn0 jgn0Var, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, double d) {
        this.f214239a = str;
        this.f214240b = str2;
        this.f214241c = qf40Var;
        this.f214242d = chn0Var;
        this.f214243e = jgn0Var;
        this.f214244f = z;
        this.f214245g = z2;
        this.f214246h = z3;
        this.f214247i = i;
        this.f214248t = z4;
        this.f214237X = i2;
        this.f214238Y = d;
    }

    /* JADX INFO: renamed from: c */
    public static suy m79419c(suy suyVar, int i, double d, int i2) {
        String str = suyVar.f214239a;
        String str2 = suyVar.f214240b;
        qf40 qf40Var = suyVar.f214241c;
        chn0 chn0Var = suyVar.f214242d;
        jgn0 jgn0Var = suyVar.f214243e;
        boolean z = suyVar.f214244f;
        boolean z2 = suyVar.f214245g;
        boolean z3 = suyVar.f214246h;
        int i3 = suyVar.f214247i;
        boolean z4 = suyVar.f214248t;
        int i4 = (i2 & 1024) != 0 ? suyVar.f214237X : i;
        double d2 = (i2 & 2048) != 0 ? suyVar.f214238Y : d;
        suyVar.getClass();
        return new suy(str, str2, qf40Var, chn0Var, jgn0Var, z, z2, z3, i3, z4, i4, d2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suy)) {
            return false;
        }
        suy suyVar = (suy) obj;
        return wj50.m88271j(this.f214239a, suyVar.f214239a) && wj50.m88271j(this.f214240b, suyVar.f214240b) && wj50.m88271j(this.f214241c, suyVar.f214241c) && wj50.m88271j(this.f214242d, suyVar.f214242d) && wj50.m88271j(this.f214243e, suyVar.f214243e) && this.f214244f == suyVar.f214244f && this.f214245g == suyVar.f214245g && this.f214246h == suyVar.f214246h && this.f214247i == suyVar.f214247i && this.f214248t == suyVar.f214248t && this.f214237X == suyVar.f214237X && Double.compare(this.f214238Y, suyVar.f214238Y) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f214238Y) + f710.m40938f(this.f214237X, s571.m77245d(mt60.m62800g(this.f214247i, s571.m77245d(s571.m77245d(s571.m77245d((this.f214243e.hashCode() + ((this.f214242d.hashCode() + fr0.m42461e(this.f214241c, s571.m77243b(this.f214239a.hashCode() * 31, 31, this.f214240b), 31)) * 31)) * 31, 31, this.f214244f), 31, this.f214245g), 31, this.f214246h), 31), 31, this.f214248t), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f214239a);
        parcel.writeString(this.f214240b);
        parcel.writeStringList(this.f214241c);
        this.f214242d.writeToParcel(parcel, i);
        this.f214243e.writeToParcel(parcel, i);
        parcel.writeInt(this.f214244f ? 1 : 0);
        parcel.writeInt(this.f214245g ? 1 : 0);
        parcel.writeInt(this.f214246h ? 1 : 0);
        parcel.writeInt(this.f214247i);
        parcel.writeInt(this.f214248t ? 1 : 0);
        int i2 = this.f214237X;
        if (i2 == 1) {
            str = "Loading";
        } else if (i2 == 2) {
            str = "Loaded";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "Failed";
        }
        parcel.writeString(str);
        parcel.writeDouble(this.f214238Y);
    }
}
