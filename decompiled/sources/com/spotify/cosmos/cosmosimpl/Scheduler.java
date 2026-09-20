package com.spotify.cosmos.cosmosimpl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmosimpl/Scheduler;", "", "Ljava/lang/Runnable;", "callback", "Lp/w2a1;", "post", "(Ljava/lang/Runnable;)V", "", "isOnSchedulerThread", "()Z", "src_main_java_com_spotify_cosmos_cosmosimpl-cosmosimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Scheduler {
    boolean isOnSchedulerThread();

    void post(Runnable callback);
}
