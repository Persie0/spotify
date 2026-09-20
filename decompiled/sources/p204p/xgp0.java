package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class xgp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgo f261347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tjo f261348b;

    public xgp0(pgo pgoVar, tjo tjoVar) {
        this.f261347a = pgoVar;
        this.f261348b = tjoVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        wgp0 wgp0Var;
        if (ibkVar instanceof wgp0) {
            wgp0Var = (wgp0) ibkVar;
            int i = wgp0Var.f251127b;
            if ((i & Integer.MIN_VALUE) != 0) {
                wgp0Var.f251127b = i - Integer.MIN_VALUE;
            } else {
                wgp0Var = new wgp0(this, ibkVar);
            }
        } else {
            wgp0Var = new wgp0(this, ibkVar);
        }
        Object obj2 = wgp0Var.f251126a;
        int i2 = wgp0Var.f251127b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        ay7 ay7VarM41173v = fag1.m41173v(this.f261347a, this.f261348b, new eip0("", ((mhp0) obj).f143851a, null));
        mwa0 mwa0Var = new mwa0(bqz0Var, 27);
        wgp0Var.f251127b = 1;
        ay7VarM41173v.collect(new ndp0(mwa0Var, 3), wgp0Var);
        return yuk.f276404a;
    }
}
