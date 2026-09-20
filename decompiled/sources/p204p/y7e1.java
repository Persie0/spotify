package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class y7e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ r7e1 f270043a;

    public y7e1(r7e1 r7e1Var) {
        this.f270043a = r7e1Var;
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
        x7e1 x7e1Var;
        if (ibkVar instanceof x7e1) {
            x7e1Var = (x7e1) ibkVar;
            int i = x7e1Var.f258884b;
            if ((i & Integer.MIN_VALUE) != 0) {
                x7e1Var.f258884b = i - Integer.MIN_VALUE;
            } else {
                x7e1Var = new x7e1(this, ibkVar);
            }
        } else {
            x7e1Var = new x7e1(this, ibkVar);
        }
        Object objM74899b = x7e1Var.f258883a;
        int i2 = x7e1Var.f258884b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = x7e1Var.f258886d;
                bga.m29073P(objM74899b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM74899b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM74899b);
        String str = ((g7e1) obj).f77254e;
        x7e1Var.f258886d = bqz0Var;
        x7e1Var.f258884b = 1;
        objM74899b = this.f270043a.m74899b(str, x7e1Var);
        if (objM74899b != yukVar) {
        }
        return yukVar;
        x7e1Var.f258886d = null;
        x7e1Var.f258884b = 2;
    }
}
