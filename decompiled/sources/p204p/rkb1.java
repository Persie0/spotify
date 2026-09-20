package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class rkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ llb1 f200045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pgq f200046b;

    public rkb1(llb1 llb1Var, pgq pgqVar) {
        this.f200045a = llb1Var;
        this.f200046b = pgqVar;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        pa9 pa9Var = this.f200045a.f134611c;
        if (pa9Var != null) {
            this.f200046b.f177382a.setValue(pa9Var);
        }
        return w2a1.f247311a;
    }
}
