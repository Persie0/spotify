package io.reactivex.rxjava3.observers;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.VolatileSizeArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public class TestObserver<T> extends BaseTestConsumer<T, TestObserver<T>> implements Observer<T>, Disposable, MaybeObserver<T>, SingleObserver<T>, CompletableObserver {

    /* JADX INFO: renamed from: f */
    public final AtomicReference f10288f = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final Observer f10287e = EmptyObserver.f10289a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EmptyObserver implements Observer<Object> {

        /* JADX INFO: renamed from: a */
        public static final EmptyObserver f10289a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ EmptyObserver[] f10290b;

        static {
            EmptyObserver emptyObserver = new EmptyObserver("INSTANCE", 0);
            f10289a = emptyObserver;
            f10290b = new EmptyObserver[]{emptyObserver};
        }

        public static EmptyObserver valueOf(String str) {
            return (EmptyObserver) Enum.valueOf(EmptyObserver.class, str);
        }

        public static EmptyObserver[] values() {
            return (EmptyObserver[]) f10290b.clone();
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th) {
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
        }

        @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        DisposableHelper.m23414a(this.f10288f);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return DisposableHelper.m23415b((Disposable) this.f10288f.get());
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onComplete() {
        CountDownLatch countDownLatch = this.f10273a;
        if (!this.f10276d) {
            this.f10276d = true;
            if (this.f10288f.get() == null) {
                this.f10275c.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            this.f10287e.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onError(Throwable th) {
        CountDownLatch countDownLatch = this.f10273a;
        boolean z = this.f10276d;
        VolatileSizeArrayList volatileSizeArrayList = this.f10275c;
        if (!z) {
            this.f10276d = true;
            if (this.f10288f.get() == null) {
                volatileSizeArrayList.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        try {
            Thread.currentThread();
            if (th == null) {
                volatileSizeArrayList.add(new NullPointerException("onError received a null Throwable"));
            } else {
                volatileSizeArrayList.add(th);
            }
            this.f10287e.getClass();
        } finally {
            countDownLatch.countDown();
        }
    }

    @Override // io.reactivex.rxjava3.core.Observer
    public final void onNext(Object obj) {
        boolean z = this.f10276d;
        VolatileSizeArrayList volatileSizeArrayList = this.f10275c;
        if (!z) {
            this.f10276d = true;
            if (this.f10288f.get() == null) {
                volatileSizeArrayList.add(new IllegalStateException("onSubscribe not called in proper order"));
            }
        }
        Thread.currentThread();
        this.f10274b.add(obj);
        if (obj == null) {
            volatileSizeArrayList.add(new NullPointerException("onNext received a null value"));
        }
        this.f10287e.getClass();
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        AtomicReference atomicReference;
        Thread.currentThread();
        VolatileSizeArrayList volatileSizeArrayList = this.f10275c;
        if (disposable == null) {
            volatileSizeArrayList.add(new NullPointerException("onSubscribe received a null Subscription"));
            return;
        }
        do {
            atomicReference = this.f10288f;
            if (atomicReference.compareAndSet(null, disposable)) {
                this.f10287e.getClass();
                return;
            }
        } while (atomicReference.get() == null);
        disposable.dispose();
        if (atomicReference.get() != DisposableHelper.f7218a) {
            volatileSizeArrayList.add(new IllegalStateException("onSubscribe received multiple subscriptions: " + disposable));
        }
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
        onNext(obj);
        onComplete();
    }
}
