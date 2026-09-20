package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ttr implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gu3 f223665a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ om0 f223666b;

    public ttr(gu3 gu3Var, om0 om0Var) {
        this.f223665a = gu3Var;
        this.f223666b = om0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        yrw0 yrw0Var = (yrw0) obj;
        if (!this.f223665a.m45717c()) {
            om0.m67310a(this.f223666b, qm0.IMPRESSION, yrw0Var.f275605a, null, null, null, 124);
            om0.m67310a(this.f223666b, yrw0Var.f275606b, yrw0Var.f275605a, null, null, null, 124);
        }
        return w2a1.f247311a;
    }
}
