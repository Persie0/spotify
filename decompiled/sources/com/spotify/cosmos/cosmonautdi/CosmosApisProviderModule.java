package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;
import com.spotify.cosmos.rxrouter.RxRouterProvider;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\u000e"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosApisProviderModule;", "", "<init>", "()V", "provideFireAndForgetResolver", "Lcom/spotify/cosmos/fireandforgetresolver/FireAndForgetResolver;", "component", "Lcom/spotify/cosmos/cosmoscomponentapi/CosmosComponentApi;", "provideCosmonaut", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "provideCosmonautFactory", "Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "provideRxRouterProvider", "Lcom/spotify/cosmos/rxrouter/RxRouterProvider;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosApisProviderModule {
    public static final CosmosApisProviderModule INSTANCE = new CosmosApisProviderModule();

    private CosmosApisProviderModule() {
    }

    public final Cosmonaut provideCosmonaut(CosmosComponentApi component) {
        return component.getCosmonaut();
    }

    public final CosmonautFactory provideCosmonautFactory(CosmosComponentApi component) {
        return component.getCosmonautFactory();
    }

    public final FireAndForgetResolver provideFireAndForgetResolver(CosmosComponentApi component) {
        return component.getFireAndForgetResolver();
    }

    public final RxRouterProvider provideRxRouterProvider(CosmosComponentApi component) {
        return component.getRxRouterProvider();
    }
}
