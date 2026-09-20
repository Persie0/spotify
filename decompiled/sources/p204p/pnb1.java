package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class pnb1 implements snb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f179360a;

    /* JADX INFO: renamed from: b */
    public final boolean f179361b;

    /* JADX INFO: renamed from: c */
    public final boolean f179362c;

    /* JADX INFO: renamed from: d */
    public final boolean f179363d;

    /* JADX INFO: renamed from: e */
    public final boolean f179364e;

    /* JADX INFO: renamed from: f */
    public final boolean f179365f;

    /* JADX INFO: renamed from: g */
    public final int f179366g;

    public /* synthetic */ pnb1(ilb1 ilb1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        this(ilb1Var, z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, false, (i2 & 64) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: g */
    public static pnb1 m70433g(pnb1 pnb1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        ilb1 ilb1Var = pnb1Var.f179360a;
        if ((i2 & 2) != 0) {
            z = pnb1Var.f179361b;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = pnb1Var.f179362c;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = pnb1Var.f179363d;
        }
        boolean z7 = z3;
        boolean z8 = pnb1Var.f179364e;
        if ((i2 & 32) != 0) {
            z4 = pnb1Var.f179365f;
        }
        boolean z9 = z4;
        if ((i2 & 64) != 0) {
            i = pnb1Var.f179366g;
        }
        pnb1Var.getClass();
        return new pnb1(ilb1Var, z5, z6, z7, z8, z9, i);
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: a */
    public final ilb1 mo70434a() {
        return this.f179360a;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: b */
    public final int mo70435b() {
        return this.f179366g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: c */
    public final boolean mo70436c() {
        return this.f179365f;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: d */
    public final boolean mo70437d() {
        return this.f179363d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnb1)) {
            return false;
        }
        pnb1 pnb1Var = (pnb1) obj;
        return wj50.m88271j(this.f179360a, pnb1Var.f179360a) && this.f179361b == pnb1Var.f179361b && this.f179362c == pnb1Var.f179362c && this.f179363d == pnb1Var.f179363d && this.f179364e == pnb1Var.f179364e && this.f179365f == pnb1Var.f179365f && this.f179366g == pnb1Var.f179366g;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: f */
    public final boolean mo70438f() {
        return this.f179364e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f179366g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f179360a.hashCode() * 31, 31, this.f179361b), 31, this.f179362c), 31, this.f179363d), 31, this.f179364e), 31, this.f179365f);
    }

    @Override // p204p.snb1
    public final boolean isVisible() {
        return this.f179362c;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: l */
    public final boolean mo70439l() {
        return this.f179361b;
    }

    public pnb1(ilb1 ilb1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.f179360a = ilb1Var;
        this.f179361b = z;
        this.f179362c = z2;
        this.f179363d = z3;
        this.f179364e = z4;
        this.f179365f = z5;
        this.f179366g = i;
    }
}
