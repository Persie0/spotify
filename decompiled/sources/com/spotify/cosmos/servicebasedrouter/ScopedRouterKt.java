package com.spotify.cosmos.servicebasedrouter;

import com.spotify.cosmos.cosmos.Response;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"isSuccessful", "", "Lcom/spotify/cosmos/cosmos/Response;", "(Lcom/spotify/cosmos/cosmos/Response;)Z", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 2, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ScopedRouterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSuccessful(Response response) {
        int status = response.getStatus();
        return 200 <= status && status < 300;
    }
}
