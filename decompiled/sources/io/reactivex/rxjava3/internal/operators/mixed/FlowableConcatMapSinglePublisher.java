package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ErrorMode;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatMapSinglePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final i7t0 f8420b;

    /* JADX INFO: renamed from: c */
    public final Function f8421c;

    /* JADX INFO: renamed from: d */
    public final ErrorMode f8422d = ErrorMode.f10254a;

    /* JADX INFO: renamed from: e */
    public final int f8423e;

    public FlowableConcatMapSinglePublisher(i7t0 i7t0Var, Function function, int i) {
        this.f8420b = i7t0Var;
        this.f8421c = function;
        this.f8423e = i;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f8420b.subscribe(new FlowableConcatMapSingle.ConcatMapSingleSubscriber(ft51Var, this.f8421c, this.f8423e, this.f8422d));
    }
}
