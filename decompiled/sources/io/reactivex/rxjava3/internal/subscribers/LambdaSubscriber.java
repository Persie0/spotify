package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.observers.LambdaConsumerIntrospection;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import p204p.ot51;

/* JADX INFO: loaded from: classes2.dex */
public final class LambdaSubscriber<T> extends AtomicReference<ot51> implements FlowableSubscriber<T>, ot51, Disposable, LambdaConsumerIntrospection {

    /* JADX INFO: renamed from: a */
    public final Consumer f10215a;

    /* JADX INFO: renamed from: b */
    public final Consumer f10216b;

    /* JADX INFO: renamed from: c */
    public final Action f10217c;

    /* JADX INFO: renamed from: d */
    public final FlowableInternalHelper$RequestMax f10218d = FlowableInternalHelper$RequestMax.f7875a;

    public LambdaSubscriber(Consumer consumer, Consumer consumer2, Action action) {
        this.f10215a = consumer;
        this.f10216b = consumer2;
        this.f10217c = action;
    }

    @Override // p204p.ot51
    public final void cancel() {
        SubscriptionHelper.m23728a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        SubscriptionHelper.m23728a(this);
    }

    @Override // io.reactivex.rxjava3.observers.LambdaConsumerIntrospection
    public final boolean hasCustomOnError() {
        return this.f10216b != Functions.f7230f;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return get() == SubscriptionHelper.f10243a;
    }

    @Override // p204p.ft51
    public final void onComplete() {
        ot51 ot51Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f10243a;
        if (ot51Var != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.f10217c.run();
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                RxJavaPlugins.m23782b(th);
            }
        }
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        ot51 ot51Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.f10243a;
        if (ot51Var == subscriptionHelper) {
            RxJavaPlugins.m23782b(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.f10216b.accept(th);
        } catch (Throwable th2) {
            Exceptions.m23404a(th2);
            RxJavaPlugins.m23782b(new CompositeException(th, th2));
        }
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
        if (isDisposed()) {
            return;
        }
        try {
            this.f10215a.accept(obj);
        } catch (Throwable th) {
            Exceptions.m23404a(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        if (SubscriptionHelper.m23731d(this, ot51Var)) {
            try {
                this.f10218d.accept(this);
            } catch (Throwable th) {
                Exceptions.m23404a(th);
                ot51Var.cancel();
                onError(th);
            }
        }
    }

    @Override // p204p.ot51
    public final void request(long j) {
        get().request(j);
    }
}
