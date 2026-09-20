package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class qq9 extends exh0 implements dp70, apz0 {

    /* JADX INFO: renamed from: M0 */
    public gh00 f191511M0;

    public qq9(gh00 gh00Var) {
        this.f191511M0 = gh00Var;
    }

    @Override // p204p.apz0
    /* JADX INFO: renamed from: g */
    public final void mo26732g(mpz0 mpz0Var) {
        boolean z;
        ch01 ch01Var;
        bnj0 bnj0VarM88314D = wjg1.m88314D(this, 2);
        if (bnj0VarM88314D.f28869f1) {
            ch01 ch01Var2 = bnj0VarM88314D.f28867d1;
            z = bnj0VarM88314D.f28868e1;
            ch01Var = ch01Var2;
        } else {
            if (l0y0.f128535a == null) {
                l0y0.f128535a = new fdx0();
            } else {
                fdx0 fdx0Var = l0y0.f128535a;
                wj50.m88279p(fdx0Var);
                fdx0Var.m41379a();
            }
            fdx0 fdx0Var2 = l0y0.f128535a;
            wj50.m88279p(fdx0Var2);
            fdx0Var2.f68597Q0 = bnj0VarM88314D.f28850M0.f135664X0;
            fdx0Var2.f68596P0 = epv0.m39677M(bnj0VarM88314D.f217324c);
            oa31 oa31VarM58610i = lb5.m58610i();
            gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
            oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
            try {
                this.f191511M0.invoke(fdx0Var2);
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                ch01Var = fdx0Var2.f68593M0;
                z = fdx0Var2.f68594N0;
            } catch (Throwable th) {
                lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
                throw th;
            }
        }
        if (z) {
            jpz0.m54009w(mpz0Var, ch01Var);
        }
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new cn8(12, t5o0VarMo39619B, this));
    }

    @Override // p204p.apz0
    /* JADX INFO: renamed from: o */
    public final boolean mo26733o() {
        return false;
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f191511M0 + ')';
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: w1 */
    public final boolean mo32896w1() {
        return false;
    }
}
