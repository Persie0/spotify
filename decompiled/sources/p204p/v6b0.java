package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class v6b0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w6b0 f237800a;

    public v6b0(w6b0 w6b0Var) {
        this.f237800a = w6b0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        zse zseVar = this.f237800a.f248320a;
        Object objM89557A = x0h1.m89557A(zseVar.f285930d, new no90(zseVar, ((u6b0) obj).f227257a, null, 14), ibkVar);
        w2a1 w2a1Var = w2a1.f247311a;
        yuk yukVar = yuk.f276404a;
        if (objM89557A != yukVar) {
            objM89557A = w2a1Var;
        }
        return objM89557A == yukVar ? objM89557A : w2a1Var;
    }
}
