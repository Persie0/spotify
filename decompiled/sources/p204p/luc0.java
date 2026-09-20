package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class luc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tvc0 f137051a;

    public luc0(tvc0 tvc0Var) {
        this.f137051a = tvc0Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vl91 vl91Var = this.f137051a.f224130W0;
        boolean z = ((vtc0) obj).f244608a;
        lv31 lv31VarEdit = ((wl91) vl91Var).f252497a.edit();
        lv31VarEdit.m60048a(wl91.f252496c, z);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }
}
