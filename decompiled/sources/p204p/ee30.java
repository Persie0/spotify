package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ee30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ie30 f58665a;

    public ee30(ie30 ie30Var) {
        this.f58665a = ie30Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        om0.m67310a(this.f58665a.f101305a, qm0.ERROR, ((pd30) obj).f176341a.mo29280c(), null, "page_load_error", null, 116);
        return w2a1.f247311a;
    }
}
