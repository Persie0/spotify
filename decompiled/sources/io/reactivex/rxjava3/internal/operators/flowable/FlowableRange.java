package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRange extends Flowable<Integer> {

    /* JADX INFO: renamed from: b */
    public final int f7969b;

    /* JADX INFO: renamed from: c */
    public final int f7970c;

    public static abstract class BaseRangeSubscription extends BasicQueueSubscription<Integer> {

        /* JADX INFO: renamed from: a */
        public final int f7971a;

        /* JADX INFO: renamed from: b */
        public int f7972b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f7973c;

        public BaseRangeSubscription(int i, int i2) {
            this.f7972b = i;
            this.f7971a = i2;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            return 1;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo23538b();

        /* JADX INFO: renamed from: c */
        public abstract void mo23539c(long j);

        @Override // p204p.ot51
        public final void cancel() {
            this.f7973c = true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7972b = this.f7971a;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7972b == this.f7971a;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            int i = this.f7972b;
            if (i == this.f7971a) {
                return null;
            }
            this.f7972b = i + 1;
            return Integer.valueOf(i);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j) && BackpressureHelper.m23742a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo23538b();
                } else {
                    mo23539c(j);
                }
            }
        }
    }

    public static final class RangeConditionalSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: d */
        public final ConditionalSubscriber f7974d;

        public RangeConditionalSubscription(ConditionalSubscriber conditionalSubscriber, int i, int i2) {
            super(i, i2);
            this.f7974d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        public final void mo23538b() {
            int i = this.f7971a;
            ConditionalSubscriber conditionalSubscriber = this.f7974d;
            for (int i2 = this.f7972b; i2 != i; i2++) {
                if (this.f7973c) {
                    return;
                }
                conditionalSubscriber.mo23502f(Integer.valueOf(i2));
            }
            if (this.f7973c) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: c */
        public final void mo23539c(long j) {
            int i = this.f7971a;
            int i2 = this.f7972b;
            ConditionalSubscriber conditionalSubscriber = this.f7974d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.f7973c) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f7973c) {
                            return;
                        }
                        if (conditionalSubscriber.mo23502f(Integer.valueOf(i2))) {
                            j2++;
                        }
                        i2++;
                    }
                }
                this.f7972b = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class RangeSubscription extends BaseRangeSubscription {

        /* JADX INFO: renamed from: d */
        public final ft51 f7975d;

        public RangeSubscription(ft51 ft51Var, int i, int i2) {
            super(i, i2);
            this.f7975d = ft51Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        public final void mo23538b() {
            int i = this.f7971a;
            ft51 ft51Var = this.f7975d;
            for (int i2 = this.f7972b; i2 != i; i2++) {
                if (this.f7973c) {
                    return;
                }
                ft51Var.onNext(Integer.valueOf(i2));
            }
            if (this.f7973c) {
                return;
            }
            ft51Var.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableRange.BaseRangeSubscription
        /* JADX INFO: renamed from: c */
        public final void mo23539c(long j) {
            int i = this.f7971a;
            int i2 = this.f7972b;
            ft51 ft51Var = this.f7975d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i2 == i) {
                        if (i2 == i) {
                            if (this.f7973c) {
                                return;
                            }
                            ft51Var.onComplete();
                            return;
                        } else {
                            j = get();
                            if (j2 == j) {
                                break;
                            }
                        }
                    } else {
                        if (this.f7973c) {
                            return;
                        }
                        ft51Var.onNext(Integer.valueOf(i2));
                        j2++;
                        i2++;
                    }
                }
                this.f7972b = i2;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public FlowableRange(int i, int i2) {
        this.f7969b = i;
        this.f7970c = i + i2;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        int i = this.f7970c;
        int i2 = this.f7969b;
        if (z) {
            ft51Var.onSubscribe(new RangeConditionalSubscription((ConditionalSubscriber) ft51Var, i2, i));
        } else {
            ft51Var.onSubscribe(new RangeSubscription(ft51Var, i2, i));
        }
    }
}
