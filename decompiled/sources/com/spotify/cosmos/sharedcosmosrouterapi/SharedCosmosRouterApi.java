package com.spotify.cosmos.sharedcosmosrouterapi;

import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/sharedcosmosrouterapi/SharedCosmosRouterApi;", "", "nativeRouter", "Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "getNativeRouter", "()Lcom/spotify/cosmos/cosmosimpl/NativeRouter;", "remoteNativeRouter", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "getRemoteNativeRouter", "()Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterapi-sharedcosmosrouterapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface SharedCosmosRouterApi {
    NativeRouter getNativeRouter();

    RemoteNativeRouter getRemoteNativeRouter();
}
