package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.Observer;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HalfSerializer {
    /* JADX INFO: renamed from: a */
    public static void m23755a(Observer observer, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.m23740d(observer);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m23756b(Observer observer, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.m23737a(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.m23740d(observer);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23757c(Observer observer, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            observer.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.m23740d(observer);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m23758d(ft51 ft51Var, Object obj, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            ft51Var.onNext(obj);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            atomicThrowable.m23741e(ft51Var);
        }
        return false;
    }
}
