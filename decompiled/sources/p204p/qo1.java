package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class qo1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ood0 f190747a;

    public qo1(ood0 ood0Var) {
        this.f190747a = ood0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        po1 po1Var;
        if (ibkVar instanceof po1) {
            po1Var = (po1) ibkVar;
            int i = po1Var.f179555b;
            if ((i & Integer.MIN_VALUE) != 0) {
                po1Var.f179555b = i - Integer.MIN_VALUE;
            } else {
                po1Var = new po1(this, ibkVar);
            }
        } else {
            po1Var = new po1(this, ibkVar);
        }
        Object objM67490g = po1Var.f179554a;
        int i2 = po1Var.f179555b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = po1Var.f179557d;
                bga.m29073P(objM67490g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM67490g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM67490g);
        po1Var.f179557d = bqz0Var;
        po1Var.f179555b = 1;
        objM67490g = this.f190747a.m67490g((om1) obj, po1Var);
        if (objM67490g != yukVar) {
        }
        return yukVar;
        po1Var.f179557d = null;
        po1Var.f179555b = 2;
    }
}
