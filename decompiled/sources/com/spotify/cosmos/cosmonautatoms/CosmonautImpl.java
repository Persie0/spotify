package com.spotify.cosmos.cosmonautatoms;

import com.spotify.cosmos.cosmonaut.Converter;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.rxrouter.RxRouter;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u0002H\u000e\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0010H\u0016¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautatoms/CosmonautImpl;", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "rxRouter", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "factories", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "<init>", "(Lcom/spotify/cosmos/rxrouter/RxRouter;Ljava/util/List;)V", "getFactories", "()Ljava/util/List;", "cosmonautHandler", "Lcom/spotify/cosmos/cosmonautatoms/CosmonautHandler;", "createCosmosService", "T", "serviceClazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "src_main_java_com_spotify_cosmos_cosmonautatoms-cosmonautatoms"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmonautImpl implements Cosmonaut {
    private final CosmonautHandler cosmonautHandler;
    private final List<Converter.Factory> factories;
    private final RxRouter rxRouter;

    /* JADX WARN: Multi-variable type inference failed */
    public CosmonautImpl(RxRouter rxRouter, List<? extends Converter.Factory> list) {
        this.rxRouter = rxRouter;
        this.factories = list;
        this.cosmonautHandler = new CosmonautHandler(list);
    }

    @Override // com.spotify.cosmos.cosmonaut.Cosmonaut
    public <T> T createCosmosService(Class<T> serviceClazz) {
        return (T) this.cosmonautHandler.create(serviceClazz, this.rxRouter);
    }

    public final List<Converter.Factory> getFactories() {
        return this.factories;
    }
}
