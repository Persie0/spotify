package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class ckb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r9.mo30229d(p204p.flq.f70840a, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bkb1 bkb1Var;
        if (ibkVar instanceof bkb1) {
            bkb1Var = (bkb1) ibkVar;
            int i = bkb1Var.f27895b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bkb1Var.f27895b = i - Integer.MIN_VALUE;
            } else {
                bkb1Var = new bkb1(this, ibkVar);
            }
        } else {
            bkb1Var = new bkb1(this, ibkVar);
        }
        Object obj2 = bkb1Var.f27894a;
        int i2 = bkb1Var.f27895b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ((sfy0) obj).getClass();
            bkb1Var.f27897d = bqz0Var;
            bkb1Var.f27895b = 1;
            if (njg1.m64619l(150L, bkb1Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = bkb1Var.f27897d;
            bga.m29073P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        bkb1Var.f27897d = null;
        bkb1Var.f27895b = 2;
    }
}
