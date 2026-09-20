package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class dba1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eba1 f47268a;

    public dba1(eba1 eba1Var) {
        this.f47268a = eba1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        cba1 cba1Var;
        if (ibkVar instanceof cba1) {
            cba1Var = (cba1) ibkVar;
            int i = cba1Var.f36068b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cba1Var.f36068b = i - Integer.MIN_VALUE;
            } else {
                cba1Var = new cba1(this, ibkVar);
            }
        } else {
            cba1Var = new cba1(this, ibkVar);
        }
        Object obj2 = cba1Var.f36067a;
        int i2 = cba1Var.f36068b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new oj71(this.f47268a, (aba1) obj, fbkVar, 14)), new far0(3, 19, fbkVar), 2);
            aeq0 aeq0Var = new aeq0(bqz0Var, 29);
            cba1Var.f36068b = 1;
            Object objCollect = vjzVar.collect(aeq0Var, cba1Var);
            yuk yukVar = yuk.f276404a;
            if (objCollect == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
