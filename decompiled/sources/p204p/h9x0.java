package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes2.dex */
public final class h9x0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j9x0 f89071a;

    public h9x0(j9x0 j9x0Var) {
        this.f89071a = j9x0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        g9x0 g9x0Var;
        if (ibkVar instanceof g9x0) {
            g9x0Var = (g9x0) ibkVar;
            int i = g9x0Var.f77914b;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9x0Var.f77914b = i - Integer.MIN_VALUE;
            } else {
                g9x0Var = new g9x0(this, ibkVar);
            }
        } else {
            g9x0Var = new g9x0(this, ibkVar);
        }
        Object obj2 = g9x0Var.f77913a;
        int i2 = g9x0Var.f77914b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            lcw0 lcw0Var = new lcw0(mvl0.m62953p(this.f89071a.f110265b.m79396h(((d9x0) obj).f46929a)), 8);
            aeq0 aeq0Var = new aeq0(bqz0Var, 8);
            g9x0Var.f77914b = 1;
            Object objCollect = lcw0Var.collect(aeq0Var, g9x0Var);
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
