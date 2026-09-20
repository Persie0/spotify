package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ivc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dw00 f106191a;

    public ivc0(dw00 dw00Var) {
        this.f106191a = dw00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hvc0 hvc0Var;
        if (ibkVar instanceof hvc0) {
            hvc0Var = (hvc0) ibkVar;
            int i = hvc0Var.f95648b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hvc0Var.f95648b = i - Integer.MIN_VALUE;
            } else {
                hvc0Var = new hvc0(this, ibkVar);
            }
        } else {
            hvc0Var = new hvc0(this, ibkVar);
        }
        Object objInvoke = hvc0Var.f95647a;
        int i2 = hvc0Var.f95648b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            hvc0Var.f95650d = bqz0Var;
            hvc0Var.f95648b = 1;
            objInvoke = this.f106191a.invoke(obj, hvc0Var);
            if (objInvoke != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = hvc0Var.f95650d;
            bga.m29073P(objInvoke);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
        }
        return w2a1.f247311a;
        hvc0Var.f95650d = null;
        hvc0Var.f95648b = 2;
    }
}
