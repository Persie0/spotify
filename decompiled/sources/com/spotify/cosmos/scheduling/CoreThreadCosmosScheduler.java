package com.spotify.cosmos.scheduling;

import com.spotify.cosmos.cosmosimpl.Scheduler;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/cosmos/scheduling/CoreThreadCosmosScheduler;", "Lcom/spotify/cosmos/cosmosimpl/Scheduler;", "Lcom/spotify/concurrency/async/Scheduler;", "coreThread", "<init>", "(Lcom/spotify/concurrency/async/Scheduler;)V", "Ljava/lang/Runnable;", "callback", "Lp/w2a1;", "post", "(Ljava/lang/Runnable;)V", "", "isOnSchedulerThread", "()Z", "Lcom/spotify/concurrency/async/Scheduler;", "src_main_java_com_spotify_cosmos_scheduling-scheduling"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CoreThreadCosmosScheduler implements Scheduler {
    private final com.spotify.concurrency.async.Scheduler coreThread;

    public CoreThreadCosmosScheduler(com.spotify.concurrency.async.Scheduler scheduler) {
        this.coreThread = scheduler;
    }

    @Override // com.spotify.cosmos.cosmosimpl.Scheduler
    public boolean isOnSchedulerThread() {
        return this.coreThread.isCurrentThread();
    }

    @Override // com.spotify.cosmos.cosmosimpl.Scheduler
    public void post(Runnable callback) {
        this.coreThread.post(callback);
    }
}
