package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class elb0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qhb0 f60678a;

    public elb0(qhb0 qhb0Var) {
        this.f60678a = qhb0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wgt wgtVar = (wgt) obj;
        String str = wgtVar.f251142b;
        String str2 = wgtVar.f251143c;
        sab0 sab0Var = wgtVar.f251144d;
        this.f60678a.m72794a(wgtVar.f251145e, str, str2, sab0Var, vdb0.SHARE_CARD, true, false);
        return w2a1.f247311a;
    }
}
