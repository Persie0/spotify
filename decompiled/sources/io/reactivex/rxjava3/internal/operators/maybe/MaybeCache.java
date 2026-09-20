package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeCache<T> extends Maybe<T> implements MaybeObserver<T> {

    /* JADX INFO: renamed from: e */
    public static final CacheDisposable[] f8234e = new CacheDisposable[0];

    /* JADX INFO: renamed from: f */
    public static final CacheDisposable[] f8235f = new CacheDisposable[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f8236a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f8237b = new AtomicReference(f8234e);

    /* JADX INFO: renamed from: c */
    public Object f8238c;

    /* JADX INFO: renamed from: d */
    public Throwable f8239d;

    public static final class CacheDisposable<T> extends AtomicReference<MaybeCache<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final MaybeObserver f8240a;

        public CacheDisposable(MaybeObserver maybeObserver, MaybeCache maybeCache) {
            super(maybeCache);
            this.f8240a = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            MaybeCache<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m23568q(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }

    public MaybeCache(MaybeOnErrorComplete maybeOnErrorComplete) {
        this.f8236a = new AtomicReference(maybeOnErrorComplete);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Maybe
    /* JADX INFO: renamed from: j */
    public final void mo23372j(MaybeObserver maybeObserver) {
        CacheDisposable cacheDisposable = new CacheDisposable(maybeObserver, this);
        maybeObserver.onSubscribe(cacheDisposable);
        while (true) {
            AtomicReference atomicReference = this.f8237b;
            CacheDisposable[] cacheDisposableArr = (CacheDisposable[]) atomicReference.get();
            if (cacheDisposableArr == f8235f) {
                if (cacheDisposable.isDisposed()) {
                    return;
                }
                Throwable th = this.f8239d;
                if (th != null) {
                    maybeObserver.onError(th);
                    return;
                }
                Object obj = this.f8238c;
                if (obj != null) {
                    maybeObserver.onSuccess(obj);
                    return;
                } else {
                    maybeObserver.onComplete();
                    return;
                }
            }
            int length = cacheDisposableArr.length;
            CacheDisposable[] cacheDisposableArr2 = new CacheDisposable[length + 1];
            System.arraycopy(cacheDisposableArr, 0, cacheDisposableArr2, 0, length);
            cacheDisposableArr2[length] = cacheDisposable;
            do {
                if (atomicReference.compareAndSet(cacheDisposableArr, cacheDisposableArr2)) {
                    if (cacheDisposable.isDisposed()) {
                        m23568q(cacheDisposable);
                        return;
                    }
                    MaybeSource maybeSource = (MaybeSource) this.f8236a.getAndSet(null);
                    if (maybeSource != null) {
                        maybeSource.subscribe(this);
                        return;
                    }
                    return;
                }
            } while (atomicReference.get() == cacheDisposableArr);
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f8237b.getAndSet(f8235f)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f8240a.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        this.f8239d = th;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f8237b.getAndSet(f8235f)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f8240a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        this.f8238c = obj;
        for (CacheDisposable cacheDisposable : (CacheDisposable[]) this.f8237b.getAndSet(f8235f)) {
            if (!cacheDisposable.isDisposed()) {
                cacheDisposable.f8240a.onSuccess(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m23568q(CacheDisposable cacheDisposable) {
        CacheDisposable[] cacheDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f8237b;
            CacheDisposable[] cacheDisposableArr2 = (CacheDisposable[]) atomicReference.get();
            int length = cacheDisposableArr2.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (cacheDisposableArr2[i] == cacheDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                cacheDisposableArr = f8234e;
            } else {
                CacheDisposable[] cacheDisposableArr3 = new CacheDisposable[length - 1];
                System.arraycopy(cacheDisposableArr2, 0, cacheDisposableArr3, 0, i);
                System.arraycopy(cacheDisposableArr2, i + 1, cacheDisposableArr3, i, (length - i) - 1);
                cacheDisposableArr = cacheDisposableArr3;
            }
            while (!atomicReference.compareAndSet(cacheDisposableArr2, cacheDisposableArr)) {
                if (atomicReference.get() != cacheDisposableArr2) {
                }
            }
            return;
        }
    }
}
