package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ymm0 implements lyi0 {

    /* JADX INFO: renamed from: a */
    public final lyi0 f274307a;

    /* JADX INFO: renamed from: b */
    public cnm0 f274308b;

    /* JADX INFO: renamed from: c */
    public dnm0 f274309c;

    public ymm0(lyi0 lyi0Var) {
        this.f274307a = lyi0Var;
    }

    @Override // p204p.lyi0
    /* JADX INFO: renamed from: a */
    public final void mo60025a(pem0 pem0Var) {
        dnm0 dnm0Var = this.f274309c;
        if (dnm0Var != null) {
            dnm0Var.f50855b.addLast(pem0Var);
            return;
        }
        cnm0 cnm0Var = this.f274308b;
        if (pem0Var instanceof kem0) {
            kem0 kem0Var = (kem0) pem0Var;
            if (kem0Var.f121917c == null && cnm0Var != null) {
                pem0Var = kem0.m56228a(kem0Var, cnm0Var.mo2758g());
            }
        }
        this.f274307a.mo60025a(pem0Var);
    }
}
