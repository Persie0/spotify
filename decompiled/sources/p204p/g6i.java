package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class g6i implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xgq0 f77055a;

    public g6i(xgq0 xgq0Var) {
        this.f77055a = xgq0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new z36(obj, null, this.f77055a, 3)).collect(new d6i(bqz0Var, 2), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
