package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p204p.klh;
import p204p.s571;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {

    /* JADX INFO: renamed from: b */
    public static final Object f10169b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f10170c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f10171d = new Object();

    /* JADX INFO: renamed from: e */
    public static final Object f10172e = new Object();

    /* JADX INFO: renamed from: a */
    public final Runnable f10173a;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.f10173a = runnable;
        lazySet(0, disposableContainer);
    }

    /* JADX INFO: renamed from: a */
    public final void m23717a(Future future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f10172e) {
                return;
            }
            if (obj == f10170c) {
                future.cancel(false);
                return;
            } else if (obj == f10171d) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        while (true) {
            Object obj6 = get(1);
            obj = f10172e;
            if (obj6 == obj || obj6 == (obj4 = f10170c) || obj6 == (obj5 = f10171d)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj4 = obj5;
            }
            if (compareAndSet(1, obj6, obj4)) {
                if (obj6 == null) {
                    break;
                }
                ((Future) obj6).cancel(z);
                break;
            }
        }
        do {
            obj2 = get(0);
            if (obj2 == obj || obj2 == (obj3 = f10169b) || obj2 == null) {
                return;
            }
        } while (!compareAndSet(0, obj2, obj3));
        ((DisposableContainer) obj2).mo23394c(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        Object obj = get(0);
        return obj == f10169b || obj == f10172e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        Object obj3 = f10171d;
        Object obj4 = f10170c;
        Object obj5 = f10169b;
        Object obj6 = f10172e;
        lazySet(2, Thread.currentThread());
        try {
            this.f10173a.run();
            Object obj7 = get(0);
            if (obj7 != obj5 && compareAndSet(0, obj7, obj6) && obj7 != null) {
                ((DisposableContainer) obj7).mo23394c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == obj4 || obj2 == obj3) {
                    break;
                }
            } while (!compareAndSet(1, obj2, obj6));
            lazySet(2, null);
        } catch (Throwable th) {
            try {
                RxJavaPlugins.m23782b(th);
                throw th;
            } catch (Throwable th2) {
                Object obj8 = get(0);
                if (obj8 != obj5 && compareAndSet(0, obj8, obj6) && obj8 != null) {
                    ((DisposableContainer) obj8).mo23394c(this);
                }
                do {
                    obj = get(1);
                    if (obj == obj4 || obj == obj3) {
                        break;
                    }
                } while (!compareAndSet(1, obj, obj6));
                lazySet(2, null);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReferenceArray
    public final String toString() {
        String strM56833e;
        Object obj = get(1);
        if (obj == f10172e) {
            strM56833e = "Finished";
        } else if (obj == f10170c) {
            strM56833e = "Disposed(Sync)";
        } else if (obj == f10171d) {
            strM56833e = "Disposed(Async)";
        } else {
            Object obj2 = get(2);
            strM56833e = obj2 == null ? "Waiting" : klh.m56833e(obj2, "Running on ");
        }
        return s571.m77251j("ScheduledRunnable[", strM56833e, "]");
    }
}
