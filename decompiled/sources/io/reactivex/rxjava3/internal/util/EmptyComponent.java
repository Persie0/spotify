package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p204p.ot51;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, ot51, Disposable {

    /* JADX INFO: renamed from: a */
    public static final EmptyComponent f10252a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EmptyComponent[] f10253b;

    static {
        EmptyComponent emptyComponent = new EmptyComponent("INSTANCE", 0);
        f10252a = emptyComponent;
        f10253b = new EmptyComponent[]{emptyComponent};
    }

    public static EmptyComponent valueOf(String str) {
        return (EmptyComponent) Enum.valueOf(EmptyComponent.class, str);
    }

    public static EmptyComponent[] values() {
        return (EmptyComponent[]) f10253b.clone();
    }

    @Override // p204p.ot51
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // p204p.ft51
    public final void onComplete() {
    }

    @Override // p204p.ft51
    public final void onError(Throwable th) {
        RxJavaPlugins.m23782b(th);
    }

    @Override // p204p.ft51
    public final void onNext(Object obj) {
    }

    @Override // io.reactivex.rxjava3.core.Observer, io.reactivex.rxjava3.core.CompletableObserver
    public final void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
    public final void onSuccess(Object obj) {
    }

    @Override // p204p.ot51
    public final void request(long j) {
    }

    @Override // p204p.ft51
    public final void onSubscribe(ot51 ot51Var) {
        ot51Var.cancel();
    }
}
