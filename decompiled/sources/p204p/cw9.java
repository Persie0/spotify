package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class cw9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f42668a;

    public cw9(Consumer consumer) {
        this.f42668a = consumer;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ev9 ev9Var = (ev9) obj;
        this.f42668a.accept(new hy9(ev9Var.f63183a, ev9Var.f63184b));
        return w2a1.f247311a;
    }
}
