package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class g821 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        f821 f821Var;
        if (ibkVar instanceof f821) {
            f821Var = (f821) ibkVar;
            int i = f821Var.f66841b;
            if ((i & Integer.MIN_VALUE) != 0) {
                f821Var.f66841b = i - Integer.MIN_VALUE;
            } else {
                f821Var = new f821(this, ibkVar);
            }
        } else {
            f821Var = new f821(this, ibkVar);
        }
        Object obj2 = f821Var.f66840a;
        int i2 = f821Var.f66841b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            f821Var.f66841b = 1;
            Object objMo30229d = bqz0Var.mo30229d(n821.f151311a, f821Var);
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
