package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes7.dex */
public final class okc implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pkc f166315a;

    public okc(pkc pkcVar) {
        this.f166315a = pkcVar;
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
        nkc nkcVar;
        if (ibkVar instanceof nkc) {
            nkcVar = (nkc) ibkVar;
            int i = nkcVar.f154849b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkcVar.f154849b = i - Integer.MIN_VALUE;
            } else {
                nkcVar = new nkc(this, ibkVar);
            }
        } else {
            nkcVar = new nkc(this, ibkVar);
        }
        Object objM30783O = nkcVar.f154848a;
        int i2 = nkcVar.f154849b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = nkcVar.f154851d;
                bga.m29073P(objM30783O);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM30783O);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM30783O);
        bxb bxbVar = this.f166315a.f178428a;
        String str = ((jkc) obj).f113280a;
        nkcVar.f154851d = bqz0Var;
        nkcVar.f154849b = 1;
        objM30783O = bxbVar.m30783O(str, nkcVar);
        if (objM30783O != yukVar) {
        }
        return yukVar;
        nkcVar.f154851d = null;
        nkcVar.f154849b = 2;
    }
}
