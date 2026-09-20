package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class ept implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ tpt f61707a;

    public ept(tpt tptVar) {
        this.f61707a = tptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        cpt cptVar;
        if (ibkVar instanceof cpt) {
            cptVar = (cpt) ibkVar;
            int i = cptVar.f40639b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cptVar.f40639b = i - Integer.MIN_VALUE;
            } else {
                cptVar = new cpt(this, ibkVar);
            }
        } else {
            cptVar = new cpt(this, ibkVar);
        }
        Object objM74700w = cptVar.f40638a;
        int i2 = cptVar.f40639b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = cptVar.f40641d;
                bga.m29073P(objM74700w);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM74700w);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM74700w);
        r3n0 r3n0Var = this.f61707a.f222594b;
        cptVar.f40641d = bqz0Var;
        cptVar.f40639b = 1;
        objM74700w = r3n0Var.m74700w((lit) obj, cptVar);
        if (objM74700w != yukVar) {
        }
        return yukVar;
        cptVar.f40641d = null;
        cptVar.f40639b = 2;
    }
}
