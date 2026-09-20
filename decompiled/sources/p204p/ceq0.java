package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class ceq0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ geq0 f37167a;

    public ceq0(geq0 geq0Var) {
        this.f37167a = geq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        zdq0 zdq0Var;
        if (ibkVar instanceof zdq0) {
            zdq0Var = (zdq0) ibkVar;
            int i = zdq0Var.f281780b;
            if ((i & Integer.MIN_VALUE) != 0) {
                zdq0Var.f281780b = i - Integer.MIN_VALUE;
            } else {
                zdq0Var = new zdq0(this, ibkVar);
            }
        } else {
            zdq0Var = new zdq0(this, ibkVar);
        }
        Object obj2 = zdq0Var.f281779a;
        int i2 = zdq0Var.f281780b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            jdq0 jdq0Var = (jdq0) obj;
            geq0 geq0Var = this.f37167a;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new vjz(new vdm0(k0e1.m54985d(geq0Var.f79170a.m76739c(jdq0Var.f111381a).distinctUntilChanged()), 9), new hmi0(4, 2, fbkVar)), new d6g0(geq0Var, jdq0Var, fbkVar, 6), 2);
            aeq0 aeq0Var = new aeq0(bqz0Var, 0);
            zdq0Var.f281780b = 1;
            Object objCollect = vjzVar.collect(aeq0Var, zdq0Var);
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
