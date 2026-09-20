package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class SingleTakeUntil<T, U> extends Single<T> {

    /* JADX INFO: renamed from: a */
    public final Single f10034a;

    /* JADX INFO: renamed from: b */
    public final i7t0 f10035b;

    public static final class TakeUntilMainObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final SingleObserver f10036a;

        /* JADX INFO: renamed from: b */
        public final TakeUntilOtherSubscriber f10037b = new TakeUntilOtherSubscriber(this);

        public TakeUntilMainObserver(SingleObserver singleObserver) {
            this.f10036a = singleObserver;
        }

        /* JADX INFO: renamed from: a */
        public final void m23708a(Throwable th) {
            Disposable andSet;
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || (andSet = getAndSet(disposableHelper)) == disposableHelper) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            if (andSet != null) {
                andSet.dispose();
            }
            this.f10036a.onError(th);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f10037b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m23728a(takeUntilOtherSubscriber);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.m23415b(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onError(Throwable th) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f10037b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m23728a(takeUntilOtherSubscriber);
            Disposable disposable = get();
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (disposable == disposableHelper || getAndSet(disposableHelper) == disposableHelper) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f10036a.onError(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.m23418g(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            TakeUntilOtherSubscriber takeUntilOtherSubscriber = this.f10037b;
            takeUntilOtherSubscriber.getClass();
            SubscriptionHelper.m23728a(takeUntilOtherSubscriber);
            DisposableHelper disposableHelper = DisposableHelper.f7218a;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f10036a.onSuccess(obj);
            }
        }
    }

    public static final class TakeUntilOtherSubscriber extends AtomicReference<ot51> implements FlowableSubscriber<Object> {

        /* JADX INFO: renamed from: a */
        public final TakeUntilMainObserver f10038a;

        public TakeUntilOtherSubscriber(TakeUntilMainObserver takeUntilMainObserver) {
            this.f10038a = takeUntilMainObserver;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            ot51 ot51Var = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.f10243a;
            if (ot51Var != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.f10038a.m23708a(new CancellationException());
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f10038a.m23708a(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (SubscriptionHelper.m23728a(this)) {
                this.f10038a.m23708a(new CancellationException());
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this, ot51Var)) {
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public SingleTakeUntil(Single single, i7t0 i7t0Var) {
        this.f10034a = single;
        this.f10035b = i7t0Var;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void subscribeActual(SingleObserver singleObserver) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(singleObserver);
        singleObserver.onSubscribe(takeUntilMainObserver);
        this.f10035b.subscribe(takeUntilMainObserver.f10037b);
        this.f10034a.subscribe(takeUntilMainObserver);
    }
}
