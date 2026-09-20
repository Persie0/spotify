package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleCache<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: f */
    public static final CacheDisposable[] f9823f = new CacheDisposable[0];

    /* JADX INFO: renamed from: g */
    public static final CacheDisposable[] f9824g = new CacheDisposable[0];

    /* JADX INFO: renamed from: a */
    public final Single f9825a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f9826b = new AtomicInteger();

    /* JADX INFO: renamed from: c */
    public final AtomicReference f9827c = new AtomicReference(f9823f);

    /* JADX INFO: renamed from: d */
    public Object f9828d;

    /* JADX INFO: renamed from: e */
    public Throwable f9829e;

    public static final class CacheDisposable<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f9830a;

        /* JADX INFO: renamed from: b */
        public final SingleCache f9831b;

        public CacheDisposable(SingleObserver singleObserver, SingleCache singleCache) {
            this.f9830a = singleObserver;
            this.f9831b = singleCache;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f9831b.m23703c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    public SingleCache(Single single) {
        this.f9825a = single;
    }

    /* JADX INFO: renamed from: c */
    public final void m23703c(CacheDisposable cacheDisposable) {
        AtomicReference atomicReference;
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        do {
            atomicReference = this.f9827c;
            cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            int length = cacheDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cacheDisposableArr[i] == cacheDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr2 = f9823f;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr2 = cacheDisposableArr3;
            }
        } while (!tfe.m80660r(atomicReference, cacheDisposableArr, cacheDisposableArr2));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f9829e = th;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f9827c.getAndSet(f9824g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f9830a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t) {
        this.f9828d = t;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f9827c.getAndSet(f9824g)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f9830a.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        AtomicReference atomicReference;
        CacheDisposable[] cacheDisposableArr;
        CacheDisposable[] cacheDisposableArr2;
        CacheDisposable cacheDisposable = new CacheDisposable(singleObserver, this);
        singleObserver.onSubscribe(cacheDisposable);
        do {
            atomicReference = this.f9827c;
            cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            if (cacheDisposableArr == f9824g) {
                Throwable th = this.f9829e;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.f9828d);
                    return;
                }
            }
            int length = cacheDisposableArr.length;
            cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
        } while (!tfe.m80660r(atomicReference, cacheDisposableArr, cacheDisposableArr2));
        if (cacheDisposable.isDisposed()) {
            m23703c(cacheDisposable);
        }
        if (this.f9826b.getAndIncrement() == 0) {
            this.f9825a.subscribe(this);
        }
    }
}
