package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class ldr implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        kdr kdrVar;
        if (ibkVar instanceof kdr) {
            kdrVar = (kdr) ibkVar;
            int i = kdrVar.f121724b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kdrVar.f121724b = i - Integer.MIN_VALUE;
            } else {
                kdrVar = new kdr(this, ibkVar);
            }
        } else {
            kdrVar = new kdr(this, ibkVar);
        }
        Object obj2 = kdrVar.f121723a;
        int i2 = kdrVar.f121724b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            kdrVar.f121724b = 1;
            Object objMo30229d = bqz0Var.mo30229d(odr.f164237a, kdrVar);
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
