package com.spotify.cosmos.servicebasedrouter;

import android.os.Binder;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.cosmos.cosmos.Response;
import com.spotify.cosmos.cosmos.Router;
import com.spotify.cosmos.cosmosimpl.NativeRouter;
import com.spotify.cosmos.observability.CosmosRequestObserver;
import com.spotify.cosmos.routercallback.ResolverCallbackReceiver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.na6;
import p204p.s571;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000 ,2\u00020\u0001:\u0004,-./B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\tR\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJO\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\f\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010&\u001a\u00020%8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00060"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "Landroid/os/Binder;", "Lcom/spotify/cosmos/cosmos/Router;", "nativeRouter", "<init>", "(Lcom/spotify/cosmos/cosmos/Router;)V", "()V", "Lcom/spotify/cosmos/cosmos/Request;", "request", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$SubscriptionResolveCallback;", "callback", "Lcom/spotify/cosmos/cosmos/Lifetime;", "resolve", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$SubscriptionResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", "", "action", "uri", "", "headers", "", "body", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "Lcom/spotify/cosmos/cosmos/Response;", "receiver", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[BLcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;)Lcom/spotify/cosmos/cosmos/Lifetime;", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "wrapper", "performNativeResolve", "(Lcom/spotify/cosmos/cosmos/Request;Lcom/spotify/cosmos/cosmos/ResolveCallback;)Lcom/spotify/cosmos/cosmos/Lifetime;", "Lp/w2a1;", "destroy", "Lcom/spotify/cosmos/cosmos/Router;", "getNativeRouter", "()Lcom/spotify/cosmos/cosmos/Router;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "destroyLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "", "routerDestroyed", "Z", "getRouterDestroyed", "()Z", "setRouterDestroyed", "(Z)V", "Companion", "SubscriptionResolveCallback", "NullResolveCallback", "WeakResolveCallbackWrapper", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public class RemoteNativeRouter extends Binder {
    private final ReentrantReadWriteLock destroyLock;
    private final Router nativeRouter;
    private volatile boolean routerDestroyed;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static CosmosRequestObserver sRequestObserver = CosmosRequestObserver.INSTANCE.getNO_OP();
    private static final int INVALID_SUBSCRIPTION_ID = -1;

    @Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0086D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$Companion;", "", "<init>", "()V", "Lcom/spotify/cosmos/cosmos/Response;", "response", "", "requestUri", "Lp/w2a1;", "logIfEmptyResponse", "(Lcom/spotify/cosmos/cosmos/Response;Ljava/lang/String;)V", "Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "requestObserver", "setObserver", "(Lcom/spotify/cosmos/observability/CosmosRequestObserver;)V", "", "INVALID_SUBSCRIPTION_ID", "I", "getINVALID_SUBSCRIPTION_ID", "()I", "sRequestObserver", "Lcom/spotify/cosmos/observability/CosmosRequestObserver;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void logIfEmptyResponse(Response response, String requestUri) {
            if (response == null) {
                Logger.m3966b("Null response for %s: ", requestUri);
                return;
            }
            if (response.getBody() == null) {
                Logger.m3966b("Response code: %d, Null response body for %s: ", Integer.valueOf(response.getStatus()), requestUri);
                return;
            }
            byte[] body = response.getBody();
            if (body == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (body.length == 0) {
                if (response.getStatus() < 200 || response.getStatus() > 202) {
                    Logger.m3966b("Response code: %d, Empty response body for %s: ", Integer.valueOf(response.getStatus()), requestUri);
                }
            }
        }

        public final int getINVALID_SUBSCRIPTION_ID() {
            return RemoteNativeRouter.INVALID_SUBSCRIPTION_ID;
        }

        public final void setObserver(CosmosRequestObserver requestObserver) {
            RemoteNativeRouter.sRequestObserver = requestObserver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$NullResolveCallback;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$SubscriptionResolveCallback;", "Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;", "", "requestUri", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;Ljava/lang/String;)V", "Lcom/spotify/cosmos/cosmos/Response;", "response", "Lp/w2a1;", "onResolved", "(Lcom/spotify/cosmos/cosmos/Response;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "", "getId", "()I", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public final class NullResolveCallback extends SubscriptionResolveCallback {
        public NullResolveCallback(String str) {
            super(null, str);
        }

        @Override // com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter.SubscriptionResolveCallback
        public int getId() {
            return RemoteNativeRouter.INSTANCE.getINVALID_SUBSCRIPTION_ID();
        }

        @Override // com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter.SubscriptionResolveCallback, com.spotify.cosmos.cosmos.ResolveCallback
        public void onError(Throwable throwable) {
        }

        @Override // com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter.SubscriptionResolveCallback, com.spotify.cosmos.cosmos.ResolveCallback
        public void onResolved(Response response) {
        }
    }

    @Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0092\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$SubscriptionResolveCallback;", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "Lcom/spotify/cosmos/cosmos/Response;", "resolverCallbackReceiver", "", "requestUri", "<init>", "(Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter;Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;Ljava/lang/String;)V", "response", "Lp/w2a1;", "onResolved", "(Lcom/spotify/cosmos/cosmos/Response;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "", "getId", "()I", "destroy", "()V", "Lcom/spotify/cosmos/routercallback/ResolverCallbackReceiver;", "Ljava/lang/String;", "", "isCancelled", "Z", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public class SubscriptionResolveCallback implements ResolveCallback {
        private boolean isCancelled;
        private final String requestUri;
        private final ResolverCallbackReceiver<Response> resolverCallbackReceiver;

        public SubscriptionResolveCallback(ResolverCallbackReceiver<Response> resolverCallbackReceiver, String str) {
            this.resolverCallbackReceiver = resolverCallbackReceiver;
            this.requestUri = str;
        }

        public void destroy() {
            this.isCancelled = true;
        }

        public int getId() {
            ResolverCallbackReceiver<Response> resolverCallbackReceiver = this.resolverCallbackReceiver;
            if (resolverCallbackReceiver != null) {
                return resolverCallbackReceiver.getId();
            }
            throw new IllegalStateException("Required value was null.");
        }

        @Override // com.spotify.cosmos.cosmos.ResolveCallback
        public void onError(Throwable throwable) {
            if (RemoteNativeRouter.this.getRouterDestroyed() || this.isCancelled) {
                return;
            }
            ResolverCallbackReceiver<Response> resolverCallbackReceiver = this.resolverCallbackReceiver;
            if (resolverCallbackReceiver == null) {
                throw new IllegalStateException("Required value was null.");
            }
            resolverCallbackReceiver.sendOnError(throwable);
        }

        @Override // com.spotify.cosmos.cosmos.ResolveCallback
        public void onResolved(Response response) {
            if (RemoteNativeRouter.this.getRouterDestroyed() || this.isCancelled) {
                return;
            }
            try {
                RemoteNativeRouter.INSTANCE.logIfEmptyResponse(response, this.requestUri);
                ResolverCallbackReceiver<Response> resolverCallbackReceiver = this.resolverCallbackReceiver;
                if (resolverCallbackReceiver == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                resolverCallbackReceiver.sendOnResolved(response);
            } catch (Exception e) {
                onError(new RuntimeException(s571.m77251j("onResolved(", this.requestUri, ") failed."), e));
            }
        }
    }

    @Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m24212d2 = {"Lcom/spotify/cosmos/servicebasedrouter/RemoteNativeRouter$WeakResolveCallbackWrapper;", "Lcom/spotify/cosmos/cosmos/ResolveCallback;", "", "id", "resolveCallback", "<init>", "(Ljava/lang/String;Lcom/spotify/cosmos/cosmos/ResolveCallback;)V", "Lcom/spotify/cosmos/cosmos/Response;", "response", "Lp/w2a1;", "onResolved", "(Lcom/spotify/cosmos/cosmos/Response;)V", "", "throwable", "onError", "(Ljava/lang/Throwable;)V", "Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "ref", "Ljava/lang/ref/WeakReference;", "src_main_java_com_spotify_cosmos_servicebasedrouter-servicebasedrouter"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class WeakResolveCallbackWrapper implements ResolveCallback {
        private final String id;
        private final WeakReference<ResolveCallback> ref;

        public WeakResolveCallbackWrapper(String str, ResolveCallback resolveCallback) {
            this.id = str;
            this.ref = new WeakReference<>(resolveCallback);
        }

        @Override // com.spotify.cosmos.cosmos.ResolveCallback
        public void onError(Throwable throwable) {
            ResolveCallback resolveCallback = this.ref.get();
            RemoteNativeRouter.sRequestObserver.onError(this.id, throwable);
            if (resolveCallback != null) {
                resolveCallback.onError(throwable);
            }
        }

        @Override // com.spotify.cosmos.cosmos.ResolveCallback
        public void onResolved(Response response) {
            ResolveCallback resolveCallback = this.ref.get();
            try {
                RemoteNativeRouter.sRequestObserver.onResponse(this.id, response);
                if (resolveCallback != null) {
                    resolveCallback.onResolved(response);
                }
            } catch (Exception e) {
                na6.m63959g("Caught an Exception in ResolveCallback.onResolved", e);
            } catch (OutOfMemoryError e2) {
                na6.m63959g("Caught an OutOfMemoryError in ResolveCallback.onResolved", e2);
                throw new RuntimeException("OutOfMemoryError converted to RuntimeException", e2);
            }
        }
    }

    public RemoteNativeRouter(Router router) {
        this.nativeRouter = router;
        this.destroyLock = new ReentrantReadWriteLock();
    }

    public void destroy() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.destroyLock;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (this.routerDestroyed) {
                throw new IllegalStateException("Router already destroyed");
            }
            this.routerDestroyed = true;
            getNativeRouter().destroy();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public Router getNativeRouter() {
        return this.nativeRouter;
    }

    public final boolean getRouterDestroyed() {
        return this.routerDestroyed;
    }

    public Lifetime performNativeResolve(Request request, ResolveCallback wrapper) {
        return getNativeRouter().resolve(request, wrapper);
    }

    public Lifetime resolve(String action, String uri, Map<String, String> headers, byte[] body, ResolverCallbackReceiver<Response> receiver) {
        return resolve(new Request(action, uri, headers, body), receiver == null ? new NullResolveCallback(uri) : new SubscriptionResolveCallback(receiver, uri));
    }

    public final void setRouterDestroyed(boolean z) {
        this.routerDestroyed = z;
    }

    public RemoteNativeRouter() {
        this(new NativeRouter());
    }

    private final Lifetime resolve(Request request, final SubscriptionResolveCallback callback) {
        String uri = request.getUri();
        String strValueOf = String.valueOf(callback.getId());
        sRequestObserver.onRequest(strValueOf, request);
        WeakResolveCallbackWrapper weakResolveCallbackWrapper = new WeakResolveCallbackWrapper(strValueOf, callback);
        ReentrantReadWriteLock.ReadLock lock = this.destroyLock.readLock();
        lock.lock();
        try {
            if (this.routerDestroyed) {
                Logger.m3969e("(Router Destroyed) Dropping request for uri = %s", uri);
                return Lifetime.UNRESOLVED;
            }
            final Lifetime lifetimePerformNativeResolve = performNativeResolve(request, weakResolveCallbackWrapper);
            return new Lifetime() { // from class: com.spotify.cosmos.servicebasedrouter.RemoteNativeRouter.resolve.1
                @Override // com.spotify.cosmos.cosmos.Lifetime
                public void release() {
                    callback.destroy();
                    Lifetime lifetime = lifetimePerformNativeResolve;
                    if (lifetime == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    lifetime.release();
                }
            };
        } finally {
            lock.unlock();
        }
    }
}
