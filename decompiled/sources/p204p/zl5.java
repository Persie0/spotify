package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class zl5 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qm5 f283939a;

    public zl5(qm5 qm5Var) {
        this.f283939a = qm5Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ml5 ml5Var = (ml5) obj;
        lk5 lk5VarMo27644a = this.f283939a.f190136k.mo27644a();
        boolean z = lk5VarMo27644a instanceof okp0;
        w2a1 w2a1Var = w2a1.f247311a;
        if (z) {
            ((okp0) lk5VarMo27644a).f166433b.f276206a.put(ml5Var.f144756a, ml5Var.f144757b);
        }
        return w2a1Var;
    }
}
