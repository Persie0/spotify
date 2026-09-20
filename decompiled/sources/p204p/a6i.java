package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class a6i implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j8y0 f12806a;

    public a6i(j8y0 j8y0Var) {
        this.f12806a = j8y0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new w36(obj, null, this.f12806a, 1)).collect(new z6d(bqz0Var, 23), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
