package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public final class dgj0 extends exh0 implements ce91, vfj0 {

    /* JADX INFO: renamed from: M0 */
    public vfj0 f48816M0;

    /* JADX INFO: renamed from: N0 */
    public yfj0 f48817N0;

    /* JADX INFO: renamed from: O0 */
    public dgj0 f48818O0;

    /* JADX INFO: renamed from: P0 */
    public final String f48819P0;

    public dgj0(vfj0 vfj0Var, yfj0 yfj0Var) {
        this.f48816M0 = vfj0Var;
        this.f48817N0 = yfj0Var == null ? new yfj0() : yfj0Var;
        this.f48819P0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        dgj0 dgj0Var = (dgj0) wjg1.m88330i(this);
        this.f48818O0 = dgj0Var;
        yfj0 yfj0Var = this.f48817N0;
        yfj0Var.f272272b = dgj0Var;
        if (yfj0Var.f272271a == this) {
            yfj0Var.f272271a = null;
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final xuk m35925H1() {
        dgj0 dgj0Var = this.f63766L0 ? (dgj0) vj50.m85738t(this) : null;
        xuk xukVarM35925H1 = dgj0Var != null ? dgj0Var.m35925H1() : null;
        if (xukVarM35925H1 != null && kk40.m56650L(xukVarM35925H1)) {
            return xukVarM35925H1;
        }
        xuk xukVar = this.f48817N0.f272274d;
        if (xukVar != null) {
            return xukVar;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: P */
    public final long mo25861P(int i, long j) {
        boolean z = this.f63766L0;
        dgj0 dgj0Var = null;
        if (z && z) {
            dgj0Var = (dgj0) vj50.m85738t(this);
        }
        long jMo25861P = dgj0Var != null ? dgj0Var.mo25861P(i, j) : 0L;
        return Offset.m257g(jMo25861P, this.f48816M0.mo25861P(i, Offset.m256f(j, jMo25861P)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: S0 */
    public final Object mo25862S0(long j, long j2, fbk fbkVar) {
        bgj0 bgj0Var;
        long j3;
        long j4;
        long jM60860j;
        dgj0 dgj0Var;
        long jM60860j2;
        long j5;
        if (fbkVar instanceof bgj0) {
            bgj0Var = (bgj0) fbkVar;
            int i = bgj0Var.f26958e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgj0Var.f26958e = i - Integer.MIN_VALUE;
            } else {
                bgj0Var = new bgj0(this, (ibk) fbkVar);
            }
        } else {
            bgj0Var = new bgj0(this, (ibk) fbkVar);
        }
        bgj0 bgj0Var2 = bgj0Var;
        Object objMo25862S0 = bgj0Var2.f26956c;
        int i2 = bgj0Var2.f26958e;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objMo25862S0);
            vfj0 vfj0Var = this.f48816M0;
            bgj0Var2.f26954a = j;
            bgj0Var2.f26955b = j2;
            bgj0Var2.f26958e = 1;
            objMo25862S0 = vfj0Var.mo25862S0(j, j2, bgj0Var2);
            if (objMo25862S0 != yukVar) {
                j3 = j;
                j4 = j2;
            }
            return yukVar;
        }
        if (i2 == 1) {
            j4 = bgj0Var2.f26955b;
            j3 = bgj0Var2.f26954a;
            bga.m29073P(objMo25862S0);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = bgj0Var2.f26954a;
            bga.m29073P(objMo25862S0);
        }
        jM60860j2 = ((m5b1) objMo25862S0).m60860j();
        jM60860j = j5;
        return m5b1.m60851a(m5b1.m60857g(jM60860j, jM60860j2));
        jM60860j = ((m5b1) objMo25862S0).m60860j();
        boolean z = this.f63766L0;
        if (z) {
            dgj0Var = null;
            if (z && z) {
                dgj0Var = (dgj0) vj50.m85738t(this);
            }
        } else {
            dgj0Var = this.f48818O0;
        }
        if (dgj0Var != null) {
            long jM60857g = m5b1.m60857g(j3, jM60860j);
            long jM60856f = m5b1.m60856f(j4, jM60860j);
            bgj0Var2.f26954a = jM60860j;
            bgj0Var2.f26958e = 2;
            objMo25862S0 = dgj0Var.mo25862S0(jM60857g, jM60856f, bgj0Var2);
            if (objMo25862S0 != yukVar) {
                j5 = jM60860j;
                jM60860j2 = ((m5b1) objMo25862S0).m60860j();
                jM60860j = j5;
            }
            return yukVar;
        }
        jM60860j2 = 0;
        return m5b1.m60851a(m5b1.m60857g(jM60860j, jM60860j2));
    }

    @Override // p204p.vfj0
    /* JADX INFO: renamed from: k0 */
    public final long mo25863k0(int i, long j, long j2) {
        long jMo25863k0 = this.f48816M0.mo25863k0(i, j, j2);
        boolean z = this.f63766L0;
        dgj0 dgj0Var = null;
        if (z && z) {
            dgj0Var = (dgj0) vj50.m85738t(this);
        }
        dgj0 dgj0Var2 = dgj0Var;
        return Offset.m257g(jMo25863k0, dgj0Var2 != null ? dgj0Var2.mo25863k0(i, Offset.m257g(j, jMo25863k0), Offset.m256f(j2, jMo25863k0)) : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r12 == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r12 == r4) goto L29;
     */
    @Override // p204p.vfj0
    /* JADX INFO: renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo25864m0(long j, fbk fbkVar) {
        cgj0 cgj0Var;
        long jM60860j;
        long j2;
        if (fbkVar instanceof cgj0) {
            cgj0Var = (cgj0) fbkVar;
            int i = cgj0Var.f37702d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cgj0Var.f37702d = i - Integer.MIN_VALUE;
            } else {
                cgj0Var = new cgj0(this, (ibk) fbkVar);
            }
        } else {
            cgj0Var = new cgj0(this, (ibk) fbkVar);
        }
        Object objMo25864m0 = cgj0Var.f37700b;
        int i2 = cgj0Var.f37702d;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                j = cgj0Var.f37699a;
                bga.m29073P(objMo25864m0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j2 = cgj0Var.f37699a;
                bga.m29073P(objMo25864m0);
            }
            return m5b1.m60851a(m5b1.m60857g(j2, ((m5b1) objMo25864m0).m60860j()));
        }
        bga.m29073P(objMo25864m0);
        boolean z = this.f63766L0;
        dgj0 dgj0Var = null;
        if (z && z) {
            dgj0Var = (dgj0) vj50.m85738t(this);
        }
        if (dgj0Var != null) {
            cgj0Var.f37699a = j;
            cgj0Var.f37702d = 1;
            objMo25864m0 = dgj0Var.mo25864m0(j, cgj0Var);
        } else {
            jM60860j = 0;
            long j3 = jM60860j;
            long j4 = j;
            j2 = j3;
            vfj0 vfj0Var = this.f48816M0;
            long jM60856f = m5b1.m60856f(j4, j2);
            cgj0Var.f37699a = j2;
            cgj0Var.f37702d = 2;
            objMo25864m0 = vfj0Var.mo25864m0(jM60856f, cgj0Var);
        }
        return yukVar;
        jM60860j = ((m5b1) objMo25864m0).m60860j();
        long j5 = jM60860j;
        long j6 = j;
        j2 = j5;
        vfj0 vfj0Var2 = this.f48816M0;
        long jM60856f2 = m5b1.m60856f(j6, j2);
        cgj0Var.f37699a = j2;
        cgj0Var.f37702d = 2;
        objMo25864m0 = vfj0Var2.mo25864m0(jM60856f2, cgj0Var);
    }

    @Override // p204p.ce91
    /* JADX INFO: renamed from: r */
    public final Object mo26917r() {
        return this.f48819P0;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        yfj0 yfj0Var = this.f48817N0;
        yfj0Var.f272271a = this;
        yfj0Var.f272272b = null;
        this.f48818O0 = null;
        yfj0Var.f272273c = new ccj0(this, 7);
        yfj0Var.f272274d = m40262v1();
    }
}
