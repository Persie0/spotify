package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class fur implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ om0 f73552a;

    public fur(om0 om0Var) {
        this.f73552a = om0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lyw0 lyw0Var = (lyw0) obj;
        om0.m67310a(this.f73552a, lyw0Var.f138126b ? qm0.COLLAPSED : qm0.EXPANDED, lyw0Var.f138125a, null, null, null, 124);
        return w2a1.f247311a;
    }
}
