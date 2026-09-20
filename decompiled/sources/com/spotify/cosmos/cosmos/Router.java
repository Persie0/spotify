package com.spotify.cosmos.cosmos;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmos/Router;", "", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "callback", "Lcom/spotify/cosmos/cosmos/Lifetime;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", "Lp/w2a1;", "destroy", "()V", "src_main_java_com_spotify_cosmos_cosmos-cosmos"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface Router {
    void destroy();

    Lifetime resolve(Request request, ResolveCallback callback);
}
