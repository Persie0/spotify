package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapSingle<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* JADX INFO: renamed from: c */
    public final Function f7814c;

    /* JADX INFO: renamed from: d */
    public final boolean f7815d;

    /* JADX INFO: renamed from: e */
    public final int f7816e;

    public static final class FlatMapSingleSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: X */
        public volatile boolean f7817X;

        /* JADX INFO: renamed from: a */
        public final ft51 f7818a;

        /* JADX INFO: renamed from: b */
        public final boolean f7819b;

        /* JADX INFO: renamed from: c */
        public final int f7820c;

        /* JADX INFO: renamed from: h */
        public final Function f7825h;

        /* JADX INFO: renamed from: t */
        public ot51 f7827t;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f7821d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final CompositeDisposable f7822e = new CompositeDisposable();

        /* JADX INFO: renamed from: g */
        public final AtomicThrowable f7824g = new AtomicThrowable();

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f7823f = new AtomicInteger(1);

        /* JADX INFO: renamed from: i */
        public final AtomicReference f7826i = new AtomicReference();

        public final class InnerObserver extends AtomicReference<Disposable> implements SingleObserver<R>, Disposable {
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

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onError(Throwable th) {
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                CompositeDisposable compositeDisposable = flatMapSingleSubscriber.f7822e;
                compositeDisposable.mo23394c(this);
                if (flatMapSingleSubscriber.f7824g.m23737a(th)) {
                    if (!flatMapSingleSubscriber.f7819b) {
                        flatMapSingleSubscriber.f7827t.cancel();
                        compositeDisposable.dispose();
                    } else if (flatMapSingleSubscriber.f7820c != Integer.MAX_VALUE) {
                        flatMapSingleSubscriber.f7827t.request(1L);
                    }
                    flatMapSingleSubscriber.f7823f.decrementAndGet();
                    if (flatMapSingleSubscriber.getAndIncrement() == 0) {
                        flatMapSingleSubscriber.m23515b();
                    }
                }
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.m23418g(this, disposable);
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0070  */
            /* JADX WARN: Code duplicated, block: B:37:0x0084 A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Code duplicated, block: B:43:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(Object obj) {
                SpscLinkedArrayQueue spscLinkedArrayQueueM23516c;
                FlatMapSingleSubscriber flatMapSingleSubscriber = FlatMapSingleSubscriber.this;
                flatMapSingleSubscriber.f7822e.mo23394c(this);
                if (flatMapSingleSubscriber.get() == 0) {
                    if (flatMapSingleSubscriber.compareAndSet(0, 1)) {
                        boolean z = flatMapSingleSubscriber.f7823f.decrementAndGet() == 0;
                        if (flatMapSingleSubscriber.f7821d.get() != 0) {
                            flatMapSingleSubscriber.f7818a.onNext(obj);
                            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) flatMapSingleSubscriber.f7826i.get();
                            if (z && (spscLinkedArrayQueue == null || spscLinkedArrayQueue.isEmpty())) {
                                flatMapSingleSubscriber.f7824g.m23741e(flatMapSingleSubscriber.f7818a);
                                return;
                            } else {
                                BackpressureHelper.m23746e(flatMapSingleSubscriber.f7821d, 1L);
                                if (flatMapSingleSubscriber.f7820c != Integer.MAX_VALUE) {
                                    flatMapSingleSubscriber.f7827t.request(1L);
                                }
                            }
                        } else {
                            SpscLinkedArrayQueue spscLinkedArrayQueueM23516c2 = flatMapSingleSubscriber.m23516c();
                            synchronized (spscLinkedArrayQueueM23516c2) {
                                spscLinkedArrayQueueM23516c2.offer(obj);
                            }
                        }
                        if (flatMapSingleSubscriber.decrementAndGet() == 0) {
                            return;
                        }
                    } else {
                        spscLinkedArrayQueueM23516c = flatMapSingleSubscriber.m23516c();
                        synchronized (spscLinkedArrayQueueM23516c) {
                            spscLinkedArrayQueueM23516c.offer(obj);
                        }
                        flatMapSingleSubscriber.f7823f.decrementAndGet();
                        if (flatMapSingleSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                } else {
                    spscLinkedArrayQueueM23516c = flatMapSingleSubscriber.m23516c();
                    synchronized (spscLinkedArrayQueueM23516c) {
                        spscLinkedArrayQueueM23516c.offer(obj);
                        flatMapSingleSubscriber.f7823f.decrementAndGet();
                        if (flatMapSingleSubscriber.getAndIncrement() != 0) {
                            return;
                        }
                    }
                }
                flatMapSingleSubscriber.m23515b();
            }
        }

        public FlatMapSingleSubscriber(int i, Function function, ft51 ft51Var, boolean z) {
            this.f7818a = ft51Var;
            this.f7825h = function;
            this.f7819b = z;
            this.f7820c = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m23514a() {
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) this.f7826i.get();
            if (spscLinkedArrayQueue != null) {
                spscLinkedArrayQueue.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m23515b() {
            ft51 ft51Var = this.f7818a;
            AtomicInteger atomicInteger = this.f7823f;
            AtomicReference atomicReference = this.f7826i;
            int iAddAndGet = 1;
            do {
                long j = this.f7821d.get();
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        break;
                    }
                    if (this.f7817X) {
                        m23514a();
                        return;
                    }
                    if (!this.f7819b && this.f7824g.get() != null) {
                        m23514a();
                        this.f7824g.m23741e(this.f7818a);
                        return;
                    }
                    boolean z = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
                    Object objPoll = spscLinkedArrayQueue != null ? spscLinkedArrayQueue.poll() : null;
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.f7824g.m23741e(ft51Var);
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        ft51Var.onNext(objPoll);
                        j2++;
                    }
                }
                if (j2 == j) {
                    if (this.f7817X) {
                        m23514a();
                        return;
                    }
                    if (!this.f7819b && this.f7824g.get() != null) {
                        m23514a();
                        this.f7824g.m23741e(ft51Var);
                        return;
                    }
                    boolean z3 = atomicInteger.get() == 0;
                    SpscLinkedArrayQueue spscLinkedArrayQueue2 = (SpscLinkedArrayQueue) atomicReference.get();
                    boolean z4 = spscLinkedArrayQueue2 == null || spscLinkedArrayQueue2.isEmpty();
                    if (z3 && z4) {
                        this.f7824g.m23741e(ft51Var);
                        return;
                    }
                }
                if (j2 != 0) {
                    BackpressureHelper.m23746e(this.f7821d, j2);
                    if (this.f7820c != Integer.MAX_VALUE) {
                        this.f7827t.request(j2);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        /* JADX INFO: renamed from: c */
        public final SpscLinkedArrayQueue m23516c() {
            AtomicReference atomicReference = this.f7826i;
            SpscLinkedArrayQueue spscLinkedArrayQueue = (SpscLinkedArrayQueue) atomicReference.get();
            if (spscLinkedArrayQueue != null) {
                return spscLinkedArrayQueue;
            }
            SpscLinkedArrayQueue spscLinkedArrayQueue2 = new SpscLinkedArrayQueue(Flowable.f7192a);
            while (!atomicReference.compareAndSet(null, spscLinkedArrayQueue2)) {
                if (atomicReference.get() != null) {
                    return (SpscLinkedArrayQueue) atomicReference.get();
                }
            }
            return spscLinkedArrayQueue2;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7817X = true;
            this.f7827t.cancel();
            this.f7822e.dispose();
            this.f7824g.m23738b();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            this.f7823f.decrementAndGet();
            if (getAndIncrement() == 0) {
                m23515b();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7823f.decrementAndGet();
            if (this.f7824g.m23737a(th)) {
                if (!this.f7819b) {
                    this.f7822e.dispose();
                }
                if (getAndIncrement() == 0) {
                    m23515b();
                }
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            try {
                Object objMo98394apply = this.f7825h.mo98394apply(obj);
                Objects.requireNonNull(objMo98394apply, "The mapper returned a null SingleSource");
                SingleSource singleSource = (SingleSource) objMo98394apply;
                this.f7823f.getAndIncrement();
                InnerObserver innerObserver = new InnerObserver();
                if (this.f7817X || !this.f7822e.mo23393b(innerObserver)) {
                    return;
                }
                singleSource.subscribe(innerObserver);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                this.f7827t.cancel();
                onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7827t, ot51Var)) {
                this.f7827t = ot51Var;
                this.f7818a.onSubscribe(this);
                int i = this.f7820c;
                if (i == Integer.MAX_VALUE) {
                    ot51Var.request(Long.MAX_VALUE);
                } else {
                    ot51Var.request(i);
                }
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f7821d, j);
                if (getAndIncrement() == 0) {
                    m23515b();
                }
            }
        }
    }

    public FlowableFlatMapSingle(Flowable flowable, Function function, boolean z, int i) {
        super(flowable);
        this.f7814c = function;
        this.f7815d = z;
        this.f7816e = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new FlatMapSingleSubscriber(this.f7816e, this.f7814c, ft51Var, this.f7815d));
    }
}
