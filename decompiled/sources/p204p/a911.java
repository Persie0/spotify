package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public final class a911 extends exh0 implements nfs, hxh0, eqk0, osh, dp70 {

    /* JADX INFO: renamed from: M0 */
    public tiv0 f13451M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f13452N0;

    /* JADX INFO: renamed from: O0 */
    public cb11 f13453O0;

    /* JADX INFO: renamed from: P0 */
    public rx10 f13454P0;

    /* JADX INFO: renamed from: Q0 */
    public final vf21 f13455Q0;

    public a911(cb11 cb11Var) {
        this.f13453O0 = cb11Var;
        this.f13454P0 = cb11Var.m32123c();
        this.f13455Q0 = quf1.m73918j(pft0.m69840u(za11.m95743a(), cb11Var));
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        jo70 jo70Var = this.f13453O0.m32128h().f25387b.f78705e;
        if (jo70Var != null) {
            this.f13451M0 = (jo70Var.mo30016a() && this.f13452N0) ? q0f1.m71836j(Offset.m256f(pwg1.m71288w(wjg1.m88317G(this)), pwg1.m71288w(jo70Var)), epv0.m39677M(wjg1.m88317G(this).f217324c)) : null;
        }
        m25068J1(null);
        this.f13453O0.m32138r(null);
        this.f13453O0.m32135o(null);
        this.f13453O0.m32134n(false);
        this.f13452N0 = false;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        this.f13451M0 = null;
        rx10 rx10Var = this.f13454P0;
        if (rx10Var != null) {
            wjg1.m88316F(this).mo49971c(rx10Var);
        }
        m25068J1(wjg1.m88316F(this).mo49970b());
    }

    /* JADX INFO: renamed from: H1 */
    public final n6d0 m25066H1(eh5 eh5Var, h6d0 h6d0Var, long j) {
        long jMo30018b;
        tiv0 tiv0VarM90562c = this.f13453O0.m32121a().m90562c();
        if (tiv0VarM90562c == null) {
            tiv0VarM90562c = this.f13453O0.m32128h().f25388c.m69636z();
        }
        if (tiv0VarM90562c != null) {
            long jM39670F = epv0.m39670F(tiv0VarM90562c.m80935g());
            int i = (int) (jM39670F >> 32);
            int i2 = (int) (jM39670F & 4294967295L);
            if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + this.f13453O0.m32121a().m90562c() + ", current bounds: " + this.f13453O0.m32128h().f25388c.m69632v().mo66733c()).toString());
            }
            if (i < 0) {
                i = 0;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            if (!((i2 >= 0) & (i >= 0))) {
                ot40.m67767a("width and height must be >= 0");
            }
            j = e8j.m38117h(i, i, i2, i2);
        }
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        if (this.f13453O0.m32128h().f25388c.m69632v().mo66734d()) {
            dd11 dd11VarM32126f = this.f13453O0.m32126f();
            jMo30018b = this.f13453O0.m32128h().f25387b.f78701a.mo44327a(wjg1.m88317G(this)).mo30018b();
            dd11VarM32126f.mo32333a(jMo30018b, (((long) t5o0VarMo39619B.f217322a) << 32) | (((long) t5o0VarMo39619B.f217323b) & 4294967295L));
        } else {
            jMo30018b = (((long) t5o0VarMo39619B.f217322a) << 32) | (((long) t5o0VarMo39619B.f217323b) & 4294967295L);
        }
        return eh5Var.mo44714T((int) (jMo30018b >> 32), (int) (jMo30018b & 4294967295L), nau.f152117a, new z811(this, t5o0VarMo39619B));
    }

    /* JADX INFO: renamed from: I1 */
    public final jo70 m25067I1() {
        jo70 jo70Var = this.f13453O0.m32128h().f25387b.f78705e;
        if (jo70Var != null) {
            return jo70Var;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    /* JADX INFO: renamed from: J1 */
    public final void m25068J1(rx10 rx10Var) {
        if (rx10Var == null) {
            rx10 rx10Var2 = this.f13454P0;
            if (rx10Var2 != null) {
                wjg1.m88316F(this).mo49971c(rx10Var2);
            }
        } else {
            this.f13453O0.m32137q(rx10Var);
        }
        this.f13454P0 = rx10Var;
    }

    /* JADX INFO: renamed from: K1 */
    public final void m25069K1() {
        w3t0 w3t0VarM95743a = za11.m95743a();
        cb11 cb11Var = this.f13453O0;
        oau oauVar = oau.f163457z0;
        vf21 vf21Var = this.f13455Q0;
        if (vf21Var == oauVar) {
            mt40.m62789a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!vf21Var.mo55005n(w3t0VarM95743a)) {
            mt40.m62789a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + w3t0VarM95743a + " was not found.");
        }
        vf21Var.m85340R(w3t0VarM95743a, cb11Var);
        this.f13453O0.m32138r((cb11) mo39636n1(za11.m95743a()));
        m25068J1(wjg1.m88316F(this).mo49970b());
        this.f13452N0 = false;
        this.f13453O0.m32135o(this);
    }

    @Override // p204p.hxh0
    /* JADX INFO: renamed from: W */
    public final k0e1 mo25070W() {
        return this.f13455Q0;
    }

    @Override // p204p.dp70
    /* JADX INFO: renamed from: i */
    public final n6d0 mo25071i(o6d0 o6d0Var, h6d0 h6d0Var, long j) {
        t5o0 t5o0VarMo39619B = h6d0Var.mo39619B(j);
        return o6d0Var.mo44714T(t5o0VarMo39619B.f217322a, t5o0VarMo39619B.f217323b, nau.f152117a, new z811(t5o0VarMo39619B, this));
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
        this.f13453O0.m32128h().m28611e();
        frz0.m42532q(this, this.f13453O0.m32128h().f25394i);
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        vbn0 vbn0VarM47144a;
        bb11 bb11VarM32128h = this.f13453O0.m32128h();
        tiv0 tiv0VarMo66733c = bb11VarM32128h.f25388c.m69632v().mo66733c();
        cb11 cb11Var = this.f13453O0;
        if (!cb11Var.m32130j() || tiv0VarMo66733c == null) {
            vbn0VarM47144a = null;
        } else {
            hd11 hd11VarM32125e = this.f13453O0.m32125e();
            ed11 ed11VarM32132l = this.f13453O0.m32132l();
            tgjVar.getLayoutDirection();
            wjg1.m88315E(this);
            hd11VarM32125e.getClass();
            vbn0VarM47144a = hd11.m47144a(ed11VarM32132l);
        }
        cb11Var.m32136p(vbn0VarM47144a);
        rx10 rx10VarM32123c = this.f13453O0.m32123c();
        if (rx10VarM32123c != null) {
            tgjVar.mo290Z(epv0.m39676L(tgjVar.mo295n()), new ono0(tgjVar, tiv0VarMo66733c, bb11VarM32128h), rx10VarM32123c);
            if (this.f13453O0.m32131k()) {
                wj50.m88246A(tgjVar, rx10VarM32123c);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + bb11VarM32128h.f25386a + ",target: " + this.f13453O0.m32121a().m90561b() + ", is attached: " + this.f63766L0).toString());
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        frz0.m42532q(this, this.f13453O0.m32128h().f25394i);
        m25069K1();
        this.f13453O0.m32134n(true);
    }
}
