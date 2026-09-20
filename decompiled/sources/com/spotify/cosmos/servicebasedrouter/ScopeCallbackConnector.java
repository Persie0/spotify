package com.spotify.cosmos.servicebasedrouter;

import kotlin.Metadata;
import p204p.bhy0;
import p204p.eh00;
import p204p.gh00;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/ScopeCallbackConnector;", "", "Lkotlin/Function1;", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "Lp/w2a1;", "onAvailable", "Lkotlin/Function0;", "onBecomeUnavailable", "Lp/bhy0;", "connect", "(Lp/gh00;Lp/eh00;)Lp/bhy0;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ScopeCallbackConnector {
    bhy0 connect(gh00 onAvailable, eh00 onBecomeUnavailable);
}
