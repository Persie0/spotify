package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class u5e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ egb1 f227007a;

    public u5e1(egb1 egb1Var) {
        this.f227007a = egb1Var;
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
        t5e1 t5e1Var;
        if (ibkVar instanceof t5e1) {
            t5e1Var = (t5e1) ibkVar;
            int i = t5e1Var.f217287b;
            if ((i & Integer.MIN_VALUE) != 0) {
                t5e1Var.f217287b = i - Integer.MIN_VALUE;
            } else {
                t5e1Var = new t5e1(this, ibkVar);
            }
        } else {
            t5e1Var = new t5e1(this, ibkVar);
        }
        Object objM38848l = t5e1Var.f217286a;
        int i2 = t5e1Var.f217287b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = t5e1Var.f217289d;
                bga.m29073P(objM38848l);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM38848l);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM38848l);
        t5e1Var.f217289d = bqz0Var;
        t5e1Var.f217287b = 1;
        objM38848l = this.f227007a.m38848l((w4e1) obj, t5e1Var);
        if (objM38848l != yukVar) {
        }
        return yukVar;
        t5e1Var.f217289d = null;
        t5e1Var.f217287b = 2;
    }
}
