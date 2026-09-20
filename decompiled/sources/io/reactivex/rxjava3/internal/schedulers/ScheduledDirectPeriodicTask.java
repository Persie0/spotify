package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledDirectPeriodicTask extends AbstractDirectTask implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        this.f10100c = Thread.currentThread();
        try {
            this.f10098a.run();
            this.f10100c = null;
        } catch (Throwable th) {
            dispose();
            this.f10100c = null;
            RxJavaPlugins.m23782b(th);
            throw th;
        }
    }
}
