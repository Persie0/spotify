package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zf51 implements Parcelable {
    public static final Parcelable.Creator<zf51> CREATOR = new nc51(4);

    /* JADX INFO: renamed from: X */
    public final tu01 f282213X;

    /* JADX INFO: renamed from: a */
    public final la51 f282214a;

    /* JADX INFO: renamed from: b */
    public final int f282215b;

    /* JADX INFO: renamed from: c */
    public final int f282216c;

    /* JADX INFO: renamed from: d */
    public final hdn0 f282217d;

    /* JADX INFO: renamed from: e */
    public final z6s0 f282218e;

    /* JADX INFO: renamed from: f */
    public final boolean f282219f;

    /* JADX INFO: renamed from: g */
    public final boolean f282220g;

    /* JADX INFO: renamed from: h */
    public final boolean f282221h;

    /* JADX INFO: renamed from: i */
    public final boolean f282222i;

    /* JADX INFO: renamed from: t */
    public final boolean f282223t;

    public zf51(la51 la51Var, int i, int i2, hdn0 hdn0Var, z6s0 z6s0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, tu01 tu01Var) {
        this.f282214a = la51Var;
        this.f282215b = i;
        this.f282216c = i2;
        this.f282217d = hdn0Var;
        this.f282218e = z6s0Var;
        this.f282219f = z;
        this.f282220g = z2;
        this.f282221h = z3;
        this.f282222i = z4;
        this.f282223t = z5;
        this.f282213X = tu01Var;
    }

    /* JADX INFO: renamed from: c */
    public static zf51 m95999c(zf51 zf51Var, la51 la51Var, int i, int i2, hdn0 hdn0Var, z6s0 z6s0Var, boolean z, boolean z2, boolean z3, boolean z4, tu01 tu01Var, int i3) {
        if ((i3 & 1) != 0) {
            la51Var = zf51Var.f282214a;
        }
        la51 la51Var2 = la51Var;
        if ((i3 & 2) != 0) {
            i = zf51Var.f282215b;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = zf51Var.f282216c;
        }
        int i5 = i2;
        hdn0 hdn0Var2 = (i3 & 8) != 0 ? zf51Var.f282217d : hdn0Var;
        z6s0 z6s0Var2 = (i3 & 16) != 0 ? zf51Var.f282218e : z6s0Var;
        boolean z5 = (i3 & 32) != 0 ? zf51Var.f282219f : z;
        boolean z6 = (i3 & 64) != 0 ? zf51Var.f282220g : z2;
        boolean z7 = (i3 & 128) != 0 ? zf51Var.f282221h : z3;
        boolean z8 = (i3 & 256) != 0 ? zf51Var.f282222i : true;
        boolean z9 = (i3 & 512) != 0 ? zf51Var.f282223t : z4;
        tu01 tu01Var2 = (i3 & 1024) != 0 ? zf51Var.f282213X : tu01Var;
        zf51Var.getClass();
        return new zf51(la51Var2, i4, i5, hdn0Var2, z6s0Var2, z5, z6, z7, z8, z9, tu01Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf51)) {
            return false;
        }
        zf51 zf51Var = (zf51) obj;
        return wj50.m88271j(this.f282214a, zf51Var.f282214a) && this.f282215b == zf51Var.f282215b && this.f282216c == zf51Var.f282216c && this.f282217d == zf51Var.f282217d && this.f282218e == zf51Var.f282218e && this.f282219f == zf51Var.f282219f && this.f282220g == zf51Var.f282220g && this.f282221h == zf51Var.f282221h && this.f282222i == zf51Var.f282222i && this.f282223t == zf51Var.f282223t && this.f282213X == zf51Var.f282213X;
    }

    public final int hashCode() {
        return this.f282213X.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d((this.f282218e.hashCode() + ((this.f282217d.hashCode() + mt60.m62800g(this.f282216c, mt60.m62800g(this.f282215b, this.f282214a.hashCode() * 31, 31), 31)) * 31)) * 31, 31, this.f282219f), 31, this.f282220g), 31, this.f282221h), 31, this.f282222i), 31, this.f282223t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f282214a, i);
        parcel.writeInt(this.f282215b);
        parcel.writeInt(this.f282216c);
        parcel.writeString(this.f282217d.name());
        parcel.writeString(this.f282218e.name());
        parcel.writeInt(this.f282219f ? 1 : 0);
        parcel.writeInt(this.f282220g ? 1 : 0);
        parcel.writeInt(this.f282221h ? 1 : 0);
        parcel.writeInt(this.f282222i ? 1 : 0);
        parcel.writeInt(this.f282223t ? 1 : 0);
        parcel.writeString(this.f282213X.name());
    }
}
