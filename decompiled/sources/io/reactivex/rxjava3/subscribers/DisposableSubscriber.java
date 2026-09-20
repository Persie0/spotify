package io.reactivex.rxjava3.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.EndConsumerHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DisposableSubscriber<T> implements FlowableSubscriber<T>, Disposable {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10448a = new AtomicReference();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        SubscriptionHelper.m23728a(this.f10448a);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f10448a.get() == SubscriptionHelper.f10243a;
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        AtomicReference atomicReference;
        Class<?> cls = getClass();
        Objects.requireNonNull(ot51Var, "next is null");
        do {
            atomicReference = this.f10448a;
            if (atomicReference.compareAndSet(null, ot51Var)) {
                ((ot51) atomicReference.get()).request(Long.MAX_VALUE);
                return;
            }
        } while (atomicReference.get() == null);
        ot51Var.cancel();
        if (atomicReference.get() != SubscriptionHelper.f10243a) {
            EndConsumerHelper.m23748a(cls);
        }
    }
}
