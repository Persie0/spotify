package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fv61 {
    /* JADX INFO: renamed from: a */
    public abstract void mo42760a(Runnable runnable);

    /* JADX INFO: renamed from: b */
    public final void m42761b(Runnable runnable) {
        if (mo42762c()) {
            runnable.run();
        } else {
            mo42763d(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo42762c();

    /* JADX INFO: renamed from: d */
    public abstract void mo42763d(Runnable runnable);
}
