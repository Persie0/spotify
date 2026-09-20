package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class SingleSubject<T> extends Single<T> implements SingleObserver<T> {

    /* JADX INFO: renamed from: e */
    public static final SingleDisposable[] f10430e = new SingleDisposable[0];

    /* JADX INFO: renamed from: f */
    public static final SingleDisposable[] f10431f = new SingleDisposable[0];

    /* JADX INFO: renamed from: c */
    public Object f10434c;

    /* JADX INFO: renamed from: d */
    public Throwable f10435d;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f10433b = new AtomicBoolean();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10432a = new AtomicReference(f10430e);

    public static final class SingleDisposable<T> extends AtomicReference<SingleSubject<T>> implements Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10436a;

        public SingleDisposable(SingleObserver singleObserver, SingleSubject singleSubject) {
            this.f10436a = singleObserver;
            lazySet(singleSubject);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            SingleSubject<T> andSet = getAndSet(null);
            if (andSet != null) {
                andSet.m23810c(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m23810c(SingleDisposable singleDisposable) {
        AtomicReference atomicReference;
        SingleDisposable[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        do {
            atomicReference = this.f10432a;
            singleDisposableArr = (SingleDisposable[]) atomicReference.get();
            int length = singleDisposableArr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (singleDisposableArr[i] == singleDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                singleDisposableArr2 = f10430e;
            } else {
                SingleDisposable[] singleDisposableArr3 = new SingleDisposable[length - 1];
                System.arraycopy(singleDisposableArr, 0, singleDisposableArr3, 0, i);
                System.arraycopy(singleDisposableArr, i + 1, singleDisposableArr3, i, (length - i) - 1);
                singleDisposableArr2 = singleDisposableArr3;
            }
        } while (!tfe.m80660r(atomicReference, singleDisposableArr, singleDisposableArr2));
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (!this.f10433b.compareAndSet(false, true)) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10435d = th;
        for (SingleDisposable singleDisposable : (SingleDisposable[]) this.f10432a.getAndSet(f10431f)) {
            singleDisposable.f10436a.onError(th);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.f10432a.get() == f10431f) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleObserver
    public void onSuccess(T t) {
        ExceptionHelper.m23751c(t, "onSuccess called with a null value.");
        if (this.f10433b.compareAndSet(false, true)) {
            this.f10434c = t;
            for (SingleDisposable singleDisposable : (SingleDisposable[]) this.f10432a.getAndSet(f10431f)) {
                singleDisposable.f10436a.onSuccess(t);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        AtomicReference atomicReference;
        SingleDisposable[] singleDisposableArr;
        SingleDisposable[] singleDisposableArr2;
        SingleDisposable singleDisposable = new SingleDisposable(singleObserver, this);
        singleObserver.onSubscribe(singleDisposable);
        do {
            atomicReference = this.f10432a;
            singleDisposableArr = (SingleDisposable[]) atomicReference.get();
            if (singleDisposableArr == f10431f) {
                Throwable th = this.f10435d;
                if (th != null) {
                    singleObserver.onError(th);
                    return;
                } else {
                    singleObserver.onSuccess(this.f10434c);
                    return;
                }
            }
            int length = singleDisposableArr.length;
            singleDisposableArr2 = new SingleDisposable[length + 1];
            System.arraycopy(singleDisposableArr, 0, singleDisposableArr2, 0, length);
            singleDisposableArr2[length] = singleDisposable;
        } while (!tfe.m80660r(atomicReference, singleDisposableArr, singleDisposableArr2));
        if (singleDisposable.isDisposed()) {
            m23810c(singleDisposable);
        }
    }
}
