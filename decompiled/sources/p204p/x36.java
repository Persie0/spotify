package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class x36 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j8y0 f257697a;

    public x36(j8y0 j8y0Var) {
        this.f257697a = j8y0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new w36(obj, null, this.f257697a, 0)).collect(new h61(bqz0Var, 6), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
