package p204p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter;

/* JADX INFO: loaded from: classes2.dex */
public final class b751 implements EsperantoCallbackRouter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CallbackRouter f24166a;

    public b751(CallbackRouter callbackRouter) {
        this.f24166a = callbackRouter;
    }

    @Override // com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter
    public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
        return this.f24166a.resolve(request, resolveCallback);
    }
}
