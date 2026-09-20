package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.flowables.ConnectableFlowable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableRefCount<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final ConnectableFlowable f7976b;

    /* JADX INFO: renamed from: c */
    public final int f7977c;

    /* JADX INFO: renamed from: d */
    public RefConnection f7978d;

    public static final class RefConnection extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {

        /* JADX INFO: renamed from: a */
        public final FlowableRefCount f7979a;

        /* JADX INFO: renamed from: b */
        public long f7980b;

        /* JADX INFO: renamed from: c */
        public boolean f7981c;

        /* JADX INFO: renamed from: d */
        public boolean f7982d;

        public RefConnection(FlowableRefCount flowableRefCount) {
            this.f7979a = flowableRefCount;
        }

        @Override // io.reactivex.rxjava3.functions.Consumer
        public final void accept(Object obj) {
            DisposableHelper.m23416c(this, (Disposable) obj);
            synchronized (this.f7979a) {
                try {
                    if (this.f7982d) {
                        this.f7979a.f7976b.mo23406e0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7979a.m23541e0(this);
        }
    }

    public static final class RefCountSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f7983a;

        /* JADX INFO: renamed from: b */
        public final FlowableRefCount f7984b;

        /* JADX INFO: renamed from: c */
        public final RefConnection f7985c;

        /* JADX INFO: renamed from: d */
        public ot51 f7986d;

        public RefCountSubscriber(ft51 ft51Var, FlowableRefCount flowableRefCount, RefConnection refConnection) {
            this.f7983a = ft51Var;
            this.f7984b = flowableRefCount;
            this.f7985c = refConnection;
        }

        @Override // p204p.ot51
        public final void cancel() {
            this.f7986d.cancel();
            if (compareAndSet(false, true)) {
                FlowableRefCount flowableRefCount = this.f7984b;
                RefConnection refConnection = this.f7985c;
                synchronized (flowableRefCount) {
                    try {
                        RefConnection refConnection2 = flowableRefCount.f7978d;
                        if (refConnection2 != null && refConnection2 == refConnection) {
                            long j = refConnection.f7980b - 1;
                            refConnection.f7980b = j;
                            if (j == 0 && refConnection.f7981c) {
                                flowableRefCount.m23541e0(refConnection);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (compareAndSet(false, true)) {
                this.f7984b.m23540d0(this.f7985c);
                this.f7983a.onComplete();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f7984b.m23540d0(this.f7985c);
                this.f7983a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7983a.onNext(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7986d, ot51Var)) {
                this.f7986d = ot51Var;
                this.f7983a.onSubscribe(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            this.f7986d.request(j);
        }
    }

    public FlowableRefCount(ConnectableFlowable connectableFlowable) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f7976b = connectableFlowable;
        this.f7977c = 1;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        RefConnection refConnection;
        boolean z;
        synchronized (this) {
            try {
                refConnection = this.f7978d;
                if (refConnection == null) {
                    refConnection = new RefConnection(this);
                    this.f7978d = refConnection;
                }
                long j = refConnection.f7980b + 1;
                refConnection.f7980b = j;
                if (refConnection.f7981c || j != this.f7977c) {
                    z = false;
                } else {
                    z = true;
                    refConnection.f7981c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7976b.subscribe((FlowableSubscriber) new RefCountSubscriber(ft51Var, this, refConnection));
        if (z) {
            this.f7976b.mo23405d0(refConnection);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m23540d0(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (this.f7978d == refConnection) {
                    refConnection.getClass();
                    long j = refConnection.f7980b - 1;
                    refConnection.f7980b = j;
                    if (j == 0) {
                        this.f7978d = null;
                        this.f7976b.mo23406e0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m23541e0(RefConnection refConnection) {
        synchronized (this) {
            try {
                if (refConnection.f7980b == 0 && refConnection == this.f7978d) {
                    this.f7978d = null;
                    Disposable disposable = refConnection.get();
                    DisposableHelper.m23414a(refConnection);
                    if (disposable == null) {
                        refConnection.f7982d = true;
                    } else {
                        this.f7976b.mo23406e0();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
