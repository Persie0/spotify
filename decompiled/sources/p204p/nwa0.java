package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class nwa0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ owa0 f159076a;

    public nwa0(owa0 owa0Var) {
        this.f159076a = owa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        lwa0 lwa0Var;
        if (ibkVar instanceof lwa0) {
            lwa0Var = (lwa0) ibkVar;
            int i = lwa0Var.f137496b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwa0Var.f137496b = i - Integer.MIN_VALUE;
            } else {
                lwa0Var = new lwa0(this, ibkVar);
            }
        } else {
            lwa0Var = new lwa0(this, ibkVar);
        }
        Object obj2 = lwa0Var.f137495a;
        int i2 = lwa0Var.f137496b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            dwa0 dwa0Var = (dwa0) obj;
            fbk fbkVar = null;
            vjz vjzVar = new vjz(new nzx0(new gnq((Object) this.f159076a.f170681a, dwa0Var.f53651e, dwa0Var.f53652f, fbkVar, 21)), new th80(3, 3, fbkVar), 2);
            mwa0 mwa0Var = new mwa0(bqz0Var, 0);
            lwa0Var.f137496b = 1;
            Object objCollect = vjzVar.collect(mwa0Var, lwa0Var);
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
