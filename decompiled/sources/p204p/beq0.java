package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class beq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ feq0 f26419a;

    public beq0(feq0 feq0Var) {
        this.f26419a = feq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ydq0 ydq0Var;
        if (ibkVar instanceof ydq0) {
            ydq0Var = (ydq0) ibkVar;
            int i = ydq0Var.f271804b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ydq0Var.f271804b = i - Integer.MIN_VALUE;
            } else {
                ydq0Var = new ydq0(this, ibkVar);
            }
        } else {
            ydq0Var = new ydq0(this, ibkVar);
        }
        Object obj2 = ydq0Var.f271803a;
        int i2 = ydq0Var.f271804b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            idq0 idq0Var = (idq0) obj;
            feq0 feq0Var = this.f26419a;
            vjz vjzVarM68486s = oyf1.m68486s(oyf1.m68473l0(new vdm0(k0e1.m54985d(feq0Var.f68817a.m76739c(idq0Var.f101203a).distinctUntilChanged()), 8), new hmi0()), new d6g0(feq0Var, idq0Var, (fbk) null, 5));
            mwa0 mwa0Var = new mwa0(bqz0Var, 29);
            ydq0Var.f271804b = 1;
            Object objCollect = vjzVarM68486s.collect(mwa0Var, ydq0Var);
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
