package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class eqf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hqf0 f61881a;

    public eqf0(hqf0 hqf0Var) {
        this.f61881a = hqf0Var;
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
        dqf0 dqf0Var;
        if (ibkVar instanceof dqf0) {
            dqf0Var = (dqf0) ibkVar;
            int i = dqf0Var.f51983b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dqf0Var.f51983b = i - Integer.MIN_VALUE;
            } else {
                dqf0Var = new dqf0(this, ibkVar);
            }
        } else {
            dqf0Var = new dqf0(this, ibkVar);
        }
        Object objM88726b = dqf0Var.f51982a;
        int i2 = dqf0Var.f51983b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dqf0Var.f51985d;
                bga.m29073P(objM88726b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM88726b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM88726b);
        wpx wpxVar = this.f61881a.f94170b;
        dqf0Var.f51985d = bqz0Var;
        dqf0Var.f51983b = 1;
        objM88726b = wpxVar.m88726b((zpf0) obj, dqf0Var);
        if (objM88726b != yukVar) {
        }
        return yukVar;
        dqf0Var.f51985d = null;
        dqf0Var.f51983b = 2;
    }
}
