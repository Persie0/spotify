package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDebounceTimed<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f7653c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f7654d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f7655e;

    public static final class DebounceEmitter<T> extends AtomicReference<Disposable> implements Runnable, Disposable {

        /* JADX INFO: renamed from: a */
        public final Object f7656a;

        /* JADX INFO: renamed from: b */
        public final long f7657b;

        /* JADX INFO: renamed from: c */
        public final DebounceTimedSubscriber f7658c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f7659d = new AtomicBoolean();

        public DebounceEmitter(Object obj, long j, DebounceTimedSubscriber debounceTimedSubscriber) {
            this.f7656a = obj;
            this.f7657b = j;
            this.f7658c = debounceTimedSubscriber;
        }

        /* JADX INFO: renamed from: a */
        public final void m23501a() {
            if (this.f7659d.compareAndSet(false, true)) {
                DebounceTimedSubscriber debounceTimedSubscriber = this.f7658c;
                long j = this.f7657b;
                Object obj = this.f7656a;
                if (j == debounceTimedSubscriber.f7666g) {
                    if (debounceTimedSubscriber.get() == 0) {
                        debounceTimedSubscriber.cancel();
                        debounceTimedSubscriber.f7660a.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                    } else {
                        debounceTimedSubscriber.f7660a.onNext(obj);
                        BackpressureHelper.m23746e(debounceTimedSubscriber, 1L);
                        dispose();
                    }
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            DisposableHelper.m23414a(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public boolean isDisposed() {
            return get() == DisposableHelper.f7218a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m23501a();
        }
    }

    public static final class DebounceTimedSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final SerializedSubscriber f7660a;

        /* JADX INFO: renamed from: b */
        public final long f7661b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f7662c;

        /* JADX INFO: renamed from: d */
        public final Scheduler.Worker f7663d;

        /* JADX INFO: renamed from: e */
        public ot51 f7664e;

        /* JADX INFO: renamed from: f */
        public Disposable f7665f;

        /* JADX INFO: renamed from: g */
        public volatile long f7666g;

        /* JADX INFO: renamed from: h */
        public boolean f7667h;

        public DebounceTimedSubscriber(SerializedSubscriber serializedSubscriber, long j, TimeUnit timeUnit, Scheduler.Worker worker) {
            this.f7660a = serializedSubscriber;
            this.f7661b = j;
            this.f7662c = timeUnit;
            this.f7663d = worker;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7664e.cancel();
            this.f7663d.dispose();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7667h) {
                return;
            }
            this.f7667h = true;
            Disposable disposable = this.f7665f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) disposable;
            if (debounceEmitter != null) {
                debounceEmitter.m23501a();
            }
            this.f7660a.onComplete();
            this.f7663d.dispose();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7667h) {
                RxJavaPlugins.m23782b(th);
                return;
            }
            this.f7667h = true;
            Disposable disposable = this.f7665f;
            if (disposable != null) {
                disposable.dispose();
            }
            this.f7660a.onError(th);
            this.f7663d.dispose();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7667h) {
                return;
            }
            long j = this.f7666g + 1;
            this.f7666g = j;
            Disposable disposable = this.f7665f;
            if (disposable != null) {
                disposable.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(obj, j, this);
            this.f7665f = debounceEmitter;
            DisposableHelper.m23416c(debounceEmitter, this.f7663d.mo23283b(debounceEmitter, this.f7661b, this.f7662c));
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7664e, ot51Var)) {
                this.f7664e = ot51Var;
                this.f7660a.onSubscribe(this);
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

    public FlowableDebounceTimed(Flowable flowable, long j, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.f7653c = j;
        this.f7654d = timeUnit;
        this.f7655e = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new DebounceTimedSubscriber(new SerializedSubscriber(ft51Var), this.f7653c, this.f7654d, this.f7655e.mo23281b()));
    }
}
