package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class wh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gu3 f251214a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nx0 f251215b;

    public wh0(gu3 gu3Var, nx0 nx0Var) {
        this.f251214a = gu3Var;
        this.f251215b = nx0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wa6 wa6Var = (wa6) obj;
        if (this.f251214a.m45717c()) {
            this.f251215b.mo46879b(wa6Var.f249402a);
        }
        return w2a1.f247311a;
    }
}
