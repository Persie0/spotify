package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class y7t implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gfi0 f270131a;

    public y7t(gfi0 gfi0Var) {
        this.f270131a = gfi0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objM44621a = this.f270131a.m44621a(ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM44621a != yukVar) {
            objM44621a = w2a1Var;
        }
        return objM44621a == yukVar ? objM44621a : w2a1Var;
    }
}
