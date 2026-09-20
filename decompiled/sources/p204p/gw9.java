package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class gw9 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jw9 f84956a;

    public gw9(jw9 jw9Var) {
        this.f84956a = jw9Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        fw9 fw9Var;
        if (ibkVar instanceof fw9) {
            fw9Var = (fw9) ibkVar;
            int i = fw9Var.f74031b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fw9Var.f74031b = i - Integer.MIN_VALUE;
            } else {
                fw9Var = new fw9(this, ibkVar);
            }
        } else {
            fw9Var = new fw9(this, ibkVar);
        }
        Object objM56009w = fw9Var.f74030a;
        int i2 = fw9Var.f74031b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = fw9Var.f74033d;
                bga.m29073P(objM56009w);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM56009w);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM56009w);
        kc5 kc5Var = this.f84956a.f116608a;
        String str = ((kv9) obj).f126799a;
        fw9Var.f74033d = bqz0Var;
        fw9Var.f74031b = 1;
        objM56009w = kc5Var.m56009w(str, fw9Var);
        if (objM56009w != yukVar) {
        }
        return yukVar;
        fw9Var.f74033d = null;
        fw9Var.f74031b = 2;
    }
}
