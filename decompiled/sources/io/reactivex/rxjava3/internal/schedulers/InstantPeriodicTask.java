package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
final class InstantPeriodicTask implements Callable<Void>, Disposable {

    /* JADX INFO: renamed from: f */
    public static final FutureTask f10137f = new FutureTask(Functions.f7226b, null);

    /* JADX INFO: renamed from: a */
    public final Runnable f10138a;

    /* JADX INFO: renamed from: d */
    public final ExecutorService f10141d;

    /* JADX INFO: renamed from: e */
    public Thread f10142e;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f10140c = new AtomicReference();

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10139b = new AtomicReference();

    public InstantPeriodicTask(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f10138a = runnable;
        this.f10141d = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m23715a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f10140c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f10137f) {
                future.cancel(this.f10142e != Thread.currentThread());
                return;
            } else {
                while (!atomicReference.compareAndSet(future2, future)) {
                    if (atomicReference.get() != future2) {
                    }
                }
                return;
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Void call() {
        this.f10142e = Thread.currentThread();
        try {
            this.f10138a.run();
            this.f10142e = null;
            Future futureSubmit = this.f10141d.submit(this);
            AtomicReference atomicReference = this.f10139b;
            loop0: while (true) {
                Future future = (Future) atomicReference.get();
                if (future != f10137f) {
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.f10142e != Thread.currentThread());
                break;
            }
            return null;
        } catch (Throwable th) {
            this.f10142e = null;
            RxJavaPlugins.m23782b(th);
            throw th;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        AtomicReference atomicReference = this.f10140c;
        FutureTask futureTask = f10137f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.f10142e != Thread.currentThread());
        }
        Future future2 = (Future) this.f10139b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.f10142e != Thread.currentThread());
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f10140c.get() == f10137f;
    }
}
