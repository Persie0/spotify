package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sfi0 implements lyi0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tfi0 f208602a;

    public sfi0(tfi0 tfi0Var) {
        this.f208602a = tfi0Var;
    }

    @Override // p204p.lyi0
    /* JADX INFO: renamed from: a */
    public final void mo60025a(pem0 pem0Var) {
        boolean z = pem0Var instanceof kem0;
        tfi0 tfi0Var = this.f208602a;
        if (z) {
            kem0 kem0Var = (kem0) pem0Var;
            if (kem0Var.f121917c == null) {
                pem0Var = kem0.m56228a(kem0Var, tfi0Var.mo2758g());
            }
        }
        xxi0 xxi0Var = tfi0Var.f219993V1;
        if (xxi0Var != null) {
            xxi0Var.m92337a(pem0Var);
        }
    }
}
