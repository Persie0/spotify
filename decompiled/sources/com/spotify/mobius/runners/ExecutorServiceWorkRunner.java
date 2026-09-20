package com.spotify.mobius.runners;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p204p.bsa0;
import p204p.xra0;

/* JADX INFO: loaded from: classes2.dex */
public class ExecutorServiceWorkRunner implements WorkRunner {

    /* JADX INFO: renamed from: c */
    public static final xra0 f5767c = bsa0.m30425b(ExecutorServiceWorkRunner.class);

    /* JADX INFO: renamed from: a */
    public final ExecutorService f5768a;

    /* JADX INFO: renamed from: b */
    public final ReentrantLock f5769b = new ReentrantLock();

    public ExecutorServiceWorkRunner(ExecutorService executorService) {
        this.f5768a = executorService;
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        ExecutorService executorService = this.f5768a;
        xra0 xra0Var = f5767c;
        ReentrantLock reentrantLock = this.f5769b;
        try {
            reentrantLock.lock();
            try {
                List<Runnable> listShutdownNow = executorService.shutdownNow();
                if (!listShutdownNow.isEmpty()) {
                    xra0Var.mo27142m(Integer.valueOf(listShutdownNow.size()), "Disposing ExecutorServiceWorkRunner with {} outstanding tasks.");
                }
                reentrantLock.unlock();
                if (executorService.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                    return;
                }
                xra0Var.mo27134e("ExecutorService shutdown timed out; there are still tasks executing");
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (InterruptedException e) {
            xra0Var.mo27136g(e, "Timeout when disposing work runner");
        }
    }

    @Override // com.spotify.mobius.runners.WorkRunner
    public final void post(Runnable runnable) {
        ExecutorService executorService = this.f5768a;
        ReentrantLock reentrantLock = this.f5769b;
        reentrantLock.lock();
        try {
            if (!executorService.isTerminated() && !executorService.isShutdown()) {
                executorService.submit(runnable);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
