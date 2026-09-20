package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class pod1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rlv0 f179679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qod1 f179680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rlv0 f179681c;

    public pod1(rlv0 rlv0Var, qod1 qod1Var, rlv0 rlv0Var2) {
        this.f179679a = rlv0Var;
        this.f179680b = qod1Var;
        this.f179681c = rlv0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        ood1 ood1Var;
        if (ibkVar instanceof ood1) {
            ood1Var = (ood1) ibkVar;
            int i = ood1Var.f167569b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ood1Var.f167569b = i - Integer.MIN_VALUE;
            } else {
                ood1Var = new ood1(this, ibkVar);
            }
        } else {
            ood1Var = new ood1(this, ibkVar);
        }
        Object obj2 = ood1Var.f167568a;
        int i2 = ood1Var.f167569b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        hb11 hb11VarM52092t = j0g1.m52092t(0, 0, 0, 7);
        rlv0 rlv0Var = this.f179679a;
        tf60 tf60Var = (tf60) rlv0Var.f200373a;
        fbk fbkVar = null;
        if (tf60Var != null) {
            tf60Var.mo26601e(null);
        }
        qod1 qod1Var = this.f179680b;
        rlv0Var.f200373a = x0h1.m89578u(l5h1.m58232p(qod1Var.f190927h.mo29873e().getLifecycle()), opo.m67570t(qod1Var.f190920a, qlg1.m73202g()), 0, new w9a1(this.f179681c, hb11VarM52092t, fbkVar, 29), 2);
        foa1 foa1Var = new foa1(bqz0Var, 8);
        ood1Var.f167569b = 1;
        hb11VarM52092t.collect(foa1Var, ood1Var);
        return yuk.f276404a;
    }
}
