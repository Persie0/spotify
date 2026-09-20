package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.nfp;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSwitchMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final FlowableObserveOn f8424b;

    /* JADX INFO: renamed from: c */
    public final nfp f8425c;

    public static final class SwitchMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: X */
        public static final SwitchMapSingleObserver f8426X = new SwitchMapSingleObserver(null);

        /* JADX INFO: renamed from: a */
        public final ft51 f8427a;

        /* JADX INFO: renamed from: b */
        public final Function f8428b;

        /* JADX INFO: renamed from: c */
        public final boolean f8429c;

        /* JADX INFO: renamed from: d */
        public final AtomicThrowable f8430d = new AtomicThrowable();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f8431e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicReference f8432f = new AtomicReference();

        /* JADX INFO: renamed from: g */
        public ot51 f8433g;

        /* JADX INFO: renamed from: h */
        public volatile boolean f8434h;

        /* JADX INFO: renamed from: i */
        public volatile boolean f8435i;

        /* JADX INFO: renamed from: t */
        public long f8436t;

        public static final class SwitchMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final SwitchMapSingleSubscriber f8437a;

            /* JADX INFO: renamed from: b */
            public volatile Object f8438b;

            public SwitchMapSingleObserver(SwitchMapSingleSubscriber switchMapSingleSubscriber) {
                this.f8437a = switchMapSingleSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                SwitchMapSingleSubscriber switchMapSingleSubscriber = this.f8437a;
                AtomicReference atomicReference = switchMapSingleSubscriber.f8432f;
                while (!atomicReference.compareAndSet(this, null)) {
                    if (atomicReference.get() != this) {
                        RxJavaPlugins.m23782b(th);
                        return;
                    }
                }
                if (switchMapSingleSubscriber.f8430d.m23737a(th)) {
                    if (!switchMapSingleSubscriber.f8429c) {
                        switchMapSingleSubscriber.f8433g.cancel();
                        switchMapSingleSubscriber.m23583a();
                    }
                    switchMapSingleSubscriber.m23584b();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                this.f8438b = obj;
                this.f8437a.m23584b();
            }
        }

        public SwitchMapSingleSubscriber(ft51 ft51Var, Function function, boolean z) {
            this.f8427a = ft51Var;
            this.f8428b = function;
            this.f8429c = z;
        }

        /* JADX INFO: renamed from: a */
        public final void m23583a() {
            AtomicReference atomicReference = this.f8432f;
            SwitchMapSingleObserver switchMapSingleObserver = f8426X;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.getAndSet(switchMapSingleObserver);
            if (switchMapSingleObserver2 == null || switchMapSingleObserver2 == switchMapSingleObserver) {
                return;
            }
            DisposableHelper.m23414a(switchMapSingleObserver2);
        }

        /* JADX INFO: renamed from: b */
        public final void m23584b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f8427a;
            AtomicThrowable atomicThrowable = this.f8430d;
            AtomicReference atomicReference = this.f8432f;
            AtomicLong atomicLong = this.f8431e;
            long j = this.f8436t;
            int iAddAndGet = 1;
            while (!this.f8435i) {
                if (atomicThrowable.get() != null && !this.f8429c) {
                    atomicThrowable.m23741e(ft51Var);
                    return;
                }
                boolean z = this.f8434h;
                SwitchMapSingleObserver switchMapSingleObserver = (SwitchMapSingleObserver) atomicReference.get();
                boolean z2 = switchMapSingleObserver == null;
                if (z && z2) {
                    atomicThrowable.m23741e(ft51Var);
                    return;
                }
                if (z2 || switchMapSingleObserver.f8438b == null || j == atomicLong.get()) {
                    this.f8436t = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    while (!atomicReference.compareAndSet(switchMapSingleObserver, null) && atomicReference.get() == switchMapSingleObserver) {
                    }
                    ft51Var.onNext(switchMapSingleObserver.f8438b);
                    j++;
                }
            }
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f8435i = true;
            this.f8433g.cancel();
            m23583a();
            this.f8430d.m23738b();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f8434h = true;
            m23584b();
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f8430d.m23737a(th)) {
                if (!this.f8429c) {
                    m23583a();
                }
                this.f8434h = true;
                m23584b();
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            SwitchMapSingleObserver switchMapSingleObserver = f8426X;
            AtomicReference atomicReference = this.f8432f;
            SwitchMapSingleObserver switchMapSingleObserver2 = (SwitchMapSingleObserver) atomicReference.get();
            if (switchMapSingleObserver2 != null) {
                DisposableHelper.m23414a(switchMapSingleObserver2);
            }
            try {
                Object objMo98394apply = this.f8428b.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                SwitchMapSingleObserver switchMapSingleObserver3 = new SwitchMapSingleObserver(this);
                while (true) {
                    SwitchMapSingleObserver switchMapSingleObserver4 = (SwitchMapSingleObserver) atomicReference.get();
                    if (switchMapSingleObserver4 == switchMapSingleObserver) {
                        return;
                    }
                    do {
                        if (atomicReference.compareAndSet(switchMapSingleObserver4, switchMapSingleObserver3)) {
                            singleSource.subscribe(switchMapSingleObserver3);
                            return;
                        }
                    } while (atomicReference.get() == switchMapSingleObserver4);
                }
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f8433g.cancel();
                atomicReference.getAndSet(switchMapSingleObserver);
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f8433g, ot51Var)) {
                this.f8433g = ot51Var;
                this.f8427a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            BackpressureHelper.m23742a(this.f8431e, j);
            m23584b();
        }
    }

    public FlowableSwitchMapSingle(FlowableObserveOn flowableObserveOn, nfp nfpVar) {
        this.f8424b = flowableObserveOn;
        this.f8425c = nfpVar;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8424b.subscribe((FlowableSubscriber) new SwitchMapSingleSubscriber(ft51Var, this.f8425c, false));
    }
}
