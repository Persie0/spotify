package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class dg2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eg2 f48706a;

    public dg2(eg2 eg2Var) {
        this.f48706a = eg2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        cg2 cg2Var;
        if (ibkVar instanceof cg2) {
            cg2Var = (cg2) ibkVar;
            int i = cg2Var.f37533b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cg2Var.f37533b = i - Integer.MIN_VALUE;
            } else {
                cg2Var = new cg2(this, ibkVar);
            }
        } else {
            cg2Var = new cg2(this, ibkVar);
        }
        Object objM56000l = cg2Var.f37532a;
        int i2 = cg2Var.f37533b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = cg2Var.f37535d;
                bga.m29073P(objM56000l);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56000l);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56000l);
        kc5 kc5Var = this.f48706a.f59200a;
        cg2Var.f37535d = bqz0Var;
        cg2Var.f37533b = 1;
        objM56000l = kc5Var.m56000l(cg2Var);
        if (objM56000l != yukVar) {
        }
        return yukVar;
        cg2Var.f37535d = null;
        cg2Var.f37533b = 2;
    }
}
