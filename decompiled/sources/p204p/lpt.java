package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class lpt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f135840a;

    public lpt(spt sptVar) {
        this.f135840a = sptVar;
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
        kpt kptVar;
        if (ibkVar instanceof kpt) {
            kptVar = (kpt) ibkVar;
            int i = kptVar.f125121b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kptVar.f125121b = i - Integer.MIN_VALUE;
            } else {
                kptVar = new kpt(this, ibkVar);
            }
        } else {
            kptVar = new kpt(this, ibkVar);
        }
        Object objM91827g = kptVar.f125120a;
        int i2 = kptVar.f125121b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = kptVar.f125123d;
                bga.m29073P(objM91827g);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM91827g);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM91827g);
        xqb xqbVar = this.f135840a.f212950j;
        kptVar.f125123d = bqz0Var;
        kptVar.f125121b = 1;
        objM91827g = xqbVar.m91827g((bet) obj, kptVar);
        if (objM91827g != yukVar) {
        }
        return yukVar;
        kptVar.f125123d = null;
        kptVar.f125121b = 2;
    }
}
