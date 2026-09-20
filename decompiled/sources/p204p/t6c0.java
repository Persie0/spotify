package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class t6c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f7c0 f217533a;

    public t6c0(f7c0 f7c0Var) {
        this.f217533a = f7c0Var;
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
        s6c0 s6c0Var;
        if (ibkVar instanceof s6c0) {
            s6c0Var = (s6c0) ibkVar;
            int i = s6c0Var.f206080b;
            if ((i & Integer.MIN_VALUE) != 0) {
                s6c0Var.f206080b = i - Integer.MIN_VALUE;
            } else {
                s6c0Var = new s6c0(this, ibkVar);
            }
        } else {
            s6c0Var = new s6c0(this, ibkVar);
        }
        Object objM40965e = s6c0Var.f206079a;
        int i2 = s6c0Var.f206080b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = s6c0Var.f206082d;
                bga.m29073P(objM40965e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40965e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40965e);
        s6c0Var.f206082d = bqz0Var;
        s6c0Var.f206080b = 1;
        objM40965e = f7c0.m40965e(this.f217533a, (m6c0) obj, s6c0Var);
        if (objM40965e != yukVar) {
        }
        return yukVar;
        s6c0Var.f206082d = null;
        s6c0Var.f206080b = 2;
    }
}
