package p204p;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r2h1 implements dsf1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f195146a;

    /* JADX INFO: renamed from: b */
    public final n0h1 f195147b = new n0h1(this);

    public r2h1(rtg1 rtg1Var) {
        this.f195146a = new WeakReference(rtg1Var);
    }

    @Override // p204p.dsf1
    /* JADX INFO: renamed from: b */
    public final void mo36769b(Runnable runnable, Executor executor) {
        this.f195147b.mo36769b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        rtg1 rtg1Var = (rtg1) this.f195146a.get();
        boolean zCancel = this.f195147b.cancel(z);
        if (!zCancel || rtg1Var == null) {
            return zCancel;
        }
        rtg1Var.f202582a = null;
        rtg1Var.f202583b = null;
        rtg1Var.f202584c.m55597i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f195147b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f195147b.f180604a instanceof ewf1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f195147b.isDone();
    }

    public final String toString() {
        return this.f195147b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f195147b.get(j, timeUnit);
    }
}
