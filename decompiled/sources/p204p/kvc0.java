package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class kvc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tvc0 f126826a;

    public kvc0(tvc0 tvc0Var) {
        this.f126826a = tvc0Var;
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
        jvc0 jvc0Var;
        if (ibkVar instanceof jvc0) {
            jvc0Var = (jvc0) ibkVar;
            int i = jvc0Var.f116301b;
            if ((i & Integer.MIN_VALUE) != 0) {
                jvc0Var.f116301b = i - Integer.MIN_VALUE;
            } else {
                jvc0Var = new jvc0(this, ibkVar);
            }
        } else {
            jvc0Var = new jvc0(this, ibkVar);
        }
        Object objInvoke = jvc0Var.f116300a;
        int i2 = jvc0Var.f116301b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = jvc0Var.f116303d;
                bga.m29073P(objInvoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objInvoke);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objInvoke);
        xqq0 xqq0Var = this.f126826a.f224120M0;
        jvc0Var.f116303d = bqz0Var;
        jvc0Var.f116301b = 1;
        objInvoke = xqq0Var.invoke(jvc0Var);
        if (objInvoke != yukVar) {
        }
        return yukVar;
        jvc0Var.f116303d = null;
        jvc0Var.f116301b = 2;
    }
}
