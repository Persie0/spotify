package p204p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.cosmos.Lifetime;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.cosmos.cosmos.ResolveCallback;
import com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter;

/* JADX INFO: loaded from: classes5.dex */
public final class mof implements EsperantoCallbackRouter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallbackRouter f145666b;

    public /* synthetic */ mof(CallbackRouter callbackRouter, int i) {
        this.f145665a = i;
        this.f145666b = callbackRouter;
    }

    @Override // com.spotify.esperanto.esperantocosmos.EsperantoCallbackRouter
    public final Lifetime resolve(Request request, ResolveCallback resolveCallback) {
        switch (this.f145665a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        return this.f145666b.resolve(request, resolveCallback);
    }
}
