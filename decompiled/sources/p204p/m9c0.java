package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class m9c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t9c0 f141272a;

    public m9c0(t9c0 t9c0Var) {
        this.f141272a = t9c0Var;
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
        l9c0 l9c0Var;
        if (ibkVar instanceof l9c0) {
            l9c0Var = (l9c0) ibkVar;
            int i = l9c0Var.f131059b;
            if ((i & Integer.MIN_VALUE) != 0) {
                l9c0Var.f131059b = i - Integer.MIN_VALUE;
            } else {
                l9c0Var = new l9c0(this, ibkVar);
            }
        } else {
            l9c0Var = new l9c0(this, ibkVar);
        }
        l9c0 l9c0Var2 = l9c0Var;
        Object objM80276a = l9c0Var2.f131058a;
        int i2 = l9c0Var2.f131059b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = l9c0Var2.f131061d;
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
        g9c0 g9c0Var = (g9c0) obj;
        String str = g9c0Var.f77727c;
        z5c0 z5c0Var = g9c0Var.f77728d;
        vmb0 vmb0Var = new vmb0(g9c0Var, 15);
        l9c0Var2.f131061d = bqz0Var;
        l9c0Var2.f131059b = 1;
        objM80276a = t9c0.m80276a(this.f141272a, str, z5c0Var, lcc1.f131897a, vmb0Var, l9c0Var2);
        if (objM80276a != yukVar) {
        }
        return yukVar;
        l9c0Var2.f131061d = null;
        l9c0Var2.f131059b = 2;
    }
}
