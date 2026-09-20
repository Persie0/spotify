package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class dhp0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yz80 f49139a;

    public dhp0(yz80 yz80Var) {
        this.f49139a = yz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        chp0 chp0Var;
        if (ibkVar instanceof chp0) {
            chp0Var = (chp0) ibkVar;
            int i = chp0Var.f38059b;
            if ((i & Integer.MIN_VALUE) != 0) {
                chp0Var.f38059b = i - Integer.MIN_VALUE;
            } else {
                chp0Var = new chp0(this, ibkVar);
            }
        } else {
            chp0Var = new chp0(this, ibkVar);
        }
        Object objM56450a = chp0Var.f38058a;
        int i2 = chp0Var.f38059b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = chp0Var.f38061d;
                bga.m29073P(objM56450a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56450a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56450a);
        ohp0 ohp0Var = (ohp0) obj;
        String str = ohp0Var.f165523b;
        String str2 = ohp0Var.f165522a;
        int i3 = ohp0Var.f165524c;
        chp0Var.f38061d = bqz0Var;
        chp0Var.f38059b = 1;
        objM56450a = khp0.m56450a(this.f49139a, str, str2, i3, chp0Var);
        if (objM56450a != yukVar) {
        }
        return yukVar;
        chp0Var.f38061d = null;
        chp0Var.f38059b = 2;
    }
}
