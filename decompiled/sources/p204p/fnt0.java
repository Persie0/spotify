package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class fnt0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ po10 f71356a;

    public fnt0(po10 po10Var) {
        this.f71356a = po10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ent0 ent0Var;
        if (ibkVar instanceof ent0) {
            ent0Var = (ent0) ibkVar;
            int i = ent0Var.f61225b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ent0Var.f61225b = i - Integer.MIN_VALUE;
            } else {
                ent0Var = new ent0(this, ibkVar);
            }
        } else {
            ent0Var = new ent0(this, ibkVar);
        }
        Object obj2 = ent0Var.f61224a;
        int i2 = ent0Var.f61225b;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1Var;
        }
        bga.m29073P(obj2);
        fiz fizVarM83470B = ((umn) this.f71356a.f179559b).m83470B();
        aeq0 aeq0Var = new aeq0(bqz0Var, 5);
        ent0Var.f61225b = 1;
        Object objCollect = fizVarM83470B.collect(new a4t0(aeq0Var, 17), ent0Var);
        yuk yukVar = yuk.f276404a;
        if (objCollect != yukVar) {
            objCollect = w2a1Var;
        }
        return objCollect == yukVar ? yukVar : w2a1Var;
    }
}
