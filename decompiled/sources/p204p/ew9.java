package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ew9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jw9 f63454a;

    public ew9(jw9 jw9Var) {
        this.f63454a = jw9Var;
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
        dw9 dw9Var;
        if (ibkVar instanceof dw9) {
            dw9Var = (dw9) ibkVar;
            int i = dw9Var.f53644b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dw9Var.f53644b = i - Integer.MIN_VALUE;
            } else {
                dw9Var = new dw9(this, ibkVar);
            }
        } else {
            dw9Var = new dw9(this, ibkVar);
        }
        Object objM56010x = dw9Var.f53643a;
        int i2 = dw9Var.f53644b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dw9Var.f53646d;
                bga.m29073P(objM56010x);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56010x);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56010x);
        kc5 kc5Var = this.f63454a.f116608a;
        String str = ((lv9) obj).f137260a;
        dw9Var.f53646d = bqz0Var;
        dw9Var.f53644b = 1;
        objM56010x = kc5Var.m56010x(str, dw9Var);
        if (objM56010x != yukVar) {
        }
        return yukVar;
        dw9Var.f53646d = null;
        dw9Var.f53644b = 2;
    }
}
