package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gp70 extends bnj0 {

    /* JADX INFO: renamed from: w1 */
    public static final lk4 f83095w1;

    /* JADX INFO: renamed from: s1 */
    public dp70 f83096s1;

    /* JADX INFO: renamed from: t1 */
    public b8j f83097t1;

    /* JADX INFO: renamed from: u1 */
    public ep70 f83098u1;

    /* JADX INFO: renamed from: v1 */
    public gh5 f83099v1;

    static {
        lk4 lk4VarM77438l = s800.m77438l();
        int i = n6f.f150872l;
        lk4VarM77438l.m59208c(ly5.m60219i());
        lk4VarM77438l.m59211f(1.0f);
        lk4VarM77438l.m59212g(1);
        f83095w1 = lk4VarM77438l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gp70(lp70 lp70Var, dp70 dp70Var) {
        super(lp70Var);
        this.f83096s1 = dp70Var;
        this.f83098u1 = lp70Var.f135685i != null ? new ep70(this) : null;
        this.f83099v1 = (((exh0) dp70Var).f63770a.f63772c & 512) != 0 ? new gh5(this, (a911) dp70Var) : null;
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: B */
    public final t5o0 mo39619B(long j) {
        n6d0 n6d0VarMo25071i;
        b8j b8jVar;
        if (this.f28852O0) {
            b8j b8jVar2 = this.f83097t1;
            if (b8jVar2 == null) {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
            j = b8jVar2.f24596a;
        }
        m80120d0(j);
        gh5 gh5Var = this.f83099v1;
        if (gh5Var != null) {
            a911 a911VarM44716d = gh5Var.m44716d();
            gh5Var.m44717e();
            boolean z = false;
            gh5Var.m44718f((a911VarM44716d.f13453O0.m32133m() && a911VarM44716d.f13453O0.m32128h().m28607a() && a911VarM44716d.f13453O0.m32128h().f25387b.m44329c()) || (b8jVar = this.f83097t1) == null || j != b8jVar.f24596a);
            if (!gh5Var.m44715c()) {
                bnj0 bnj0Var = this.f28853P0;
                wj50.m88279p(bnj0Var);
                bnj0Var.f28852O0 = true;
            }
            bnj0 bnj0Var2 = this.f28853P0;
            wj50.m88279p(bnj0Var2);
            n6d0VarMo25071i = a911VarM44716d.m25066H1(gh5Var, bnj0Var2, j);
            bnj0 bnj0Var3 = this.f28853P0;
            wj50.m88279p(bnj0Var3);
            bnj0Var3.f28852O0 = false;
            int iMo27122d = n6d0VarMo25071i.mo27122d();
            ep70 ep70Var = this.f83098u1;
            wj50.m88279p(ep70Var);
            if (iMo27122d == ep70Var.f217322a) {
                int iMo27120b = n6d0VarMo25071i.mo27120b();
                ep70 ep70Var2 = this.f83098u1;
                wj50.m88279p(ep70Var2);
                if (iMo27120b == ep70Var2.f217323b) {
                    z = true;
                }
            }
            if (!gh5Var.m44715c()) {
                bnj0 bnj0Var4 = this.f28853P0;
                wj50.m88279p(bnj0Var4);
                long j2 = bnj0Var4.f217324c;
                bnj0 bnj0Var5 = this.f28853P0;
                wj50.m88279p(bnj0Var5);
                f3b0 f3b0VarMo30015Y0 = bnj0Var5.mo30015Y0();
                if (g450.m43519a(j2, f3b0VarMo30015Y0 != null ? new g450(f3b0VarMo30015Y0.m40643R0()) : null) && !z) {
                    n6d0VarMo25071i = new fp70(n6d0VarMo25071i, this);
                }
            }
        } else {
            dp70 dp70Var = this.f83096s1;
            bnj0 bnj0Var6 = this.f28853P0;
            wj50.m88279p(bnj0Var6);
            n6d0VarMo25071i = dp70Var.mo25071i(this, bnj0Var6, j);
        }
        m29992B1(n6d0VarMo25071i);
        m30038r1();
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX INFO: renamed from: K1 */
    public final void m45365K1() {
        boolean z;
        if (this.f44844t) {
            return;
        }
        m30040t1();
        bnj0 bnj0Var = this.f28853P0;
        wj50.m88279p(bnj0Var);
        gh5 gh5Var = this.f83099v1;
        if (gh5Var != null) {
            a911 a911VarM44716d = gh5Var.m44716d();
            wj50.m88279p(this.f83098u1);
            a911VarM44716d.getClass();
            if (gh5Var.m44715c()) {
                z = false;
            } else {
                long j = this.f217324c;
                ep70 ep70Var = this.f83098u1;
                if (g450.m43519a(j, ep70Var != null ? new g450(ep70Var.m40643R0()) : null)) {
                    long j2 = bnj0Var.f217324c;
                    f3b0 f3b0VarMo30015Y0 = bnj0Var.mo30015Y0();
                    if (g450.m43519a(j2, f3b0VarMo30015Y0 != null ? new g450(f3b0VarMo30015Y0.m40643R0()) : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
            }
            bnj0Var.f28851N0 = z;
        }
        bnj0Var.f44837X = this.f44837X;
        mo30043v0().mo27119a();
        bnj0Var.f44837X = false;
        bnj0Var.f28851N0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L1 */
    public final void m45366L1(dp70 dp70Var) {
        if (!dp70Var.equals(this.f83096s1)) {
            if ((((exh0) dp70Var).f63770a.f63772c & 512) != 0) {
                a911 a911Var = (a911) dp70Var;
                gh5 gh5Var = this.f83099v1;
                if (gh5Var != null) {
                    gh5Var.m44719g(a911Var);
                } else {
                    gh5Var = new gh5(this, a911Var);
                }
                this.f83099v1 = gh5Var;
            } else {
                this.f83099v1 = null;
            }
        }
        this.f83096s1 = dp70Var;
    }

    @Override // p204p.bnj0
    /* JADX INFO: renamed from: S0 */
    public final void mo30012S0() {
        if (this.f83098u1 == null) {
            this.f83098u1 = new ep70(this);
        }
    }

    @Override // p204p.t5o0
    /* JADX INFO: renamed from: X */
    public final void mo40646X(long j, float f, gh00 gh00Var) {
        if (this.f28851N0) {
            f3b0 f3b0VarMo30015Y0 = mo30015Y0();
            wj50.m88279p(f3b0VarMo30015Y0);
            m30049y1(f3b0VarMo30015Y0.mo30050z0(), f, gh00Var, null);
        } else {
            m30049y1(j, f, gh00Var, null);
        }
        m45365K1();
    }

    @Override // p204p.bnj0
    /* JADX INFO: renamed from: Y0 */
    public final f3b0 mo30015Y0() {
        return this.f83098u1;
    }

    @Override // p204p.bnj0, p204p.t5o0
    /* JADX INFO: renamed from: b0 */
    public final void mo30019b0(long j, float f, rx10 rx10Var) {
        if (this.f28851N0) {
            f3b0 f3b0VarMo30015Y0 = mo30015Y0();
            wj50.m88279p(f3b0VarMo30015Y0);
            m30049y1(f3b0VarMo30015Y0.mo30050z0(), f, null, rx10Var);
        } else {
            m30049y1(j, f, null, rx10Var);
        }
        m45365K1();
    }

    @Override // p204p.bnj0
    /* JADX INFO: renamed from: b1 */
    public final exh0 mo30020b1() {
        return ((exh0) this.f83096s1).f63770a;
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: d */
    public final int mo39620d(int i) {
        gh5 gh5Var = this.f83099v1;
        if (gh5Var == null) {
            dp70 dp70Var = this.f83096s1;
            bnj0 bnj0Var = this.f28853P0;
            wj50.m88279p(bnj0Var);
            return dp70Var.mo35395C(this, bnj0Var, i);
        }
        a911 a911VarM44716d = gh5Var.m44716d();
        bnj0 bnj0Var2 = this.f28853P0;
        wj50.m88279p(bnj0Var2);
        a911VarM44716d.getClass();
        bnj0 bnj0Var3 = a911VarM44716d.f63770a.f63777h;
        wj50.m88279p(bnj0Var3);
        f3b0 f3b0VarMo30015Y0 = bnj0Var3.mo30015Y0();
        wj50.m88279p(f3b0VarMo30015Y0);
        if (!f3b0VarMo30015Y0.mo30037r0()) {
            return bnj0Var2.mo39620d(i);
        }
        return a911VarM44716d.m25066H1(new dh5(gh5Var, gh5Var.getLayoutDirection()), new x6d0(bnj0Var2, 2, 2, 1), e8j.m38111b(0, i, 0, 0, 13)).mo27120b();
    }

    @Override // p204p.d3b0
    /* JADX INFO: renamed from: j0 */
    public final int mo34822j0(pb3 pb3Var) {
        ep70 ep70Var = this.f83098u1;
        return ep70Var != null ? ep70Var.m40639J0(pb3Var) : ywg1.m94792d(this, pb3Var);
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: l */
    public final int mo39621l(int i) {
        gh5 gh5Var = this.f83099v1;
        if (gh5Var == null) {
            dp70 dp70Var = this.f83096s1;
            bnj0 bnj0Var = this.f28853P0;
            wj50.m88279p(bnj0Var);
            return dp70Var.mo35402u0(this, bnj0Var, i);
        }
        a911 a911VarM44716d = gh5Var.m44716d();
        bnj0 bnj0Var2 = this.f28853P0;
        wj50.m88279p(bnj0Var2);
        a911VarM44716d.getClass();
        bnj0 bnj0Var3 = a911VarM44716d.f63770a.f63777h;
        wj50.m88279p(bnj0Var3);
        f3b0 f3b0VarMo30015Y0 = bnj0Var3.mo30015Y0();
        wj50.m88279p(f3b0VarMo30015Y0);
        if (!f3b0VarMo30015Y0.mo30037r0()) {
            return bnj0Var2.mo39621l(i);
        }
        return a911VarM44716d.m25066H1(new dh5(gh5Var, gh5Var.getLayoutDirection()), new x6d0(bnj0Var2, 1, 2, 1), e8j.m38111b(0, i, 0, 0, 13)).mo27120b();
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: u */
    public final int mo39622u(int i) {
        gh5 gh5Var = this.f83099v1;
        if (gh5Var == null) {
            dp70 dp70Var = this.f83096s1;
            bnj0 bnj0Var = this.f28853P0;
            wj50.m88279p(bnj0Var);
            return dp70Var.mo35400R0(this, bnj0Var, i);
        }
        a911 a911VarM44716d = gh5Var.m44716d();
        bnj0 bnj0Var2 = this.f28853P0;
        wj50.m88279p(bnj0Var2);
        a911VarM44716d.getClass();
        bnj0 bnj0Var3 = a911VarM44716d.f63770a.f63777h;
        wj50.m88279p(bnj0Var3);
        f3b0 f3b0VarMo30015Y0 = bnj0Var3.mo30015Y0();
        wj50.m88279p(f3b0VarMo30015Y0);
        if (!f3b0VarMo30015Y0.mo30037r0()) {
            return bnj0Var2.mo39622u(i);
        }
        return a911VarM44716d.m25066H1(new dh5(gh5Var, gh5Var.getLayoutDirection()), new x6d0(bnj0Var2, 1, 1, 1), e8j.m38111b(0, 0, 0, i, 7)).mo27122d();
    }

    @Override // p204p.h6d0
    /* JADX INFO: renamed from: w */
    public final int mo39623w(int i) {
        gh5 gh5Var = this.f83099v1;
        if (gh5Var == null) {
            dp70 dp70Var = this.f83096s1;
            bnj0 bnj0Var = this.f28853P0;
            wj50.m88279p(bnj0Var);
            return dp70Var.mo35401X0(this, bnj0Var, i);
        }
        a911 a911VarM44716d = gh5Var.m44716d();
        bnj0 bnj0Var2 = this.f28853P0;
        wj50.m88279p(bnj0Var2);
        a911VarM44716d.getClass();
        bnj0 bnj0Var3 = a911VarM44716d.f63770a.f63777h;
        wj50.m88279p(bnj0Var3);
        f3b0 f3b0VarMo30015Y0 = bnj0Var3.mo30015Y0();
        wj50.m88279p(f3b0VarMo30015Y0);
        if (!f3b0VarMo30015Y0.mo30037r0()) {
            return bnj0Var2.mo39623w(i);
        }
        return a911VarM44716d.m25066H1(new dh5(gh5Var, gh5Var.getLayoutDirection()), new x6d0(bnj0Var2, 2, 1, 1), e8j.m38111b(0, 0, 0, i, 7)).mo27122d();
    }

    @Override // p204p.bnj0
    /* JADX INFO: renamed from: x1 */
    public final void mo30047x1(wqb wqbVar, rx10 rx10Var) {
        bnj0 bnj0Var;
        bnj0 bnj0Var2 = this.f28853P0;
        wj50.m88279p(bnj0Var2);
        bnj0Var2.m30010Q0(wqbVar, rx10Var);
        if (!((oz3) op70.m67517a(this.f28850M0)).getShowLayoutBounds() || (bnj0Var = this.f28853P0) == null) {
            return;
        }
        if (g450.m43520b(this.f217324c, bnj0Var.f217324c) && y350.m92729b(bnj0Var.f28863Z0, 0L)) {
            return;
        }
        long j = this.f217324c;
        wqbVar.mo25274c(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, f83095w1);
    }
}
