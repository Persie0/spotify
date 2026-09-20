package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Function f7780c;

    /* JADX INFO: renamed from: d */
    public final int f7781d;

    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: a */
        public final ft51 f7782a;

        /* JADX INFO: renamed from: c */
        public final Function f7784c;

        /* JADX INFO: renamed from: e */
        public final int f7786e;

        /* JADX INFO: renamed from: f */
        public ot51 f7787f;

        /* JADX INFO: renamed from: g */
        public volatile boolean f7788g;

        /* JADX INFO: renamed from: b */
        public final AtomicThrowable f7783b = new AtomicThrowable();

        /* JADX INFO: renamed from: d */
        public final CompositeDisposable f7785d = new CompositeDisposable();

        public final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public InnerConsumer() {
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
                flatMapCompletableMainSubscriber.f7785d.mo23394c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f7785d.mo23394c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this, disposable);
            }
        }

        public FlatMapCompletableMainSubscriber(ft51 ft51Var, Function function, int i) {
            this.f7782a = ft51Var;
            this.f7784c = function;
            this.f7786e = i;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            return 2;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7788g = true;
            this.f7787f.cancel();
            this.f7785d.dispose();
            this.f7783b.m23738b();
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f7783b.m23741e(this.f7782a);
            } else if (this.f7786e != Integer.MAX_VALUE) {
                this.f7787f.request(1L);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7783b.m23737a(th)) {
                this.f7788g = true;
                this.f7787f.cancel();
                this.f7785d.dispose();
                this.f7783b.m23741e(this.f7782a);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            try {
                Object objMo98394apply = this.f7784c.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = (CompletableSource) objMo98394apply;
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (this.f7788g || !this.f7785d.mo23393b(innerConsumer)) {
                    return;
                }
                completableSource.subscribe(innerConsumer);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f7787f.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7787f, ot51Var)) {
                this.f7787f = ot51Var;
                this.f7782a.onSubscribe(this);
                int i = this.f7786e;
                if (i == Integer.MAX_VALUE) {
                    ot51Var.request(Long.MAX_VALUE);
                } else {
                    ot51Var.request(i);
                }
            }
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            return null;
        }

        @Override // p204p.ot51
        public final void request(long j) {
        }
    }

    public FlowableFlatMapCompletable(Flowable flowable, Function function, int i) {
        super(flowable);
        this.f7780c = function;
        this.f7781d = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new FlatMapCompletableMainSubscriber(ft51Var, this.f7780c, this.f7781d));
    }
}
