package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class byk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r9.mo30229d(p204p.iyk.f107003a, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ayk aykVar;
        if (ibkVar instanceof ayk) {
            aykVar = (ayk) ibkVar;
            int i = aykVar.f21261b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aykVar.f21261b = i - Integer.MIN_VALUE;
            } else {
                aykVar = new ayk(this, ibkVar);
            }
        } else {
            aykVar = new ayk(this, ibkVar);
        }
        Object obj2 = aykVar.f21260a;
        int i2 = aykVar.f21261b;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(obj2);
            aykVar.f21263d = bqz0Var;
            aykVar.f21261b = 1;
            if (njg1.m64619l(200L, aykVar) != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = aykVar.f21263d;
            bga.m29073P(obj2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
        aykVar.f21263d = null;
        aykVar.f21261b = 2;
    }
}
