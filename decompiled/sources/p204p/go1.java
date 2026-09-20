package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class go1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fp1 f82813a;

    public go1(fp1 fp1Var) {
        this.f82813a = fp1Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Object objMo30229d = this.f82813a.f71682w.f233737a.mo30229d((ln1) obj, ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objMo30229d != yukVar) {
            objMo30229d = w2a1Var;
        }
        return objMo30229d == yukVar ? objMo30229d : w2a1Var;
    }
}
