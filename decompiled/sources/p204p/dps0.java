package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class dps0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hg6 f51738a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f51739b;

    public dps0(String str, hg6 hg6Var) {
        this.f51738a = hg6Var;
        this.f51739b = str;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new kbi0(obj, (Object) this.f51738a, this.f51739b, (fbk) null, 12)).collect(new aeq0(bqz0Var, 1), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
