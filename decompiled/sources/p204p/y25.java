package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class y25 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (r9.mo30229d(p204p.d35.f44771a, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        x25 x25Var;
        if (ibkVar instanceof x25) {
            x25Var = (x25) ibkVar;
            int i = x25Var.f257357b;
            if ((i & Integer.MIN_VALUE) != 0) {
                x25Var.f257357b = i - Integer.MIN_VALUE;
            } else {
                x25Var = new x25(this, ibkVar);
            }
        } else {
            x25Var = new x25(this, ibkVar);
        }
        Object obj2 = x25Var.f257356a;
        int i2 = x25Var.f257357b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ((t25) obj).getClass();
            x25Var.f257359d = bqz0Var;
            x25Var.f257357b = 1;
            if (njg1.m64619l(1000L, x25Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = x25Var.f257359d;
            bga.m29073P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        x25Var.f257359d = null;
        x25Var.f257357b = 2;
    }
}
