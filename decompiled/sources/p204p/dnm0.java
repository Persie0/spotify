package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dnm0 implements e9w0 {

    /* JADX INFO: renamed from: a */
    public final ymm0 f50854a;

    /* JADX INFO: renamed from: b */
    public final hj5 f50855b = new hj5();

    /* JADX INFO: renamed from: c */
    public cnm0 f50856c;

    /* JADX INFO: renamed from: d */
    public boolean f50857d;

    public dnm0(ymm0 ymm0Var) {
        this.f50854a = ymm0Var;
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: b */
    public final void mo32122b() {
        if (this.f50857d) {
            return;
        }
        this.f50857d = true;
        cnm0 cnm0Var = this.f50856c;
        if (cnm0Var == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ymm0 ymm0Var = this.f50854a;
        if (ymm0Var.f274309c != this) {
            return;
        }
        ymm0Var.f274308b = cnm0Var;
        ymm0Var.f274309c = null;
        while (true) {
            hj5 hj5Var = this.f50855b;
            if (hj5Var.isEmpty()) {
                return;
            }
            lyi0 lyi0Var = ymm0Var.f274307a;
            pem0 pem0VarM56228a = (pem0) hj5Var.removeFirst();
            if (pem0VarM56228a instanceof kem0) {
                kem0 kem0Var = (kem0) pem0VarM56228a;
                if (kem0Var.f121917c == null) {
                    pem0VarM56228a = kem0.m56228a(kem0Var, cnm0Var.mo2758g());
                }
            }
            lyi0Var.mo60025a(pem0VarM56228a);
        }
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: d */
    public final void mo32124d() {
        ymm0 ymm0Var = this.f50854a;
        if (ymm0Var.f274309c != this) {
            return;
        }
        ymm0Var.f274309c = null;
        this.f50855b.clear();
    }

    @Override // p204p.e9w0
    /* JADX INFO: renamed from: g */
    public final void mo32127g() {
        ymm0 ymm0Var = this.f50854a;
        if (ymm0Var.f274309c != this) {
            return;
        }
        ymm0Var.f274309c = null;
        this.f50855b.clear();
    }
}
