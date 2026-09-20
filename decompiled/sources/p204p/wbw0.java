package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class wbw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zbw0 f249874a;

    public wbw0(zbw0 zbw0Var) {
        this.f249874a = zbw0Var;
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
        vbw0 vbw0Var;
        if (ibkVar instanceof vbw0) {
            vbw0Var = (vbw0) ibkVar;
            int i = vbw0Var.f239596b;
            if ((i & Integer.MIN_VALUE) != 0) {
                vbw0Var.f239596b = i - Integer.MIN_VALUE;
            } else {
                vbw0Var = new vbw0(this, ibkVar);
            }
        } else {
            vbw0Var = new vbw0(this, ibkVar);
        }
        Object objM81821e = vbw0Var.f239595a;
        int i2 = vbw0Var.f239596b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = vbw0Var.f239598d;
                bga.m29073P(objM81821e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM81821e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM81821e);
        twz0 twz0Var = this.f249874a.f281411b;
        vbw0Var.f239598d = bqz0Var;
        vbw0Var.f239596b = 1;
        objM81821e = twz0Var.m81821e((jbw0) obj, vbw0Var);
        if (objM81821e != yukVar) {
        }
        return yukVar;
        vbw0Var.f239598d = null;
        vbw0Var.f239596b = 2;
    }
}
