package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class m411 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m011 f139792a;

    public m411(m011 m011Var) {
        this.f139792a = m011Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Object objM60397a = this.f139792a.m60397a(new zbr0(((l411) obj).f129479a), ibkVar);
        return objM60397a == yuk.f276404a ? objM60397a : w2a1.f247311a;
    }
}
