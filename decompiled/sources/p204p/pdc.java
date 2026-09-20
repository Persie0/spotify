package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes11.dex */
public final class pdc implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rdc f176413a;

    public pdc(rdc rdcVar) {
        this.f176413a = rdcVar;
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
        odc odcVar;
        if (ibkVar instanceof odc) {
            odcVar = (odc) ibkVar;
            int i = odcVar.f164152b;
            if ((i & Integer.MIN_VALUE) != 0) {
                odcVar.f164152b = i - Integer.MIN_VALUE;
            } else {
                odcVar = new odc(this, ibkVar);
            }
        } else {
            odcVar = new odc(this, ibkVar);
        }
        Object objM75326a = odcVar.f164151a;
        int i2 = odcVar.f164152b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = odcVar.f164154d;
                bga.m29073P(objM75326a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM75326a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM75326a);
        odcVar.f164154d = bqz0Var;
        odcVar.f164152b = 1;
        objM75326a = rdc.m75326a(this.f176413a, (vdc) obj, odcVar);
        if (objM75326a != yukVar) {
        }
        return yukVar;
        odcVar.f164154d = null;
        odcVar.f164152b = 2;
    }
}
