package p204p;

import com.spotify.adsdisplay.proto.OnSurfaceAdsEvent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class xtr implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qre0 f265913a;

    public xtr(qre0 qre0Var) {
        this.f265913a = qre0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lqa0 lqa0Var = (lqa0) obj;
        ldl0 ldl0VarM2819r = OnSurfaceAdsEvent.m2819r();
        ldl0VarM2819r.m58742m(lqa0Var.f135997a.mo29280c());
        ldl0VarM2819r.m58743q(lqa0Var.f135997a.mo29283j());
        ldl0VarM2819r.m58744r(lqa0Var.f135998b);
        ldl0VarM2819r.m58745s(lqa0Var.f135999c.getValue());
        this.f265913a.m73616a(ldl0VarM2819r.build());
        return w2a1.f247311a;
    }
}
