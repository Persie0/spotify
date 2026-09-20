package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    @Override // java.util.concurrent.Callable
    public final Void call() {
        FutureTask futureTask = AbstractDirectTask.f10096d;
        this.f10100c = Thread.currentThread();
        try {
            try {
                this.f10098a.run();
                return null;
            } finally {
                lazySet(futureTask);
                this.f10100c = null;
            }
        } catch (Throwable th) {
            RxJavaPlugins.m23782b(th);
            throw th;
        }
    }
}
