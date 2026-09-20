package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosComponentInstallerModule;", "", "<init>", "()V", "cosmosComponent", "Lcom/spotify/cosmos/cosmoscomponentapi/CosmosComponentApi;", "deps", "Lcom/spotify/cosmos/cosmonautdi/CosmosDeps;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmosComponentInstallerModule {
    public static final CosmosComponentInstallerModule INSTANCE = new CosmosComponentInstallerModule();

    private CosmosComponentInstallerModule() {
    }

    public final CosmosComponentApi cosmosComponent(CosmosDeps deps) {
        return DaggerCosmosComponent.factory().create(deps);
    }
}
