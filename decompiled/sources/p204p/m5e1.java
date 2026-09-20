package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class m5e1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f0m f140199a;

    public m5e1(f0m f0mVar) {
        this.f140199a = f0mVar;
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
        l5e1 l5e1Var;
        if (ibkVar instanceof l5e1) {
            l5e1Var = (l5e1) ibkVar;
            int i = l5e1Var.f129884b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l5e1Var.f129884b = i - Integer.MIN_VALUE;
            } else {
                l5e1Var = new l5e1(this, ibkVar);
            }
        } else {
            l5e1Var = new l5e1(this, ibkVar);
        }
        Object objM40489d = l5e1Var.f129883a;
        int i2 = l5e1Var.f129884b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = l5e1Var.f129886d;
                bga.m29073P(objM40489d);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40489d);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40489d);
        l5e1Var.f129886d = bqz0Var;
        l5e1Var.f129884b = 1;
        objM40489d = this.f140199a.m40489d((y4e1) obj, l5e1Var);
        if (objM40489d != yukVar) {
        }
        return yukVar;
        l5e1Var.f129886d = null;
        l5e1Var.f129884b = 2;
    }
}
