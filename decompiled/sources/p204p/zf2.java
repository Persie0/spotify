package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class zf2 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ eg2 f282194a;

    public zf2(eg2 eg2Var) {
        this.f282194a = eg2Var;
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
        yf2 yf2Var;
        if (ibkVar instanceof yf2) {
            yf2Var = (yf2) ibkVar;
            int i = yf2Var.f272104b;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf2Var.f272104b = i - Integer.MIN_VALUE;
            } else {
                yf2Var = new yf2(this, ibkVar);
            }
        } else {
            yf2Var = new yf2(this, ibkVar);
        }
        Object objM56008v = yf2Var.f272103a;
        int i2 = yf2Var.f272104b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = yf2Var.f272106d;
                bga.m29073P(objM56008v);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56008v);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56008v);
        kc5 kc5Var = this.f282194a.f59200a;
        yf2Var.f272106d = bqz0Var;
        yf2Var.f272104b = 1;
        objM56008v = kc5Var.m56008v(yf2Var);
        if (objM56008v != yukVar) {
        }
        return yukVar;
        yf2Var.f272106d = null;
        yf2Var.f272104b = 2;
    }
}
