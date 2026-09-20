package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class fov implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f71633a;

    public fov(rlv0 rlv0Var) {
        this.f71633a = rlv0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        snv snvVar = (snv) obj;
        bmo0 bmo0Var = (bmo0) this.f71633a.f200373a;
        if (bmo0Var != null) {
            Object objMo29884a = bmo0Var.mo29884a(new tlo0(snvVar.f211030a), snvVar.f211031b, snvVar.f211033d, snvVar.f211032c, snvVar.f211034e, (96 & 32) != 0 ? q3g0.f184880a : null, false, ibkVar);
            if (objMo29884a == yuk.f276404a) {
                return objMo29884a;
            }
        }
        return w2a1.f247311a;
    }
}
