package p204p;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jbb implements u790 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f110726a;

    /* JADX INFO: renamed from: b */
    public final ibb f110727b = new ibb(this);

    public jbb(gbb gbbVar) {
        this.f110726a = new WeakReference(gbbVar);
    }

    @Override // p204p.u790
    /* JADX INFO: renamed from: a */
    public final void mo28322a(Runnable runnable, Executor executor) {
        this.f110727b.mo28322a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        gbb gbbVar = (gbb) this.f110726a.get();
        boolean zCancel = this.f110727b.cancel(z);
        if (zCancel && gbbVar != null) {
            gbbVar.f78253a = null;
            gbbVar.f78254b = null;
            gbbVar.f78255c.m63868l(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f110727b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f110727b.f151670a instanceof C1852f9;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f110727b.isDone();
    }

    public final String toString() {
        return this.f110727b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f110727b.get(j, timeUnit);
    }
}
