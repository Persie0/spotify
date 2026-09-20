package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ot51;

/* JADX INFO: loaded from: classes11.dex */
public final class DisposableAutoReleaseSubscriber<T> extends AtomicReference<ot51> implements FlowableSubscriber<T>, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f10204a;

    /* JADX INFO: renamed from: b */
    public final Consumer f10205b;

    /* JADX INFO: renamed from: c */
    public final Consumer f10206c;

    /* JADX INFO: renamed from: d */
    public final Action f10207d;

    public DisposableAutoReleaseSubscriber(Consumer consumer, Consumer consumer2, Action action, DisposableContainer disposableContainer) {
        this.f10205b = consumer;
        this.f10206c = consumer2;
        this.f10207d = action;
        this.f10204a = new AtomicReference(disposableContainer);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.m23728a(this);
        DisposableContainer disposableContainer = (DisposableContainer) this.f10204a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.mo23394c(this);
        }
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f10206c != Functions.f7230f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return SubscriptionHelper.f10243a == get();
    }

    @Override // p204p.ft51
    public final void onComplete() {
        ot51 ot51Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f10243a;
        if (ot51Var != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f10207d.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
        DisposableContainer disposableContainer = (DisposableContainer) this.f10204a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.mo23394c(this);
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        ot51 ot51Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f10243a;
        if (ot51Var != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f10206c.accept(th);
            } catch (Throwable th2) {
                Exceptions.m23404a(th2);
                RxJavaPlugins.m23782b(new CompositeException(th, th2));
            }
        } else {
            RxJavaPlugins.m23782b(th);
        }
        DisposableContainer disposableContainer = (DisposableContainer) this.f10204a.getAndSet(null);
        if (disposableContainer != null) {
            disposableContainer.mo23394c(this);
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        if (get() != SubscriptionHelper.f10243a) {
            try {
                this.f10205b.accept(obj);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                get().cancel();
                onError(th);
            }
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23731d(this, ot51Var)) {
            ot51Var.request(Long.MAX_VALUE);
        }
    }
}
