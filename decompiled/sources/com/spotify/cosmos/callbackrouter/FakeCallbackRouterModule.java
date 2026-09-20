package com.spotify.cosmos.callbackrouter;

import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m24212d2 = {"Lcom/spotify/cosmos/callbackrouter/FakeCallbackRouterModule;", "", "<init>", "()V", "provideCallbackRouter", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "src_main_java_com_spotify_cosmos_callbackrouter-callbackrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class FakeCallbackRouterModule {
    public static final FakeCallbackRouterModule INSTANCE = new FakeCallbackRouterModule();

    private FakeCallbackRouterModule() {
    }

    public final CallbackRouter provideCallbackRouter() {
        return new CallbackRouter() { // from class: com.spotify.cosmos.callbackrouter.FakeCallbackRouterModule.provideCallbackRouter.1
            @Override // com.spotify.cosmos.callbackrouter.CallbackRouter
            public Lifetime resolve(Request request, ResolveCallback callback) {
                return new Lifetime() { // from class: com.spotify.cosmos.callbackrouter.FakeCallbackRouterModule$provideCallbackRouter$1$resolve$1
                    @Override // com.spotify.cosmos.cosmos.Lifetime
                    public void release() {
                    }
                };
            }
        };
    }
}
