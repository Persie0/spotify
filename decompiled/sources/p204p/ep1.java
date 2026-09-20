package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ep1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uj81 f61530a;

    public ep1(uj81 uj81Var) {
        this.f61530a = uj81Var;
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
        dp1 dp1Var;
        if (ibkVar instanceof dp1) {
            dp1Var = (dp1) ibkVar;
            int i = dp1Var.f51146b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp1Var.f51146b = i - Integer.MIN_VALUE;
            } else {
                dp1Var = new dp1(this, ibkVar);
            }
        } else {
            dp1Var = new dp1(this, ibkVar);
        }
        Object objM83238k = dp1Var.f51145a;
        int i2 = dp1Var.f51146b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dp1Var.f51148d;
                bga.m29073P(objM83238k);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83238k);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM83238k);
        dp1Var.f51148d = bqz0Var;
        dp1Var.f51146b = 1;
        objM83238k = this.f61530a.m83238k((rn1) obj, dp1Var);
        if (objM83238k != yukVar) {
        }
        return yukVar;
        dp1Var.f51148d = null;
        dp1Var.f51146b = 2;
    }
}
