package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes5.dex */
public final class eni implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kni f61163a;

    public eni(kni kniVar) {
        this.f61163a = kniVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r8.mo30229d(r9, r0) == r5) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        dni dniVar;
        if (ibkVar instanceof dni) {
            dniVar = (dni) ibkVar;
            int i = dniVar.f50841b;
            if ((i & Integer.MIN_VALUE) != 0) {
                dniVar.f50841b = i - Integer.MIN_VALUE;
            } else {
                dniVar = new dni(this, ibkVar);
            }
        } else {
            dniVar = new dni(this, ibkVar);
        }
        Object objM57048u = dniVar.f50840a;
        int i2 = dniVar.f50841b;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = dniVar.f50843d;
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
        ujh ujhVar = this.f61163a.f124415c;
        dniVar.f50843d = bqz0Var;
        dniVar.f50841b = 1;
        objM57048u = kpg1.m57048u(new gs3(ujhVar, (sji) obj, fbkVar, 19), null, sik.f209548t, dniVar);
        if (objM57048u != yukVar) {
        }
        return yukVar;
        dniVar.f50843d = null;
        dniVar.f50841b = 2;
    }
}
