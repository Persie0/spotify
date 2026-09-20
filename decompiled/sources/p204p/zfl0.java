package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zfl0 extends exh0 implements eqk0, v3a1 {

    /* JADX INFO: renamed from: M0 */
    public gh00 f282341M0;

    /* JADX INFO: renamed from: N0 */
    public ih71 f282342N0;

    /* JADX INFO: renamed from: O0 */
    public di41 f282343O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f282344P0;

    /* JADX INFO: renamed from: Q0 */
    public boolean f282345Q0;

    /* JADX INFO: renamed from: R0 */
    public o0w0 f282346R0;

    /* JADX INFO: renamed from: S0 */
    public final f0l0 f282347S0 = new f0l0(this, 12);

    public zfl0(gh00 gh00Var) {
        this.f282341M0 = gh00Var;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        ih71 ih71Var = this.f282342N0;
        if (ih71Var != null) {
            ih71Var.m50586b();
        }
        m96030I1();
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        m96030I1();
        di41 di41Var = this.f282343O0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f282343O0 = null;
        this.f282344P0 = false;
        this.f282346R0 = null;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m96029H1(o0w0 o0w0Var) {
        this.f282346R0 = o0w0Var;
        long j = o0w0Var.f160526e;
        float fM66026a = o0w0Var.m66026a(0, 0, (int) (j >> 32), (int) j);
        boolean z = fM66026a > 1.0f || fM66026a == 1.0f;
        if (z != this.f282344P0) {
            this.f282344P0 = z;
            di41 di41Var = this.f282343O0;
            if (di41Var != null) {
                di41Var.mo26601e(null);
            }
            this.f282343O0 = null;
            if (z != this.f282345Q0) {
                m96031J1();
            }
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m96030I1() {
        di41 di41Var = this.f282343O0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f282343O0 = null;
        this.f282344P0 = false;
        if (this.f282345Q0) {
            m96031J1();
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final void m96031J1() {
        di41 di41Var = this.f282343O0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f282343O0 = null;
        this.f282341M0.invoke(Boolean.valueOf(this.f282344P0));
        this.f282345Q0 = this.f282344P0;
    }

    @Override // p204p.v3a1
    /* JADX INFO: renamed from: u1 */
    public final void mo57089u1() {
        m96030I1();
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        ih71 ih71Var = this.f282342N0;
        if (ih71Var != null) {
            ih71Var.m50586b();
        }
        this.f282342N0 = alf1.m26341x(this, 0L, 0L, this.f282347S0);
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
    }
}
