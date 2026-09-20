package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class rkf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glf0 f200065a;

    public rkf0(glf0 glf0Var) {
        this.f200065a = glf0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wlf0 wlf0Var = (wlf0) obj;
        z9j0 z9j0Var = this.f200065a.f81081o.f195429a;
        d850 d850Var = wlf0Var.f252542b;
        String str = wlf0Var.f252541a;
        if (d850Var != null) {
            z9j0Var.mo47342b(str, d850Var, null);
        } else {
            z9j0Var.mo47346g(str);
        }
        return w2a1.f247311a;
    }
}
