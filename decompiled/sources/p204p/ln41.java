package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class ln41 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ da80 f135088a;

    public ln41(da80 da80Var) {
        this.f135088a = da80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006c, code lost:
    
        if (r13.mo30229d(r14, r0) == r10) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        kn41 kn41Var;
        if (ibkVar instanceof kn41) {
            kn41Var = (kn41) ibkVar;
            int i = kn41Var.f124308b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kn41Var.f124308b = i - Integer.MIN_VALUE;
            } else {
                kn41Var = new kn41(this, ibkVar);
            }
        } else {
            kn41Var = new kn41(this, ibkVar);
        }
        Object objM28059a = kn41Var.f124307a;
        int i2 = kn41Var.f124308b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = kn41Var.f124310d;
                bga.m29073P(objM28059a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM28059a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM28059a);
        on41 on41Var = (on41) obj;
        kn41Var.f124310d = bqz0Var;
        kn41Var.f124308b = 1;
        xr01 xr01Var = on41Var.f167158b;
        yn41 yn41Var = new yn41(3, xr01Var, bk01.f27801a, on41Var.f167157a);
        da80 da80Var = this.f135088a;
        objM28059a = ((b411) da80Var.f46998d).m28059a("sharing.standard_share_format_loading", xr01Var, new q0a0(on41Var, da80Var, yn41Var, fbkVar, 1), kn41Var);
        if (objM28059a != yukVar) {
        }
        return yukVar;
        kn41Var.f124310d = null;
        kn41Var.f124308b = 2;
    }
}
