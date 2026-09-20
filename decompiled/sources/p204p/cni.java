package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class cni implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kni f40028a;

    public cni(kni kniVar) {
        this.f40028a = kniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r8.mo30229d(r9, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        bni bniVar;
        if (ibkVar instanceof bni) {
            bniVar = (bni) ibkVar;
            int i = bniVar.f28838b;
            if ((i & Integer.MIN_VALUE) != 0) {
                bniVar.f28838b = i - Integer.MIN_VALUE;
            } else {
                bniVar = new bni(this, ibkVar);
            }
        } else {
            bniVar = new bni(this, ibkVar);
        }
        Object objM57048u = bniVar.f28837a;
        int i2 = bniVar.f28838b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = bniVar.f28840d;
                bga.m29073P(objM57048u);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM57048u);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM57048u);
        w9r0 w9r0Var = this.f40028a.f124414b;
        bniVar.f28840d = bqz0Var;
        bniVar.f28838b = 1;
        objM57048u = kpg1.m57048u(new js3(w9r0Var, (eki) obj, fbkVar, 21), s5w0.f205916M0, qzv0.f194299R0, bniVar);
        if (objM57048u != yukVar) {
        }
        return yukVar;
        bniVar.f28840d = null;
        bniVar.f28838b = 2;
    }
}
