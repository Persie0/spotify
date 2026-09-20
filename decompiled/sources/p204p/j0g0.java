package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class j0g0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m0g0 f107456a;

    public j0g0(m0g0 m0g0Var) {
        this.f107456a = m0g0Var;
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
        i0g0 i0g0Var;
        if (ibkVar instanceof i0g0) {
            i0g0Var = (i0g0) ibkVar;
            int i = i0g0Var.f97238b;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0g0Var.f97238b = i - Integer.MIN_VALUE;
            } else {
                i0g0Var = new i0g0(this, ibkVar);
            }
        } else {
            i0g0Var = new i0g0(this, ibkVar);
        }
        Object objM76948c = i0g0Var.f97237a;
        int i2 = i0g0Var.f97238b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = i0g0Var.f97240d;
                bga.m29073P(objM76948c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76948c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM76948c);
        s1e1 s1e1Var = this.f107456a.f138671b;
        i0g0Var.f97240d = bqz0Var;
        i0g0Var.f97238b = 1;
        objM76948c = s1e1Var.m76948c((b0g0) obj, i0g0Var);
        if (objM76948c != yukVar) {
        }
        return yukVar;
        i0g0Var.f97240d = null;
        i0g0Var.f97238b = 2;
    }
}
