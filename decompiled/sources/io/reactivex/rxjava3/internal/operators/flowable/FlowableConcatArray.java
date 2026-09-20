package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowableConcatArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final i7t0[] f7581b;

    public static final class ConcatArraySubscriber<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: X */
        public final AtomicInteger f7582X;

        /* JADX INFO: renamed from: Y */
        public int f7583Y;

        /* JADX INFO: renamed from: Z */
        public long f7584Z;

        /* JADX INFO: renamed from: i */
        public final ft51 f7585i;

        /* JADX INFO: renamed from: t */
        public final i7t0[] f7586t;

        public ConcatArraySubscriber(i7t0[] i7t0VarArr, ft51 ft51Var) {
            super(false);
            this.f7585i = ft51Var;
            this.f7586t = i7t0VarArr;
            this.f7582X = new AtomicInteger();
        }

        @Override // p204p.ft51
        public final void onComplete() {
            AtomicInteger atomicInteger = this.f7582X;
            if (atomicInteger.getAndIncrement() == 0) {
                i7t0[] i7t0VarArr = this.f7586t;
                int length = i7t0VarArr.length;
                int i = this.f7583Y;
                do {
                    ft51 ft51Var = this.f7585i;
                    if (i == length) {
                        ft51Var.onComplete();
                        return;
                    }
                    i7t0 i7t0Var = i7t0VarArr[i];
                    if (i7t0Var == null) {
                        ft51Var.onError(new NullPointerException("A Publisher entry is null"));
                        return;
                    }
                    long j = this.f7584Z;
                    if (j != 0) {
                        this.f7584Z = 0L;
                        m23726d(j);
                    }
                    i7t0Var.subscribe(this);
                    i++;
                    this.f7583Y = i;
                } while (atomicInteger.decrementAndGet() != 0);
            }
        }

        @Override // p204p.ft51
        public final void onError(Throwable th) {
            this.f7585i.onError(th);
        }

        @Override // p204p.ft51
        public final void onNext(Object obj) {
            this.f7584Z++;
            this.f7585i.onNext(obj);
        }
    }

    public FlowableConcatArray(i7t0[] i7t0VarArr) {
        this.f7581b = i7t0VarArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        ConcatArraySubscriber concatArraySubscriber = new ConcatArraySubscriber(this.f7581b, ft51Var);
        ft51Var.onSubscribe(concatArraySubscriber);
        concatArraySubscriber.onComplete();
    }
}
