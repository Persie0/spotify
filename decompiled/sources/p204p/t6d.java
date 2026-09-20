package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class t6d implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h7d f217537a;

    public t6d(h7d h7dVar) {
        this.f217537a = h7dVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new k6d(obj, null, this.f217537a, 0)).collect(new h61(bqz0Var, 16), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
