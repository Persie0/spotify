package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i3b extends exh0 implements eqk0, kqa, nfs {

    /* JADX INFO: renamed from: M0 */
    public final l3b f98086M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f98087N0;

    /* JADX INFO: renamed from: O0 */
    public vhy0 f98088O0;

    /* JADX INFO: renamed from: P0 */
    public gh00 f98089P0;

    public i3b(l3b l3bVar, gh00 gh00Var) {
        this.f98086M0 = l3bVar;
        this.f98089P0 = gh00Var;
        l3bVar.f129254a = this;
        l3bVar.f129257d = new bj9(this, 24);
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: A1 */
    public final void mo25064A1() {
        vhy0 vhy0Var = this.f98088O0;
        if (vhy0Var != null) {
            vhy0Var.m85577d();
        }
    }

    @Override // p204p.exh0
    /* JADX INFO: renamed from: B1 */
    public final void mo25065B1() {
        m49584H1();
    }

    /* JADX INFO: renamed from: H1 */
    public final void m49584H1() {
        vhy0 vhy0Var = this.f98088O0;
        if (vhy0Var != null) {
            vhy0Var.m85577d();
        }
        this.f98087N0 = false;
        this.f98086M0.f129255b = null;
        hvg1.m48859l(this);
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: N0 */
    public final void mo39629N0() {
        m49584H1();
    }

    @Override // p204p.jlq
    /* JADX INFO: renamed from: U */
    public final void mo33412U() {
        m49584H1();
    }

    @Override // p204p.kqa
    public final ko70 getLayoutDirection() {
        return wjg1.m88318H(this);
    }

    @Override // p204p.kqa
    /* JADX INFO: renamed from: j */
    public final yqq mo39633j() {
        return wjg1.m88315E(this);
    }

    @Override // p204p.eqk0
    /* JADX INFO: renamed from: j0 */
    public final void mo25072j0() {
        m49584H1();
    }

    @Override // p204p.jlq
    /* JADX INFO: renamed from: l */
    public final void mo33590l() {
        m49584H1();
    }

    @Override // p204p.kqa
    /* JADX INFO: renamed from: n */
    public final long mo39635n() {
        return epv0.m39677M(wjg1.m88314D(this, 4).f217324c);
    }

    @Override // p204p.nfs
    /* JADX INFO: renamed from: v0 */
    public final void mo25073v0(tgj tgjVar) {
        boolean z = this.f98087N0;
        l3b l3bVar = this.f98086M0;
        if (!z) {
            l3bVar.f129255b = null;
            l3bVar.f129256c = tgjVar;
            frz0.m42532q(this, new n17(26, this, l3bVar));
            if (l3bVar.f129255b == null) {
                throw edb.m38576y("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f98087N0 = true;
        }
        ibp ibpVar = l3bVar.f129255b;
        wj50.m88279p(ibpVar);
        ibpVar.m50192d().invoke(tgjVar);
    }
}
