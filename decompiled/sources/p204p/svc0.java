package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class svc0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fei f214380a;

    public svc0(fei feiVar) {
        this.f214380a = feiVar;
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
        rvc0 rvc0Var;
        if (ibkVar instanceof rvc0) {
            rvc0Var = (rvc0) ibkVar;
            int i = rvc0Var.f203060b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rvc0Var.f203060b = i - Integer.MIN_VALUE;
            } else {
                rvc0Var = new rvc0(this, ibkVar);
            }
        } else {
            rvc0Var = new rvc0(this, ibkVar);
        }
        Object objM41449a = rvc0Var.f203059a;
        int i2 = rvc0Var.f203060b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = rvc0Var.f203062d;
                bga.m29073P(objM41449a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM41449a);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM41449a);
        rvc0Var.f203062d = bqz0Var;
        rvc0Var.f203060b = 1;
        objM41449a = this.f214380a.m41449a((buc0) obj, rvc0Var);
        if (objM41449a != yukVar) {
        }
        return yukVar;
        rvc0Var.f203062d = null;
        rvc0Var.f203060b = 2;
    }
}
