package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final ArrayList f8244b;

    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f8245a;

        /* JADX INFO: renamed from: e */
        public final Iterator f8249e;

        /* JADX INFO: renamed from: f */
        public long f8250f;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f8246b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final SequentialDisposable f8248d = new SequentialDisposable();

        /* JADX INFO: renamed from: c */
        public final AtomicReference f8247c = new AtomicReference(NotificationLite.f10261a);

        public ConcatMaybeObserver(ft51 ft51Var, Iterator it) {
            this.f8245a = ft51Var;
            this.f8249e = it;
        }

        /* JADX INFO: renamed from: a */
        public final void m23569a() {
            Iterator it = this.f8249e;
            if (getAndIncrement() != 0) {
                return;
            }
            do {
                SequentialDisposable sequentialDisposable = this.f8248d;
                boolean zIsDisposed = sequentialDisposable.isDisposed();
                AtomicReference atomicReference = this.f8247c;
                if (zIsDisposed) {
                    atomicReference.lazySet(null);
                    return;
                }
                Object obj = atomicReference.get();
                if (obj != null) {
                    NotificationLite notificationLite = NotificationLite.f10261a;
                    ft51 ft51Var = this.f8245a;
                    if (obj != notificationLite) {
                        long j = this.f8250f;
                        if (j != this.f8246b.get()) {
                            this.f8250f = j + 1;
                            atomicReference.lazySet(null);
                            ft51Var.onNext(obj);
                        }
                    } else {
                        atomicReference.lazySet(null);
                    }
                    if (!sequentialDisposable.isDisposed()) {
                        try {
                            if (it.hasNext()) {
                                try {
                                    Object next = it.next();
                                    Objects.requireNonNull(next, "The source Iterator returned a null MaybeSource");
                                    ((MaybeSource) next).subscribe(this);
                                } catch (Throwable th) {
                                    Exceptions.m23404a(th);
                                    ft51Var.onError(th);
                                    return;
                                }
                            } else {
                                ft51Var.onComplete();
                            }
                        } catch (Throwable th2) {
                            Exceptions.m23404a(th2);
                            ft51Var.onError(th2);
                            return;
                        }
                    }
                }
            } while (decrementAndGet() != 0);
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8248d.dispose();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f8247c.lazySet(NotificationLite.f10261a);
            m23569a();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            this.f8245a.onError(th);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            SequentialDisposable sequentialDisposable = this.f8248d;
            sequentialDisposable.getClass();
            DisposableHelper.m23416c(sequentialDisposable, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            this.f8247c.lazySet(obj);
            m23569a();
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f8246b, j);
                m23569a();
            }
        }
    }

    public MaybeConcatIterable(ArrayList arrayList) {
        this.f8244b = arrayList;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        try {
            Iterator it = this.f8244b.iterator();
            Objects.requireNonNull(it, "The sources Iterable returned a null Iterator");
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(ft51Var, it);
            ft51Var.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.m23569a();
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        }
    }
}
