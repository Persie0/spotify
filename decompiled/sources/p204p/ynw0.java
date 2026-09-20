package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class ynw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ znw0 f274511a;

    public ynw0(znw0 znw0Var) {
        this.f274511a = znw0Var;
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
        xnw0 xnw0Var;
        if (ibkVar instanceof xnw0) {
            xnw0Var = (xnw0) ibkVar;
            int i = xnw0Var.f263719b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xnw0Var.f263719b = i - Integer.MIN_VALUE;
            } else {
                xnw0Var = new xnw0(this, ibkVar);
            }
        } else {
            xnw0Var = new xnw0(this, ibkVar);
        }
        Object objM61486p = xnw0Var.f263718a;
        int i2 = xnw0Var.f263719b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = xnw0Var.f263721d;
                bga.m29073P(objM61486p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM61486p);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM61486p);
        mcu mcuVar = this.f274511a.f284569b;
        xnw0Var.f263721d = bqz0Var;
        xnw0Var.f263719b = 1;
        objM61486p = mcuVar.m61486p((mnw0) obj, xnw0Var);
        if (objM61486p != yukVar) {
        }
        return yukVar;
        xnw0Var.f263721d = null;
        xnw0Var.f263719b = 2;
    }
}
