package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class lp00 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r9.mo30229d(r10, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        kp00 kp00Var;
        cp00 cp00Var;
        if (ibkVar instanceof kp00) {
            kp00Var = (kp00) ibkVar;
            int i = kp00Var.f124944b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kp00Var.f124944b = i - Integer.MIN_VALUE;
            } else {
                kp00Var = new kp00(this, ibkVar);
            }
        } else {
            kp00Var = new kp00(this, ibkVar);
        }
        Object obj2 = kp00Var.f124943a;
        int i2 = kp00Var.f124944b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                cp00Var = kp00Var.f124947e;
                bqz0Var = kp00Var.f124946d;
                bga.m29073P(obj2);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj2);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj2);
        cp00Var = (cp00) obj;
        long j = cp00Var.f40383a;
        kp00Var.f124946d = bqz0Var;
        kp00Var.f124947e = cp00Var;
        kp00Var.f124944b = 1;
        if (njg1.m64619l(j, kp00Var) != yukVar) {
        }
        return yukVar;
        sp00 sp00Var = new sp00(cp00Var.f40384b);
        kp00Var.f124946d = null;
        kp00Var.f124947e = null;
        kp00Var.f124944b = 2;
    }
}
