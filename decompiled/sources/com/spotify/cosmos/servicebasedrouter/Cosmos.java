package com.spotify.cosmos.servicebasedrouter;

import com.spotify.cosmos.observability.CosmosRequestObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/Cosmos;", "", "<init>", "()V", "Companion", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class Cosmos {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/Cosmos$Companion;", "", "<init>", "()V", "Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "observer", "Lp/w2a1;", "setObserver", "(Lcom/spotify/cosmos/observability/CosmosRequestObserver;)V", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setObserver(CosmosRequestObserver observer) {
            RemoteNativeRouter.INSTANCE.setObserver(observer);
        }

        private Companion() {
        }
    }

    public static final void setObserver(CosmosRequestObserver cosmosRequestObserver) {
        INSTANCE.setObserver(cosmosRequestObserver);
    }
}
