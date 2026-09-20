package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes11.dex */
public final class q0d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v0d1 f183979a;

    public q0d1(v0d1 v0d1Var) {
        this.f183979a = v0d1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objM84376c = this.f183979a.m84376c(((m0d1) obj).f138645a, ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM84376c != yukVar) {
            objM84376c = w2a1Var;
        }
        return objM84376c == yukVar ? objM84376c : w2a1Var;
    }
}
