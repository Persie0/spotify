package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmoscomponentapi.CosmosComponentApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosComponent;", "Lcom/spotify/cosmos/cosmoscomponentapi/CosmosComponentApi;", "Factory", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CosmosComponent extends CosmosComponentApi {

    @Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmosComponent$Factory;", "", "create", "Lcom/spotify/cosmos/cosmonautdi/CosmosComponent;", "dependencies", "Lcom/spotify/cosmos/cosmonautdi/CosmosDeps;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public interface Factory {
        CosmosComponent create(CosmosDeps dependencies);
    }
}
