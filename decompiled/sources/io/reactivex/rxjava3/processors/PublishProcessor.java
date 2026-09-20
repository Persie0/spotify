package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;
import p204p.tfe;

/* JADX INFO: loaded from: classes2.dex */
public final class PublishProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: d */
    public static final PublishSubscription[] f10330d = new PublishSubscription[0];

    /* JADX INFO: renamed from: e */
    public static final PublishSubscription[] f10331e = new PublishSubscription[0];

    /* JADX INFO: renamed from: b */
    public final AtomicReference f10332b = new AtomicReference(f10331e);

    /* JADX INFO: renamed from: c */
    public Throwable f10333c;

    public static final class PublishSubscription<T> extends AtomicLong implements ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f10334a;

        /* JADX INFO: renamed from: b */
        public final PublishProcessor f10335b;

        public PublishSubscription(ft51 ft51Var, PublishProcessor publishProcessor) {
            this.f10334a = ft51Var;
            this.f10335b = publishProcessor;
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f10335b.m23788e0(this);
            }
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23743b(this, j);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        AtomicReference atomicReference;
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        PublishSubscription publishSubscription = new PublishSubscription(ft51Var, this);
        ft51Var.onSubscribe(publishSubscription);
        do {
            atomicReference = this.f10332b;
            publishSubscriptionArr = (PublishSubscription[]) atomicReference.get();
            if (publishSubscriptionArr == f10330d) {
                Throwable th = this.f10333c;
                if (th != null) {
                    ft51Var.onError(th);
                    return;
                } else {
                    ft51Var.onComplete();
                    return;
                }
            }
            int length = publishSubscriptionArr.length;
            publishSubscriptionArr2 = new PublishSubscription[length + 1];
            System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, length);
            publishSubscriptionArr2[length] = publishSubscription;
        } while (!tfe.m80660r(atomicReference, publishSubscriptionArr, publishSubscriptionArr2));
        if (publishSubscription.get() == Long.MIN_VALUE) {
            m23788e0(publishSubscription);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m23788e0(PublishSubscription publishSubscription) {
        AtomicReference atomicReference;
        PublishSubscription[] publishSubscriptionArr;
        PublishSubscription[] publishSubscriptionArr2;
        do {
            atomicReference = this.f10332b;
            publishSubscriptionArr = (PublishSubscription[]) atomicReference.get();
            if (publishSubscriptionArr == f10330d || publishSubscriptionArr == (publishSubscriptionArr2 = f10331e)) {
                return;
            }
            int length = publishSubscriptionArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (publishSubscriptionArr[i] == publishSubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                publishSubscriptionArr2 = new PublishSubscription[length - 1];
                System.arraycopy(publishSubscriptionArr, 0, publishSubscriptionArr2, 0, i);
                System.arraycopy(publishSubscriptionArr, i + 1, publishSubscriptionArr2, i, (length - i) - 1);
            }
        } while (!tfe.m80660r(atomicReference, publishSubscriptionArr, publishSubscriptionArr2));
    }

    @Override // p204p.ft51
    public final void onComplete() {
        AtomicReference atomicReference = this.f10332b;
        Object obj = atomicReference.get();
        Object obj2 = f10330d;
        if (obj == obj2) {
            return;
        }
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) atomicReference.getAndSet(obj2);
        for (PublishSubscription publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.f10334a.onComplete();
            }
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        AtomicReference atomicReference = this.f10332b;
        Object obj = atomicReference.get();
        Object obj2 = f10330d;
        if (obj == obj2) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10333c = th;
        PublishSubscription[] publishSubscriptionArr = (PublishSubscription[]) atomicReference.getAndSet(obj2);
        for (PublishSubscription publishSubscription : publishSubscriptionArr) {
            if (publishSubscription.get() != Long.MIN_VALUE) {
                publishSubscription.f10334a.onError(th);
            } else {
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        for (PublishSubscription publishSubscription : (PublishSubscription[]) this.f10332b.get()) {
            ft51 ft51Var = publishSubscription.f10334a;
            long j = publishSubscription.get();
            if (j != Long.MIN_VALUE) {
                if (j != 0) {
                    ft51Var.onNext(obj);
                    BackpressureHelper.m23747f(publishSubscription, 1L);
                } else {
                    publishSubscription.cancel();
                    ft51Var.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                }
            }
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (this.f10332b.get() == f10330d) {
            ot51Var.cancel();
        } else {
            ot51Var.request(Long.MAX_VALUE);
        }
    }
}
