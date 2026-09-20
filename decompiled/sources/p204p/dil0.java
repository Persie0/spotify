package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes10.dex */
public final class dil0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kil0 f49413a;

    public dil0(kil0 kil0Var) {
        this.f49413a = kil0Var;
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
        cil0 cil0Var;
        if (ibkVar instanceof cil0) {
            cil0Var = (cil0) ibkVar;
            int i = cil0Var.f38384b;
            if ((i & Integer.MIN_VALUE) != 0) {
                cil0Var.f38384b = i - Integer.MIN_VALUE;
            } else {
                cil0Var = new cil0(this, ibkVar);
            }
        } else {
            cil0Var = new cil0(this, ibkVar);
        }
        Object objM73499b = cil0Var.f38383a;
        int i2 = cil0Var.f38384b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = cil0Var.f38386d;
                bga.m29073P(objM73499b);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM73499b);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM73499b);
        qq8 qq8Var = this.f49413a.f123010b;
        cil0Var.f38386d = bqz0Var;
        cil0Var.f38384b = 1;
        objM73499b = qq8Var.m73499b((ihl0) obj, cil0Var);
        if (objM73499b != yukVar) {
        }
        return yukVar;
        cil0Var.f38386d = null;
        cil0Var.f38384b = 2;
    }
}
