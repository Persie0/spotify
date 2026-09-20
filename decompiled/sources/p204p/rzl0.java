package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes9.dex */
public final class rzl0 implements Parcelable {
    public static final Parcelable.Creator<rzl0> CREATOR = new cpl0(5);

    /* JADX INFO: renamed from: L0 */
    public final Integer f204165L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f204166M0;

    /* JADX INFO: renamed from: N0 */
    public final float f204167N0;

    /* JADX INFO: renamed from: O0 */
    public final float f204168O0;

    /* JADX INFO: renamed from: P0 */
    public final double f204169P0;

    /* JADX INFO: renamed from: Q0 */
    public final double f204170Q0;

    /* JADX INFO: renamed from: X */
    public final int f204171X;

    /* JADX INFO: renamed from: Y */
    public final Float f204172Y;

    /* JADX INFO: renamed from: Z */
    public final Float f204173Z;

    /* JADX INFO: renamed from: a */
    public final String f204174a;

    /* JADX INFO: renamed from: b */
    public final String f204175b;

    /* JADX INFO: renamed from: c */
    public final String f204176c;

    /* JADX INFO: renamed from: d */
    public final String f204177d;

    /* JADX INFO: renamed from: e */
    public final String f204178e;

    /* JADX INFO: renamed from: f */
    public final String f204179f;

    /* JADX INFO: renamed from: g */
    public final String f204180g;

    /* JADX INFO: renamed from: h */
    public final String f204181h;

    /* JADX INFO: renamed from: i */
    public final int f204182i;

    /* JADX INFO: renamed from: t */
    public final int f204183t;

