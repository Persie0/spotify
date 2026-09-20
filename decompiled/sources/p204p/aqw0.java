package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class aqw0 implements Parcelable {
    public static final Parcelable.Creator<aqw0> CREATOR = new b8w0(14);

    /* JADX INFO: renamed from: a */
    public final String f18852a;

    /* JADX INFO: renamed from: b */
    public final String f18853b;

    /* JADX INFO: renamed from: c */
    public final dhr0 f18854c;

    /* JADX INFO: renamed from: d */
    public final String f18855d;

    /* JADX INFO: renamed from: e */
    public final boolean f18856e;

    /* JADX INFO: renamed from: f */
    public final boolean f18857f;

    /* JADX INFO: renamed from: g */
    public final zv8 f18858g;

    /* JADX INFO: renamed from: h */
    public final String f18859h;

    /* JADX INFO: renamed from: i */
    public final sky f18860i;

    /* JADX INFO: renamed from: t */
    public final boolean f18861t;

    public aqw0(String str, String str2, dhr0 dhr0Var, String str3, boolean z, boolean z2, zv8 zv8Var, String str4, sky skyVar, boolean z3) {
        this.f18852a = str;
        this.f18853b = str2;
        this.f18854c = dhr0Var;
        this.f18855d = str3;
        this.f18856e = z;
        this.f18857f = z2;
        this.f18858g = zv8Var;
        this.f18859h = str4;
        this.f18860i = skyVar;
        this.f18861t = z3;
    }

    /* JADX INFO: renamed from: c */
    public static aqw0 m26902c(aqw0 aqw0Var, dhr0 dhr0Var, String str, boolean z, boolean z2, zv8 zv8Var, sky skyVar, boolean z3, int i) {
        String str2 = aqw0Var.f18852a;
        String str3 = aqw0Var.f18853b;
        if ((i & 4) != 0) {
            dhr0Var = aqw0Var.f18854c;
        }
        dhr0 dhr0Var2 = dhr0Var;
        if ((i & 8) != 0) {
            str = aqw0Var.f18855d;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            z = aqw0Var.f18856e;
        }
        boolean z4 = z;
        boolean z5 = (i & 32) != 0 ? aqw0Var.f18857f : z2;
        zv8 zv8Var2 = (i & 64) != 0 ? aqw0Var.f18858g : zv8Var;
        String str5 = aqw0Var.f18859h;
        sky skyVar2 = (i & 256) != 0 ? aqw0Var.f18860i : skyVar;
        boolean z6 = (i & 512) != 0 ? aqw0Var.f18861t : z3;
        aqw0Var.getClass();
        return new aqw0(str2, str3, dhr0Var2, str4, z4, z5, zv8Var2, str5, skyVar2, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqw0)) {
            return false;
        }
        aqw0 aqw0Var = (aqw0) obj;
        return wj50.m88271j(this.f18852a, aqw0Var.f18852a) && wj50.m88271j(this.f18853b, aqw0Var.f18853b) && wj50.m88271j(this.f18854c, aqw0Var.f18854c) && wj50.m88271j(this.f18855d, aqw0Var.f18855d) && this.f18856e == aqw0Var.f18856e && this.f18857f == aqw0Var.f18857f && wj50.m88271j(this.f18858g, aqw0Var.f18858g) && wj50.m88271j(this.f18859h, aqw0Var.f18859h) && wj50.m88271j(this.f18860i, aqw0Var.f18860i) && this.f18861t == aqw0Var.f18861t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18861t) + ((this.f18860i.hashCode() + s571.m77243b((this.f18858g.hashCode() + s571.m77245d(s571.m77245d(s571.m77243b((this.f18854c.hashCode() + s571.m77243b(this.f18852a.hashCode() * 31, 31, this.f18853b)) * 31, 31, this.f18855d), 31, this.f18856e), 31, this.f18857f)) * 31, 31, this.f18859h)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18852a);
        parcel.writeString(this.f18853b);
        parcel.writeParcelable(this.f18854c, i);
        parcel.writeString(this.f18855d);
        parcel.writeInt(this.f18856e ? 1 : 0);
        parcel.writeInt(this.f18857f ? 1 : 0);
        parcel.writeParcelable(this.f18858g, i);
        parcel.writeString(this.f18859h);
        parcel.writeParcelable(this.f18860i, i);
        parcel.writeInt(this.f18861t ? 1 : 0);
    }
}
