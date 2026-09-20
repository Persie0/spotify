package io.reactivex.rxjava3.core;

import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class BackpressureOverflowStrategy {

    /* JADX INFO: renamed from: a */
    public static final BackpressureOverflowStrategy f7185a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ BackpressureOverflowStrategy[] f7186b;

    /* JADX INFO: Fake field, exist only in values array */
    BackpressureOverflowStrategy EF0;

    static {
        BackpressureOverflowStrategy backpressureOverflowStrategy = new BackpressureOverflowStrategy(SearchEndpointResponseKt.RESULT_ERROR, 0);
        BackpressureOverflowStrategy backpressureOverflowStrategy2 = new BackpressureOverflowStrategy("DROP_OLDEST", 1);
        f7185a = backpressureOverflowStrategy2;
        f7186b = new BackpressureOverflowStrategy[]{backpressureOverflowStrategy, backpressureOverflowStrategy2, new BackpressureOverflowStrategy("DROP_LATEST", 2)};
    }

    public static BackpressureOverflowStrategy valueOf(String str) {
        return (BackpressureOverflowStrategy) Enum.valueOf(BackpressureOverflowStrategy.class, str);
    }

    public static BackpressureOverflowStrategy[] values() {
        return (BackpressureOverflowStrategy[]) f7186b.clone();
    }
}
