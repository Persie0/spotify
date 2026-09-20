package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class qnb1 implements snb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f190554a;

    /* JADX INFO: renamed from: b */
    public final boolean f190555b;

    /* JADX INFO: renamed from: c */
    public final boolean f190556c;

    /* JADX INFO: renamed from: d */
    public final boolean f190557d;

    /* JADX INFO: renamed from: e */
    public final boolean f190558e;

    /* JADX INFO: renamed from: f */
    public final boolean f190559f;

    /* JADX INFO: renamed from: g */
    public final int f190560g;

    public qnb1(ilb1 ilb1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.f190554a = ilb1Var;
        this.f190555b = z;
        this.f190556c = z2;
        this.f190557d = z3;
        this.f190558e = z4;
        this.f190559f = z5;
        this.f190560g = i;
    }

    /* JADX INFO: renamed from: g */
    public static qnb1 m73341g(qnb1 qnb1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        ilb1 ilb1Var = qnb1Var.f190554a;
        if ((i2 & 2) != 0) {
            z = qnb1Var.f190555b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = qnb1Var.f190556c;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = qnb1Var.f190557d;
        }
        boolean z7 = z3;
        boolean z8 = qnb1Var.f190558e;
        if ((i2 & 32) != 0) {
            z4 = qnb1Var.f190559f;
        }
        boolean z9 = z4;
        if ((i2 & 64) != 0) {
            i = qnb1Var.f190560g;
        }
        qnb1Var.getClass();
        return new qnb1(ilb1Var, z5, z6, z7, z8, z9, i);
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: a */
    public final ilb1 mo70434a() {
        return this.f190554a;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: b */
    public final int mo70435b() {
        return this.f190560g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: c */
    public final boolean mo70436c() {
        return this.f190559f;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: d */
    public final boolean mo70437d() {
        return this.f190557d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnb1)) {
            return false;
        }
        qnb1 qnb1Var = (qnb1) obj;
        return wj50.m88271j(this.f190554a, qnb1Var.f190554a) && this.f190555b == qnb1Var.f190555b && this.f190556c == qnb1Var.f190556c && this.f190557d == qnb1Var.f190557d && this.f190558e == qnb1Var.f190558e && this.f190559f == qnb1Var.f190559f && this.f190560g == qnb1Var.f190560g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: f */
    public final boolean mo70438f() {
        return this.f190558e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f190560g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f190554a.hashCode() * 31, 31, this.f190555b), 31, this.f190556c), 31, this.f190557d), 31, this.f190558e), 31, this.f190559f);
    }

    @Override // p204p.snb1
    public final boolean isVisible() {
        return this.f190556c;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: l */
    public final boolean mo70439l() {
        return this.f190555b;
    }
}
