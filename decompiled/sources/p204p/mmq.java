package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class mmq extends lmq {

    /* JADX INFO: renamed from: b */
    public final jd21 f145198b;

    public mmq(jd21 jd21Var) {
        this.f145198b = jd21Var;
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: J0 */
    public final jd21 mo35109G0(boolean z) {
        return z == mo36064D0() ? this : this.f145198b.mo35109G0(z).mo35111I0(mo36062B0());
    }

    @Override // p204p.jd21
    /* JADX INFO: renamed from: K0 */
    public final jd21 mo35111I0(gn91 gn91Var) {
        return gn91Var != mo36062B0() ? new md21(this, gn91Var) : this;
    }

    @Override // p204p.lmq
    /* JADX INFO: renamed from: L0 */
    public final jd21 mo48291L0() {
        return this.f145198b;
    }
}
