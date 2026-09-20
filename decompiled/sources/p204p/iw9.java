package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class iw9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jw9 f106364a;

    public iw9(jw9 jw9Var) {
        this.f106364a = jw9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hw9 hw9Var;
        if (ibkVar instanceof hw9) {
            hw9Var = (hw9) ibkVar;
            int i = hw9Var.f95889b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hw9Var.f95889b = i - Integer.MIN_VALUE;
            } else {
                hw9Var = new hw9(this, ibkVar);
            }
        } else {
            hw9Var = new hw9(this, ibkVar);
        }
        Object objM56011y = hw9Var.f95888a;
        int i2 = hw9Var.f95889b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = hw9Var.f95891d;
                bga.m29073P(objM56011y);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56011y);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56011y);
        kc5 kc5Var = this.f106364a.f116608a;
        String str = ((mv9) obj).f147534a;
        hw9Var.f95891d = bqz0Var;
        hw9Var.f95889b = 1;
        objM56011y = kc5Var.m56011y(str, hw9Var);
        if (objM56011y != yukVar) {
        }
        return yukVar;
        hw9Var.f95891d = null;
        hw9Var.f95889b = 2;
    }
}
