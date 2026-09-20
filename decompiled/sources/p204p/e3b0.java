package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class e3b0 extends s5o0 {

    /* JADX INFO: renamed from: b */
    public final d3b0 f55732b;

    public e3b0(d3b0 d3b0Var) {
        this.f55732b = d3b0Var;
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: W0 */
    public final float mo24617W0() {
        return this.f55732b.mo24617W0();
    }

    @Override // p204p.s5o0
    /* JADX INFO: renamed from: b */
    public final float mo37624b(dux0 dux0Var) {
        int iM29589L0;
        th00 th00Var = dux0Var.f53318a;
        if (th00Var != null) {
            return ((Number) th00Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
        }
        d3b0 d3b0Var = this.f55732b;
        if (d3b0Var.f44837X) {
            return Float.NaN;
        }
        d3b0 d3b0Var2 = d3b0Var;
        while (true) {
            bg30 bg30Var = d3b0Var2.f44839Z;
            float f = (bg30Var == null || (iM29589L0 = bk5.m29589L0((dux0[]) bg30Var.f26821b, dux0Var)) < 0) ? Float.NaN : ((float[]) bg30Var.f26822c)[iM29589L0];
            if (!Float.isNaN(f)) {
                d3b0Var2.m34821i0(d3b0Var.mo30041u0(), dux0Var);
                return dux0Var.mo37037a(f, d3b0Var2.mo30034o0(), d3b0Var.mo30034o0());
            }
            d3b0 d3b0VarMo30048y0 = d3b0Var2.mo30048y0();
            if (d3b0VarMo30048y0 == null) {
                d3b0Var2.m34821i0(d3b0Var.mo30041u0(), dux0Var);
                return Float.NaN;
            }
            d3b0Var2 = d3b0VarMo30048y0;
        }
    }

    @Override // p204p.s5o0
    /* JADX INFO: renamed from: c */
    public final jo70 mo37625c() {
        d3b0 d3b0Var = this.f55732b;
        jo70 jo70VarMo30034o0 = d3b0Var.f44837X ? null : d3b0Var.mo30034o0();
        if (jo70VarMo30034o0 == null) {
            d3b0Var.mo30041u0().f135676d1.m70507b();
        }
        return jo70VarMo30034o0;
    }

    @Override // p204p.s5o0
    /* JADX INFO: renamed from: d */
    public final ko70 mo37626d() {
        return this.f55732b.getLayoutDirection();
    }

    @Override // p204p.s5o0
    /* JADX INFO: renamed from: e */
    public final int mo37627e() {
        return this.f55732b.mo49587V();
    }

    @Override // p204p.yqq
    /* JADX INFO: renamed from: j */
    public final float mo24619j() {
        return this.f55732b.mo24619j();
    }
}
