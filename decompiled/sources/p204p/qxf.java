package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class qxf extends q19 {

    /* JADX INFO: renamed from: T0 */
    public final up60 f193661T0;

    /* JADX INFO: renamed from: U0 */
    public final t290 f193662U0;

    /* JADX INFO: renamed from: V0 */
    public mhv f193663V0;

    /* JADX INFO: renamed from: W0 */
    public final h9p f193664W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxf(ovf ovfVar, up60 up60Var, t290 t290Var) {
        super(ovfVar);
        y2e y2eVar = y2e.f268566N0;
        this.f193661T0 = up60Var;
        this.f193662U0 = t290Var;
        this.f193664W0 = new h9p((eh00) y2eVar, false);
    }

    @Override // p204p.q19
    /* JADX INFO: renamed from: D */
    public final void mo27517D(mhv mhvVar) {
        vgg1.m85469j(this.f193661T0, mhvVar);
        this.f193663V0 = mhvVar;
        if (this.f193664W0.m46898y(mhvVar)) {
            ((ovf) this.f184268S0).mo2820d(mo46736G(mhvVar));
        }
        mo46735F(mhvVar, new e2a(1, this.f193662U0, t290.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0, 0, 18));
    }

    @Override // p204p.q19
    /* JADX INFO: renamed from: E */
    public final void mo27518E() {
        this.f193664W0.f89016d = null;
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo46735F(mhv mhvVar, e2a e2aVar);

    /* JADX INFO: renamed from: G */
    public abstract Object mo46736G(mhv mhvVar);
}
