package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class aoh0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ coh0 f17693a;

    public aoh0(coh0 coh0Var) {
        this.f17693a = coh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        znh0 znh0Var;
        if (ibkVar instanceof znh0) {
            znh0Var = (znh0) ibkVar;
            int i = znh0Var.f284503b;
            if ((i & Integer.MIN_VALUE) != 0) {
                znh0Var.f284503b = i - Integer.MIN_VALUE;
            } else {
                znh0Var = new znh0(this, ibkVar);
            }
        } else {
            znh0Var = new znh0(this, ibkVar);
        }
        Object obj2 = znh0Var.f284502a;
        int i2 = znh0Var.f284503b;
        w2a1 w2a1Var = w2a1.f247311a;
        int i3 = 1;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        C2014jg c2014jg = this.f17693a.f40266e;
        fbk fbkVar = null;
        fiz fizVarM62953p = mvl0.m62953p(g0g1.m43302g(nxf1.m65827f(new C1777dg(c2014jg, fbkVar, i3)), nxf1.m65827f(new C1977ig(c2014jg, C2014jg.f111986c, new C1859fg(c2014jg, 0), (fbk) null)), mvl0.m62953p(xtm0.m92105z(nxf1.m65827f(new C1977ig(c2014jg, C2014jg.f111987d, new C1859fg(c2014jg, 1), (fbk) null)), nxf1.m65827f(new C1777dg(c2014jg, fbkVar, 0)))), C1813eg.f59177h));
        mwa0 mwa0Var = new mwa0(bqz0Var, 19);
        znh0Var.f284503b = 1;
        Object objCollect = fizVarM62953p.collect(new nif0(mwa0Var, 27), znh0Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
