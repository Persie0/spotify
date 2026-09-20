package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class zd30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ie30 f281617a;

    public zd30(ie30 ie30Var) {
        this.f281617a = ie30Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qd30 qd30Var = (qd30) obj;
        ie30 ie30Var = this.f281617a;
        if (!ie30Var.f101309e.m45717c()) {
            om0.m67310a(ie30Var.f101305a, qm0.IMPRESSION, qd30Var.f187467a, null, null, null, 124);
            om0.m67310a(ie30Var.f101305a, qd30Var.f187468b, qd30Var.f187467a, null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
