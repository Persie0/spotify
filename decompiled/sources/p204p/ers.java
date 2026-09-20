package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ers implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gfi0 f62199a;

    public ers(gfi0 gfi0Var) {
        this.f62199a = gfi0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        d850 d850Var = ((krs) obj).f125718a;
        Object objM44622b = this.f62199a.m44622b(new p6j0("https://www.spotify.com/platform-rules/plain", "", false, false, 0, 0, false, null, null, d850Var != null ? new n6j0(d850Var) : null), null, ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM44622b != yukVar) {
            objM44622b = w2a1Var;
        }
        return objM44622b == yukVar ? objM44622b : w2a1Var;
    }
}
