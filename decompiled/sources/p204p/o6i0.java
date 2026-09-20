package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class o6i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r6i0 f162351a;

    public o6i0(r6i0 r6i0Var) {
        this.f162351a = r6i0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        eh00 eh00Var = this.f162351a.f196284O0;
        if (eh00Var != null) {
            eh00Var.invoke();
        }
        return w2a1.f247311a;
    }
}
