package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {

    /* JADX INFO: renamed from: c */
    public final Object f7726c;

    /* JADX INFO: renamed from: d */
    public final boolean f7727d;

    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: c */
        public final Object f7728c;

        /* JADX INFO: renamed from: d */
        public final boolean f7729d;

        /* JADX INFO: renamed from: e */
        public ot51 f7730e;

        /* JADX INFO: renamed from: f */
        public long f7731f;

        /* JADX INFO: renamed from: g */
        public boolean f7732g;

        public ElementAtSubscriber(ft51 ft51Var, Object obj, boolean z) {
            super(ft51Var);
            this.f7728c = obj;
            this.f7729d = z;
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, p204p.ot51
        public final void cancel() {
            super.cancel();
            this.f7730e.cancel();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            if (this.f7732g) {
                return;
            }
            this.f7732g = true;
            Object obj = this.f7728c;
            if (obj != null) {
                m23722b(obj);
                return;
            }
            boolean z = this.f7729d;
            ft51 ft51Var = this.f10229a;
            if (z) {
                ft51Var.onError(new NoSuchElementException());
            } else {
                ft51Var.onComplete();
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            if (this.f7732g) {
                RxJavaPlugins.m23782b(th);
            } else {
                this.f7732g = true;
                this.f10229a.onError(th);
            }
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            if (this.f7732g) {
                return;
            }
            long j = this.f7731f;
            if (j != 0) {
                this.f7731f = j + 1;
                return;
            }
            this.f7732g = true;
            this.f7730e.cancel();
            m23722b(obj);
        }

        @Override // p204p.ft51
        public final void onSubscribe(ot51 ot51Var) {
            if (SubscriptionHelper.m23733f(this.f7730e, ot51Var)) {
                this.f7730e = ot51Var;
                this.f10229a.onSubscribe(this);
                ot51Var.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableElementAt(Flowable flowable, Object obj, boolean z) {
        super(flowable);
        this.f7726c = obj;
        this.f7727d = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7529b.subscribe((FlowableSubscriber) new ElementAtSubscriber(ft51Var, this.f7726c, this.f7727d));
    }
}
