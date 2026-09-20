package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class glx0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r11.mo30229d(r12, r0) == r4) goto L23;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        flx0 flx0Var;
        clx0 clx0Var;
        if (ibkVar instanceof flx0) {
            flx0Var = (flx0) ibkVar;
            int i = flx0Var.f70885b;
            if ((i & Integer.MIN_VALUE) != 0) {
                flx0Var.f70885b = i - Integer.MIN_VALUE;
            } else {
                flx0Var = new flx0(this, ibkVar);
            }
        } else {
            flx0Var = new flx0(this, ibkVar);
        }
        Object obj2 = flx0Var.f70884a;
        int i2 = flx0Var.f70885b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                clx0Var = flx0Var.f70888e;
                bqz0Var = flx0Var.f70887d;
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
        clx0Var = (clx0) obj;
        long jCurrentTimeMillis = clx0Var.f39420b - System.currentTimeMillis();
        if (jCurrentTimeMillis > 0) {
            flx0Var.f70887d = bqz0Var;
            flx0Var.f70888e = clx0Var;
            flx0Var.f70885b = 1;
            if (njg1.m64619l(jCurrentTimeMillis, flx0Var) != yukVar) {
            }
        }
        return yukVar;
        tlx0 tlx0Var = new tlx0(clx0Var.f39419a);
        flx0Var.f70887d = null;
        flx0Var.f70888e = null;
        flx0Var.f70885b = 2;
    }
}
