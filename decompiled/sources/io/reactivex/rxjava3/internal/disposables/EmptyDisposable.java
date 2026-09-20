package io.reactivex.rxjava3.internal.disposables;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.operators.QueueDisposable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class EmptyDisposable implements QueueDisposable<Object> {

    /* JADX INFO: renamed from: a */
    public static final EmptyDisposable f7220a;

    /* JADX INFO: renamed from: b */
    public static final EmptyDisposable f7221b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ EmptyDisposable[] f7222c;

    static {
        EmptyDisposable emptyDisposable = new EmptyDisposable("INSTANCE", 0);
        f7220a = emptyDisposable;
        EmptyDisposable emptyDisposable2 = new EmptyDisposable("NEVER", 1);
        f7221b = emptyDisposable2;
        f7222c = new EmptyDisposable[]{emptyDisposable, emptyDisposable2};
    }

    /* JADX INFO: renamed from: b */
    public static void m23420b(Observer observer) {
        observer.onSubscribe(f7220a);
        observer.onComplete();
    }

    /* JADX INFO: renamed from: c */
    public static void m23421c(Throwable th, Observer observer) {
        observer.onSubscribe(f7220a);
        observer.onError(th);
    }

    /* JADX INFO: renamed from: f */
    public static void m23422f(Throwable th, SingleObserver singleObserver) {
        singleObserver.onSubscribe(f7220a);
        singleObserver.onError(th);
    }

    public static EmptyDisposable valueOf(String str) {
        return (EmptyDisposable) Enum.valueOf(EmptyDisposable.class, str);
    }

    public static EmptyDisposable[] values() {
        return (EmptyDisposable[]) f7222c.clone();
    }

    @Override // io.reactivex.rxjava3.operators.QueueFuseable
    /* JADX INFO: renamed from: a */
    public final int mo23423a(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this == f7220a;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        return null;
    }
}
