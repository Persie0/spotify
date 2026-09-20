package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import io.reactivex.rxjava3.operators.SimpleQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatMapSingle<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final Flowable f8407b;

    /* JADX INFO: renamed from: c */
    public final Function f8408c;

    /* JADX INFO: renamed from: d */
    public final ErrorMode f8409d;

    /* JADX INFO: renamed from: e */
    public final int f8410e;

    public static final class ConcatMapSingleSubscriber<T, R> extends ConcatMapXMainSubscriber<T> implements ot51 {

        /* JADX INFO: renamed from: L0 */
        public int f8411L0;

        /* JADX INFO: renamed from: M0 */
        public Object f8412M0;

        /* JADX INFO: renamed from: N0 */
        public volatile int f8413N0;

        /* JADX INFO: renamed from: X */
        public final AtomicLong f8414X;

        /* JADX INFO: renamed from: Y */
        public final ConcatMapSingleObserver f8415Y;

        /* JADX INFO: renamed from: Z */
        public long f8416Z;

        /* JADX INFO: renamed from: i */
        public final ft51 f8417i;

        /* JADX INFO: renamed from: t */
        public final Function f8418t;

        public static final class ConcatMapSingleObserver<R> extends AtomicReference<Disposable> implements SingleObserver<R> {

            /* JADX INFO: renamed from: a */
            public final ConcatMapSingleSubscriber f8419a;

            public ConcatMapSingleObserver(ConcatMapSingleSubscriber concatMapSingleSubscriber) {
                this.f8419a = concatMapSingleSubscriber;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.f8419a;
                if (concatMapSingleSubscriber.f8389a.m23737a(th)) {
                    if (concatMapSingleSubscriber.f8391c != ErrorMode.f10256c) {
                        concatMapSingleSubscriber.f8393e.cancel();
                    }
                    concatMapSingleSubscriber.f8413N0 = 0;
                    concatMapSingleSubscriber.mo23580c();
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23416c(this, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                ConcatMapSingleSubscriber concatMapSingleSubscriber = this.f8419a;
                concatMapSingleSubscriber.f8412M0 = obj;
                concatMapSingleSubscriber.f8413N0 = 2;
                concatMapSingleSubscriber.mo23580c();
            }
        }

        public ConcatMapSingleSubscriber(ft51 ft51Var, Function function, int i, ErrorMode errorMode) {
            super(i, errorMode);
            this.f8417i = ft51Var;
            this.f8418t = function;
            this.f8414X = new AtomicLong();
            this.f8415Y = new ConcatMapSingleObserver(this);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: a */
        public final void mo23578a() {
            this.f8412M0 = null;
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: b */
        public final void mo23579b() {
            ConcatMapSingleObserver concatMapSingleObserver = this.f8415Y;
            concatMapSingleObserver.getClass();
            DisposableHelper.m23414a(concatMapSingleObserver);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: c */
        public final void mo23580c() {
            if (getAndIncrement() != 0) {
                return;
            }
            ft51 ft51Var = this.f8417i;
            ErrorMode errorMode = this.f8391c;
            SimpleQueue simpleQueue = this.f8392d;
            AtomicThrowable atomicThrowable = this.f8389a;
            AtomicLong atomicLong = this.f8414X;
            int i = this.f8390b;
            int i2 = i - (i >> 1);
            boolean z = this.f8396h;
            int iAddAndGet = 1;
            while (true) {
                if (!this.f8395g) {
                    int i3 = this.f8413N0;
                    if (atomicThrowable.get() != null && (errorMode == ErrorMode.f10254a || (errorMode == ErrorMode.f10255b && i3 == 0))) {
                        break;
                    }
                    if (i3 == 0) {
                        boolean z2 = this.f8394f;
                        try {
                            Object objPoll = simpleQueue.poll();
                            boolean z3 = objPoll == null;
                            if (z2 && z3) {
                                atomicThrowable.m23741e(ft51Var);
                                return;
                            }
                            if (!z3) {
                                if (!z) {
                                    int i4 = this.f8411L0 + 1;
                                    if (i4 == i2) {
                                        this.f8411L0 = 0;
                                        this.f8393e.request(i2);
                                    } else {
                                        this.f8411L0 = i4;
                                    }
                                }
                                try {
                                    Object objMo98394apply = this.f8418t.mo98394apply(objPoll);
                                    Objects.requireNonNull(objMo98394apply, "The mapper returned a null SingleSource");
                                    SingleSource singleSource = (SingleSource) objMo98394apply;
                                    this.f8413N0 = 1;
                                    singleSource.subscribe(this.f8415Y);
                                } catch (Throwable th) {
                                    Exceptions.m23404a(th);
                                    this.f8393e.cancel();
                                    simpleQueue.clear();
                                    atomicThrowable.m23737a(th);
                                    atomicThrowable.m23741e(ft51Var);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            Exceptions.m23404a(th2);
                            this.f8393e.cancel();
                            atomicThrowable.m23737a(th2);
                            atomicThrowable.m23741e(ft51Var);
                            return;
                        }
                    } else if (i3 == 2) {
                        long j = this.f8416Z;
                        if (j != atomicLong.get()) {
                            Object obj = this.f8412M0;
                            this.f8412M0 = null;
                            ft51Var.onNext(obj);
                            this.f8416Z = j + 1;
                            this.f8413N0 = 0;
                        }
                    }
                } else {
                    simpleQueue.clear();
                    this.f8412M0 = null;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            simpleQueue.clear();
            this.f8412M0 = null;
            atomicThrowable.m23741e(ft51Var);
        }

        @Override // io.reactivex.rxjava3.internal.operators.mixed.ConcatMapXMainSubscriber
        /* JADX INFO: renamed from: g */
        public final void mo23581g() {
            this.f8417i.onSubscribe(this);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            BackpressureHelper.m23742a(this.f8414X, j);
            mo23580c();
        }
    }

    public FlowableConcatMapSingle(Flowable flowable, Function function, ErrorMode errorMode, int i) {
        this.f8407b = flowable;
        this.f8408c = function;
        this.f8409d = errorMode;
        this.f8410e = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8407b.subscribe((FlowableSubscriber) new ConcatMapSingleSubscriber(ft51Var, this.f8408c, this.f8410e, this.f8409d));
    }
}
