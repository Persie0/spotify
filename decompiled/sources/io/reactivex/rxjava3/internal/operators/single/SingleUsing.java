package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleUsing<T, U> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Supplier f10073a;

    /* JADX INFO: renamed from: b */
    public final Function f10074b;

    /* JADX INFO: renamed from: c */
    public final Consumer f10075c;

    /* JADX INFO: renamed from: d */
    public final boolean f10076d;

    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10077a;

        /* JADX INFO: renamed from: b */
        public final Consumer f10078b;

        /* JADX INFO: renamed from: c */
        public final boolean f10079c;

        /* JADX INFO: renamed from: d */
        public Disposable f10080d;

        public UsingSingleObserver(SingleObserver singleObserver, Object obj, boolean z, Consumer consumer) {
            super(obj);
            this.f10077a = singleObserver;
            this.f10079c = z;
            this.f10078b = consumer;
        }

        /* JADX INFO: renamed from: a */
        public final void m23711a() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.f10078b.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    RxJavaPlugins.m23782b(th);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            boolean z = this.f10079c;
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (z) {
                m23711a();
                this.f10080d.dispose();
                this.f10080d = disposableHelper;
            } else {
                this.f10080d.dispose();
                this.f10080d = disposableHelper;
                m23711a();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f10080d.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f10080d = DisposableHelper.f7218a;
            boolean z = this.f10079c;
            if (z) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f10078b.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.f10077a.onError(th);
            if (z) {
                return;
            }
            m23711a();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.m23419h(this.f10080d, disposable)) {
                this.f10080d = disposable;
                this.f10077a.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f10080d = DisposableHelper.f7218a;
            SingleObserver singleObserver = this.f10077a;
            boolean z = this.f10079c;
            if (z) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.f10078b.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.m23404a(th);
                    singleObserver.onError(th);
                    return;
                }
            }
            singleObserver.onSuccess(obj);
            if (z) {
                return;
            }
            m23711a();
        }
    }

    public SingleUsing(Supplier supplier, Function function, Consumer consumer, boolean z) {
        this.f10073a = supplier;
        this.f10074b = function;
        this.f10075c = consumer;
        this.f10076d = z;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        Consumer consumer = this.f10075c;
        boolean z = this.f10076d;
        try {
            Object obj = this.f10073a.get();
            try {
                Object objMo98394apply = this.f10074b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The singleFunction returned a null SingleSource");
                ((SingleSource) objMo98394apply).subscribe(new UsingSingleObserver(singleObserver, obj, z, consumer));
            } catch (Throwable th) {
                th = th;
                Exceptions.m23404a(th);
                if (z) {
                    try {
                        consumer.accept(obj);
                    } catch (Throwable th2) {
                        Exceptions.m23404a(th2);
                        th = new CompositeException(th, th2);
                    }
                }
                EmptyDisposable.m23422f(th, singleObserver);
                if (z) {
                    return;
                }
                try {
                    consumer.accept(obj);
                } catch (Throwable th3) {
                    Exceptions.m23404a(th3);
                    RxJavaPlugins.m23782b(th3);
                }
            }
        } catch (Throwable th4) {
            Exceptions.m23404a(th4);
            EmptyDisposable.m23422f(th4, singleObserver);
        }
    }
}
