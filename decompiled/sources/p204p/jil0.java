package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class jil0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kil0 f112792a;

    public jil0(kil0 kil0Var) {
        this.f112792a = kil0Var;
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
        iil0 iil0Var;
        if (ibkVar instanceof iil0) {
            iil0Var = (iil0) ibkVar;
            int i = iil0Var.f102600b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iil0Var.f102600b = i - Integer.MIN_VALUE;
            } else {
                iil0Var = new iil0(this, ibkVar);
            }
        } else {
            iil0Var = new iil0(this, ibkVar);
        }
        Object objM83608a = iil0Var.f102599a;
        int i2 = iil0Var.f102600b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = iil0Var.f102602d;
                bga.m29073P(objM83608a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM83608a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM83608a);
        uob uobVar = this.f112792a.f123013e;
        iil0Var.f102602d = bqz0Var;
        iil0Var.f102600b = 1;
        objM83608a = uobVar.m83608a((hhl0) obj, iil0Var);
        if (objM83608a != yukVar) {
        }
        return yukVar;
        iil0Var.f102602d = null;
        iil0Var.f102600b = 2;
    }
}
