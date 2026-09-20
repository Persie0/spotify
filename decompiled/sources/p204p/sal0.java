package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sal0 extends exh0 implements eqk0 {

    /* JADX INFO: renamed from: M0 */
    public eh00 f207229M0;

    /* JADX INFO: renamed from: N0 */
    public ih71 f207230N0;

    /* JADX INFO: renamed from: O0 */
    public di41 f207231O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f207232P0;

    /* JADX INFO: renamed from: Q0 */
    public o0w0 f207233Q0;

    /* JADX INFO: renamed from: R0 */
    public final f0l0 f207234R0 = new f0l0(this, 9);

    public sal0(eh00 eh00Var) {
        this.f207229M0 = eh00Var;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        ih71 ih71Var = this.f207230N0;
        if (ih71Var != null) {
            ih71Var.m50586b();
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        di41 di41Var = this.f207231O0;
        if (di41Var != null) {
            di41Var.mo26601e(null);
        }
        this.f207231O0 = null;
        this.f207232P0 = false;
        this.f207233Q0 = null;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m77643H1(o0w0 o0w0Var) {
        di41 di41Var;
        this.f207233Q0 = o0w0Var;
        long j = o0w0Var.f160526e;
        float fM66026a = o0w0Var.m66026a(0, 0, (int) (j >> 32), (int) j);
        boolean z = fM66026a > 1.0f || fM66026a == 1.0f;
        if (z && !this.f207232P0) {
            ih71 ih71Var = this.f207230N0;
            if (ih71Var != null) {
                ih71Var.m50586b();
            }
            di41 di41Var2 = this.f207231O0;
            if (di41Var2 != null) {
                di41Var2.mo26601e(null);
            }
            this.f207229M0.invoke();
        } else if (!z && this.f207232P0 && (di41Var = this.f207231O0) != null) {
            di41Var.mo26601e(null);
        }
        this.f207232P0 = z;
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: z1 */
    public final void mo25074z1() {
        ih71 ih71Var = this.f207230N0;
        if (ih71Var != null) {
            ih71Var.m50586b();
        }
        this.f207230N0 = alf1.m26341x(this, 0L, 0L, this.f207234R0);
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
    }
}
