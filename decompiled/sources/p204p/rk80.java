package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rk80 implements zp6 {

    /* JADX INFO: renamed from: a */
    public float f200023a;

    /* JADX INFO: renamed from: b */
    public float f200024b;

    /* JADX INFO: renamed from: c */
    public xpi0 f200025c;

    /* JADX INFO: renamed from: d */
    public xpi0 f200026d;

    @Override // p204p.zp6
    /* JADX INFO: renamed from: e */
    public final void mo25663e(int i, Float f, Float f2) {
        xpi0 xpi0Var = this.f200025c;
        float f3 = xpi0Var.f264676f;
        float f4 = 0.3f * f3;
        float f5 = (i * 2.0f) + this.f200023a;
        this.f200023a = f5;
        if (i > 0 && f5 - this.f200024b > f4) {
            this.f200024b = f5 - f4;
        } else if (i < 0 && this.f200024b - f5 > f4) {
            this.f200024b = f5 + f4;
        }
        float f6 = this.f200024b;
        float f7 = xpi0Var.f264674d - (0.35f * f3);
        if (f6 > f7) {
            this.f200024b = f7;
            this.f200023a = f7 - f4;
        } else {
            float f8 = (0.15f * f3) + xpi0Var.f264672b;
            if (f6 < f8) {
                this.f200024b = f8;
                this.f200023a = f8 + f4;
            }
        }
        xpi0 xpi0Var2 = this.f200026d;
        float f9 = this.f200024b;
        float f10 = xpi0Var2.f264672b;
        float f11 = f9 - f10;
        this.f200026d = new xpi0(xpi0Var2.f264671a + 0.0f, f10 + f11, xpi0Var2.f264673c + 0.0f, xpi0Var2.f264674d + f11);
    }

    @Override // p204p.zp6
    /* JADX INFO: renamed from: g */
    public final void mo25665g(xpi0 xpi0Var) {
        if (this.f200025c.equals(xpi0Var)) {
            return;
        }
        this.f200025c = xpi0Var;
        float f = 0.15f * xpi0Var.f264676f;
        this.f200026d = new xpi0(0.0f, f, xpi0Var.f264675e, 1.0f + f);
    }

    @Override // p204p.zp6
    /* JADX INFO: renamed from: k */
    public final xpi0 mo25669k() {
        return this.f200026d;
    }
}
