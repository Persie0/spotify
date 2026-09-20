package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class py20 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uy20 f183321a;

    public py20(uy20 uy20Var) {
        this.f183321a = uy20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        oy20 oy20Var;
        if (ibkVar instanceof oy20) {
            oy20Var = (oy20) ibkVar;
            int i = oy20Var.f171646b;
            if ((i & Integer.MIN_VALUE) != 0) {
                oy20Var.f171646b = i - Integer.MIN_VALUE;
            } else {
                oy20Var = new oy20(this, ibkVar);
            }
        } else {
            oy20Var = new oy20(this, ibkVar);
        }
        Object obj2 = oy20Var.f171645a;
        int i2 = oy20Var.f171646b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            yab yabVarM65827f = nxf1.m65827f(new ty20(this.f183321a, (wy20) obj, (fbk) null));
            zax zaxVar = new zax(bqz0Var, 17);
            oy20Var.f171646b = 1;
            Object objCollect = yabVarM65827f.collect(zaxVar, oy20Var);
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
