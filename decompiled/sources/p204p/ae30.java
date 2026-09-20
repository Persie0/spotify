package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ae30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ie30 f14736a;

    public ae30(ie30 ie30Var) {
        this.f14736a = ie30Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        rd30 rd30Var = (rd30) obj;
        ie30 ie30Var = this.f14736a;
        if (!ie30Var.f101309e.m45717c()) {
            om0.m67310a(ie30Var.f101305a, qm0.VIEWABILITY_50, rd30Var.f198015a, null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
