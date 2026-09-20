package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0005"}, m24212d2 = {"Lio/reactivex/rxjava3/internal/operators/flowable/FlowableWithUpstream;", "", "T", "R", "Lio/reactivex/rxjava3/core/Flowable;", "third_party_java_io_reactivex_rxjava3_internal_operators_flowable-rxjava3flowableext"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public abstract class FlowableWithUpstream<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: b */
    public final Flowable f8205b;

    public FlowableWithUpstream(Flowable flowable) {
        this.f8205b = flowable;
    }
}
