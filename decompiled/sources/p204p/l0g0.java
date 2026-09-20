package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class l0g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0g0 f128424a;

    public l0g0(m0g0 m0g0Var) {
        this.f128424a = m0g0Var;
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
        k0g0 k0g0Var;
        if (ibkVar instanceof k0g0) {
            k0g0Var = (k0g0) ibkVar;
            int i = k0g0Var.f118081b;
            if ((i & Integer.MIN_VALUE) != 0) {
                k0g0Var.f118081b = i - Integer.MIN_VALUE;
            } else {
                k0g0Var = new k0g0(this, ibkVar);
            }
        } else {
            k0g0Var = new k0g0(this, ibkVar);
        }
        Object objM49845e = k0g0Var.f118080a;
        int i2 = k0g0Var.f118081b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = k0g0Var.f118083d;
                bga.m29073P(objM49845e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM49845e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM49845e);
        i780 i780Var = this.f128424a.f138672c;
        k0g0Var.f118083d = bqz0Var;
        k0g0Var.f118081b = 1;
        objM49845e = i780Var.m49845e((d0g0) obj, k0g0Var);
        if (objM49845e != yukVar) {
        }
        return yukVar;
        k0g0Var.f118083d = null;
        k0g0Var.f118081b = 2;
    }
}
