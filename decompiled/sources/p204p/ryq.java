package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ryq extends qc21 implements xxq {

    /* JADX INFO: renamed from: c1 */
    public final q0t0 f203944c1;

    /* JADX INFO: renamed from: d1 */
    public final pui0 f203945d1;

    /* JADX INFO: renamed from: e1 */
    public final ayz f203946e1;

    /* JADX INFO: renamed from: f1 */
    public final ceb1 f203947f1;

    /* JADX INFO: renamed from: g1 */
    public final gyq f203948g1;

    public ryq(oqo oqoVar, qc21 qc21Var, l25 l25Var, qti0 qti0Var, int i, q0t0 q0t0Var, pui0 pui0Var, ayz ayzVar, ceb1 ceb1Var, gyq gyqVar, du31 du31Var) {
        super(oqoVar, qc21Var, l25Var, qti0Var, i, du31Var == null ? du31.f52959o0 : du31Var);
        this.f203944c1 = q0t0Var;
        this.f203945d1 = pui0Var;
        this.f203946e1 = ayzVar;
        this.f203947f1 = ceb1Var;
        this.f203948g1 = gyqVar;
    }

    @Override // p204p.jyq
    /* JADX INFO: renamed from: H */
    public final ayz mo54801H() {
        return this.f203946e1;
    }

    @Override // p204p.qc21, p204p.pi00
    /* JADX INFO: renamed from: J1 */
    public final pi00 mo28795J1(int i, l25 l25Var, oqo oqoVar, mi00 mi00Var, qti0 qti0Var, du31 du31Var) {
        ryq ryqVar = new ryq(oqoVar, (qc21) mi00Var, l25Var, qti0Var == null ? getName() : qti0Var, i, this.f203944c1, this.f203945d1, this.f203946e1, this.f203947f1, this.f203948g1, du31Var);
        ryqVar.f177789U0 = this.f177789U0;
        return ryqVar;
    }

    @Override // p204p.jyq
    /* JADX INFO: renamed from: L */
    public final pui0 mo54802L() {
        return this.f203945d1;
    }

    @Override // p204p.jyq
    /* JADX INFO: renamed from: M */
    public final gyq mo54803M() {
        return this.f203948g1;
    }

    /* JADX INFO: renamed from: W1 */
    public final q0t0 m76736W1() {
        return this.f203944c1;
    }

    @Override // p204p.jyq
    /* JADX INFO: renamed from: e0 */
    public final AbstractC2155n8 mo54804e0() {
        return this.f203944c1;
    }
}
