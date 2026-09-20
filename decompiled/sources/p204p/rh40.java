package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class rh40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sh40 f199106a;

    public rh40(sh40 sh40Var) {
        this.f199106a = sh40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7.mo30229d(r8, r0) == r4) goto L21;
     */
    @Override // com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder.EffectHandler
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo15629a(Object obj, bqz0 bqz0Var, ibk ibkVar) {
        qh40 qh40Var;
        if (ibkVar instanceof qh40) {
            qh40Var = (qh40) ibkVar;
            int i = qh40Var.f188622b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qh40Var.f188622b = i - Integer.MIN_VALUE;
            } else {
                qh40Var = new qh40(this, ibkVar);
            }
        } else {
            qh40Var = new qh40(this, ibkVar);
        }
        Object objM46915b = qh40Var.f188621a;
        int i2 = qh40Var.f188622b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = qh40Var.f188624d;
                bga.m29073P(objM46915b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM46915b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM46915b);
        ha80 ha80Var = this.f199106a.f209088c;
        qh40Var.f188624d = bqz0Var;
        qh40Var.f188622b = 1;
        objM46915b = ha80Var.m46915b(qh40Var);
        if (objM46915b != yukVar) {
        }
        return yukVar;
        qh40Var.f188624d = null;
        qh40Var.f188622b = 2;
    }
}
