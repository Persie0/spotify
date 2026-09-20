package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class yo1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zrr0 f274534a;

    public yo1(zrr0 zrr0Var) {
        this.f274534a = zrr0Var;
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
        xo1 xo1Var;
        if (ibkVar instanceof xo1) {
            xo1Var = (xo1) ibkVar;
            int i = xo1Var.f263743b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xo1Var.f263743b = i - Integer.MIN_VALUE;
            } else {
                xo1Var = new xo1(this, ibkVar);
            }
        } else {
            xo1Var = new xo1(this, ibkVar);
        }
        Object objM96768e = xo1Var.f263742a;
        int i2 = xo1Var.f263743b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = xo1Var.f263745d;
                bga.m29073P(objM96768e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96768e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM96768e);
        xo1Var.f263745d = bqz0Var;
        xo1Var.f263743b = 1;
        objM96768e = this.f274534a.m96768e((cn1) obj, xo1Var);
        if (objM96768e != yukVar) {
        }
        return yukVar;
        xo1Var.f263745d = null;
        xo1Var.f263743b = 2;
    }
}
