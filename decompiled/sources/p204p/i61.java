package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class i61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f99068a;

    public i61(x61 x61Var) {
        this.f99068a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        g61 g61Var;
        if (ibkVar instanceof g61) {
            g61Var = (g61) ibkVar;
            int i = g61Var.f76826b;
            if ((i & Integer.MIN_VALUE) != 0) {
                g61Var.f76826b = i - Integer.MIN_VALUE;
            } else {
                g61Var = new g61(this, ibkVar);
            }
        } else {
            g61Var = new g61(this, ibkVar);
        }
        Object obj2 = g61Var.f76825a;
        int i2 = g61Var.f76826b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            p51 p51Var = (p51) obj;
            nzx0 nzx0Var = new nzx0(new y51(this.f99068a.f258554a, p51Var.f174042c, p51Var.f174043d, p51Var.f174041b, p51Var.f174044e, null));
            h61 h61Var = new h61(bqz0Var, 0);
            g61Var.f76826b = 1;
            Object objCollect = nzx0Var.collect(h61Var, g61Var);
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
