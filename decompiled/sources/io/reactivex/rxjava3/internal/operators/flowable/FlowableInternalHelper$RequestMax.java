package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.functions.Consumer;
import p204p.ot51;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class FlowableInternalHelper$RequestMax implements Consumer<ot51> {

    /* JADX INFO: renamed from: a */
    public static final FlowableInternalHelper$RequestMax f7875a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ FlowableInternalHelper$RequestMax[] f7876b;

    static {
        FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax = new FlowableInternalHelper$RequestMax("INSTANCE", 0);
        f7875a = flowableInternalHelper$RequestMax;
        f7876b = new FlowableInternalHelper$RequestMax[]{flowableInternalHelper$RequestMax};
    }

    public static FlowableInternalHelper$RequestMax valueOf(String str) {
        return (FlowableInternalHelper$RequestMax) Enum.valueOf(FlowableInternalHelper$RequestMax.class, str);
    }

    public static FlowableInternalHelper$RequestMax[] values() {
        return (FlowableInternalHelper$RequestMax[]) f7876b.clone();
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        ((ot51) obj).request(Long.MAX_VALUE);
    }
}
