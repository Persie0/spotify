package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class o9c0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t9c0 f162997a;

    public o9c0(t9c0 t9c0Var) {
        this.f162997a = t9c0Var;
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
        n9c0 n9c0Var;
        if (ibkVar instanceof n9c0) {
            n9c0Var = (n9c0) ibkVar;
            int i = n9c0Var.f151767b;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9c0Var.f151767b = i - Integer.MIN_VALUE;
            } else {
                n9c0Var = new n9c0(this, ibkVar);
            }
        } else {
            n9c0Var = new n9c0(this, ibkVar);
        }
        n9c0 n9c0Var2 = n9c0Var;
        Object objM80276a = n9c0Var2.f151766a;
        int i2 = n9c0Var2.f151767b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = n9c0Var2.f151769d;
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
        f9c0 f9c0Var = (f9c0) obj;
        String str = f9c0Var.f67218c;
        z5c0 z5c0Var = f9c0Var.f67219d;
        vmb0 vmb0Var = new vmb0(f9c0Var, 16);
        n9c0Var2.f151769d = bqz0Var;
        n9c0Var2.f151767b = 1;
        objM80276a = t9c0.m80276a(this.f162997a, str, z5c0Var, lcc1.f131898b, vmb0Var, n9c0Var2);
        if (objM80276a != yukVar) {
        }
        return yukVar;
        n9c0Var2.f151769d = null;
        n9c0Var2.f151767b = 2;
    }
}
