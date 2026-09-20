package p204p;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes4.dex */
public final class vrf1 implements dsf1 {

    /* JADX INFO: renamed from: b */
    public static final zrf1 f244204b = new zrf1(vrf1.class);

    /* JADX INFO: renamed from: a */
    public final Object f244205a;

    public vrf1(Object obj) {
        this.f244205a = obj;
    }

    @Override // p204p.dsf1
    /* JADX INFO: renamed from: b */
    public final void mo36769b(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f244204b.m96765a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", edb.m38566o("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f244205a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return s571.m77252k(super.toString(), "[status=SUCCESS, result=[", this.f244205a.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f244205a;
    }
}
