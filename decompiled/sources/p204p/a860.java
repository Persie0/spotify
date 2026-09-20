package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class a860 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ d860 f13198a;

    public a860(d860 d860Var) {
        this.f13198a = d860Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        z760 z760Var;
        if (ibkVar instanceof z760) {
            z760Var = (z760) ibkVar;
            int i = z760Var.f280104b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z760Var.f280104b = i - Integer.MIN_VALUE;
            } else {
                z760Var = new z760(this, ibkVar);
            }
        } else {
            z760Var = new z760(this, ibkVar);
        }
        Object obj2 = z760Var.f280103a;
        int i2 = z760Var.f280104b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            vjz vjzVar = new vjz(new qp20(this.f13198a.f46394e.m83470B(), 20), new C2537wj(3, 26, null), 2);
            zax zaxVar = new zax(bqz0Var, 25);
            z760Var.f280104b = 1;
            Object objCollect = vjzVar.collect(zaxVar, z760Var);
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
