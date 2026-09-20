package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class m480 implements z380 {

    /* JADX INFO: renamed from: a */
    public final xoi0 f139861a = new xoi0();

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: a */
    public final qfm0 mo31538a() {
        return (cs61) this.f139861a.mo33098e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.x7l0
    /* JADX INFO: renamed from: b */
    public final void mo24810b(String str, i500 i500Var) {
        boolean z = i500Var instanceof e600;
        xoi0 xoi0Var = this.f139861a;
        if (!z) {
            xoi0Var.mo33104m(null);
        } else {
            String strMo24331j = ((e600) i500Var).mo24331j();
            xoi0Var.mo33104m(strMo24331j != null ? new cs61(strMo24331j) : null);
        }
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: c */
    public final void mo31539c(dqk0 dqk0Var) {
        this.f139861a.mo33102k(dqk0Var);
    }

    @Override // p204p.jfm0
    /* JADX INFO: renamed from: d */
    public final void mo31540d(dqk0 dqk0Var) {
        this.f139861a.m33100g(dqk0Var);
    }
}
