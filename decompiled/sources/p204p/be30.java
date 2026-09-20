package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class be30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ie30 f26267a;

    public be30(ie30 ie30Var) {
        this.f26267a = ie30Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        sd30 sd30Var = (sd30) obj;
        ie30 ie30Var = this.f26267a;
        if (!ie30Var.f101309e.m45717c()) {
            om0.m67310a(ie30Var.f101305a, qm0.VIEWABILITY_50_LESS, sd30Var.f207871a, null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
