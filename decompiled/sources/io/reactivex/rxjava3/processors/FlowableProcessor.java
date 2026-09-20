package io.reactivex.rxjava3.processors;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import p204p.ft51;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements ft51, FlowableSubscriber<T> {
    /* JADX INFO: renamed from: d0 */
    public final FlowableProcessor m23787d0() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor((UnicastProcessor) this);
    }
}
