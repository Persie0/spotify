package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xkg1 extends uqe1 {
    @Override // p204p.uqe1
    /* JADX INFO: renamed from: q */
    public final void mo82900q(ung1 ung1Var, ung1 ung1Var2) {
        ung1Var.f232171b = ung1Var2;
    }

    @Override // p204p.uqe1
    /* JADX INFO: renamed from: r */
    public final void mo82901r(ung1 ung1Var, Thread thread) {
        ung1Var.f232170a = thread;
    }

    @Override // p204p.uqe1
    /* JADX INFO: renamed from: s */
    public final boolean mo82902s(prg1 prg1Var, c8g1 c8g1Var, c8g1 c8g1Var2) {
        synchronized (prg1Var) {
            try {
                if (prg1Var.f180605b != c8g1Var) {
                    return false;
                }
                prg1Var.f180605b = c8g1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.uqe1
    /* JADX INFO: renamed from: t */
    public final boolean mo82903t(prg1 prg1Var, Object obj, Object obj2) {
        synchronized (prg1Var) {
            try {
                if (prg1Var.f180604a != obj) {
                    return false;
                }
                prg1Var.f180604a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p204p.uqe1
    /* JADX INFO: renamed from: u */
    public final boolean mo82904u(prg1 prg1Var, ung1 ung1Var, ung1 ung1Var2) {
        synchronized (prg1Var) {
            try {
                if (prg1Var.f180606c != ung1Var) {
                    return false;
                }
                prg1Var.f180606c = ung1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
