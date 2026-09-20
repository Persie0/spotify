package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableFlatMapCompletableCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: a */
    public final Flowable f7790a;

    /* JADX INFO: renamed from: b */
    public final Function f7791b;

    /* JADX INFO: renamed from: c */
    public final int f7792c = Alert.DURATION_SHOW_INDEFINITELY;

    public static final class FlatMapCompletableMainSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: a */
        public final CompletableObserver f7793a;

        /* JADX INFO: renamed from: c */
        public final Function f7795c;

        /* JADX INFO: renamed from: e */
        public final int f7797e;

        /* JADX INFO: renamed from: f */
        public ot51 f7798f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f7799g;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f7794b = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public final CompositeDisposable f7796d = new CompositeDisposable();

        public final class InnerObserver extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public InnerObserver() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public void dispose() {
                DisposableHelper.m23414a(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public boolean isDisposed() {
                return DisposableHelper.m23415b(get());
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f7796d.mo23394c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f7796d.mo23394c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this, disposable);
            }
        }

        public FlatMapCompletableMainSubscriber(CompletableObserver completableObserver, Function function, int i) {
            this.f7793a = completableObserver;
            this.f7795c = function;
            this.f7797e = i;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.f7799g = true;
            this.f7798f.cancel();
            this.f7796d.dispose();
            this.f7794b.m23738b();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return this.f7796d.isDisposed();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f7794b.m23739c(this.f7793a);
            } else if (this.f7797e != Integer.MAX_VALUE) {
                this.f7798f.request(1L);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7794b.m23737a(th)) {
                this.f7799g = true;
                this.f7798f.cancel();
                this.f7796d.dispose();
                this.f7794b.m23739c(this.f7793a);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            try {
                Object objMo98394apply = this.f7795c.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objMo98394apply;
                getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f7799g || !this.f7796d.mo23393b(innerObserver)) {
                    return;
                }
                completableSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f7798f.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7798f, ot51Var)) {
                this.f7798f = ot51Var;
                this.f7793a.onSubscribe(this);
                int i = this.f7797e;
                if (i == Integer.MAX_VALUE) {
                    ot51Var.request(Long.MAX_VALUE);
                } else {
                    ot51Var.request(i);
                }
            }
        }
    }

    public FlowableFlatMapCompletableCompletable(Flowable flowable, Function function) {
        this.f7790a = flowable;
        this.f7791b = function;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    /* JADX INFO: renamed from: b */
    public final Flowable mo23452b() {
        return new FlowableFlatMapCompletable(this.f7790a, this.f7791b, this.f7792c);
    }

    @Override // io.reactivex.rxjava3.core.Completable
    /* JADX INFO: renamed from: s */
    public final void mo23302s(CompletableObserver completableObserver) {
        this.f7790a.subscribe((FlowableSubscriber) new FlatMapCompletableMainSubscriber(completableObserver, this.f7791b, this.f7792c));
    }
}
