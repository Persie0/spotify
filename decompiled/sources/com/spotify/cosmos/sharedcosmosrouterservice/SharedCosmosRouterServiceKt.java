package com.spotify.cosmos.sharedcosmosrouterservice;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m24212d2 = {"createSharedCosmosRouterService", "Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterService;", "dependencies", "Lcom/spotify/cosmos/sharedcosmosrouterservice/SharedCosmosRouterServiceDependencies;", "src_main_java_com_spotify_cosmos_sharedcosmosrouterservice-sharedcosmosrouterservice"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class SharedCosmosRouterServiceKt {
    public static final SharedCosmosRouterService createSharedCosmosRouterService(SharedCosmosRouterServiceDependencies sharedCosmosRouterServiceDependencies) {
        return DaggerSharedCosmosRouterServiceFactoryComponent.factory().create(sharedCosmosRouterServiceDependencies).sharedCosmosRouterService();
    }
}
