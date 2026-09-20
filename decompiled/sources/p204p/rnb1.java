package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class rnb1 implements snb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f200875a;

    /* JADX INFO: renamed from: b */
    public final boolean f200876b;

    /* JADX INFO: renamed from: c */
    public final boolean f200877c;

    /* JADX INFO: renamed from: d */
    public final boolean f200878d;

    /* JADX INFO: renamed from: e */
    public final boolean f200879e;

    /* JADX INFO: renamed from: f */
    public final boolean f200880f;

    /* JADX INFO: renamed from: g */
    public final int f200881g;

    public rnb1(ilb1 ilb1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.f200875a = ilb1Var;
        this.f200876b = z;
        this.f200877c = z2;
        this.f200878d = z3;
        this.f200879e = z4;
        this.f200880f = z5;
        this.f200881g = i;
    }

    /* JADX INFO: renamed from: g */
    public static rnb1 m75998g(rnb1 rnb1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        ilb1 ilb1Var = rnb1Var.f200875a;
        if ((i2 & 2) != 0) {
            z = rnb1Var.f200876b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = rnb1Var.f200877c;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = rnb1Var.f200878d;
        }
        boolean z7 = z3;
        boolean z8 = rnb1Var.f200879e;
        if ((i2 & 32) != 0) {
            z4 = rnb1Var.f200880f;
        }
        boolean z9 = z4;
        if ((i2 & 64) != 0) {
            i = rnb1Var.f200881g;
        }
        rnb1Var.getClass();
        return new rnb1(ilb1Var, z5, z6, z7, z8, z9, i);
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: a */
    public final ilb1 mo70434a() {
        return this.f200875a;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: b */
    public final int mo70435b() {
        return this.f200881g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: c */
    public final boolean mo70436c() {
        return this.f200880f;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: d */
    public final boolean mo70437d() {
        return this.f200878d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnb1)) {
            return false;
        }
        rnb1 rnb1Var = (rnb1) obj;
        return wj50.m88271j(this.f200875a, rnb1Var.f200875a) && this.f200876b == rnb1Var.f200876b && this.f200877c == rnb1Var.f200877c && this.f200878d == rnb1Var.f200878d && this.f200879e == rnb1Var.f200879e && this.f200880f == rnb1Var.f200880f && this.f200881g == rnb1Var.f200881g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: f */
    public final boolean mo70438f() {
        return this.f200879e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f200881g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f200875a.hashCode() * 31, 31, this.f200876b), 31, this.f200877c), 31, this.f200878d), 31, this.f200879e), 31, this.f200880f);
    }

    @Override // p204p.snb1
    public final boolean isVisible() {
        return this.f200877c;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: l */
    public final boolean mo70439l() {
        return this.f200876b;
    }
}
