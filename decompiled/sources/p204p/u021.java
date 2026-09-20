package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class u021 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v021 f225354a;

    public u021(v021 v021Var) {
        this.f225354a = v021Var;
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
        t021 t021Var;
        if (ibkVar instanceof t021) {
            t021Var = (t021) ibkVar;
            int i = t021Var.f215729b;
            if ((i & Integer.MIN_VALUE) != 0) {
                t021Var.f215729b = i - Integer.MIN_VALUE;
            } else {
                t021Var = new t021(this, ibkVar);
            }
        } else {
            t021Var = new t021(this, ibkVar);
        }
        Object objM86854p = t021Var.f215728a;
        int i2 = t021Var.f215729b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = t021Var.f215731d;
                bga.m29073P(objM86854p);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM86854p);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM86854p);
        vyr0 vyr0Var = this.f225354a.f235892a;
        t021Var.f215731d = bqz0Var;
        t021Var.f215729b = 1;
        objM86854p = vyr0Var.m86854p(t021Var);
        if (objM86854p != yukVar) {
        }
        return yukVar;
        t021Var.f215731d = null;
        t021Var.f215729b = 2;
    }
}
