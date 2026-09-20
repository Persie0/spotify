package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class qx60 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ iy60 f193526a;

    public qx60(iy60 iy60Var) {
        this.f193526a = iy60Var;
    }

    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        vl91 vl91Var = this.f193526a.f106876t;
        boolean z = ((jx60) obj).f116818a;
        lv31 lv31VarEdit = ((wl91) vl91Var).f252497a.edit();
        lv31VarEdit.m60048a(wl91.f252496c, z);
        lv31VarEdit.m60055h();
        return w2a1.f247311a;
    }
}
