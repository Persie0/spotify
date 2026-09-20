package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class um3 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wm3 f231711a;

    public um3(wm3 wm3Var) {
        this.f231711a = wm3Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new tm3(obj, null, this.f231711a, 0)).collect(new h61(bqz0Var, 4), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
