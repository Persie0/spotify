package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class s5e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ brl0 f205787a;

    public s5e1(brl0 brl0Var) {
        this.f205787a = brl0Var;
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
        r5e1 r5e1Var;
        if (ibkVar instanceof r5e1) {
            r5e1Var = (r5e1) ibkVar;
            int i = r5e1Var.f196031b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r5e1Var.f196031b = i - Integer.MIN_VALUE;
            } else {
                r5e1Var = new r5e1(this, ibkVar);
            }
        } else {
            r5e1Var = new r5e1(this, ibkVar);
        }
        Object objM30303e = r5e1Var.f196030a;
        int i2 = r5e1Var.f196031b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = r5e1Var.f196033d;
                bga.m29073P(objM30303e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30303e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM30303e);
        r5e1Var.f196033d = bqz0Var;
        r5e1Var.f196031b = 1;
        objM30303e = this.f205787a.m30303e((n4e1) obj, r5e1Var);
        if (objM30303e != yukVar) {
        }
        return yukVar;
        r5e1Var.f196033d = null;
        r5e1Var.f196031b = 2;
    }
}
