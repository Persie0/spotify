package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class wkb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
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
        vkb1 vkb1Var;
        if (ibkVar instanceof vkb1) {
            vkb1Var = (vkb1) ibkVar;
            int i = vkb1Var.f242198b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vkb1Var.f242198b = i - Integer.MIN_VALUE;
            } else {
                vkb1Var = new vkb1(this, ibkVar);
            }
        } else {
            vkb1Var = new vkb1(this, ibkVar);
        }
        Object obj2 = vkb1Var.f242197a;
        int i2 = vkb1Var.f242198b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ((rfy0) obj).getClass();
            vkb1Var.f242200d = bqz0Var;
            vkb1Var.f242198b = 1;
            if (njg1.m64619l(150L, vkb1Var) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = vkb1Var.f242200d;
            bga.m29073P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        vkb1Var.f242200d = null;
        vkb1Var.f242198b = 2;
    }
}
