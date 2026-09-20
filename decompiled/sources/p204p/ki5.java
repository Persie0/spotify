package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ki5 extends fv61 {

    /* JADX INFO: renamed from: b */
    public static volatile ki5 f122816b;

    /* JADX INFO: renamed from: c */
    public static final ekr f122817c = new ekr(4);

    /* JADX INFO: renamed from: a */
    public fv61 f122818a;

    /* JADX INFO: renamed from: e */
    public static ki5 m56473e() {
        if (f122816b != null) {
            return f122816b;
        }
        synchronized (ki5.class) {
            try {
                if (f122816b == null) {
                    ki5 ki5Var = new ki5();
                    ki5Var.f122818a = new pbq();
                    f122816b = ki5Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f122816b;
    }

    @Override // p204p.fv61
    /* JADX INFO: renamed from: a */
    public final void mo42760a(Runnable runnable) {
        this.f122818a.mo42760a(runnable);
    }

    @Override // p204p.fv61
    /* JADX INFO: renamed from: c */
    public final boolean mo42762c() {
        return this.f122818a.mo42762c();
    }

    @Override // p204p.fv61
    /* JADX INFO: renamed from: d */
    public final void mo42763d(Runnable runnable) {
        this.f122818a.mo42763d(runnable);
    }
}
