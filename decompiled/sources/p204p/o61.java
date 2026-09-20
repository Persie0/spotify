package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class o61 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ x61 f162187a;

    public o61(x61 x61Var) {
        this.f162187a = x61Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r8.mo30229d(r9, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        n61 n61Var;
        if (ibkVar instanceof n61) {
            n61Var = (n61) ibkVar;
            int i = n61Var.f150660b;
            if ((i & Integer.MIN_VALUE) != 0) {
                n61Var.f150660b = i - Integer.MIN_VALUE;
            } else {
                n61Var = new n61(this, ibkVar);
            }
        } else {
            n61Var = new n61(this, ibkVar);
        }
        Object objM24829a = n61Var.f150659a;
        int i2 = n61Var.f150660b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = n61Var.f150662d;
                bga.m29073P(objM24829a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM24829a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM24829a);
        g51 g51Var = (g51) obj;
        a61 a61Var = this.f162187a.f258554a;
        String str = g51Var.f76560b;
        String str2 = g51Var.f76561c;
        gpm0 gpm0Var = g51Var.f76562d;
        n61Var.f150662d = bqz0Var;
        n61Var.f150660b = 1;
        objM24829a = a61Var.m24829a(str, str2, gpm0Var, n61Var);
        if (objM24829a != yukVar) {
        }
        return yukVar;
        n61Var.f150662d = null;
        n61Var.f150660b = 2;
    }
}
