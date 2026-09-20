package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class oqt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xqt f168381a;

    public oqt(xqt xqtVar) {
        this.f168381a = xqtVar;
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
        nqt nqtVar;
        if (ibkVar instanceof nqt) {
            nqtVar = (nqt) ibkVar;
            int i = nqtVar.f157331b;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqtVar.f157331b = i - Integer.MIN_VALUE;
            } else {
                nqtVar = new nqt(this, ibkVar);
            }
        } else {
            nqtVar = new nqt(this, ibkVar);
        }
        Object objM91902b = nqtVar.f157330a;
        int i2 = nqtVar.f157331b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = nqtVar.f157333d;
                bga.m29073P(objM91902b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM91902b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM91902b);
        nqtVar.f157333d = bqz0Var;
        nqtVar.f157331b = 1;
        objM91902b = xqt.m91902b(this.f168381a, nqtVar);
        if (objM91902b != yukVar) {
        }
        return yukVar;
        nqtVar.f157333d = null;
        nqtVar.f157331b = 2;
    }
}
