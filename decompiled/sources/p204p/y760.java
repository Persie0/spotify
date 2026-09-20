package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class y760 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d860 f269972a;

    public y760(d860 d860Var) {
        this.f269972a = d860Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        x760 x760Var;
        if (ibkVar instanceof x760) {
            x760Var = (x760) ibkVar;
            int i = x760Var.f258832b;
            if ((i & Integer.MIN_VALUE) != 0) {
                x760Var.f258832b = i - Integer.MIN_VALUE;
            } else {
                x760Var = new x760(this, ibkVar);
            }
        } else {
            x760Var = new x760(this, ibkVar);
        }
        Object obj2 = x760Var.f258831a;
        int i2 = x760Var.f258832b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vjz vjzVar = new vjz(new qp20(this.f269972a.f46390a.m80585h(), 19), new ic0(3, 28, null), 2);
            zax zaxVar = new zax(bqz0Var, 24);
            x760Var.f258832b = 1;
            Object objCollect = vjzVar.collect(zaxVar, x760Var);
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
