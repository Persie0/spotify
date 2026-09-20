package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class ovc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dw00 f170468a;

    public ovc0(dw00 dw00Var) {
        this.f170468a = dw00Var;
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
        nvc0 nvc0Var;
        if (ibkVar instanceof nvc0) {
            nvc0Var = (nvc0) ibkVar;
            int i = nvc0Var.f158859b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvc0Var.f158859b = i - Integer.MIN_VALUE;
            } else {
                nvc0Var = new nvc0(this, ibkVar);
            }
        } else {
            nvc0Var = new nvc0(this, ibkVar);
        }
        Object objInvoke = nvc0Var.f158858a;
        int i2 = nvc0Var.f158859b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objInvoke);
            nvc0Var.f158861d = bqz0Var;
            nvc0Var.f158859b = 1;
            objInvoke = this.f170468a.invoke(obj, nvc0Var);
            if (objInvoke != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = nvc0Var.f158861d;
            bga.m29073P(objInvoke);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objInvoke);
        }
        return w2a1.f247311a;
        nvc0Var.f158861d = null;
        nvc0Var.f158859b = 2;
    }
}
