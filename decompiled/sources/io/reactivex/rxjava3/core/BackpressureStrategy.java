package io.reactivex.rxjava3.core;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class BackpressureStrategy {

    /* JADX INFO: renamed from: a */
    public static final BackpressureStrategy f7187a;

    /* JADX INFO: renamed from: b */
    public static final BackpressureStrategy f7188b;

    /* JADX INFO: renamed from: c */
    public static final BackpressureStrategy f7189c;

    /* JADX INFO: renamed from: d */
    public static final BackpressureStrategy f7190d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ BackpressureStrategy[] f7191e;

    static {
        BackpressureStrategy backpressureStrategy = new BackpressureStrategy("MISSING", 0);
        f7187a = backpressureStrategy;
        BackpressureStrategy backpressureStrategy2 = new BackpressureStrategy(SearchEndpointResponseKt.RESULT_ERROR, 1);
        BackpressureStrategy backpressureStrategy3 = new BackpressureStrategy("BUFFER", 2);
        f7188b = backpressureStrategy3;
        BackpressureStrategy backpressureStrategy4 = new BackpressureStrategy("DROP", 3);
        f7189c = backpressureStrategy4;
        BackpressureStrategy backpressureStrategy5 = new BackpressureStrategy("LATEST", 4);
        f7190d = backpressureStrategy5;
        f7191e = new BackpressureStrategy[]{backpressureStrategy, backpressureStrategy2, backpressureStrategy3, backpressureStrategy4, backpressureStrategy5};
    }

    public static BackpressureStrategy valueOf(String str) {
        return (BackpressureStrategy) Enum.valueOf(BackpressureStrategy.class, str);
    }

    public static BackpressureStrategy[] values() {
        return (BackpressureStrategy[]) f7191e.clone();
    }
}
