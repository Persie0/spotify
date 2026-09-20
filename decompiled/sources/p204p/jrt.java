package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class jrt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mrt f115310a;

    public jrt(mrt mrtVar) {
        this.f115310a = mrtVar;
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
        irt irtVar;
        if (ibkVar instanceof irt) {
            irtVar = (irt) ibkVar;
            int i = irtVar.f105052b;
            if ((i & Integer.MIN_VALUE) != 0) {
                irtVar.f105052b = i - Integer.MIN_VALUE;
            } else {
                irtVar = new irt(this, ibkVar);
            }
        } else {
            irtVar = new irt(this, ibkVar);
        }
        Object objM73755n = irtVar.f105051a;
        int i2 = irtVar.f105052b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = irtVar.f105054d;
                bga.m29073P(objM73755n);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM73755n);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM73755n);
        qst0 qst0Var = this.f115310a.f146602b;
        irtVar.f105054d = bqz0Var;
        irtVar.f105052b = 1;
        objM73755n = qst0Var.m73755n((cjt) obj, irtVar);
        if (objM73755n != yukVar) {
        }
        return yukVar;
        irtVar.f105054d = null;
        irtVar.f105052b = 2;
    }
}
