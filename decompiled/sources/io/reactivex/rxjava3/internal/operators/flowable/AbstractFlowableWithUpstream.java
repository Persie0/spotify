package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final Flowable f7529b;

    public AbstractFlowableWithUpstream(Flowable flowable) {
        Objects.requireNonNull(flowable, "source is null");
        this.f7529b = flowable;
    }
}
