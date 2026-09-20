package p204p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;

/* JADX INFO: loaded from: classes.dex */
public final class fbb implements CallbackRouter {

    /* JADX INFO: renamed from: a */
    public final CallbackRouter f67776a;

    /* JADX INFO: renamed from: b */
    public final CallbackRouter f67777b;

    static {
        new ti5(2);
    }

    public fbb(CallbackRouter callbackRouter, CallbackRouter callbackRouter2) {
        this.f67776a = callbackRouter;
        this.f67777b = callbackRouter2;
    }

    @Override // com.spotify.cosmos.callbackrouter.CallbackRouter
    public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
        return ti5.m80907n(request) ? this.f67777b.resolve(request, resolveCallback) : this.f67776a.resolve(request, resolveCallback);
    }
}
