package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class q9c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t9c0 f186564a;

    public q9c0(t9c0 t9c0Var) {
        this.f186564a = t9c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r11.mo30229d(r12, r6) == r8) goto L22;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        p9c0 p9c0Var;
        if (ibkVar instanceof p9c0) {
            p9c0Var = (p9c0) ibkVar;
            int i = p9c0Var.f175211b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p9c0Var.f175211b = i - Integer.MIN_VALUE;
            } else {
                p9c0Var = new p9c0(this, ibkVar);
            }
        } else {
            p9c0Var = new p9c0(this, ibkVar);
        }
        p9c0 p9c0Var2 = p9c0Var;
        Object objM80276a = p9c0Var2.f175210a;
        int i2 = p9c0Var2.f175211b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = p9c0Var2.f175213d;
                bga.m29073P(objM80276a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM80276a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM80276a);
        h9c0 h9c0Var = (h9c0) obj;
        String str = h9c0Var.f88919c;
        z5c0 z5c0Var = h9c0Var.f88920d;
        vmb0 vmb0Var = new vmb0(h9c0Var, 17);
        p9c0Var2.f175213d = bqz0Var;
        p9c0Var2.f175211b = 1;
        objM80276a = t9c0.m80276a(this.f186564a, str, z5c0Var, lcc1.f131899c, vmb0Var, p9c0Var2);
        if (objM80276a != yukVar) {
        }
        return yukVar;
        p9c0Var2.f175213d = null;
        p9c0Var2.f175211b = 2;
    }
}
