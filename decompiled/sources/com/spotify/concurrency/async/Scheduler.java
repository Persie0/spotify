package com.spotify.concurrency.async;

import com.spotify.player.model.command.SignalCommand;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/concurrency/async/Scheduler;", "", "Ljava/lang/Runnable;", "callback", "Lp/w2a1;", "runBlocking", "(Ljava/lang/Runnable;)V", "post", "", SignalCommand.ENDPOINT_NAME, "kill", "(I)V", "", "isCurrentThread", "()Z", "src_main_java_com_spotify_concurrency_async-async"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Scheduler {
    boolean isCurrentThread();

    void kill(int signal);

    void post(Runnable callback);

    void runBlocking(Runnable callback);
}
