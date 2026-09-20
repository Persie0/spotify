package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.i7t0;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Scheduler f8097c;

    /* JADX INFO: renamed from: d */
    public final boolean f8098d;

    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, ot51, Runnable {

        /* JADX INFO: renamed from: a */
        public final ft51 f8099a;

        /* JADX INFO: renamed from: b */
        public final Scheduler.Worker f8100b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference f8101c = new AtomicReference();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f8102d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final boolean f8103e;

        /* JADX INFO: renamed from: f */
        public i7t0 f8104f;

        /* JADX INFO: loaded from: classes11.dex */
        public static final class Request implements Runnable {

            /* JADX INFO: renamed from: a */
            public final ot51 f8105a;

            /* JADX INFO: renamed from: b */
            public final long f8106b;

            public Request(long j, ot51 ot51Var) {
                this.f8105a = ot51Var;
                this.f8106b = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8105a.request(this.f8106b);
            }
        }

        public SubscribeOnSubscriber(ft51 ft51Var, Scheduler.Worker worker, i7t0 i7t0Var, boolean z) {
            this.f8099a = ft51Var;
            this.f8100b = worker;
            this.f8104f = i7t0Var;
            this.f8103e = !z;
        }

        /* JADX INFO: renamed from: a */
        public final void m23559a(long j, ot51 ot51Var) {
            if (this.f8103e || Thread.currentThread() == get()) {
                ot51Var.request(j);
            } else {
                this.f8100b.mo23386a(new Request(j, ot51Var));
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            SubscriptionHelper.m23728a(this.f8101c);
            this.f8100b.dispose();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8099a.onComplete();
            this.f8100b.dispose();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f8099a.onError(th);
            this.f8100b.dispose();
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f8099a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23731d(this.f8101c, ot51Var)) {
                long andSet = this.f8102d.getAndSet(0L);
                if (andSet != 0) {
                    m23559a(andSet, ot51Var);
                }
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                AtomicReference atomicReference = this.f8101c;
                ot51 ot51Var = (ot51) atomicReference.get();
                if (ot51Var != null) {
                    m23559a(j, ot51Var);
                    return;
                }
                AtomicLong atomicLong = this.f8102d;
                BackpressureHelper.m23742a(atomicLong, j);
                ot51 ot51Var2 = (ot51) atomicReference.get();
                if (ot51Var2 != null) {
                    long andSet = atomicLong.getAndSet(0L);
                    if (andSet != 0) {
                        m23559a(andSet, ot51Var2);
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            lazySet(Thread.currentThread());
            i7t0 i7t0Var = this.f8104f;
            this.f8104f = null;
            i7t0Var.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable flowable, Scheduler scheduler, boolean z) {
        super(flowable);
        this.f8097c = scheduler;
        this.f8098d = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        Scheduler.Worker workerMo23281b = this.f8097c.mo23281b();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(ft51Var, workerMo23281b, this.f7529b, this.f8098d);
        ft51Var.onSubscribe(subscribeOnSubscriber);
        workerMo23281b.mo23386a(subscribeOnSubscriber);
    }
}
