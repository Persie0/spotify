package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gi20 {

    /* JADX INFO: renamed from: h */
    public static final gi20 f80013h = new gi20(di20.f49213a, false, false, 0, new lh20(lau.f131415a), false, null);

    /* JADX INFO: renamed from: a */
    public final di20 f80014a;

    /* JADX INFO: renamed from: b */
    public final boolean f80015b;

    /* JADX INFO: renamed from: c */
    public final boolean f80016c;

    /* JADX INFO: renamed from: d */
    public final int f80017d;

    /* JADX INFO: renamed from: e */
    public final nh20 f80018e;

    /* JADX INFO: renamed from: f */
    public final boolean f80019f;

    /* JADX INFO: renamed from: g */
    public final Boolean f80020g;

    public gi20(di20 di20Var, boolean z, boolean z2, int i, nh20 nh20Var, boolean z3, Boolean bool) {
        this.f80014a = di20Var;
        this.f80015b = z;
        this.f80016c = z2;
        this.f80017d = i;
        this.f80018e = nh20Var;
        this.f80019f = z3;
        this.f80020g = bool;
    }

    /* JADX INFO: renamed from: a */
    public static gi20 m44766a(gi20 gi20Var, di20 di20Var, boolean z, boolean z2, int i, nh20 nh20Var, boolean z3, int i2) {
        Boolean bool = Boolean.TRUE;
        if ((i2 & 1) != 0) {
            di20Var = gi20Var.f80014a;
        }
        di20 di20Var2 = di20Var;
        if ((i2 & 2) != 0) {
            z = gi20Var.f80015b;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = gi20Var.f80016c;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            i = gi20Var.f80017d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            nh20Var = gi20Var.f80018e;
        }
        nh20 nh20Var2 = nh20Var;
        if ((i2 & 32) != 0) {
            z3 = gi20Var.f80019f;
        }
        boolean z6 = z3;
        if ((i2 & 64) != 0) {
            bool = gi20Var.f80020g;
        }
        gi20Var.getClass();
        return new gi20(di20Var2, z4, z5, i3, nh20Var2, z6, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi20)) {
            return false;
        }
        gi20 gi20Var = (gi20) obj;
        return this.f80014a == gi20Var.f80014a && this.f80015b == gi20Var.f80015b && this.f80016c == gi20Var.f80016c && this.f80017d == gi20Var.f80017d && wj50.m88271j(this.f80018e, gi20Var.f80018e) && this.f80019f == gi20Var.f80019f && wj50.m88271j(this.f80020g, gi20Var.f80020g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f80018e.hashCode() + mt60.m62800g(this.f80017d, s571.m77245d(s571.m77245d(this.f80014a.hashCode() * 31, 31, this.f80015b), 31, this.f80016c), 31)) * 31, 31, this.f80019f);
        Boolean bool = this.f80020g;
        return iM77245d + (bool == null ? 0 : bool.hashCode());
    }
}
