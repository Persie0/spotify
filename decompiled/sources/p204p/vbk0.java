package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class vbk0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eqb f239520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qyr f239521b;

    public vbk0(eqb eqbVar, qyr qyrVar) {
        this.f239520a = eqbVar;
        this.f239521b = qyrVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        this.f239520a.f61841a.mo26601e(null);
        l950 l950Var = this.f239521b.f194019d;
        if (l950Var != null) {
            l950Var.cancel();
        }
        return w2a1.f247311a;
    }
}
