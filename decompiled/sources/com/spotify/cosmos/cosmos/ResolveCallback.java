package com.spotify.cosmos.cosmos;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmos/ResolveCallback;", "", "Lcom/spotify/cosmos/cosmos/Response;", "response", "Lp/w2a1;", "onResolved", "(Lcom/spotify/cosmos/cosmos/Response;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "src_main_java_com_spotify_cosmos_cosmos-cosmos"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ResolveCallback {
    void onError(Throwable throwable);

    void onResolved(Response response);
}
