package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class yqs0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mys f275285a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f275286b;

    public yqs0(mys mysVar, String str) {
        this.f275285a = mysVar;
        this.f275286b = str;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objCollect = new nzx0(new kbi0(obj, (Object) this.f275285a, this.f275286b, (fbk) null, 13)).collect(new aeq0(bqz0Var, 2), ibkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
