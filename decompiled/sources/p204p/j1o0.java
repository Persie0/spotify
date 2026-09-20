package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class j1o0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o1o0 f107809a;

    public j1o0(o1o0 o1o0Var) {
        this.f107809a = o1o0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        i1o0 i1o0Var;
        if (ibkVar instanceof i1o0) {
            i1o0Var = (i1o0) ibkVar;
            int i = i1o0Var.f97557b;
            if ((i & Integer.MIN_VALUE) != 0) {
                i1o0Var.f97557b = i - Integer.MIN_VALUE;
            } else {
                i1o0Var = new i1o0(this, ibkVar);
            }
        } else {
            i1o0Var = new i1o0(this, ibkVar);
        }
        Object obj2 = i1o0Var.f97556a;
        int i2 = i1o0Var.f97557b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        d5a0 d5a0Var = this.f107809a.f160818a;
        t5p t5pVar = (t5p) d5a0Var.f45381c;
        fiz fizVarM62953p = mvl0.m62953p(new vjz(new yqi(((mv31) ((hv31) t5pVar.f217328b)).m62897r(s2o0.f205045b), 21), new fop(t5pVar, (fbk) null, 3)));
        mwa0 mwa0Var = new mwa0(bqz0Var, 26);
        i1o0Var.f97557b = 1;
        Object objCollect = fizVarM62953p.collect(new pvn0(new dal0(9, mwa0Var, d5a0Var), 2), i1o0Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
