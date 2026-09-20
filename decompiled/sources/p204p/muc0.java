package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class muc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iyo0 f147300a;

    public muc0(iyo0 iyo0Var) {
        this.f147300a = iyo0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        Object objInvoke = this.f147300a.invoke((wtc0) obj, ibkVar);
        return objInvoke == yuk.f276404a ? objInvoke : w2a1.f247311a;
    }
}
