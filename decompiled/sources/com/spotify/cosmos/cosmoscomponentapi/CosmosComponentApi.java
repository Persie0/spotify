package com.spotify.cosmos.cosmoscomponentapi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmoscomponentapi/CosmosComponentApi;", "", "fireAndForgetResolver", "Lcom/spotify/cosmos/fireandforgetresolver/FireAndForgetResolver;", "getFireAndForgetResolver", "()Lcom/spotify/cosmos/fireandforgetresolver/FireAndForgetResolver;", "cosmonaut", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "getCosmonaut", "()Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "cosmonautFactory", "Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "getCosmonautFactory", "()Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "rxRouterProvider", "Lcom/spotify/cosmos/rxrouter/RxRouterProvider;", "getRxRouterProvider", "()Lcom/spotify/cosmos/rxrouter/RxRouterProvider;", "src_main_java_com_spotify_cosmos_cosmoscomponentapi-cosmoscomponentapi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CosmosComponentApi {
    Cosmonaut getCosmonaut();

    CosmonautFactory getCosmonautFactory();

    FireAndForgetResolver getFireAndForgetResolver();

    RxRouterProvider getRxRouterProvider();
}
