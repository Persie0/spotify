package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class gf21 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f79252a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rlv0 f79253b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hf21 f79254c;

    public gf21(rlv0 rlv0Var, rlv0 rlv0Var2, hf21 hf21Var) {
        this.f79252a = rlv0Var;
        this.f79253b = rlv0Var2;
        this.f79254c = hf21Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new i620(obj, (fbk) null, this.f79252a, this.f79253b, this.f79254c)).collect(new aeq0(bqz0Var, 14), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
