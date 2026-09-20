package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ybw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zbw0 f271283a;

    public ybw0(zbw0 zbw0Var) {
        this.f271283a = zbw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        xbw0 xbw0Var;
        if (ibkVar instanceof xbw0) {
            xbw0Var = (xbw0) ibkVar;
            int i = xbw0Var.f260022b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xbw0Var.f260022b = i - Integer.MIN_VALUE;
            } else {
                xbw0Var = new xbw0(this, ibkVar);
            }
        } else {
            xbw0Var = new xbw0(this, ibkVar);
        }
        Object objM63934c = xbw0Var.f260021a;
        int i2 = xbw0Var.f260022b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = xbw0Var.f260024d;
                bga.m29073P(objM63934c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM63934c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM63934c);
        n9r0 n9r0Var = this.f271283a.f281410a;
        xbw0Var.f260024d = bqz0Var;
        xbw0Var.f260022b = 1;
        objM63934c = n9r0Var.m63934c((obw0) obj, xbw0Var);
        if (objM63934c != yukVar) {
        }
        return yukVar;
        xbw0Var.f260024d = null;
        xbw0Var.f260022b = 2;
    }
}
