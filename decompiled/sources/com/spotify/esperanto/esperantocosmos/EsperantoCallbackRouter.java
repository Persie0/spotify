package com.spotify.esperanto.esperantocosmos;

import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/esperanto/esperantocosmos/EsperantoCallbackRouter;", "", "resolve", "Lcom/spotify/cosmos/cosmos/Lifetime;", "request", "Lcom/spotify/cosmos/cosmos/Request;", "callback", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "src_main_java_com_spotify_esperanto_esperantocosmos-esperantocosmos_kt-api"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface EsperantoCallbackRouter {
    Lifetime resolve(Request request, ResolveCallback callback);
}
