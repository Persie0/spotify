package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class hpt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ spt f93847a;

    public hpt(spt sptVar) {
        this.f93847a = sptVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        gpt gptVar;
        if (ibkVar instanceof gpt) {
            gptVar = (gpt) ibkVar;
            int i = gptVar.f83244b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gptVar.f83244b = i - Integer.MIN_VALUE;
            } else {
                gptVar = new gpt(this, ibkVar);
            }
        } else {
            gptVar = new gpt(this, ibkVar);
        }
        Object objM34964e = gptVar.f83243a;
        int i2 = gptVar.f83244b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = gptVar.f83246d;
                bga.m29073P(objM34964e);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM34964e);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM34964e);
        d5a0 d5a0Var = this.f93847a.f212947g;
        gptVar.f83246d = bqz0Var;
        gptVar.f83244b = 1;
        objM34964e = d5a0Var.m34964e(crx.f41419a, gptVar);
        if (objM34964e != yukVar) {
        }
        return yukVar;
        gptVar.f83246d = null;
        gptVar.f83244b = 2;
    }
}
