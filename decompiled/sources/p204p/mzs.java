package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class mzs implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xjp f148775a;

    public mzs(xjp xjpVar) {
        this.f148775a = xjpVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6.mo30229d(r7, r5) == r3) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        lzs lzsVar;
        if (ibkVar instanceof lzs) {
            lzsVar = (lzs) ibkVar;
            int i = lzsVar.f138423c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzsVar.f138423c = i - Integer.MIN_VALUE;
            } else {
                lzsVar = new lzs(this, ibkVar);
            }
        } else {
            lzsVar = new lzs(this, ibkVar);
        }
        Object objM91232a = lzsVar.f138422b;
        int i2 = lzsVar.f138423c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM91232a);
            lzsVar.f138421a = bqz0Var;
            lzsVar.f138423c = 1;
            objM91232a = this.f148775a.m91232a(lzsVar);
            if (objM91232a != yukVar) {
            }
            return yukVar;
        }
        if (i2 == 1) {
            bqz0Var = lzsVar.f138421a;
            bga.m29073P(objM91232a);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM91232a);
        }
        return w2a1.f247311a;
        lzsVar.f138421a = null;
        lzsVar.f138423c = 2;
    }
}