    public rzl0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, Float f, Float f2, Integer num, boolean z, float f3, float f4, double d, double d2) {
        this.f204174a = str;
        this.f204175b = str2;
        this.f204176c = str3;
        this.f204177d = str4;
        this.f204178e = str5;
        this.f204179f = str6;
        this.f204180g = str7;
        this.f204181h = str8;
        this.f204182i = i;
        this.f204183t = i2;
        this.f204171X = i3;
        this.f204172Y = f;
        this.f204173Z = f2;
        this.f204165L0 = num;
        this.f204166M0 = z;
        this.f204167N0 = f3;
        this.f204168O0 = f4;
        this.f204169P0 = d;
        this.f204170Q0 = d2;
    }

    /* JADX INFO: renamed from: c */
    public static rzl0 m76819c(rzl0 rzl0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, Float f, Integer num, float f2, float f3, double d, double d2, int i4) {
        String str8 = rzl0Var.f204174a;
        String str9 = (i4 & 2) != 0 ? rzl0Var.f204175b : str;
        String str10 = (i4 & 4) != 0 ? rzl0Var.f204176c : str2;
        String str11 = (i4 & 8) != 0 ? rzl0Var.f204177d : str3;
        String str12 = (i4 & 16) != 0 ? rzl0Var.f204178e : str4;
        String str13 = (i4 & 32) != 0 ? rzl0Var.f204179f : str5;
        String str14 = (i4 & 64) != 0 ? rzl0Var.f204180g : str6;
        String str15 = (i4 & 128) != 0 ? rzl0Var.f204181h : str7;
        int i5 = (i4 & 256) != 0 ? rzl0Var.f204182i : i;
        int i6 = (i4 & 512) != 0 ? rzl0Var.f204183t : i2;
        int i7 = (i4 & 1024) != 0 ? rzl0Var.f204171X : i3;
        Float f4 = (i4 & 2048) != 0 ? rzl0Var.f204172Y : null;
        Float f5 = (i4 & 4096) != 0 ? rzl0Var.f204173Z : f;
        Integer num2 = (i4 & 8192) != 0 ? rzl0Var.f204165L0 : num;
        boolean z = (i4 & 16384) != 0 ? rzl0Var.f204166M0 : false;
        float f6 = (i4 & 32768) != 0 ? rzl0Var.f204167N0 : f2;
        float f7 = (i4 & 65536) != 0 ? rzl0Var.f204168O0 : f3;
        boolean z2 = z;
        double d3 = (i4 & 131072) != 0 ? rzl0Var.f204169P0 : d;
        double d4 = (i4 & 262144) != 0 ? rzl0Var.f204170Q0 : d2;
        rzl0Var.getClass();
        return new rzl0(str8, str9, str10, str11, str12, str13, str14, str15, i5, i6, i7, f4, f5, num2, z2, f6, f7, d3, d4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzl0)) {
            return false;
        }
        rzl0 rzl0Var = (rzl0) obj;
        return wj50.m88271j(this.f204174a, rzl0Var.f204174a) && wj50.m88271j(this.f204175b, rzl0Var.f204175b) && wj50.m88271j(this.f204176c, rzl0Var.f204176c) && wj50.m88271j(this.f204177d, rzl0Var.f204177d) && wj50.m88271j(this.f204178e, rzl0Var.f204178e) && wj50.m88271j(this.f204179f, rzl0Var.f204179f) && wj50.m88271j(this.f204180g, rzl0Var.f204180g) && wj50.m88271j(this.f204181h, rzl0Var.f204181h) && this.f204182i == rzl0Var.f204182i && this.f204183t == rzl0Var.f204183t && this.f204171X == rzl0Var.f204171X && wj50.m88271j(this.f204172Y, rzl0Var.f204172Y) && wj50.m88271j(this.f204173Z, rzl0Var.f204173Z) && wj50.m88271j(this.f204165L0, rzl0Var.f204165L0) && this.f204166M0 == rzl0Var.f204166M0 && Float.compare(this.f204167N0, rzl0Var.f204167N0) == 0 && Float.compare(this.f204168O0, rzl0Var.f204168O0) == 0 && Double.compare(this.f204169P0, rzl0Var.f204169P0) == 0 && Double.compare(this.f204170Q0, rzl0Var.f204170Q0) == 0;
    }

    /* JADX INFO: renamed from: g */
    public final float m76820g() {
        return this.f204167N0;
    }

    /* JADX INFO: renamed from: h */
    public final double m76821h() {
        return this.f204169P0;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f204171X, mt60.m62800g(this.f204183t, mt60.m62800g(this.f204182i, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f204174a.hashCode() * 31, 31, this.f204175b), 31, this.f204176c), 31, this.f204177d), 31, this.f204178e), 31, this.f204179f), 31, this.f204180g), 31, this.f204181h), 31), 31), 31);
        Float f = this.f204172Y;
        int iHashCode = (iM62800g + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f204173Z;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.f204165L0;
        return Double.hashCode(this.f204170Q0) + xl81.m91399h(this.f204169P0, AbstractC0000a.m8g(AbstractC0000a.m8g(s571.m77245d((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f204166M0), 31, this.f204167N0), 31, this.f204168O0), 31);
    }

    /* JADX INFO: renamed from: j */
    public final double m76822j() {
        return this.f204170Q0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f204174a);
        parcel.writeString(this.f204175b);
        parcel.writeString(this.f204176c);
        parcel.writeString(this.f204177d);
        parcel.writeString(this.f204178e);
        parcel.writeString(this.f204179f);
        parcel.writeString(this.f204180g);
        parcel.writeString(this.f204181h);
        parcel.writeInt(this.f204182i);
        parcel.writeInt(this.f204183t);
        parcel.writeInt(this.f204171X);
        Float f = this.f204172Y;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        Float f2 = this.f204173Z;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        }
        Integer num = this.f204165L0;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f204166M0 ? 1 : 0);
        parcel.writeFloat(this.f204167N0);
        parcel.writeFloat(this.f204168O0);
        parcel.writeDouble(this.f204169P0);
        parcel.writeDouble(this.f204170Q0);
    }
}
