package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSwitchMapSinglePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final i7t0 f8439b;

    /* JADX INFO: renamed from: c */
    public final Function f8440c;

    /* JADX INFO: renamed from: d */
    public final boolean f8441d;

    public FlowableSwitchMapSinglePublisher(i7t0 i7t0Var, Function function, boolean z) {
        this.f8439b = i7t0Var;
        this.f8440c = function;
        this.f8441d = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8439b.subscribe(new FlowableSwitchMapSingle.SwitchMapSingleSubscriber(ft51Var, this.f8440c, this.f8441d));
    }
}
