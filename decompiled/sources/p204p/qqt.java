package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class qqt implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xqt f191649a;

    public qqt(xqt xqtVar) {
        this.f191649a = xqtVar;
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
        pqt pqtVar;
        if (ibkVar instanceof pqt) {
            pqtVar = (pqt) ibkVar;
            int i = pqtVar.f180419b;
            if ((i & Integer.MIN_VALUE) != 0) {
                pqtVar.f180419b = i - Integer.MIN_VALUE;
            } else {
                pqtVar = new pqt(this, ibkVar);
            }
        } else {
            pqtVar = new pqt(this, ibkVar);
        }
        Object objM91903c = pqtVar.f180418a;
        int i2 = pqtVar.f180419b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = pqtVar.f180421d;
                bga.m29073P(objM91903c);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM91903c);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM91903c);
        pqtVar.f180421d = bqz0Var;
        pqtVar.f180419b = 1;
        objM91903c = xqt.m91903c(this.f191649a, (hjt) obj, pqtVar);
        if (objM91903c != yukVar) {
        }
        return yukVar;
        pqtVar.f180421d = null;
        pqtVar.f180419b = 2;
    }
}
