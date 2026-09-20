package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class i5v implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ u6x f99029a;

    public i5v(u6x u6xVar) {
        this.f99029a = u6xVar;
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
        h5v h5vVar;
        if (ibkVar instanceof h5v) {
            h5vVar = (h5v) ibkVar;
            int i = h5vVar.f87910b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h5vVar.f87910b = i - Integer.MIN_VALUE;
            } else {
                h5vVar = new h5v(this, ibkVar);
            }
        } else {
            h5vVar = new h5v(this, ibkVar);
        }
        Object objM82468h = h5vVar.f87909a;
        int i2 = h5vVar.f87910b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = h5vVar.f87912d;
                bga.m29073P(objM82468h);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM82468h);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM82468h);
        h5vVar.f87912d = bqz0Var;
        h5vVar.f87910b = 1;
        objM82468h = this.f99029a.m82468h(h5vVar);
        if (objM82468h != yukVar) {
        }
        return yukVar;
        h5vVar.f87912d = null;
        h5vVar.f87910b = 2;
    }
}
