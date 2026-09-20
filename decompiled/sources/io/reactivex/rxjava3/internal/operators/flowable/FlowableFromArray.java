package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Objects;
import p204p.edb;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Object[] f7848b;

    public static final class ArrayConditionalSubscription<T> extends BaseArraySubscription<T> {

        /* JADX INFO: renamed from: d */
        public final ConditionalSubscriber f7849d;

        public ArrayConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Object[] objArr) {
            super(objArr);
            this.f7849d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: b */
        public final void mo23519b() {
            Object[] objArr = this.f7851a;
            int length = objArr.length;
            ConditionalSubscriber conditionalSubscriber = this.f7849d;
            for (int i = this.f7852b; i != length; i++) {
                if (this.f7853c) {
                    return;
                }
                Object obj = objArr[i];
                if (obj == null) {
                    conditionalSubscriber.onError(new NullPointerException(edb.m38563l("The element at index ", i, " is null")));
                    return;
                }
                conditionalSubscriber.mo23502f(obj);
            }
            if (this.f7853c) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: c */
        public final void mo23520c(long j) {
            Object[] objArr = this.f7851a;
            int length = objArr.length;
            int i = this.f7852b;
            ConditionalSubscriber conditionalSubscriber = this.f7849d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.f7853c) {
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
                        if (this.f7853c) {
                            return;
                        }
                        Object obj = objArr[i];
                        if (obj == null) {
                            conditionalSubscriber.onError(new NullPointerException(edb.m38563l("The element at index ", i, " is null")));
                            return;
                        } else {
                            if (conditionalSubscriber.mo23502f(obj)) {
                                j2++;
                            }
                            i++;
                        }
                    }
                }
                this.f7852b = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class ArraySubscription<T> extends BaseArraySubscription<T> {

        /* JADX INFO: renamed from: d */
        public final ft51 f7850d;

        public ArraySubscription(ft51 ft51Var, Object[] objArr) {
            super(objArr);
            this.f7850d = ft51Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: b */
        public final void mo23519b() {
            Object[] objArr = this.f7851a;
            int length = objArr.length;
            ft51 ft51Var = this.f7850d;
            for (int i = this.f7852b; i != length; i++) {
                if (this.f7853c) {
                    return;
                }
                Object obj = objArr[i];
                if (obj == null) {
                    ft51Var.onError(new NullPointerException(edb.m38563l("The element at index ", i, " is null")));
                    return;
                }
                ft51Var.onNext(obj);
            }
            if (this.f7853c) {
                return;
            }
            ft51Var.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.BaseArraySubscription
        /* JADX INFO: renamed from: c */
        public final void mo23520c(long j) {
            Object[] objArr = this.f7851a;
            int length = objArr.length;
            int i = this.f7852b;
            ft51 ft51Var = this.f7850d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j || i == length) {
                        if (i == length) {
                            if (this.f7853c) {
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
                        if (this.f7853c) {
                            return;
                        }
                        Object obj = objArr[i];
                        if (obj == null) {
                            ft51Var.onError(new NullPointerException(edb.m38563l("The element at index ", i, " is null")));
                            return;
                        } else {
                            ft51Var.onNext(obj);
                            j2++;
                            i++;
                        }
                    }
                }
                this.f7852b = i;
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static abstract class BaseArraySubscription<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public final Object[] f7851a;

        /* JADX INFO: renamed from: b */
        public int f7852b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f7853c;

        public BaseArraySubscription(Object[] objArr) {
            this.f7851a = objArr;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            return 1;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo23519b();

        /* JADX INFO: renamed from: c */
        public abstract void mo23520c(long j);

        @Override // p204p.ot51
        public final void cancel() {
            this.f7853c = true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7852b = this.f7851a.length;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.f7852b == this.f7851a.length;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            int i = this.f7852b;
            Object[] objArr = this.f7851a;
            if (i == objArr.length) {
                return null;
            }
            this.f7852b = i + 1;
            Object obj = objArr[i];
            Objects.requireNonNull(obj, "array element is null");
            return obj;
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j) && BackpressureHelper.m23742a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo23519b();
                } else {
                    mo23520c(j);
                }
            }
        }
    }

    public FlowableFromArray(Object[] objArr) {
        this.f7848b = objArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        boolean z = ft51Var instanceof ConditionalSubscriber;
        Object[] objArr = this.f7848b;
        if (z) {
            ft51Var.onSubscribe(new ArrayConditionalSubscription((ConditionalSubscriber) ft51Var, objArr));
        } else {
            ft51Var.onSubscribe(new ArraySubscription(ft51Var, objArr));
        }
    }
}
