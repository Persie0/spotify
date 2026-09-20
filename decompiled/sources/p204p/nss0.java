package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class nss0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pss0 f157888a;

    public nss0(pss0 pss0Var) {
        this.f157888a = pss0Var;
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
        mss0 mss0Var;
        if (ibkVar instanceof mss0) {
            mss0Var = (mss0) ibkVar;
            int i = mss0Var.f146852b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mss0Var.f146852b = i - Integer.MIN_VALUE;
            } else {
                mss0Var = new mss0(this, ibkVar);
            }
        } else {
            mss0Var = new mss0(this, ibkVar);
        }
        Object objM70887a = mss0Var.f146851a;
        int i2 = mss0Var.f146852b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = mss0Var.f146854d;
                bga.m29073P(objM70887a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM70887a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM70887a);
        mss0Var.f146854d = bqz0Var;
        mss0Var.f146852b = 1;
        objM70887a = this.f157888a.m70887a((rss0) obj, mss0Var);
        if (objM70887a != yukVar) {
        }
        return yukVar;
        mss0Var.f146854d = null;
        mss0Var.f146852b = 2;
    }
}
