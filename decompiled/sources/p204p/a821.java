package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes6.dex */
public final class a821 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ae00 f13175a;

    public a821(ae00 ae00Var) {
        this.f13175a = ae00Var;
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
        z721 z721Var;
        if (ibkVar instanceof z721) {
            z721Var = (z721) ibkVar;
            int i = z721Var.f280080b;
            if ((i & Integer.MIN_VALUE) != 0) {
                z721Var.f280080b = i - Integer.MIN_VALUE;
            } else {
                z721Var = new z721(this, ibkVar);
            }
        } else {
            z721Var = new z721(this, ibkVar);
        }
        Object objM25648n = z721Var.f280079a;
        int i2 = z721Var.f280080b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = z721Var.f280082d;
                bga.m29073P(objM25648n);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM25648n);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM25648n);
        z721Var.f280082d = bqz0Var;
        z721Var.f280080b = 1;
        objM25648n = this.f13175a.m25648n(z721Var);
        if (objM25648n != yukVar) {
        }
        return yukVar;
        z721Var.f280082d = null;
        z721Var.f280080b = 2;
    }
}
