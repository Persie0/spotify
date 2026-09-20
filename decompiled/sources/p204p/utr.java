package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class utr implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gu3 f233972a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nx0 f233973b;

    public utr(gu3 gu3Var, nx0 nx0Var) {
        this.f233972a = gu3Var;
        this.f233973b = nx0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        va6 va6Var = (va6) obj;
        if (this.f233972a.m45717c()) {
            this.f233973b.mo46879b(va6Var.f239128a);
        }
        return w2a1.f247311a;
    }
}
