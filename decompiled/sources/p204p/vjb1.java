package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class vjb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ flb1 f241942a;

    public vjb1(flb1 flb1Var) {
        this.f241942a = flb1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        us4 us4Var = this.f241942a.f70748d.f50177a;
        ((eq40) obj).f61776a.mo29280c();
        us4Var.getClass();
        us4 us4Var2 = new us4(2, 26, ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        us4Var2.invokeSuspend(w2a1Var);
        return w2a1Var;
    }
}
