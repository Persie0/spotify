package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class yd30 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ie30 f271629a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nx0 f271630b;

    public yd30(ie30 ie30Var, nx0 nx0Var) {
        this.f271629a = ie30Var;
        this.f271630b = nx0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hd30 hd30Var = (hd30) obj;
        if (this.f271629a.f101309e.m45717c()) {
            this.f271630b.mo46879b(hd30Var.f89976a);
        }
        return w2a1.f247311a;
    }
}
