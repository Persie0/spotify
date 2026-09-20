package com.spotify.cosmos.cosmonautdi;

import com.spotify.cosmos.cosmonaut.Cosmonaut;
import com.spotify.cosmos.cosmonaut.CosmonautFactory;
import com.spotify.cosmos.rxrouter.RxRouter;
import kotlin.Metadata;
import p204p.fk60;
import p204p.p0i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmonautModule;", "", "Companion", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CosmonautModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m24212d2 = {"Lcom/spotify/cosmos/cosmonautdi/CosmonautModule$Companion;", "", "<init>", "()V", "Lp/p0i0;", "moshi", "Lp/fk60;", "json", "Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "provideCosmonautFactory", "(Lp/p0i0;Lp/fk60;)Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;", "cosmonautFactory", "Lcom/spotify/cosmos/rxrouter/RxRouter;", "rxRouter", "Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "provideCosmonaut", "(Lcom/spotify/cosmos/cosmonaut/CosmonautFactory;Lcom/spotify/cosmos/rxrouter/RxRouter;)Lcom/spotify/cosmos/cosmonaut/Cosmonaut;", "src_main_java_com_spotify_cosmos_cosmonautdi-cosmonautdi"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Cosmonaut provideCosmonaut(CosmonautFactory cosmonautFactory, RxRouter rxRouter) {
            return cosmonautFactory.provideCosmonaut(rxRouter);
        }

        public final CosmonautFactory provideCosmonautFactory(p0i0 moshi, fk60 json) {
            return new CosmonautFactoryImpl(moshi, json);
        }
    }
}
