package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class so1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s1e1 f211076a;

    public so1(s1e1 s1e1Var) {
        this.f211076a = s1e1Var;
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
        ro1 ro1Var;
        if (ibkVar instanceof ro1) {
            ro1Var = (ro1) ibkVar;
            int i = ro1Var.f201035b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ro1Var.f201035b = i - Integer.MIN_VALUE;
            } else {
                ro1Var = new ro1(this, ibkVar);
            }
        } else {
            ro1Var = new ro1(this, ibkVar);
        }
        Object objM76947b = ro1Var.f201034a;
        int i2 = ro1Var.f201035b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ro1Var.f201037d;
                bga.m29073P(objM76947b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76947b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM76947b);
        ro1Var.f201037d = bqz0Var;
        ro1Var.f201035b = 1;
        objM76947b = this.f211076a.m76947b((qm1) obj, ro1Var);
        if (objM76947b != yukVar) {
        }
        return yukVar;
        ro1Var.f201037d = null;
        ro1Var.f201035b = 2;
    }
}
