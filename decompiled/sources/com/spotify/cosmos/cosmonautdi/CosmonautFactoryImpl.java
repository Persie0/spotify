package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.converters.ByteArrayConverters;
import com.spotify.cosmos.converters.KotlinxSerializationCosmonautConverters;
import com.spotify.cosmos.converters.MoshiMigrationConverters;
import com.spotify.cosmos.converters.ProtoJavaliteConverters;
import com.spotify.cosmos.converters.StringConverters;
import com.spotify.cosmos.cosmonaut.Converter;
import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.cosmonautatoms.CosmonautImpl;
import com.spotify.cosmos.rxrouter.RxRouter;
import java.util.List;
import kotlin.Metadata;
import p204p.fk60;
import p204p.h6f;
import p204p.p0i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmonautFactoryImpl;", "Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "Lp/p0i0;", "moshi", "Lp/fk60;", "json", "<init>", "(Lp/p0i0;Lp/fk60;)V", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "provideCosmonaut", "(Lcom/spotify/cosmos/rxrouter/RxRouter;)Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "", "Lcom/spotify/cosmos/cosmonaut/Converter$Factory;", "converterFactories", "Ljava/util/List;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CosmonautFactoryImpl implements CosmonautFactory {
    private final List<Converter.Factory> converterFactories;

    public CosmonautFactoryImpl(p0i0 p0i0Var, fk60 fk60Var) {
        this.converterFactories = h6f.m46715L(new ByteArrayConverters(), new StringConverters(), new ProtoJavaliteConverters(), new MoshiMigrationConverters(p0i0Var), new KotlinxSerializationCosmonautConverters(fk60Var));
    }

    @Override // com.spotify.cosmos.cosmonaut.CosmonautFactory
    public Cosmonaut provideCosmonaut(RxRouter rxRouter) {
        return new CosmonautImpl(rxRouter, this.converterFactories);
    }
}
