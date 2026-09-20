package io.reactivex.rxjava3.subjects;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class PublishSubject<T> extends Subject<T> {

    /* JADX INFO: renamed from: c */
    public static final PublishDisposable[] f10401c = new PublishDisposable[0];

    /* JADX INFO: renamed from: d */
    public static final PublishDisposable[] f10402d = new PublishDisposable[0];

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10403a = new AtomicReference(f10402d);

    /* JADX INFO: renamed from: b */
    public Throwable f10404b;

    public static final class PublishDisposable<T> extends AtomicBoolean implements Disposable {

        /* JADX INFO: renamed from: a */
        public final Observer f10405a;

        /* JADX INFO: renamed from: b */
        public final PublishSubject f10406b;

        public PublishDisposable(Observer observer, PublishSubject publishSubject) {
            this.f10405a = observer;
            this.f10406b = publishSubject;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f10406b.m23803f(this);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get();
        }
    }

    @Override // io.reactivex.rxjava3.subjects.Subject
    /* JADX INFO: renamed from: a */
    public final boolean mo23797a() {
        return ((PublishDisposable[]) this.f10403a.get()).length != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m23803f(PublishDisposable publishDisposable) {
        PublishDisposable[] publishDisposableArr;
        while (true) {
            AtomicReference atomicReference = this.f10403a;
            PublishDisposable[] publishDisposableArr2 = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr2 == f10401c || publishDisposableArr2 == (publishDisposableArr = f10402d)) {
                return;
            }
            int length = publishDisposableArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishDisposableArr2[i] == publishDisposable) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishDisposableArr = new PublishDisposable[length - 1];
                System.arraycopy(publishDisposableArr2, 0, publishDisposableArr, 0, i);
                System.arraycopy(publishDisposableArr2, i + 1, publishDisposableArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(publishDisposableArr2, publishDisposableArr)) {
                if (atomicReference.get() != publishDisposableArr2) {
                }
            }
            return;
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        AtomicReference atomicReference = this.f10403a;
        Object obj = atomicReference.get();
        Object obj2 = f10401c;
        if (obj == obj2) {
            return;
        }
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (!publishDisposable.get()) {
                publishDisposable.f10405a.onComplete();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.f10403a;
        Object obj = atomicReference.get();
        Object obj2 = f10401c;
        if (obj == obj2) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10404b = th;
        PublishDisposable[] publishDisposableArr = (PublishDisposable[]) atomicReference.getAndSet(obj2);
        for (PublishDisposable publishDisposable : publishDisposableArr) {
            if (publishDisposable.get()) {
                RxJavaPlugins.m23782b(th);
            } else {
                publishDisposable.f10405a.onError(th);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        for (PublishDisposable publishDisposable : (PublishDisposable[]) this.f10403a.get()) {
            if (!publishDisposable.get()) {
                publishDisposable.f10405a.onNext(obj);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        if (this.f10403a.get() == f10401c) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        AtomicReference atomicReference;
        PublishDisposable[] publishDisposableArr;
        PublishDisposable[] publishDisposableArr2;
        PublishDisposable publishDisposable = new PublishDisposable(observer, this);
        observer.onSubscribe(publishDisposable);
        do {
            atomicReference = this.f10403a;
            publishDisposableArr = (PublishDisposable[]) atomicReference.get();
            if (publishDisposableArr == f10401c) {
                Throwable th = this.f10404b;
                if (th != null) {
                    observer.onError(th);
                    return;
                } else {
                    observer.onComplete();
                    return;
                }
            }
            int length = publishDisposableArr.length;
            publishDisposableArr2 = new PublishDisposable[length + 1];
            System.arraycopy(publishDisposableArr, 0, publishDisposableArr2, 0, length);
            publishDisposableArr2[length] = publishDisposable;
        } while (!tfe.m80660r(atomicReference, publishDisposableArr, publishDisposableArr2));
        if (publishDisposable.isDisposed()) {
            m23803f(publishDisposable);
        }
    }
}
