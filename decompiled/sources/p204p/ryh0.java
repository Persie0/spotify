package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ryh0 extends AbstractC1694b7.i implements Runnable {

    /* JADX INFO: renamed from: e */
    public final Runnable f203922e;

    public ryh0(Runnable runnable) {
        runnable.getClass();
        this.f203922e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f203922e.run();
        } catch (Throwable th) {
            m28331v(th);
            throw th;
        }
    }

    @Override // p204p.AbstractC1694b7
    /* JADX INFO: renamed from: s */
    public final String mo28328s() {
        return "task=[" + this.f203922e + "]";
    }
}
