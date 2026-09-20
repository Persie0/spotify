package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes8.dex */
public final class fkt0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gkt0 f70621a;

    public fkt0(gkt0 gkt0Var) {
        this.f70621a = gkt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r7.mo30229d(r6, r0) == r4) goto L25;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        ekt0 ekt0Var;
        Object objM47848d;
        Object obj2;
        if (ibkVar instanceof ekt0) {
            ekt0Var = (ekt0) ibkVar;
            int i = ekt0Var.f60535b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ekt0Var.f60535b = i - Integer.MIN_VALUE;
            } else {
                ekt0Var = new ekt0(this, ibkVar);
            }
        } else {
            ekt0Var = new ekt0(this, ibkVar);
        }
        Object obj3 = ekt0Var.f60534a;
        int i2 = ekt0Var.f60535b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = ekt0Var.f60537d;
                bga.m29073P(obj3);
                objM47848d = ((s6x0) obj3).f206218a;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj3);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(obj3);
        hki0 hki0Var = this.f70621a.f80903a;
        fmg1 fmg1Var = ((xjt0) obj).f262231a;
        ekt0Var.f60537d = bqz0Var;
        ekt0Var.f60535b = 1;
        objM47848d = hki0Var.m47848d(fmg1Var, ekt0Var);
        if (objM47848d != yukVar) {
        }
        return yukVar;
        if (s6x0.m77348a(objM47848d) == null) {
            obj2 = ukt0.f231366a;
        } else {
            obj2 = tkt0.f221217a;
        }
        ekt0Var.f60537d = null;
        ekt0Var.f60535b = 2;
    }
}
