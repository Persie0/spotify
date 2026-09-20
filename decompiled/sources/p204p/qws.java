package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class qws implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ w3y0 f193414a;

    public qws(w3y0 w3y0Var) {
        this.f193414a = w3y0Var;
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
        pws pwsVar;
        if (ibkVar instanceof pws) {
            pwsVar = (pws) ibkVar;
            int i = pwsVar.f182106b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwsVar.f182106b = i - Integer.MIN_VALUE;
            } else {
                pwsVar = new pws(this, ibkVar);
            }
        } else {
            pwsVar = new pws(this, ibkVar);
        }
        Object objM87117a = pwsVar.f182105a;
        int i2 = pwsVar.f182106b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = pwsVar.f182108d;
                bga.m29073P(objM87117a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM87117a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM87117a);
        pwsVar.f182108d = bqz0Var;
        pwsVar.f182106b = 1;
        objM87117a = this.f193414a.m87117a((fws) obj, pwsVar);
        if (objM87117a != yukVar) {
        }
        return yukVar;
        pwsVar.f182108d = null;
        pwsVar.f182106b = 2;
    }
}
