package io.reactivex.rxjava3.internal.operators.flowable;

import androidx.car.app.model.Alert;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.functions.Function;
import p204p.ft51;
import p204p.i7t0;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapSinglePublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final i7t0 f7829b;

    /* JADX INFO: renamed from: c */
    public final Function f7830c;

    /* JADX INFO: renamed from: d */
    public final boolean f7831d;

    /* JADX INFO: renamed from: e */
    public final int f7832e = Alert.DURATION_SHOW_INDEFINITELY;

    public FlowableFlatMapSinglePublisher(i7t0 i7t0Var, Function function, boolean z) {
        this.f7829b = i7t0Var;
        this.f7830c = function;
        this.f7831d = z;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    /* JADX INFO: renamed from: V */
    public final void mo23341V(ft51 ft51Var) {
        this.f7829b.subscribe(new FlowableFlatMapSingle.FlatMapSingleSubscriber(this.f7832e, this.f7830c, ft51Var, this.f7831d));
    }
}
