package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class cb1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hb1 f35966a;

    public cb1(hb1 hb1Var) {
        this.f35966a = hb1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bb1 bb1Var;
        if (ibkVar instanceof bb1) {
            bb1Var = (bb1) ibkVar;
            int i = bb1Var.f25378b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bb1Var.f25378b = i - Integer.MIN_VALUE;
            } else {
                bb1Var = new bb1(this, ibkVar);
            }
        } else {
            bb1Var = new bb1(this, ibkVar);
        }
        Object objM46958a = bb1Var.f25377a;
        int i2 = bb1Var.f25378b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = bb1Var.f25380d;
                bga.m29073P(objM46958a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46958a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM46958a);
        bb1Var.f25380d = bqz0Var;
        bb1Var.f25378b = 1;
        objM46958a = hb1.m46958a(this.f35966a, bb1Var);
        if (objM46958a != yukVar) {
        }
        return yukVar;
        bb1Var.f25380d = null;
        bb1Var.f25378b = 2;
    }
}
