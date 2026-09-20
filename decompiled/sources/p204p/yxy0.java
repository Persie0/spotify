package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class yxy0 implements Parcelable {
    public static final Parcelable.Creator<yxy0> CREATOR = new lpy0(3);

    /* JADX INFO: renamed from: N0 */
    public static final yxy0 f277346N0 = new yxy0("", "", 0, e0z0.f55071a, rzi.f204155a, kpy0.f125157h, kpm0.f125090a, f6z.f66516a, bro0.f30124a, 1, new c5x0(false, false, false, false), new qbm0(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31), false, new tit0(null), false);

    /* JADX INFO: renamed from: L0 */
    public final tit0 f277347L0;

    /* JADX INFO: renamed from: M0 */
    public final boolean f277348M0;

    /* JADX INFO: renamed from: X */
    public final c5x0 f277349X;

    /* JADX INFO: renamed from: Y */
    public final qbm0 f277350Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f277351Z;

    /* JADX INFO: renamed from: a */
    public final String f277352a;

    /* JADX INFO: renamed from: b */
    public final String f277353b;

    /* JADX INFO: renamed from: c */
    public final int f277354c;

    /* JADX INFO: renamed from: d */
    public final l0z0 f277355d;

    /* JADX INFO: renamed from: e */
    public final vzi f277356e;

    /* JADX INFO: renamed from: f */
    public final kpy0 f277357f;

    /* JADX INFO: renamed from: g */
    public final mpm0 f277358g;

    /* JADX INFO: renamed from: h */
    public final g6z f277359h;

    /* JADX INFO: renamed from: i */
    public final vro0 f277360i;

    /* JADX INFO: renamed from: t */
    public final int f277361t;

    public yxy0(String str, String str2, int i, l0z0 l0z0Var, vzi vziVar, kpy0 kpy0Var, mpm0 mpm0Var, g6z g6zVar, vro0 vro0Var, int i2, c5x0 c5x0Var, qbm0 qbm0Var, boolean z, tit0 tit0Var, boolean z2) {
        this.f277352a = str;
        this.f277353b = str2;
        this.f277354c = i;
        this.f277355d = l0z0Var;
        this.f277356e = vziVar;
        this.f277357f = kpy0Var;
        this.f277358g = mpm0Var;
        this.f277359h = g6zVar;
        this.f277360i = vro0Var;
        this.f277361t = i2;
        this.f277349X = c5x0Var;
        this.f277350Y = qbm0Var;
        this.f277351Z = z;
        this.f277347L0 = tit0Var;
        this.f277348M0 = z2;
    }

    /* JADX INFO: renamed from: c */
    public static yxy0 m94851c(yxy0 yxy0Var, String str, String str2, int i, l0z0 l0z0Var, vzi vziVar, kpy0 kpy0Var, mpm0 mpm0Var, g6z g6zVar, vro0 vro0Var, int i2, c5x0 c5x0Var, qbm0 qbm0Var, boolean z, tit0 tit0Var, boolean z2, int i3) {
        String str3 = (i3 & 1) != 0 ? yxy0Var.f277352a : str;
        String str4 = (i3 & 2) != 0 ? yxy0Var.f277353b : str2;
        int i4 = (i3 & 4) != 0 ? yxy0Var.f277354c : i;
        l0z0 l0z0Var2 = (i3 & 8) != 0 ? yxy0Var.f277355d : l0z0Var;
        vzi vziVar2 = (i3 & 16) != 0 ? yxy0Var.f277356e : vziVar;
        kpy0 kpy0Var2 = (i3 & 32) != 0 ? yxy0Var.f277357f : kpy0Var;
        mpm0 mpm0Var2 = (i3 & 64) != 0 ? yxy0Var.f277358g : mpm0Var;
        g6z g6zVar2 = (i3 & 128) != 0 ? yxy0Var.f277359h : g6zVar;
        vro0 vro0Var2 = (i3 & 256) != 0 ? yxy0Var.f277360i : vro0Var;
        int i5 = (i3 & 512) != 0 ? yxy0Var.f277361t : i2;
        c5x0 c5x0Var2 = (i3 & 1024) != 0 ? yxy0Var.f277349X : c5x0Var;
        qbm0 qbm0Var2 = (i3 & 2048) != 0 ? yxy0Var.f277350Y : qbm0Var;
        boolean z3 = (i3 & 4096) != 0 ? yxy0Var.f277351Z : z;
        tit0 tit0Var2 = (i3 & 8192) != 0 ? yxy0Var.f277347L0 : tit0Var;
        boolean z4 = (i3 & 16384) != 0 ? yxy0Var.f277348M0 : z2;
        yxy0Var.getClass();
        return new yxy0(str3, str4, i4, l0z0Var2, vziVar2, kpy0Var2, mpm0Var2, g6zVar2, vro0Var2, i5, c5x0Var2, qbm0Var2, z3, tit0Var2, z4);
    }

    /* JADX INFO: renamed from: A */
    public final l0z0 m94852A() {
        return this.f277355d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxy0)) {
            return false;
        }
        yxy0 yxy0Var = (yxy0) obj;
        return wj50.m88271j(this.f277352a, yxy0Var.f277352a) && wj50.m88271j(this.f277353b, yxy0Var.f277353b) && this.f277354c == yxy0Var.f277354c && wj50.m88271j(this.f277355d, yxy0Var.f277355d) && wj50.m88271j(this.f277356e, yxy0Var.f277356e) && wj50.m88271j(this.f277357f, yxy0Var.f277357f) && wj50.m88271j(this.f277358g, yxy0Var.f277358g) && wj50.m88271j(this.f277359h, yxy0Var.f277359h) && wj50.m88271j(this.f277360i, yxy0Var.f277360i) && this.f277361t == yxy0Var.f277361t && wj50.m88271j(this.f277349X, yxy0Var.f277349X) && wj50.m88271j(this.f277350Y, yxy0Var.f277350Y) && this.f277351Z == yxy0Var.f277351Z && wj50.m88271j(this.f277347L0, yxy0Var.f277347L0) && this.f277348M0 == yxy0Var.f277348M0;
    }

    /* JADX INFO: renamed from: g */
    public final String m94853g() {
        return this.f277353b;
    }

    /* JADX INFO: renamed from: h */
    public final kpy0 m94854h() {
        return this.f277357f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f277348M0) + ((this.f277347L0.hashCode() + s571.m77245d((this.f277350Y.hashCode() + ((this.f277349X.hashCode() + f710.m40938f(this.f277361t, (this.f277360i.hashCode() + ((this.f277359h.hashCode() + ((this.f277358g.hashCode() + ((this.f277357f.hashCode() + ((this.f277356e.hashCode() + ((this.f277355d.hashCode() + mt60.m62800g(this.f277354c, s571.m77243b(this.f277352a.hashCode() * 31, 31, this.f277353b), 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31, 31, this.f277351Z)) * 31);
    }

    /* JADX INFO: renamed from: j */
    public final vzi m94855j() {
        return this.f277356e;
    }

    /* JADX INFO: renamed from: k */
    public final g6z m94856k() {
        return this.f277359h;
    }

    /* JADX INFO: renamed from: l */
    public final int m94857l() {
        return this.f277361t;
    }

    /* JADX INFO: renamed from: m */
    public final int m94858m() {
        return this.f277354c;
    }

    /* JADX INFO: renamed from: q */
    public final qbm0 m94859q() {
        return this.f277350Y;
    }

    /* JADX INFO: renamed from: u */
    public final vro0 m94860u() {
        return this.f277360i;
    }

    /* JADX INFO: renamed from: v */
    public final tit0 m94861v() {
        return this.f277347L0;
    }

    /* JADX INFO: renamed from: w */
    public final c5x0 m94862w() {
        return this.f277349X;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f277352a);
        parcel.writeString(this.f277353b);
        parcel.writeInt(this.f277354c);
        parcel.writeParcelable(this.f277355d, i);
        parcel.writeParcelable(this.f277356e, i);
        this.f277357f.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f277358g, i);
        parcel.writeParcelable(this.f277359h, i);
        parcel.writeParcelable(this.f277360i, i);
        int i2 = this.f277361t;
        if (i2 == 1) {
            str = "None";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "Dismissed";
        }
        parcel.writeString(str);
        this.f277349X.writeToParcel(parcel, i);
        this.f277350Y.writeToParcel(parcel, i);
        parcel.writeInt(this.f277351Z ? 1 : 0);
        this.f277347L0.writeToParcel(parcel, i);
        parcel.writeInt(this.f277348M0 ? 1 : 0);
    }
}
