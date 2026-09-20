package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class izs implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ezw0 f107284a;

    public izs(ezw0 ezw0Var) {
        this.f107284a = ezw0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        hzs hzsVar;
        if (ibkVar instanceof hzs) {
            hzsVar = (hzs) ibkVar;
            int i = hzsVar.f97003b;
            if ((i & Integer.MIN_VALUE) != 0) {
                hzsVar.f97003b = i - Integer.MIN_VALUE;
            } else {
                hzsVar = new hzs(this, ibkVar);
            }
        } else {
            hzsVar = new hzs(this, ibkVar);
        }
        Object objM40410c = hzsVar.f97002a;
        int i2 = hzsVar.f97003b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = hzsVar.f97005d;
                bga.m29073P(objM40410c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM40410c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM40410c);
        hzsVar.f97005d = bqz0Var;
        hzsVar.f97003b = 1;
        objM40410c = this.f107284a.m40410c((ezs) obj, hzsVar);
        if (objM40410c != yukVar) {
        }
        return yukVar;
        hzsVar.f97005d = null;
        hzsVar.f97003b = 2;
    }
}
