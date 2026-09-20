package com.spotify.cosmos.servicebasedrouter;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0011\u0010\f\u001a\u00020\r*\u00020\u000bH\u0002¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeCallbackRouter;", "Lcom/spotify/cosmos/callbackrouter/CallbackRouter;", "router", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;)V", "resolve", "Lcom/spotify/cosmos/cosmos/Lifetime;", "request", "Lcom/spotify/cosmos/cosmos/Request;", "callback", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "asResolverCallbackReceiver", "com/spotify/cosmos/servicebasedrouter/RemoteNativeCallbackRouter$asResolverCallbackReceiver$1", "(Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeCallbackRouter$asResolverCallbackReceiver$1;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class RemoteNativeCallbackRouter implements CallbackRouter {
    private final RemoteNativeRouter router;

    public RemoteNativeCallbackRouter(RemoteNativeRouter remoteNativeRouter) {
        this.router = remoteNativeRouter;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.spotify.cosmos.servicebasedrouter.RemoteNativeCallbackRouter$asResolverCallbackReceiver$1] */
    private final C06011 asResolverCallbackReceiver(final ResolveCallback resolveCallback) {
        return new ResolverCallbackReceiver<Response>() { // from class: com.spotify.cosmos.servicebasedrouter.RemoteNativeCallbackRouter.asResolverCallbackReceiver.1
            {
                super(null);
            }

            @Override // com.spotify.cosmos.routercallback.ResolverCallbackReceiver
            public void onError(Throwable error) {
                resolveCallback.onError(error);
            }

            @Override // com.spotify.cosmos.routercallback.ResolverCallbackReceiver
            public void onResolved(Response response) {
                resolveCallback.onResolved(response);
            }
        };
    }

    @Override // com.spotify.cosmos.callbackrouter.CallbackRouter
    public Lifetime resolve(Request request, ResolveCallback callback) {
        RemoteNativeRouter remoteNativeRouter = this.router;
        String action = request.getAction();
        if (action == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String uri = request.getUri();
        if (uri != null) {
            return remoteNativeRouter.resolve(action, uri, request.getHeaders(), request.getBody(), asResolverCallbackReceiver(callback));
        }
        throw new IllegalStateException("Required value was null.");
    }
}
