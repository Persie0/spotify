package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class p0s0 implements xyr0 {
    public static final Parcelable.Creator<p0s0> CREATOR = new uir0(14);

    /* JADX INFO: renamed from: X */
    public final Integer f172730X;

    /* JADX INFO: renamed from: Y */
    public final int f172731Y;

    /* JADX INFO: renamed from: a */
    public final o0s0 f172732a;

    /* JADX INFO: renamed from: b */
    public final String f172733b;

    /* JADX INFO: renamed from: c */
    public final String f172734c;

    /* JADX INFO: renamed from: d */
    public final String f172735d;

    /* JADX INFO: renamed from: e */
    public final String f172736e;

    /* JADX INFO: renamed from: f */
    public final xxz f172737f;

    /* JADX INFO: renamed from: g */
    public final String f172738g;

    /* JADX INFO: renamed from: h */
    public final String f172739h;

    /* JADX INFO: renamed from: i */
    public final Long f172740i;

    /* JADX INFO: renamed from: t */
    public final boolean f172741t;

    public p0s0(o0s0 o0s0Var, String str, String str2, String str3, String str4, xxz xxzVar, String str5, String str6, Long l, boolean z, Integer num, int i) {
        this.f172732a = o0s0Var;
        this.f172733b = str;
        this.f172734c = str2;
        this.f172735d = str3;
        this.f172736e = str4;
        this.f172737f = xxzVar;
        this.f172738g = str5;
        this.f172739h = str6;
        this.f172740i = l;
        this.f172741t = z;
        this.f172730X = num;
        this.f172731Y = i;
    }

    /* JADX INFO: renamed from: c */
    public static p0s0 m68728c(p0s0 p0s0Var, o0s0 o0s0Var, String str, String str2, String str3, xxz xxzVar, Integer num, int i, int i2) {
        o0s0 o0s0Var2 = (i2 & 1) != 0 ? p0s0Var.f172732a : o0s0Var;
        String str4 = p0s0Var.f172733b;
        String str5 = (i2 & 4) != 0 ? p0s0Var.f172734c : str;
        String str6 = (i2 & 8) != 0 ? p0s0Var.f172735d : str2;
        String str7 = (i2 & 16) != 0 ? p0s0Var.f172736e : str3;
        xxz xxzVar2 = (i2 & 32) != 0 ? p0s0Var.f172737f : xxzVar;
        String str8 = p0s0Var.f172738g;
        String str9 = p0s0Var.f172739h;
        Long l = p0s0Var.f172740i;
        boolean z = p0s0Var.f172741t;
        Integer num2 = (i2 & 1024) != 0 ? p0s0Var.f172730X : num;
        int i3 = (i2 & 2048) != 0 ? p0s0Var.f172731Y : i;
        p0s0Var.getClass();
        return new p0s0(o0s0Var2, str4, str5, str6, str7, xxzVar2, str8, str9, l, z, num2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0s0)) {
            return false;
        }
        p0s0 p0s0Var = (p0s0) obj;
        return wj50.m88271j(this.f172732a, p0s0Var.f172732a) && wj50.m88271j(this.f172733b, p0s0Var.f172733b) && wj50.m88271j(this.f172734c, p0s0Var.f172734c) && wj50.m88271j(this.f172735d, p0s0Var.f172735d) && wj50.m88271j(this.f172736e, p0s0Var.f172736e) && wj50.m88271j(this.f172737f, p0s0Var.f172737f) && wj50.m88271j(this.f172738g, p0s0Var.f172738g) && wj50.m88271j(this.f172739h, p0s0Var.f172739h) && wj50.m88271j(this.f172740i, p0s0Var.f172740i) && this.f172741t == p0s0Var.f172741t && wj50.m88271j(this.f172730X, p0s0Var.f172730X) && this.f172731Y == p0s0Var.f172731Y;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f172732a.hashCode() * 31, 31, this.f172733b), 31, this.f172734c);
        String str = this.f172735d;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f172736e;
        int iHashCode2 = (this.f172737f.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.f172738g;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f172739h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f172740i;
        int iM77245d = s571.m77245d((iHashCode4 + (l == null ? 0 : l.hashCode())) * 31, 31, this.f172741t);
        Integer num = this.f172730X;
        return edb.m38547C(this.f172731Y) + ((iM77245d + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.f172732a, i);
        parcel.writeString(this.f172733b);
        parcel.writeString(this.f172734c);
        parcel.writeString(this.f172735d);
        parcel.writeString(this.f172736e);
        parcel.writeParcelable(this.f172737f, i);
        parcel.writeString(this.f172738g);
        parcel.writeString(this.f172739h);
        Long l = this.f172740i;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        parcel.writeInt(this.f172741t ? 1 : 0);
        Integer num = this.f172730X;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        switch (this.f172731Y) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "FRIEND";
                break;
            case 3:
                str = "INVITED";
                break;
            case 4:
                str = "SUGGESTED";
                break;
            case 5:
                str = "REQUESTED";
                break;
            case 6:
                str = "PENDING";
                break;
            default:
                throw null;
        }
        parcel.writeString(str);
    }

    public /* synthetic */ p0s0(o0s0 o0s0Var, String str, String str2, String str3, String str4, xxz xxzVar, String str5, int i) {
        this(o0s0Var, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? new xxz(0, 15) : xxzVar, null, (i & 128) != 0 ? null : str5, null, false, null, 1);
    }
}
