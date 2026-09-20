package com.spotify.cosmos.observability;

import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.Response;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "", "", "id", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lp/w2a1;", "onRequest", "(Ljava/lang/String;Lcom/spotify/cosmos/cosmos/Request;)V", "Lcom/spotify/cosmos/cosmos/Response;", "response", "onResponse", "(Ljava/lang/String;Lcom/spotify/cosmos/cosmos/Response;)V", "", "throwable", "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "src_main_java_com_spotify_cosmos_observability-observability"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface CosmosRequestObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m24211d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m24212d2 = {"Lcom/spotify/cosmos/observability/CosmosRequestObserver$Companion;", "", "<init>", "()V", "NO_OP", "Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "getNO_OP$annotations", "getNO_OP", "()Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "src_main_java_com_spotify_cosmos_observability-observability"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CosmosRequestObserver NO_OP = new CosmosRequestObserver() { // from class: com.spotify.cosmos.observability.CosmosRequestObserver$Companion$NO_OP$1
            @Override // com.spotify.cosmos.observability.CosmosRequestObserver
            public void onError(String id, Throwable throwable) {
            }

            @Override // com.spotify.cosmos.observability.CosmosRequestObserver
            public void onRequest(String id, Request request) {
            }

            @Override // com.spotify.cosmos.observability.CosmosRequestObserver
            public void onResponse(String id, Response response) {
            }
        };

        private Companion() {
        }

        public static /* synthetic */ void getNO_OP$annotations() {
        }

        public final CosmosRequestObserver getNO_OP() {
            return NO_OP;
        }
    }

    static CosmosRequestObserver getNO_OP() {
        return INSTANCE.getNO_OP();
    }

    void onError(String id, Throwable throwable);

    void onRequest(String id, Request request);

    void onResponse(String id, Response response);
}
