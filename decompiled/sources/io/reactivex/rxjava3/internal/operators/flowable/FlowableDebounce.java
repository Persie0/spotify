package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDebounce<T, U> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Function f7641c;

    public static final class DebounceSubscriber<T, U> extends AtomicLong implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f7642a;

        /* JADX INFO: renamed from: b */
        public final Function f7643b;

        /* JADX INFO: renamed from: c */
        public ot51 f7644c;

        /* JADX INFO: renamed from: d */
        public final AtomicReference f7645d = new AtomicReference();

        /* JADX INFO: renamed from: e */
        public volatile long f7646e;

        /* JADX INFO: renamed from: f */
        public boolean f7647f;

        public static final class DebounceInnerSubscriber<T, U> extends DisposableSubscriber<U> {

            /* JADX INFO: renamed from: b */
            public final DebounceSubscriber f7648b;

            /* JADX INFO: renamed from: c */
            public final long f7649c;

            /* JADX INFO: renamed from: d */
            public final Object f7650d;

            /* JADX INFO: renamed from: e */
            public boolean f7651e;

            /* JADX INFO: renamed from: f */
            public final AtomicBoolean f7652f = new AtomicBoolean();

            public DebounceInnerSubscriber(DebounceSubscriber debounceSubscriber, long j, Object obj) {
                this.f7648b = debounceSubscriber;
                this.f7649c = j;
                this.f7650d = obj;
            }

            /* JADX INFO: renamed from: a */
            public final void m23500a() {
                if (this.f7652f.compareAndSet(false, true)) {
                    DebounceSubscriber debounceSubscriber = this.f7648b;
                    long j = this.f7649c;
                    Object obj = this.f7650d;
                    if (j == debounceSubscriber.f7646e) {
                        if (debounceSubscriber.get() != 0) {
                            debounceSubscriber.f7642a.onNext(obj);
                            BackpressureHelper.m23746e(debounceSubscriber, 1L);
                        } else {
                            debounceSubscriber.cancel();
                            debounceSubscriber.f7642a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                        }
                    }
                }
            }

            @Override // p204p.ft51
            public final void onComplete() {
                if (this.f7651e) {
                    return;
                }
                this.f7651e = true;
                m23500a();
            }

            @Override // p204p.ft51
            public final void onError(Throwable th) {
                if (this.f7651e) {
                    RxJavaPlugins.m23782b(th);
                } else {
                    this.f7651e = true;
                    this.f7648b.onError(th);
                }
            }

            @Override // p204p.ft51
            public final void onNext(Object obj) {
                if (this.f7651e) {
                    return;
                }
                this.f7651e = true;
                dispose();
                m23500a();
            }
        }

        public DebounceSubscriber(SerializedSubscriber serializedSubscriber, Function function) {
            this.f7642a = serializedSubscriber;
            this.f7643b = function;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7644c.cancel();
            DisposableHelper.m23414a(this.f7645d);
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7647f) {
                return;
            }
            this.f7647f = true;
            AtomicReference atomicReference = this.f7645d;
            Disposable disposable = (Disposable) atomicReference.get();
            if (DisposableHelper.m23415b(disposable)) {
                return;
            }
            DebounceInnerSubscriber debounceInnerSubscriber = (DebounceInnerSubscriber) disposable;
            if (debounceInnerSubscriber != null) {
                debounceInnerSubscriber.m23500a();
            }
            DisposableHelper.m23414a(atomicReference);
            this.f7642a.onComplete();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            DisposableHelper.m23414a(this.f7645d);
            this.f7642a.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7647f) {
                return;
            }
            long j = this.f7646e + 1;
            this.f7646e = j;
            Disposable disposable = (Disposable) this.f7645d.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Object objMo98394apply = this.f7643b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The publisher supplied is null");
                i7t0 i7t0Var = (i7t0) objMo98394apply;
                DebounceInnerSubscriber debounceInnerSubscriber = new DebounceInnerSubscriber(this, j, obj);
                AtomicReference atomicReference = this.f7645d;
                while (!atomicReference.compareAndSet(disposable, debounceInnerSubscriber)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                i7t0Var.subscribe(debounceInnerSubscriber);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                cancel();
                this.f7642a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7644c, ot51Var)) {
                this.f7644c = ot51Var;
                this.f7642a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this, j);
            }
        }
    }

    public FlowableDebounce(Flowable flowable, Function function) {
        super(flowable);
        this.f7641c = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new DebounceSubscriber(new SerializedSubscriber(ft51Var), this.f7641c));
    }
}
