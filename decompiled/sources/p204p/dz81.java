package p204p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class dz81 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.List] */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        cz81 cz81Var;
        Object c6x0Var;
        if (ibkVar instanceof cz81) {
            cz81Var = (cz81) ibkVar;
            int i = cz81Var.f43492b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz81Var.f43492b = i - Integer.MIN_VALUE;
            } else {
                cz81Var = new cz81(this, ibkVar);
            }
        } else {
            cz81Var = new cz81(this, ibkVar);
        }
        Object obj2 = cz81Var.f43491a;
        int i2 = cz81Var.f43492b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            iz81 iz81Var = (iz81) obj;
            try {
                c6x0Var = x74.m90114B(iz81Var.f107168a, iz81Var.f107169b);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            Throwable thM77348a = s6x0.m77348a(c6x0Var);
            Object lz81Var = kz81.f128045a;
            if (thM77348a == null) {
                srq0 srq0Var = (srq0) c6x0Var;
                if (srq0Var.f213371a.isEmpty()) {
                    Logger.m3966b("Received empty PreparedTranscript", new Object[0]);
                } else {
                    lz81Var = new lz81(srq0Var);
                }
            } else {
                Logger.m3967c(thM77348a, "Failed to prepare transcript", new Object[0]);
            }
            cz81Var.f43492b = 1;
            Object objMo30229d = bqz0Var.mo30229d(lz81Var, cz81Var);
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
