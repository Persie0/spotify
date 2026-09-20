package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class uuc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tvc0 f234150a;

    public uuc0(tvc0 tvc0Var) {
        this.f234150a = tvc0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Object objInvoke = this.f234150a.f224121N0.invoke(ibkVar);
        return objInvoke == yuk.f276404a ? objInvoke : w2a1.f247311a;
    }
}
