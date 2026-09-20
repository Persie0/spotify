package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractDirectTask extends AtomicReference<Future<?>> implements Disposable {

    /* JADX INFO: renamed from: d */
    public static final FutureTask f10096d;

    /* JADX INFO: renamed from: e */
    public static final FutureTask f10097e;

    /* JADX INFO: renamed from: a */
    public final Runnable f10098a;

    /* JADX INFO: renamed from: b */
    public final boolean f10099b;

    /* JADX INFO: renamed from: c */
    public Thread f10100c;

    static {
        Runnable runnable = Functions.f7226b;
        f10096d = new FutureTask(runnable, null);
        f10097e = new FutureTask(runnable, null);
    }

    public AbstractDirectTask(Runnable runnable, boolean z) {
        this.f10098a = runnable;
        this.f10099b = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m23713a(Future future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f10096d) {
                return;
            }
            if (future2 == f10097e) {
                if (this.f10100c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.f10099b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future<?> future = get();
        if (future == f10096d || future == (futureTask = f10097e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.f10100c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f10099b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f10096d || future == f10097e;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        String str;
        Future<?> future = get();
        if (future == f10096d) {
            str = "Finished";
        } else if (future == f10097e) {
            str = "Disposed";
        } else if (this.f10100c != null) {
            str = "Running on " + this.f10100c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
