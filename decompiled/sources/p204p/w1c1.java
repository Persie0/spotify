package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class w1c1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        v1c1 v1c1Var;
        if (ibkVar instanceof v1c1) {
            v1c1Var = (v1c1) ibkVar;
            int i = v1c1Var.f236320b;
            if ((i & Integer.MIN_VALUE) != 0) {
                v1c1Var.f236320b = i - Integer.MIN_VALUE;
            } else {
                v1c1Var = new v1c1(this, ibkVar);
            }
        } else {
            v1c1Var = new v1c1(this, ibkVar);
        }
        Object objM89633c = v1c1Var.f236319a;
        int i2 = v1c1Var.f236320b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM89633c);
            v1c1Var.f236322d = bqz0Var;
            v1c1Var.f236320b = 1;
            objM89633c = x1c1.m89633c((n1c1) obj, v1c1Var);
            if (objM89633c != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = v1c1Var.f236322d;
            bga.m29073P(objM89633c);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM89633c);
        }
        return w2a1.f247311a;
        v1c1Var.f236322d = null;
        v1c1Var.f236320b = 2;
    }
}
