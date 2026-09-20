package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class s590 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ yz80 f205759a;

    public s590(yz80 yz80Var) {
        this.f205759a = yz80Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r10.mo30229d(r11, r0) == r5) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        r590 r590Var;
        n590 n590Var;
        if (ibkVar instanceof r590) {
            r590Var = (r590) ibkVar;
            int i = r590Var.f195997b;
            if ((i & Integer.MIN_VALUE) != 0) {
                r590Var.f195997b = i - Integer.MIN_VALUE;
            } else {
                r590Var = new r590(this, ibkVar);
            }
        } else {
            r590Var = new r590(this, ibkVar);
        }
        Object objM76980u = r590Var.f195996a;
        int i2 = r590Var.f195997b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                n590Var = r590Var.f196000e;
                bqz0Var = r590Var.f195999d;
                bga.m29073P(objM76980u);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM76980u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM76980u);
        n590Var = (n590) obj;
        g090 g090Var = new g090(this.f205759a, n590Var, fbkVar, 4);
        r590Var.f195999d = bqz0Var;
        r590Var.f196000e = n590Var;
        r590Var.f195997b = 1;
        objM76980u = s1h1.m76980u(500L, g090Var, r590Var);
        if (objM76980u != yukVar) {
        }
        return yukVar;
        Object w590Var = ((p2x0) objM76980u) instanceof m2x0 ? new w590(n590Var.f150506b) : x590.f258335a;
        r590Var.f195999d = null;
        r590Var.f196000e = null;
        r590Var.f195997b = 2;
    }
}
