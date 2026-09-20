package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class nkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ llb1 f154847a;

    public nkb1(llb1 llb1Var) {
        this.f154847a = llb1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        us4 us4Var = this.f154847a.f134609a.f123853a;
        ((fq40) obj).f72054a.mo29280c();
        us4Var.getClass();
        us4 us4Var2 = new us4(2, 28, ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        us4Var2.invokeSuspend(w2a1Var);
        return w2a1Var;
    }
}
