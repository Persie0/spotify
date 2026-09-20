package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class cvc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dpk0 f42352a;

    public cvc0(dpk0 dpk0Var) {
        this.f42352a = dpk0Var;
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
        bvc0 bvc0Var;
        if (ibkVar instanceof bvc0) {
            bvc0Var = (bvc0) ibkVar;
            int i = bvc0Var.f31329b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bvc0Var.f31329b = i - Integer.MIN_VALUE;
            } else {
                bvc0Var = new bvc0(this, ibkVar);
            }
        } else {
            bvc0Var = new bvc0(this, ibkVar);
        }
        Object objInvoke = bvc0Var.f31328a;
        int i2 = bvc0Var.f31329b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = bvc0Var.f31331d;
                bga.m29073P(objInvoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objInvoke);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objInvoke);
        bvc0Var.f31331d = bqz0Var;
        bvc0Var.f31329b = 1;
        objInvoke = this.f42352a.invoke((utc0) obj, bvc0Var);
        if (objInvoke != yukVar) {
        }
        return yukVar;
        bvc0Var.f31331d = null;
        bvc0Var.f31329b = 2;
    }
}
