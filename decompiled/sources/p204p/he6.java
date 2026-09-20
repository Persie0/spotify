package p204p;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class he6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xe6 f90332a;

    public he6(xe6 xe6Var) {
        this.f90332a = xe6Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ComponentCallbacks2 componentCallbacks2 = (Activity) this.f90332a.f260643b.f54909a.get();
        if (componentCallbacks2 instanceof c7l0) {
            ((c7l0) componentCallbacks2).mo31751N().m28388d();
        } else {
            edb.m38545A("NavigateBackEffectHandler: Activity ", componentCallbacks2.getClass().getName(), " does not implement OnBackPressedDispatcherOwner");
        }
        return w2a1.f247311a;
    }
}
