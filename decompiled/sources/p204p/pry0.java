package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class pry0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ory0 ory0Var;
        if (ibkVar instanceof ory0) {
            ory0Var = (ory0) ibkVar;
            int i = ory0Var.f168675b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ory0Var.f168675b = i - Integer.MIN_VALUE;
            } else {
                ory0Var = new ory0(this, ibkVar);
            }
        } else {
            ory0Var = new ory0(this, ibkVar);
        }
        Object obj2 = ory0Var.f168674a;
        int i2 = ory0Var.f168675b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            Object luy0Var = new luy0(((kqy0) obj).f125473a);
            ory0Var.f168675b = 1;
            Object objMo30229d = bqz0Var.mo30229d(luy0Var, ory0Var);
            Object obj3 = yuk.f276404a;
            if (objMo30229d == obj3) {
                return obj3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
