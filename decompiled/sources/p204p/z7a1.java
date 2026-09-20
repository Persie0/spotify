package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class z7a1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c8a1 f280145a;

    public z7a1(c8a1 c8a1Var) {
        this.f280145a = c8a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        y7a1 y7a1Var;
        if (ibkVar instanceof y7a1) {
            y7a1Var = (y7a1) ibkVar;
            int i = y7a1Var.f270004b;
            if ((i & Integer.MIN_VALUE) != 0) {
                y7a1Var.f270004b = i - Integer.MIN_VALUE;
            } else {
                y7a1Var = new y7a1(this, ibkVar);
            }
        } else {
            y7a1Var = new y7a1(this, ibkVar);
        }
        Object obj2 = y7a1Var.f270003a;
        int i2 = y7a1Var.f270004b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            nzx0 nzx0Var = new nzx0(new oj71(this.f280145a, (s7a1) obj, (fbk) null, 13));
            aeq0 aeq0Var = new aeq0(bqz0Var, 27);
            y7a1Var.f270004b = 1;
            Object objCollect = nzx0Var.collect(aeq0Var, y7a1Var);
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
