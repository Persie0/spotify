package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class k8q implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ l8q f120411a;

    public k8q(l8q l8qVar) {
        this.f120411a = l8qVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        Object objInvoke = this.f120411a.f130922b.invoke((rb31) obj, ibkVar);
        return objInvoke == yuk.f276404a ? objInvoke : w2a1.f247311a;
    }
}
