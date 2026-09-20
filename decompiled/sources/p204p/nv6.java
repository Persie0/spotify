package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class nv6 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m011 f158808a;

    public nv6(m011 m011Var) {
        this.f158808a = m011Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        uv6 uv6Var = (uv6) obj;
        Object objM60397a = this.f158808a.m60397a(new bcr0(uv6Var.f234375d, uv6Var.f234376e), ibkVar);
        return objM60397a == yuk.f276404a ? objM60397a : w2a1.f247311a;
    }
}
