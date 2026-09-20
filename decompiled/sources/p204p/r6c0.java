package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class r6c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f7c0 f196239a;

    public r6c0(f7c0 f7c0Var) {
        this.f196239a = f7c0Var;
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
        q6c0 q6c0Var;
        if (ibkVar instanceof q6c0) {
            q6c0Var = (q6c0) ibkVar;
            int i = q6c0Var.f185742b;
            if ((i & Integer.MIN_VALUE) != 0) {
                q6c0Var.f185742b = i - Integer.MIN_VALUE;
            } else {
                q6c0Var = new q6c0(this, ibkVar);
            }
        } else {
            q6c0Var = new q6c0(this, ibkVar);
        }
        Object objM40961a = q6c0Var.f185741a;
        int i2 = q6c0Var.f185742b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = q6c0Var.f185744d;
                bga.m29073P(objM40961a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40961a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40961a);
        q6c0Var.f185744d = bqz0Var;
        q6c0Var.f185742b = 1;
        objM40961a = f7c0.m40961a(this.f196239a, (i6c0) obj, q6c0Var);
        if (objM40961a != yukVar) {
        }
        return yukVar;
        q6c0Var.f185744d = null;
        q6c0Var.f185742b = 2;
    }
}
