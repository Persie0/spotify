package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.operators.ConditionalSubscriber;
import java.util.Iterator;
import java.util.Objects;
import p204p.ft51;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: b */
    public final Iterable f7860b;

    public static abstract class BaseRangeSubscription<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: a */
        public Iterator f7861a;

        /* JADX INFO: renamed from: b */
        public volatile boolean f7862b;

        /* JADX INFO: renamed from: c */
        public boolean f7863c;

        public BaseRangeSubscription(Iterator it) {
            this.f7861a = it;
        }

        @Override // io.reactivex.rxjava3.operators.QueueFuseable
        /* JADX INFO: renamed from: a */
        public final int mo23423a(int i) {
            return 1;
        }

        /* JADX INFO: renamed from: b */
        public abstract void mo23521b();

        /* JADX INFO: renamed from: c */
        public abstract void mo23522c(long j);

        @Override // p204p.ot51
        public final void cancel() {
            this.f7862b = true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final void clear() {
            this.f7861a = null;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            Iterator it = this.f7861a;
            if (it == null) {
                return true;
            }
            if (!this.f7863c || it.hasNext()) {
                return false;
            }
            this.f7861a = null;
            return true;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            Iterator it = this.f7861a;
            if (it == null) {
                return null;
            }
            if (!this.f7863c) {
                this.f7863c = true;
            } else if (!it.hasNext()) {
                return null;
            }
            Object next = this.f7861a.next();
            Objects.requireNonNull(next, "Iterator.next() returned a null value");
            return next;
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j) && BackpressureHelper.m23742a(this, j) == 0) {
                if (j == Long.MAX_VALUE) {
                    mo23521b();
                } else {
                    mo23522c(j);
                }
            }
        }
    }

    public static final class IteratorConditionalSubscription<T> extends BaseRangeSubscription<T> {

        /* JADX INFO: renamed from: d */
        public final ConditionalSubscriber f7864d;

        public IteratorConditionalSubscription(ConditionalSubscriber conditionalSubscriber, Iterator it) {
            super(it);
            this.f7864d = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        public final void mo23521b() {
            Iterator it = this.f7861a;
            ConditionalSubscriber conditionalSubscriber = this.f7864d;
            while (!this.f7862b) {
                try {
                    Object next = it.next();
                    if (this.f7862b) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.mo23502f(next);
                    if (this.f7862b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f7862b) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        conditionalSubscriber.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    conditionalSubscriber.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: c */
        public final void mo23522c(long j) {
            Iterator it = this.f7861a;
            ConditionalSubscriber conditionalSubscriber = this.f7864d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f7862b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f7862b) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zMo23502f = conditionalSubscriber.mo23502f(next);
                            if (this.f7862b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f7862b) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zMo23502f) {
                                    j2++;
                                }
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                conditionalSubscriber.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.m23404a(th2);
                            conditionalSubscriber.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public static final class IteratorSubscription<T> extends BaseRangeSubscription<T> {

        /* JADX INFO: renamed from: d */
        public final ft51 f7865d;

        public IteratorSubscription(ft51 ft51Var, Iterator it) {
            super(it);
            this.f7865d = ft51Var;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: b */
        public final void mo23521b() {
            Iterator it = this.f7861a;
            ft51 ft51Var = this.f7865d;
            while (!this.f7862b) {
                try {
                    Object next = it.next();
                    if (this.f7862b) {
                        return;
                    }
                    if (next == null) {
                        ft51Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    ft51Var.onNext(next);
                    if (this.f7862b) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f7862b) {
                                return;
                            }
                            ft51Var.onComplete();
                            return;
                        }
                    } catch (Throwable th) {
                        Exceptions.m23404a(th);
                        ft51Var.onError(th);
                        return;
                    }
                } catch (Throwable th2) {
                    Exceptions.m23404a(th2);
                    ft51Var.onError(th2);
                    return;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromIterable.BaseRangeSubscription
        /* JADX INFO: renamed from: c */
        public final void mo23522c(long j) {
            Iterator it = this.f7861a;
            ft51 ft51Var = this.f7865d;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            break;
                        }
                    } else {
                        if (this.f7862b) {
                            return;
                        }
                        try {
                            Object next = it.next();
                            if (this.f7862b) {
                                return;
                            }
                            if (next == null) {
                                ft51Var.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            ft51Var.onNext(next);
                            if (this.f7862b) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f7862b) {
                                        return;
                                    }
                                    ft51Var.onComplete();
                                    return;
                                }
                                j2++;
                            } catch (Throwable th) {
                                Exceptions.m23404a(th);
                                ft51Var.onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.m23404a(th2);
                            ft51Var.onError(th2);
                            return;
                        }
                    }
                }
                j = addAndGet(-j2);
            } while (j != 0);
        }
    }

    public FlowableFromIterable(Iterable iterable) {
        this.f7860b = iterable;
    }

    public static <T> void subscribe(ft51 ft51Var, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.m23723b(ft51Var);
            } else if (ft51Var instanceof ConditionalSubscriber) {
                ft51Var.onSubscribe(new IteratorConditionalSubscription((ConditionalSubscriber) ft51Var, it));
            } else {
                ft51Var.onSubscribe(new IteratorSubscription(ft51Var, it));
            }
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            EmptySubscription.m23724c(th, ft51Var);
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        try {
            subscribe(ft51Var, this.f7860b.iterator());
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            ft51Var.onSubscribe(EmptySubscription.f10231a);
            ft51Var.onError(th);
        }
    }
}
