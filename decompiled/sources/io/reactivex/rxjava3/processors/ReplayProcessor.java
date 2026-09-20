package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ft51;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {

    /* JADX INFO: renamed from: e */
    public static final Object[] f10336e = new Object[0];

    /* JADX INFO: renamed from: f */
    public static final ReplaySubscription[] f10337f = new ReplaySubscription[0];

    /* JADX INFO: renamed from: g */
    public static final ReplaySubscription[] f10338g = new ReplaySubscription[0];

    /* JADX INFO: renamed from: b */
    public final UnboundedReplayBuffer f10339b;

    /* JADX INFO: renamed from: c */
    public boolean f10340c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f10341d = new AtomicReference(f10337f);

    public static final class ReplaySubscription<T> extends AtomicInteger implements ot51 {

        /* JADX INFO: renamed from: a */
        public final ft51 f10342a;

        /* JADX INFO: renamed from: b */
        public final ReplayProcessor f10343b;

        /* JADX INFO: renamed from: c */
        public Integer f10344c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f10345d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public volatile boolean f10346e;

        /* JADX INFO: renamed from: f */
        public long f10347f;

        public ReplaySubscription(ft51 ft51Var, ReplayProcessor replayProcessor) {
            this.f10342a = ft51Var;
            this.f10343b = replayProcessor;
        }

        @Override // p204p.ot51
        public final void cancel() {
            if (this.f10346e) {
                return;
            }
            this.f10346e = true;
            this.f10343b.m23790f0(this);
        }

        @Override // p204p.ot51
        public final void request(long j) {
            if (SubscriptionHelper.m23732e(j)) {
                BackpressureHelper.m23742a(this.f10345d, j);
                this.f10343b.f10339b.m23791a(this);
            }
        }
    }

    public static final class UnboundedReplayBuffer<T> {

        /* JADX INFO: renamed from: a */
        public final ArrayList f10348a = new ArrayList(16);

        /* JADX INFO: renamed from: b */
        public Throwable f10349b;

        /* JADX INFO: renamed from: c */
        public volatile boolean f10350c;

        /* JADX INFO: renamed from: d */
        public volatile int f10351d;

        /* JADX INFO: renamed from: a */
        public final void m23791a(ReplaySubscription replaySubscription) {
            int iIntValue;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            ArrayList arrayList = this.f10348a;
            ft51 ft51Var = replaySubscription.f10342a;
            Integer num = replaySubscription.f10344c;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
                replaySubscription.f10344c = 0;
            }
            long j = replaySubscription.f10347f;
            int iAddAndGet = 1;
            do {
                long j2 = replaySubscription.f10345d.get();
                while (j != j2) {
                    if (replaySubscription.f10346e) {
                        replaySubscription.f10344c = null;
                        return;
                    }
                    boolean z = this.f10350c;
                    int i = this.f10351d;
                    if (z && iIntValue == i) {
                        replaySubscription.f10344c = null;
                        replaySubscription.f10346e = true;
                        Throwable th = this.f10349b;
                        if (th == null) {
                            ft51Var.onComplete();
                            return;
                        } else {
                            ft51Var.onError(th);
                            return;
                        }
                    }
                    if (iIntValue == i) {
                        break;
                    }
                    ft51Var.onNext(arrayList.get(iIntValue));
                    iIntValue++;
                    j++;
                }
                if (j == j2) {
                    if (replaySubscription.f10346e) {
                        replaySubscription.f10344c = null;
                        return;
                    }
                    boolean z2 = this.f10350c;
                    int i2 = this.f10351d;
                    if (z2 && iIntValue == i2) {
                        replaySubscription.f10344c = null;
                        replaySubscription.f10346e = true;
                        Throwable th2 = this.f10349b;
                        if (th2 == null) {
                            ft51Var.onComplete();
                            return;
                        } else {
                            ft51Var.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.f10344c = Integer.valueOf(iIntValue);
                replaySubscription.f10347f = j;
                iAddAndGet = replaySubscription.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }
    }

    public ReplayProcessor(UnboundedReplayBuffer unboundedReplayBuffer) {
        this.f10339b = unboundedReplayBuffer;
    }

    /* JADX INFO: renamed from: e0 */
    public static ReplayProcessor m23789e0() {
        return new ReplayProcessor(new UnboundedReplayBuffer());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        ReplaySubscription replaySubscription = new ReplaySubscription(ft51Var, this);
        ft51Var.onSubscribe(replaySubscription);
        AtomicReference atomicReference = this.f10341d;
        loop0: while (true) {
            ReplaySubscription[] replaySubscriptionArr = (ReplaySubscription[]) atomicReference.get();
            if (replaySubscriptionArr == f10338g) {
                break;
            }
            int length = replaySubscriptionArr.length;
            ReplaySubscription[] replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
            do {
                if (atomicReference.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2)) {
                    if (!replaySubscription.f10346e) {
                        break loop0;
                    }
                    m23790f0(replaySubscription);
                    return;
                }
            } while (atomicReference.get() == replaySubscriptionArr);
        }
        this.f10339b.m23791a(replaySubscription);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final void m23790f0(ReplaySubscription replaySubscription) {
        ReplaySubscription[] replaySubscriptionArr;
        while (true) {
            AtomicReference atomicReference = this.f10341d;
            ReplaySubscription[] replaySubscriptionArr2 = (ReplaySubscription[]) atomicReference.get();
            if (replaySubscriptionArr2 == f10338g || replaySubscriptionArr2 == (replaySubscriptionArr = f10337f)) {
                return;
            }
            int length = replaySubscriptionArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (replaySubscriptionArr2[i] == replaySubscription) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length != 1) {
                replaySubscriptionArr = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr2, 0, replaySubscriptionArr, 0, i);
                System.arraycopy(replaySubscriptionArr2, i + 1, replaySubscriptionArr, i, (length - i) - 1);
            }
            while (!atomicReference.compareAndSet(replaySubscriptionArr2, replaySubscriptionArr)) {
                if (atomicReference.get() != replaySubscriptionArr2) {
                }
            }
            return;
        }
    }

    @Override // p204p.ft51
    public final void onComplete() {
        if (this.f10340c) {
            return;
        }
        this.f10340c = true;
        UnboundedReplayBuffer unboundedReplayBuffer = this.f10339b;
        unboundedReplayBuffer.f10350c = true;
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.f10341d.getAndSet(f10338g)) {
            unboundedReplayBuffer.m23791a(replaySubscription);
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        ExceptionHelper.m23751c(th, "onError called with a null Throwable.");
        if (this.f10340c) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        this.f10340c = true;
        UnboundedReplayBuffer unboundedReplayBuffer = this.f10339b;
        unboundedReplayBuffer.f10349b = th;
        unboundedReplayBuffer.f10350c = true;
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.f10341d.getAndSet(f10338g)) {
            unboundedReplayBuffer.m23791a(replaySubscription);
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        ExceptionHelper.m23751c(obj, "onNext called with a null value.");
        if (this.f10340c) {
            return;
        }
        UnboundedReplayBuffer unboundedReplayBuffer = this.f10339b;
        unboundedReplayBuffer.f10348a.add(obj);
        unboundedReplayBuffer.f10351d++;
        for (ReplaySubscription replaySubscription : (ReplaySubscription[]) this.f10341d.get()) {
            unboundedReplayBuffer.m23791a(replaySubscription);
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (this.f10340c) {
            ot51Var.cancel();
        } else {
            ot51Var.request(Long.MAX_VALUE);
        }
    }
}
