package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class o5e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k1n f161954a;

    public o5e1(k1n k1nVar) {
        this.f161954a = k1nVar;
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
        n5e1 n5e1Var;
        if (ibkVar instanceof n5e1) {
            n5e1Var = (n5e1) ibkVar;
            int i = n5e1Var.f150539b;
            if ((i & Integer.MIN_VALUE) != 0) {
                n5e1Var.f150539b = i - Integer.MIN_VALUE;
            } else {
                n5e1Var = new n5e1(this, ibkVar);
            }
        } else {
            n5e1Var = new n5e1(this, ibkVar);
        }
        Object objM55117b = n5e1Var.f150538a;
        int i2 = n5e1Var.f150539b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = n5e1Var.f150541d;
                bga.m29073P(objM55117b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM55117b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM55117b);
        n5e1Var.f150541d = bqz0Var;
        n5e1Var.f150539b = 1;
        objM55117b = this.f161954a.m55117b((o4e1) obj, n5e1Var);
        if (objM55117b != yukVar) {
        }
        return yukVar;
        n5e1Var.f150541d = null;
        n5e1Var.f150539b = 2;
    }
}
