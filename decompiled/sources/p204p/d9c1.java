package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class d9c1 extends e4p0 {

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ kqi0 f46790L0;

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ lqi0 f46791X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ kqi0 f46792Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ kqi0 f46793Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9c1(yzo0 yzo0Var, noo0 noo0Var, lqi0 lqi0Var, kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3) {
        super(yzo0Var, noo0Var);
        this.f46791X = lqi0Var;
        this.f46792Y = kqi0Var;
        this.f46793Z = kqi0Var2;
        this.f46790L0 = kqi0Var3;
    }

    @Override // p204p.e4p0, p204p.ozo0
    /* JADX INFO: renamed from: G */
    public final void mo29149G(long j, long j2) {
        super.mo29149G(j, j2);
        this.f46792Y.setValue(c0c1.f32741a);
        this.f46793Z.setValue(Boolean.TRUE);
    }

    @Override // p204p.e4p0, p204p.ozo0
    /* JADX INFO: renamed from: M */
    public final void mo29150M(long j, long j2) {
        super.mo29150M(j, j2);
        this.f46792Y.setValue(b0c1.f21842a);
        if (((Boolean) this.f46790L0.getValue()).booleanValue()) {
            return;
        }
        this.f46793Z.setValue(Boolean.FALSE);
    }

    @Override // p204p.e4p0, p204p.ozo0
    /* JADX INFO: renamed from: Q */
    public final void mo25537Q(clq clqVar, int i, long j, long j2) {
        super.mo25537Q(clqVar, i, j, j2);
        this.f46792Y.setValue(a0c1.f11056a);
        if (((Boolean) this.f46790L0.getValue()).booleanValue()) {
            return;
        }
        this.f46793Z.setValue(Boolean.FALSE);
    }

    @Override // p204p.e4p0, p204p.ozo0
    /* JADX INFO: renamed from: m */
    public final void mo25538m(long j, long j2) {
        super.mo25538m(j, j2);
        z3p0 z3p0VarM37787a = m37787a();
        if (z3p0VarM37787a == null || z3p0VarM37787a.f278997g) {
            return;
        }
        this.f46792Y.setValue(c0c1.f32741a);
        this.f46793Z.setValue(Boolean.TRUE);
    }

    @Override // p204p.e4p0
    /* JADX INFO: renamed from: w */
    public final void mo35353w(z3p0 z3p0Var) {
        zv41 zv41Var = (zv41) this.f46791X;
        zv41Var.getClass();
        zv41Var.m97091m(null, z3p0Var);
    }
}
