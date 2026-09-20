package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jxs0 extends mxs0 {
    public static final Parcelable.Creator<jxs0> CREATOR = new wds0(18);

    /* JADX INFO: renamed from: a */
    public final String f117211a;

    /* JADX INFO: renamed from: b */
    public final String f117212b;

    /* JADX INFO: renamed from: c */
    public final String f117213c;

    /* JADX INFO: renamed from: d */
    public final String f117214d;

    /* JADX INFO: renamed from: e */
    public final String f117215e;

    /* JADX INFO: renamed from: f */
    public final String f117216f;

    /* JADX INFO: renamed from: g */
    public final String f117217g;

    /* JADX INFO: renamed from: h */
    public final Integer f117218h;

    /* JADX INFO: renamed from: i */
    public final boolean f117219i;

    /* JADX INFO: renamed from: t */
    public final boolean f117220t;

    public jxs0(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, boolean z, boolean z2) {
        this.f117211a = str;
        this.f117212b = str2;
        this.f117213c = str3;
        this.f117214d = str4;
        this.f117215e = str5;
        this.f117216f = str6;
        this.f117217g = str7;
        this.f117218h = num;
        this.f117219i = z;
        this.f117220t = z2;
    }

    /* JADX INFO: renamed from: g */
    public static jxs0 m54725g(jxs0 jxs0Var, String str, Integer num, boolean z, boolean z2, int i) {
        String str2 = jxs0Var.f117211a;
        String str3 = jxs0Var.f117212b;
        String str4 = jxs0Var.f117213c;
        String str5 = jxs0Var.f117214d;
        String str6 = jxs0Var.f117215e;
        String str7 = jxs0Var.f117216f;
        if ((i & 64) != 0) {
            str = jxs0Var.f117217g;
        }
        String str8 = str;
        if ((i & 128) != 0) {
            num = jxs0Var.f117218h;
        }
        Integer num2 = num;
        if ((i & 256) != 0) {
            z = jxs0Var.f117219i;
        }
        boolean z3 = z;
        boolean z4 = (i & 512) != 0 ? jxs0Var.f117220t : z2;
        jxs0Var.getClass();
        return new jxs0(str2, str3, str4, str5, str6, str7, str8, num2, z3, z4);
    }

    @Override // p204p.mxs0
    /* JADX INFO: renamed from: c */
    public final String mo49039c() {
        return this.f117211a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxs0)) {
            return false;
        }
        jxs0 jxs0Var = (jxs0) obj;
        return wj50.m88271j(this.f117211a, jxs0Var.f117211a) && wj50.m88271j(this.f117212b, jxs0Var.f117212b) && wj50.m88271j(this.f117213c, jxs0Var.f117213c) && wj50.m88271j(this.f117214d, jxs0Var.f117214d) && wj50.m88271j(this.f117215e, jxs0Var.f117215e) && wj50.m88271j(this.f117216f, jxs0Var.f117216f) && wj50.m88271j(this.f117217g, jxs0Var.f117217g) && wj50.m88271j(this.f117218h, jxs0Var.f117218h) && this.f117219i == jxs0Var.f117219i && this.f117220t == jxs0Var.f117220t;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f117211a.hashCode() * 31, 31, this.f117212b), 31, this.f117213c), 31, this.f117214d), 31, this.f117215e);
        String str = this.f117216f;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117217g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f117218h;
        return Boolean.hashCode(this.f117220t) + s571.m77245d((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f117219i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117211a);
        parcel.writeString(this.f117212b);
        parcel.writeString(this.f117213c);
        parcel.writeString(this.f117214d);
        parcel.writeString(this.f117215e);
        parcel.writeString(this.f117216f);
        parcel.writeString(this.f117217g);
        Integer num = this.f117218h;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f117219i ? 1 : 0);
        parcel.writeInt(this.f117220t ? 1 : 0);
    }
}
