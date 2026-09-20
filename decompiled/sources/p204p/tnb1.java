package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tnb1 implements snb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f221931a;

    /* JADX INFO: renamed from: b */
    public final boolean f221932b;

    /* JADX INFO: renamed from: c */
    public final boolean f221933c;

    /* JADX INFO: renamed from: d */
    public final boolean f221934d;

    /* JADX INFO: renamed from: e */
    public final boolean f221935e;

    /* JADX INFO: renamed from: f */
    public final boolean f221936f;

    /* JADX INFO: renamed from: g */
    public final int f221937g;

    public tnb1(ilb1 ilb1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.f221931a = ilb1Var;
        this.f221932b = z;
        this.f221933c = z2;
        this.f221934d = z3;
        this.f221935e = z4;
        this.f221936f = z5;
        this.f221937g = i;
    }

    /* JADX INFO: renamed from: g */
    public static tnb1 m81170g(tnb1 tnb1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, int i2) {
        boolean z6 = z;
        ilb1 ilb1Var = tnb1Var.f221931a;
        if ((i2 & 2) != 0) {
            z6 = tnb1Var.f221932b;
        }
        if ((i2 & 4) != 0) {
            z2 = tnb1Var.f221933c;
        }
        if ((i2 & 8) != 0) {
            z3 = tnb1Var.f221934d;
        }
        if ((i2 & 16) != 0) {
            z4 = tnb1Var.f221935e;
        }
        if ((i2 & 32) != 0) {
            z5 = tnb1Var.f221936f;
        }
        if ((i2 & 64) != 0) {
            i = tnb1Var.f221937g;
        }
        int i3 = i;
        tnb1Var.getClass();
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        return new tnb1(ilb1Var, z6, z2, z9, z8, z7, i3);
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: a */
    public final ilb1 mo70434a() {
        return this.f221931a;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: b */
    public final int mo70435b() {
        return this.f221937g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: c */
    public final boolean mo70436c() {
        return this.f221936f;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: d */
    public final boolean mo70437d() {
        return this.f221934d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnb1)) {
            return false;
        }
        tnb1 tnb1Var = (tnb1) obj;
        return wj50.m88271j(this.f221931a, tnb1Var.f221931a) && this.f221932b == tnb1Var.f221932b && this.f221933c == tnb1Var.f221933c && this.f221934d == tnb1Var.f221934d && this.f221935e == tnb1Var.f221935e && this.f221936f == tnb1Var.f221936f && this.f221937g == tnb1Var.f221937g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: f */
    public final boolean mo70438f() {
        return this.f221935e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f221937g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f221931a.hashCode() * 31, 31, this.f221932b), 31, this.f221933c), 31, this.f221934d), 31, this.f221935e), 31, this.f221936f);
    }

    @Override // p204p.snb1
    public final boolean isVisible() {
        return this.f221933c;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: l */
    public final boolean mo70439l() {
        return this.f221932b;
    }
}
