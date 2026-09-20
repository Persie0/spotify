package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class jym0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kym0 f117435a;

    public jym0(kym0 kym0Var) {
        this.f117435a = kym0Var;
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
        iym0 iym0Var;
        if (ibkVar instanceof iym0) {
            iym0Var = (iym0) ibkVar;
            int i = iym0Var.f107007b;
            if ((i & Integer.MIN_VALUE) != 0) {
                iym0Var.f107007b = i - Integer.MIN_VALUE;
            } else {
                iym0Var = new iym0(this, ibkVar);
            }
        } else {
            iym0Var = new iym0(this, ibkVar);
        }
        Object objM37912f = iym0Var.f107006a;
        int i2 = iym0Var.f107007b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = iym0Var.f107009d;
                bga.m29073P(objM37912f);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM37912f);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM37912f);
        e6a0 e6a0Var = this.f117435a.f127888a;
        iym0Var.f107009d = bqz0Var;
        iym0Var.f107007b = 1;
        objM37912f = e6a0Var.m37912f(iym0Var);
        if (objM37912f != yukVar) {
        }
        return yukVar;
        iym0Var.f107009d = null;
        iym0Var.f107007b = 2;
    }
}
