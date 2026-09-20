package p204p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: classes9.dex */
public final class blf0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ glf0 f28177a;

    public blf0(glf0 glf0Var) {
        this.f28177a = glf0Var;
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
        alf0 alf0Var;
        if (ibkVar instanceof alf0) {
            alf0Var = (alf0) ibkVar;
            int i = alf0Var.f16873b;
            if ((i & Integer.MIN_VALUE) != 0) {
                alf0Var.f16873b = i - Integer.MIN_VALUE;
            } else {
                alf0Var = new alf0(this, ibkVar);
            }
        } else {
            alf0Var = new alf0(this, ibkVar);
        }
        Object objM29907j = alf0Var.f16872a;
        int i2 = alf0Var.f16873b;
        yuk yukVar = yuk.f276404a;
        if (i2 != 0) {
            if (i2 == 1) {
                bqz0Var = alf0Var.f16875d;
                bga.m29073P(objM29907j);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM29907j);
            }
            return w2a1.f247311a;
        }
        bga.m29073P(objM29907j);
        bmx bmxVar = this.f28177a.f81075i;
        alf0Var.f16875d = bqz0Var;
        alf0Var.f16873b = 1;
        objM29907j = bmxVar.m29907j((vlf0) obj, alf0Var);
        if (objM29907j != yukVar) {
        }
        return yukVar;
        alf0Var.f16875d = null;
        alf0Var.f16873b = 2;
    }
}
