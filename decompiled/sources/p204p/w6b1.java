package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class w6b1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ z9j0 f248322a;

    public w6b1(z9j0 z9j0Var) {
        this.f248322a = z9j0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        t6b1 t6b1Var = (t6b1) obj;
        d850 d850Var = t6b1Var.f217530d;
        String str = t6b1Var.f217529c;
        z9j0 z9j0Var = this.f248322a;
        if (d850Var != null) {
            z9j0Var.mo47342b(str, d850Var, null);
        } else {
            z9j0Var.mo47346g(str);
        }
        return w2a1.f247311a;
    }
}
