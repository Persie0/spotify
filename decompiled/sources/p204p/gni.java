package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class gni implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kni f82716a;

    public gni(kni kniVar) {
        this.f82716a = kniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r8.mo30229d(r9, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) throws Throwable {
        fni fniVar;
        if (ibkVar instanceof fni) {
            fniVar = (fni) ibkVar;
            int i = fniVar.f71299b;
            if ((i & Integer.MIN_VALUE) != 0) {
                fniVar.f71299b = i - Integer.MIN_VALUE;
            } else {
                fniVar = new fni(this, ibkVar);
            }
        } else {
            fniVar = new fni(this, ibkVar);
        }
        Object objM89557A = fniVar.f71298a;
        int i2 = fniVar.f71299b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = fniVar.f71301d;
                bga.m29073P(objM89557A);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM89557A);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM89557A);
        fniVar.f71301d = bqz0Var;
        fniVar.f71299b = 1;
        kni kniVar = this.f82716a;
        objM89557A = x0h1.m89557A(kniVar.f124418f, new nmi(kniVar, fbkVar, 0), fniVar);
        if (objM89557A != yukVar) {
        }
        return yukVar;
        fli fliVar = new fli(((Boolean) objM89557A).booleanValue());
        fniVar.f71301d = null;
        fniVar.f71299b = 2;
    }
}
